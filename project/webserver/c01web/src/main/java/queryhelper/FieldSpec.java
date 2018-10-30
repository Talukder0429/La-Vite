package queryhelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldSpec
{
	@SuppressWarnings("serial")
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
	
	
	
	//These methods are actually done this way since wherever type checks are used it will require its own piece for each type
	//so gain nothing by generalizing all type checks into one method other than making parameters more complex 
	public static final boolean IsString(String field)
	{
		return (FIELD_TYPES.get(field) == FIELDTYPE_STRING);
	}
	
	public static final boolean IsBoolean(String field)
	{
		return (FIELD_TYPES.get(field) == FIELDTYPE_BOOLEAN);
	}
}
