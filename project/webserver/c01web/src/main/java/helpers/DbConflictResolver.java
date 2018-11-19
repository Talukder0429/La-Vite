package helpers;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
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
	/*TODO what to do for Language Training - Course Setup
		 * a) describing courses there
		 * b) describing a specific instance of person X taking course Y
		 */
	//contains the tables for which there can only be one row per person per month
	private static final List<String> MONTH_TABLES = Arrays.asList(
																	Field.TABLE_EMPLOYMENT,
																	Field.TABLE_COMMUNITY_CONNECTIONS,
																	Field.TABLE_INFORMATION_AND_ORIENTATION,
																	Field.TABLE_LANGUAGE_TRAINING_CLIENT_ENROLLMENT,
																	Field.TABLE_LANGUAGE_TRAINING_CLIENT_EXIT
																	);
	//this is a mapping, for each table there is a specific field that should be used as the date
	@SuppressWarnings("serial")
	private static final Map<String, String> FIELD_TYPES = Collections.unmodifiableMap(
		    new HashMap<String, String>() {
			{
				put(Field.TABLE_EMPLOYMENT, Field.REFERRAL_DATE_YYYY_MM_DD);
				put(Field.TABLE_COMMUNITY_CONNECTIONS, Field.START_DATE_YYYY_MM_DD);
				put(Field.TABLE_INFORMATION_AND_ORIENTATION, Field.START_DATE_OF_SERVICE_YYYY_MM_DD);
				put(Field.TABLE_LANGUAGE_TRAINING_CLIENT_ENROLLMENT, Field.DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD);
				put(Field.TABLE_LANGUAGE_TRAINING_CLIENT_EXIT, Field.DATE_CLIENT_EXITED_COURSE_YYYY_MM_DD);
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
		if (MONTH_TABLES.indexOf(this.tableName) == -1) //if the table doesn't even require this check then just skip it
		{
			return false;
		}
		
		String dateField = FIELD_TYPES.get(this.tableName);
		String dateValue = row.getValue(dateField);
		DateConverter date;
		try {
			date = new DateConverter(dateValue);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return true; //date in row cannot be converted into an actual date, so it is not a date
		}
		if (dateValue == null)
		{
			return false; //unexpected behaviour
		}
		
		DbSelectHelper dbsh = new DbSelectHelper(this.connection, this.tableName);
		dbsh.addResultField(dateField); //gets the specific date field that is used for the table
		dbsh.addConditionField(Field.UNIQUE_IDENTIFIER, row.getValue(Field.UNIQUE_IDENTIFIER));
		dbsh.addConditionField(Field.UNIQUE_IDENTIFIER_VALUE, row.getValue(Field.UNIQUE_IDENTIFIER_VALUE));
		try {
			dbsh.retrieveRows();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true; //something went wrong, the row should fail the check to prevent going further
		}
		
		for (Row dbrow : dbsh.getRows())
		{
			String dbDateString = dbrow.getValue(dateField);
			if (dbDateString == null)
			{
				continue; //unexpected behaviour
			}
			DateConverter dbDate;
			try {
				dbDate = new DateConverter(dbDateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue; //if date connot be converted, it shouldn't even be in database but if it is just skip
			}
			
			if (date.isSameYearAndMonth(dbDate)) //matching year and month
			{
				return true;
			}
		}
		
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
