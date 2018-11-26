package helpers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DbUpdateHelperTest
{
	private final String TABLE = "testtable";
	private final String FIELD1 = "field1";
	private final String VALUE1 = "value1";
	private final String FIELD2 = "field2";
	private final String VALUE2 = "value2";
	private final String FIELD3 = "field3";
	private final String VALUE3 = "value3";
	private final String FIELD4 = "field4";
	private final String VALUE4 = "value4";
	
	/**
	 * test with 1 update field, no condition fields
	 */
	@Test
	@DisplayName("update 1, no conditions")
	public void testUpdate1NoConditions()
	{
		DbUpdateHelper u = new DbUpdateHelper(null, TABLE);
		u.addUpdateField(FIELD1, VALUE1);
		assertEquals(String.format("UPDATE %s SET %s=?", TABLE, FIELD1), u.buildQueryString());
	}
	
	/**
	 * test with 2 update fields, no condition fields
	 */
	@Test
	@DisplayName("update 2, no conditions")
	public void testUpdate2NoConditions()
	{
		DbUpdateHelper u = new DbUpdateHelper(null, TABLE);
		u.addUpdateField(FIELD1, VALUE1);
		u.addUpdateField(FIELD2, VALUE2);
		assertEquals(String.format("UPDATE %s SET %s=?,%s=?", TABLE, FIELD1, FIELD2), u.buildQueryString());
	}
	
	/**
	 * test with 1 update field, 1 condition field
	 */
	@Test
	@DisplayName("update 1, condition 1")
	public void testUpdate1Condition1()
	{
		DbUpdateHelper u = new DbUpdateHelper(null, TABLE);
		u.addUpdateField(FIELD1, VALUE1);
		u.addConditionField(FIELD2, VALUE2);
		assertEquals(String.format("UPDATE %s SET %s=? WHERE %s=?", TABLE, FIELD1, FIELD2), u.buildQueryString());
	}
	
	/**
	 * test with 2 update fields, 2 condition fields
	 */
	@Test
	@DisplayName("update 2, condition 2")
	public void testUpdate2Condition2()
	{
		DbUpdateHelper u = new DbUpdateHelper(null, TABLE);
		u.addUpdateField(FIELD1, VALUE1);
		u.addUpdateField(FIELD2, VALUE2);
		u.addConditionField(FIELD3, VALUE3);
		u.addConditionField(FIELD4, VALUE4);
		assertEquals(String.format("UPDATE %s SET %s=?,%s=? WHERE %s=? AND %s=?", TABLE, FIELD1, FIELD2, FIELD3, FIELD4), u.buildQueryString());
	}
	
	/**
	 * test with 2 update fields, 2 condition fields, overlapping field
	 */
	@Test
	@DisplayName("update 2, condition 2")
	public void testUpdate2Condition2OverlappingField()
	{
		DbUpdateHelper u = new DbUpdateHelper(null, TABLE);
		u.addUpdateField(FIELD1, VALUE1);
		u.addUpdateField(FIELD2, VALUE2);
		u.addConditionField(FIELD2, VALUE2);
		u.addConditionField(FIELD3, VALUE3);
		assertEquals(String.format("UPDATE %s SET %s=? WHERE %s=? AND %s=?", TABLE, FIELD1, FIELD2, FIELD3), u.buildQueryString());
	}
}
