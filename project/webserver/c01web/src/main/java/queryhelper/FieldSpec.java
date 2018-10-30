package queryhelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldSpec
{
	private static final Map<String, String> FIELD_TYPES = Collections.unmodifiableMap(
		    new HashMap<String, String>() {
			{
				//Each new field must have a type associated to it
		        put(UNIQUE_IDENTIFIER, FIELDTYPE_STRING);
		        put(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
		    }});
	
	//Each new type goes here
	public static final String FIELDTYPE_STRING = "string";
	public static final String FIELDTYPE_BOOLEAN = "boolean";
	
	//Each new field has it's referenced name go here
	public static final String UNIQUE_IDENTIFIER = "unique_identifier";
	public static final String UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
	
	public static final String GetType(String field)
	{
		return FIELD_TYPES.get(field);
	}
}
