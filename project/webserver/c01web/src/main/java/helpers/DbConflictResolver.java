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
	public static final List<String> MONTH_TABLES = Arrays.asList(
																	Field.TABLE_EMPLOYMENT,
																	Field.TABLE_COMMUNITY_CONNECTIONS,
																	Field.TABLE_INFORMATION_AND_ORIENTATION,
																	Field.TABLE_LANGUAGE_TRAINING_CLIENT_ENROLLMENT,
																	Field.TABLE_LANGUAGE_TRAINING_CLIENT_EXIT
																	);
	//this is a mapping, for each table there is a specific field that should be used as the date
	@SuppressWarnings("serial")
	public static final Map<String, String> DATE_MAPS = Collections.unmodifiableMap(
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
	
	//If conflicting row exists, that row is returned, returning null means that there is no conflict
	public Row checkUserMonthAlreadyExist(Row row) throws ParseException
	{
		if (MONTH_TABLES.indexOf(this.tableName) == -1) //if the table doesn't even require this check then just skip it
		{
			return null;
		}
		
		String dateField = DATE_MAPS.get(this.tableName);
		String dateValue = row.getValue(dateField);
		DateConverter date = new DateConverter(dateValue);
		
		DbSelectHelper dbsh = new DbSelectHelper(this.connection, this.tableName);
		dbsh.addConditionField(Field.UNIQUE_IDENTIFIER, row.getValue(Field.UNIQUE_IDENTIFIER));
		dbsh.addConditionField(Field.UNIQUE_IDENTIFIER_VALUE, row.getValue(Field.UNIQUE_IDENTIFIER_VALUE));
		try {
			dbsh.retrieveRows();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return row; //something went wrong, the row should fail the check to prevent going further
		}
		
		//for (Row dbrow : dbsh.getRows())
		for (int a = 0; a < dbsh.getRows().size(); a++)
		{
			Row dbrow = dbsh.getRows().get(a);
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
				return dbrow;
			}
		}
		
		return null;
	}
	
	//If conflicting row exists, that row is returned, returning null means that there is no conflict
	public Row checkIdentifierAlreadyExist(Row row) throws SQLException
	{
		if (IDENTIIFIER_TABLES.indexOf(this.tableName) == -1) //if the table doesn't even require this check then just skip it
		{
			return null;
		}
		//String countStr = "COUNT(*)";
		
		DbSelectHelper s = new DbSelectHelper(this.connection, this.tableName);
		//s.addResultField(countStr);
		s.addConditionField(Field.UNIQUE_IDENTIFIER, row.getValue(Field.UNIQUE_IDENTIFIER));
		s.addConditionField(Field.UNIQUE_IDENTIFIER_VALUE, row.getValue(Field.UNIQUE_IDENTIFIER_VALUE));
		s.retrieveRows();
		
		//Row result = s.getRows().get(0);
		int count = s.getRows().size();
		if (count == 0)
		{
			return null;
		}
		return s.getRows().get(0);
	}
}
