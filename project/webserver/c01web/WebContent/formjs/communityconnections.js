//change this to your own servlet mapped url
var servletUrl = "CommunityConnections"

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
	addFieldElement(LANGUAGE_OF_SERVICE);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(REFERRED_BY);
	addFieldElement(ACTIVITY_UNDER_WHICH_CLIENT_RECEIVED_SERVICES);
	addFieldElement(TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
	addFieldElement(TYPE_OF_EVENT_ATTENDED);
	addFieldElement(TYPE_OF_SERVICE);
	addFieldElement(MAIN_TOPIC_FOCUS_OF_THE_SERVICE_RECEIVED);
	addFieldElement(SERVICE_RECEIVED);
	addFieldElement(NUMBER_OF_UNIQUE_PARTICIPANTS);
	addFieldElement(DID_VOLUNTEERS_FROM_THE_HOST_COMMUNITY_PARTICIPATE_IN_THE_ACTIVITY);
	addFieldElement(DIRECTED_AT_A_SPECIFIC_TARGET_GROUP);
	addFieldElement(TARGET_GROUP_CHILDREN_0_14_YRS);
	addFieldElement(TARGET_GROUP_YOUTH_15_24_YRS);
	addFieldElement(TARGET_GROUP_SENIOR);
	addFieldElement(TARGET_GROUP_GENDER_SPECIFIC);
	addFieldElement(TARGET_GROUP_REFUGEES);
	addFieldElement(TARGET_GROUP_ETHNIC_CULTURAL_LINGUISTIC_GROUP);
	addFieldElement(TARGET_GROUP_DEAF_OR_HARD_OF_HEARING);
	addFieldElement(TARGET_GROUP_BLIND_OR_PARTIALLY_SIGHTED);
	addFieldElement(TARGET_GROUP_LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ);
	addFieldElement(TARGET_GROUP_FAMILIES_PARENTS);
	addFieldElement(TARGET_GROUP_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL);
	addFieldElement(TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION);
	addFieldElement(TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE);
	addFieldElement(TARGET_GROUP_OFFICIAL_LANGUAGE_MINORITIES);
	addFieldElement(STATUS_OF_SERVICE);
	addFieldElement(REASON_FOR_LEAVING_SERVICE);
	addFieldElement(START_DATE_YYYY_MM_DD);
	addFieldElement(END_DATE_YYYY_MM_DD);
	addFieldElement(PROJECTED_END_DATE_YYYY_MM_DD);
	addFieldElement(WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
	addFieldElement(COMPUTER_SKILLS);
	addFieldElement(DOCUMENT_USE);
	addFieldElement(INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
	addFieldElement(LEADERSHIP_TRAINING);
	addFieldElement(LIFE_SKILLS);
	addFieldElement(NUMERACY);
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
	addFieldElement(TRANSPORTATION_CHILD);
	addFieldElement(PROVISIONS_FOR_DISABILITIES);
	addFieldElement(TRANSLATION);
	addFieldElement(BETWEEN_TRANSLATION);
	addFieldElement(AND_TRANSLATION);
	addFieldElement(INTERPRETATION);
	addFieldElement(BETWEEN_INTERPRETATION);
	addFieldElement(AND_INTERPRETATION);
	addFieldElement(CRISIS_COUNSELLING);
	addFieldElement(TOTAL_LENGTH_OF_SERVICE_HOURS);
	addFieldElement(TOTAL_LENGTH_OF_SERVICE_MINUTES);
	addFieldElement(REASON_FOR_UPDATE);
}
