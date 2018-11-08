//change this to your own servlet mapped url
var servletUrl = "ClientProfile"

function overrideNames()
{
	//Any fields for which you want to change the display name go here
	//ex. setName(UNIQUE_IDENTIFIER, "blah");
	//setName(UNIT, "Unit/Suite/Apt #: ");
}

function generatePageElements()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	addFieldElement(UNIQUE_IDENTIFIER);
	addFieldElement(UNIQUE_IDENTIFIER_VALUE);
	addFieldElement(DATE_OF_BIRTH_YYYY_MM_DD);
	addFieldElement(PHONE_NUMBER);
	addFieldElement(DOES_THE_CLIENT_HAVE_AN_EMAIL_ADDRESS);
	addFieldElement(EMAIL_ADDRESS);
	addFieldElement(STREET_NUMBER);
	addFieldElement(STREET_NAME);
	addFieldElement(STREET_TYPE);
	addFieldElement(STREET_DIRECTION);
	addFieldElement(UNIT_SUITE_APT);
	addFieldElement(CITY);
	addFieldElement(PROVINCE);
	addFieldElement(POSTAL_CODE);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION);
}
