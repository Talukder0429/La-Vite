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
				// TODO
				//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//////////////////////////////        NEW FIELDS GO HERE                                         /////////
				//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//Regular string fields you fill on your own go here
		        put(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
		        put(DATE_OF_BIRTH, FIELDTYPE_STRING);
		        put(PHONE_NUMBER, FIELDTYPE_STRING);
		        put(EMAIL_ADDRESS, FIELDTYPE_STRING);
		        put(STREET_NUMBER, FIELDTYPE_STRING);
		        put(STREET_NAME, FIELDTYPE_STRING);
		        put(UNIT, FIELDTYPE_STRING);
		        put(CITY, FIELDTYPE_STRING);
		        put(POSTAL_CODE, FIELDTYPE_STRING);
		        
		        //Boolean fields go here
		        put(HAS_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
		        put(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION, FIELDTYPE_BOOLEAN);
		        
		        //Fields that have a specific list of choices go here (ones that have drop-down lists)
		        put(UNIQUE_IDENTIFIER, FIELDTYPE_STRING);
		        put(STREET_TYPE, FIELDTYPE_STRING);
		        put(STREET_DIRECTION, FIELDTYPE_STRING);
		        put(PROVINCE, FIELDTYPE_STRING);
		        put(OFFICIAL_LANGUAGE_OF_PREFERENCE, FIELDTYPE_STRING);
		    }});
	
	
	
	//Each new type goes here
	public static final String FIELDTYPE_STRING = "string";
	public static final String FIELDTYPE_BOOLEAN = "boolean";
	
	
	
	//Each new table has it's referenced name go here
	public static final String TABLE_CLIENT_PROFILE = "client_profile";
	
	
	
	// TODO
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////        NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Regular string fields you fill on your own go here
	public static final String UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
	public static final String DATE_OF_BIRTH = "date_of_birth";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String STREET_NUMBER = "street_number";
	public static final String STREET_NAME = "street_name";
	public static final String UNIT = "unit";
	public static final String CITY = "city";
	public static final String POSTAL_CODE = "postal_code";
	
	//Boolean fields go here
	public static final String HAS_EMAIL_ADDRESS = "has_email_address";
	public static final String HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION = "has_consent_for_future_research_or_consultation";
	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	public static final String UNIQUE_IDENTIFIER = "unique_identifier";
	public static final String STREET_TYPE = "street_type";
	public static final String STREET_DIRECTION = "street_direction";
	public static final String PROVINCE = "province";
	public static final String OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";
	
	
	
	public static final boolean isType(String field, String type)
	{
		return (FIELD_TYPES.get(field) == type);
	}
}
