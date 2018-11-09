//change this to your own servlet mapped url
var servletUrl = "Employment"

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
	addFieldElement(POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
	addFieldElement(REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION);
	addFieldElement(A_REFERRAL_TO);
	addFieldElement(LANGUAGE_OF_SERVICE);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
	addFieldElement(REFERRED_BY);
	addFieldElement(REFERRAL_DATE_YYYY_MM_DD);
	addFieldElement(EMPLOYMENT_STATUS);
	addFieldElement(EDUCATION_STATUS);
	addFieldElement(OCCUPATION_IN_CANADA);
	addFieldElement(INTENDED_OCCUPATION);
	addFieldElement(INTERVENTION_TYPE);
	addFieldElement(LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED);
	addFieldElement(LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION);
	addFieldElement(LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION);
	addFieldElement(LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD);
	addFieldElement(LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD);
	addFieldElement(LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER);
	addFieldElement(LONG_TERM_INTERVENTION_PLACEMENT_WAS);
	addFieldElement(LONG_TERM_INTERVENTION_HOURS_PER_WEEK);
	addFieldElement(LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT);
	addFieldElement(LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR);
	addFieldElement(LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED);
	addFieldElement(WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
	addFieldElement(COMPUTER_SKILLS);
	addFieldElement(DOCUMENT_USE);
	addFieldElement(INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
	addFieldElement(LEADERSHIP_TRAINING);
	addFieldElement(NUMERACY);
	addFieldElement(SHORT_TERM_INTERVENTION_SERVICE_RECEIVED);
	addFieldElement(SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD);
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
	addFieldElement(TRANSPORTATION_ADULT);
	addFieldElement(TRANSPORTATION_CHILD);
	addFieldElement(PROVISIONS_FOR_DISABILITIES_CHILD);
	addFieldElement(TRANSLATION_CHILD);
	addFieldElement(BETWEEN_TRANSLATION);
	addFieldElement(AND_TRANSLATION);
	addFieldElement(INTERPRETATION_CHILD);
	addFieldElement(BETWEEN_INTERPRETATION);
	addFieldElement(AND_INTERPRETATION);
	addFieldElement(CRISIS_COUNSELLING_CHILD);
	addFieldElement(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS);
	addFieldElement(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES);
	addFieldElement(REASON_FOR_UPDATE);
}