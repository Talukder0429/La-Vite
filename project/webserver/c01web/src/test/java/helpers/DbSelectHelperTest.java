package helpers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DbSelectHelperTest
{
	private final String TABLE = "testtable";
	private final String FIELD1 = "field1";
	private final String VALUE1 = "value1";
	private final String FIELD2 = "field2";
	private final String VALUE2 = "value2";
	private final String FIELD3 = "field3";
	private final String FIELD4 = "field4";
	
	/**
	 * test with no result or condition fields
	 */
	@Test
	@DisplayName("select all, no conditions")
	public void testSelectAllNoConditions()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		assertEquals(String.format("SELECT * FROM %s;", TABLE), s.buildQueryString());
	}
	
	/**
	 * test with 1 result field, no condition fields
	 */
	@Test
	@DisplayName("select 1 column, no conditions")
	public void testSelect1ColumnNoConditions()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		s.addResultField(FIELD1);
		assertEquals(String.format("SELECT %s FROM %s;", FIELD1, TABLE), s.buildQueryString());
	}
	
	/**
	 * test with no result, 1 conditon field
	 */
	@Test
	@DisplayName("select 1 column, no conditions")
	public void testSelectAll1ConditionField()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		s.addConditionField(FIELD1, VALUE1);
		assertEquals(String.format("SELECT * FROM %s WHERE %s=\"%s\";", TABLE, FIELD1, VALUE1), s.buildQueryString());
	}
	
	/**
	 * test with 2 result, 2 conditon fields
	 */
	@Test
	@DisplayName("select 2 columns, 2 condition fields")
	public void testSelect2Columns2ConditionFields()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		s.addConditionField(FIELD1, VALUE1);
		s.addConditionField(FIELD2, VALUE2);
		s.addResultField(FIELD3);
		s.addResultField(FIELD4);
		assertEquals(String.format("SELECT %s,%s FROM %s WHERE %s=\"%s\" AND %s=\"%s\";", FIELD3, FIELD4, TABLE, FIELD1, VALUE1, FIELD2, VALUE2), s.buildQueryString());
	}
	
	/**
	 * test with 2 result, 2 conditon fields, distinct
	 */
	@Test
	@DisplayName("select 2 columns, 2 condition fields, distinct")
	public void testSelect2Columns2ConditionFieldsDistinct()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		s.addConditionField(FIELD1, VALUE1);
		s.addConditionField(FIELD2, VALUE2);
		s.addResultField(FIELD3);
		s.addResultField(FIELD4);
		s.setDistinct(true);
		assertEquals(String.format("SELECT DISTINCT %s,%s FROM %s WHERE %s=\"%s\" AND %s=\"%s\";", FIELD3, FIELD4, TABLE, FIELD1, VALUE1, FIELD2, VALUE2), s.buildQueryString());
	}
	
	/**
	 * test with no result or condition fields, distinct
	 */
	@Test
	@DisplayName("select all columns, no conditon fields, distinct")
	public void testSelectAllNoConditionsDistinct()
	{
		DbSelectHelper s = new DbSelectHelper(null, TABLE);
		s.setDistinct(true);
		assertEquals(String.format("SELECT DISTINCT * FROM %s;", TABLE), s.buildQueryString());
	}
}
