//change this to your own servlet mapped url
var servletUrl = "LanguageTrainingClientEnrollment"

function overrideNames()
{
	//Any fields for which you want to change the display name go here
	//ex. setName(UNIQUE_IDENTIFIER, "blah");
	//setName(UNIT, "Unit/Suite/Apt #: ");
}

function generatePageElements()
{

	addFieldElement(UPDATE_RECORD_ID);
	addFieldElement(UNIQUE_IDENTIFIER);
	addFieldElement(UNIQUE_IDENTIFIER_VALUE);
	addFieldElement(DATE_OF_BIRTH_YYYY_MM_DD);
	addFieldElement(POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
	addFieldElement(COURSE_CODE);
	addFieldElement(DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(SUPPORT_SERVICES_RECEIVED);
	addFieldElement(CARE_FOR_NEWCOMER_CHILDREN_CHILD);
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
	addFieldElement(TRANSPORTATION_CHILD);
	addFieldElement(PROVISIONS_FOR_DISABILITIES_CHILD);
	addFieldElement(TRANSLATION_CHILD);
	addFieldElement(BETWEEN_TRANSLATION);
	addFieldElement(AND_TRANSLATION);
	addFieldElement(INTERPRETATION_CHILD);
	addFieldElement(BETWEEN_INTERPRETATION);
	addFieldElement(AND_INTERPRETATION);
	addFieldElement(CRISIS_COUNSELLING_CHILD);
	addFieldElement(REASON_FOR_UPDATE);
}