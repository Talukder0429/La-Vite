package helpers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import queryhelper.Field;
import queryhelper.Row;

public class DbConflictResolver
{
	//contains the tables for which there can only be one row per person, so the important thing is to not have duplicate unique identifiers
	private static final List<String> IDENTIIFIER_TABLES = Arrays.asList(
																		Field.TABLE_CLIENT_PROFILE, 
																		Field.TABLE_NEEDS_ASSESSMENT_AND_REFERRALS
																		);
	//contains the tables for which there can only be one row per person per month
	private static final List<String> MONTH_TABLES = Arrays.asList(Field.TABLE_EMPLOYMENT);
	//this is a mapping, for each table there is a specific field that should be used as the date
	@SuppressWarnings("serial")
	private static final Map<String, String> FIELD_TYPES = Collections.unmodifiableMap(
		    new HashMap<String, String>() {
			{
				put(Field.TABLE_EMPLOYMENT, Field.REFERRAL_DATE_YYYY_MM_DD);
				//put(Field.TABLE_COMMUNITY_CONNECTIONS, Field.START_DATE_YYYY_MM_DD);
			}});
	
	private String tableName;
	private Connection connection;
	
	public DbConflictResolver(Connection connection, String tableName)
	{
		this.tableName = tableName;
		this.connection = connection;
	}
	
	public boolean checkRowValid(Row row)
	{
		if (row.getValue(Field.UNIQUE_IDENTIFIER) == null) //unique identifier does not exist
		{
			return false;
		}
		if (row.getValue(Field.UNIQUE_IDENTIFIER_VALUE) == null)
		{
			return false;
		}
		
		if (this.checkIdentifierAlreadyExist(row))
		{
			return false;
		}
		
		if (this.checkUserMonthAlreadyExist(row))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean checkUserMonthAlreadyExist(Row row)
	{
		return false;
	}
	
	public boolean checkIdentifierAlreadyExist(Row row)
	{
		if (IDENTIIFIER_TABLES.indexOf(this.tableName) == -1) //if the table doesn't even require this check then just skip it
		{
			return false;
		}
		String countStr = "COUNT(*)";
		
		DbSelectHelper s = new DbSelectHelper(this.connection, this.tableName);
		s.addResultField(countStr);
		s.addConditionField(Field.UNIQUE_IDENTIFIER, row.getValue(Field.UNIQUE_IDENTIFIER));
		s.addConditionField(Field.UNIQUE_IDENTIFIER_VALUE, row.getValue(Field.UNIQUE_IDENTIFIER_VALUE));
		try
		{
			s.retrieveRows();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return true; //something went wrong, the row should fail the check to prevent going further
		}
		
		Row result = s.getRows().get(0);
		String count = result.getValue(countStr);
		if (count == null)
		{
			return true; //also fail here just in case
		}
		
		return !count.equals("0"); //if the count is 0, then the identifier does not exist
	}
}
