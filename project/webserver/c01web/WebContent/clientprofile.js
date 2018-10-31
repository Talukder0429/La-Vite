var elements = new Array();
var servletUrl = "ClientProfile"

function Init()
{
	mapTypes();
	//mapNames();
	mapLists();
	overrideNames();
	
	findForm();
	
	generatePageElements();
}

function overrideNames()
{
	//Any fields for which you want to change the display name go here
	//ex. setName(UNIQUE_IDENTIFIER, "blah");
	setName(UNIT, "Unit/Suite/Apt #: ");
}

function generatePageElements()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//addFieldElement(UNIQUE_IDENTIFIER);
	addFieldElement(UNIQUE_IDENTIFIER_VALUE);
	addFieldElement(DATE_OF_BIRTH);
	addFieldElement(PHONE_NUMBER);
	addFieldElement(HAS_EMAIL_ADDRESS);
	addFieldElement(EMAIL_ADDRESS);
	addFieldElement(STREET_NUMBER);
	addFieldElement(STREET_NAME);
	//addFieldElement(STREET_TYPE);
	//addFieldElement(STREET_DIRECTION);
	addFieldElement(UNIT);
	addFieldElement(CITY);
	addFieldElement(PROVINCE);
	addFieldElement(POSTAL_CODE);
	//addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION);
}

function submit()
{
	sendRequest(servletUrl);
}

//important leave this
window.onload = Init;
