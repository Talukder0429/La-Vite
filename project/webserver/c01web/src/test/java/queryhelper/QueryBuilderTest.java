package queryhelper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueryBuilderTest
{
	private final String TABLE = "testtable";
	private final String FIELD1 = "field1";
	private final String VALUE1 = "value1";
	private final String FIELD2 = "field2";
	private final String VALUE2 = "value2";
	
	/**
	 * test with insert 1 field
	 */
	@Test
	@DisplayName("insert 1")
	public void testInsert1()
	{
		QueryBuilder q = new QueryBuilder(TABLE);
		q.addParam(FIELD1, VALUE1);
		assertEquals(String.format("INSERT INTO %s(%s) VALUES(?)", TABLE, FIELD1), q.generateQueryString());
	}
	
	/**
	 * test with insert 2 fields
	 */
	@Test
	@DisplayName("insert 1")
	public void testInsert2()
	{
		QueryBuilder q = new QueryBuilder(TABLE);
		q.addParam(FIELD1, VALUE1);
		q.addParam(FIELD2, VALUE2);
		assertEquals(String.format("INSERT INTO %s(%s,%s) VALUES(?,?)", TABLE, FIELD1, FIELD2), q.generateQueryString());
	}
}
