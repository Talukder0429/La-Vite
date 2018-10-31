//Each new type goes here
const FIELDTYPE_STRING = "string";
const FIELDTYPE_BOOLEAN = "boolean";
const FIELDTYPE_SELECT = "select";

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////        NEW FIELDS GO HERE                                         /////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Regular string fields you fill on your own go here
const UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
const DATE_OF_BIRTH = "date_of_birth";
const PHONE_NUMBER = "phone_number";
const EMAIL_ADDRESS = "email_address";
const STREET_NUMBER = "street_number";
const STREET_NAME = "street_name";
const UNIT = "unit";
const CITY = "city";
const POSTAL_CODE = "postal_code";

//Boolean fields go here
const HAS_EMAIL_ADDRESS = "has_email_address";
const HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION = "has_consent_for_future_research_or_consultation";

//Fields that have a specific list of choices go here (ones that have drop-down lists)
const UNIQUE_IDENTIFIER = "unique_identifier";
const STREET_TYPE = "street_type";
const STREET_DIRECTION = "street_direction";
const PROVINCE = "province";
const OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";

var mapping = new Object();

function createMapping()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Regular string fields you fill on your own go here
	setType(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
	setType(DATE_OF_BIRTH, FIELDTYPE_STRING);
	setType(PHONE_NUMBER, FIELDTYPE_STRING);
	setType(EMAIL_ADDRESS, FIELDTYPE_STRING);
	setType(STREET_NUMBER, FIELDTYPE_STRING);
	setType(STREET_NAME, FIELDTYPE_STRING);
	setType(UNIT, FIELDTYPE_STRING);
	setType(CITY, FIELDTYPE_STRING);
	setType(POSTAL_CODE, FIELDTYPE_STRING);
	
	//Boolean fields go here
	setType(HAS_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
	setType(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION, FIELDTYPE_BOOLEAN);
	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	setType(UNIQUE_IDENTIFIER, FIELDTYPE_SELECT);
	setType(STREET_TYPE, FIELDTYPE_SELECT);
	setType(STREET_DIRECTION, FIELDTYPE_SELECT);
	setType(PROVINCE, FIELDTYPE_SELECT);
	setType(OFFICIAL_LANGUAGE_OF_PREFERENCE, FIELDTYPE_SELECT);
}

function setType(field, type)
{
	mapping[field] = type;
}