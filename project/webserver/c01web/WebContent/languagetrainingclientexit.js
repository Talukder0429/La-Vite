//change this to your own servlet mapped url
var servletUrl = "LanguageTrainingClientExit"

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
	addFieldElement(COURSE_CODE);
	addFieldElement(CLIENTS_TRAINING_STATUS);
	addFieldElement(DATE_CLIENT_EXITED_COURSE_YYYY_MM_DD);
	addFieldElement(REASON_FOR_EXITING_COURSE);
	addFieldElement(LISTENING_CLB_LEVEL);
	addFieldElement(READING_CLB_LEVEL);
	addFieldElement(SPEAKING_CLB_LEVEL);
	addFieldElement(WRITING_CLB_LEVEL);
	addFieldElement(WAS_A_CERTIFICATE_ISSUED_TO_THE_CLIENT);
	addFieldElement(LISTENING_LEVEL_INDICATED_ON_CERTIFICATE);
	addFieldElement(SPEAKING_LEVEL_INDICATED_ON_CERTIFICATE);
	addFieldElement(SUPPORT_SERVICES_RECEIVED);
	addFieldElement(CARE_FOR_NEWCOMER_CHILDREN);
	addFieldElement(CHILD_1_AGE);
	addFieldElement(CHILD_1_TYPE_OF_CARE);
	addFieldElement(CHILD_2_AGE);
	addFieldElement(CHILD_2_TYPE_OF_CARE);
	addFieldElement(CHILD_3_AGE);
	addFieldElement(CHILD_3_TYPE_OF_CARE);
	addFieldElement(CHILD_4_AGE);
	addFieldElement(CHILD_4_TYPE_OF_CARE);
	addFieldElement(CHILD_5_AGE);
	addFieldElement(CHILD_5_TYPE_OF_CARE);
	addFieldElement(TRANSPORTATION_ADULT);
	addFieldElement(TRANSPORTATION_CHILD);
	addFieldElement(PROVISIONS_FOR_DISABILITIES);
	addFieldElement(TRANSLATION);
	addFieldElement(BETWEEN_TRANSLATION);
	addFieldElement(AND_TRANSLATION);
	addFieldElement(INTERPRETATION);
	addFieldElement(BETWEEN_INTERPRETATION);
	addFieldElement(AND_INTERPRETATION);
	addFieldElement(CRISIS_COUNSELLING);
	addFieldElement(REASON_FOR_UPDATE);
	
}