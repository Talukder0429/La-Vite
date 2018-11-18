package helpers;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import queryhelper.Field;
import queryhelper.Row;

public class DbConflictResolver
{
	//contains the tables for which there can only be one row per person, so the important thing is to not have duplicate unique identifiers
	private static final List<String> identifierTables = Arrays.asList(Field.TABLE_CLIENT_PROFILE, Field.TABLE_NEEDS_ASSESSMENT_AND_REFERRALS);
	
	private String tableName;
	private Connection connection;
	
	public DbConflictResolver(Connection connection, String tableName)
	{
		this.tableName = tableName;
		this.connection = connection;
	}
	
	public boolean checkRowValid(Row row)
	{
		
		return true;
	}
	
	public boolean checkIdentifierNotExist()
	{
		if (identifierTables.indexOf(this.tableName) == -1) //if the table doesn't even require this check then just skip it
		{
			return true;
		}
		
		DbSelectHelper s = new DbSelectHelper(this.connection, this.tableName);
		s.addResultField("COUNT(*)");
		
		return true;
	}
}
