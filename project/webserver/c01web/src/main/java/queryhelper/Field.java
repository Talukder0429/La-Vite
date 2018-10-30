package queryhelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Field
{
	@SuppressWarnings("serial")
	private static final Map<String, String> FIELD_TYPES = Collections.unmodifiableMap(
		    new HashMap<String, String>() {
			{
				//Each new field must have a type associated to it
		        put(UNIQUE_IDENTIFIER, FIELDTYPE_STRING);
		        put(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
		        put(DATE_OF_BIRTH, FIELDTYPE_STRING);
		        put(PHONE_NUMBER, FIELDTYPE_STRING);
		        put(HAS_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
		        put(EMAIL_ADDRESS, FIELDTYPE_STRING);
		        put(STREET_NUMBER, FIELDTYPE_STRING);
		        put(STREET_NAME, FIELDTYPE_STRING);
		        put(STREET_TYPE, FIELDTYPE_STRING);
		        put(STREET_DIRECTION, FIELDTYPE_STRING);
		        put(UNIT, FIELDTYPE_STRING);
		        put(CITY, FIELDTYPE_STRING);
		        put(PROVINCE, FIELDTYPE_STRING);
		        put(POSTAL_CODE, FIELDTYPE_STRING);
		        put(LANGUAGE, FIELDTYPE_STRING);
		        put(HAS_CONSENT, FIELDTYPE_BOOLEAN);
		    }});
	
	
	
	//Each new type goes here
	public static final String FIELDTYPE_STRING = "string";
	public static final String FIELDTYPE_BOOLEAN = "boolean";
	
	
	
	//Each new table has it's referenced name go here
	public static final String TABLE_CLIENT_PROFILE = "client_profile";
	
	
	
	//Each new field has it's referenced name go here
	public static final String UNIQUE_IDENTIFIER = "unique_identifier";
	public static final String UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
	public static final String DATE_OF_BIRTH = "date_of_birth";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String HAS_EMAIL_ADDRESS = "has_email_address";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String STREET_NUMBER = "street_number";
	public static final String STREET_NAME = "street_name";
	public static final String STREET_TYPE = "street_type";
	public static final String STREET_DIRECTION = "street_direction";
	public static final String UNIT = "unit";
	public static final String CITY = "city";
	public static final String PROVINCE = "province";
	public static final String POSTAL_CODE = "postal_code";
	public static final String LANGUAGE = "language";
	public static final String HAS_CONSENT = "has_consent";
	
	
	
	public static final boolean isType(String field, String type)
	{
		return (FIELD_TYPES.get(field) == type);
	}
}
