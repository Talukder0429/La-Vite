//change this to your own servlet mapped url
var servletUrl = "InformationAndOrientation"

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
	addFieldElement(START_DATE_OF_SERVICE_YYYY_MM_DD);
	addFieldElement(LANGUAGE_OF_SERVICE);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE);
	addFieldElement(TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
	addFieldElement(REFERRED_BY);
	addFieldElement(SERVICE_RECEIVED);
	addFieldElement(TOTAL_LENGTH_OF_ORIENTATION);
	addFieldElement(TOTAL_LENGTH_OF_ORIENTATION_HOURS);
	addFieldElement(TOTAL_LENGTH_OF_ORIENTATION_MINUTES);
	addFieldElement(NUMBER_OF_CLIENTS_IN_GROUP);
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
	addFieldElement(OVERVIEW_OF_CANADA);
	addFieldElement(OVERVIEW_OF_CANADA_REFERRALS);
	addFieldElement(SOURCES_OF_INFORMATION);
	addFieldElement(SOURCES_OF_INFORMATION_REFERRALS);
	addFieldElement(RIGHTS_AND_FREEDOMS);
	addFieldElement(RIGHTS_AND_FREEDOMS_REFERRALS);
	addFieldElement(CANADIAN_LAW_AND_JUSTICE);
	addFieldElement(CANADIAN_LAW_AND_JUSTICE_REFERRALS);
	addFieldElement(IMPORTANT_DOCUMENTS);
	addFieldElement(IMPORTANT_DOCUMENTS_REFERRALS);
	addFieldElement(IMPROVING_ENGLISH_OR_FRENCH);
	addFieldElement(IMPROVING_ENGLISH_OR_FRENCH_REFERRALS);
	addFieldElement(EMPLOYMENT_AND_INCOME);
	addFieldElement(EMPLOYMENT_AND_INCOME_REFERRALS);
	addFieldElement(EDUCATION);
	addFieldElement(EDUCATION_REFERRALS);
	addFieldElement(HOUSING);
	addFieldElement(HOUSING_REFERRALS);
	addFieldElement(HEALTH);
	addFieldElement(HEALTH_REFERRALS);
	addFieldElement(MONEY_AND_FINANCES);
	addFieldElement(MONEY_AND_FINANCES_REFERRALS);
	addFieldElement(TRANSPORTATION_ADULT);
	addFieldElement(TRANSPORTATION_REFERRALS);
	addFieldElement(COMMUNICATIONS_AND_MEDIA);
	addFieldElement(COMMUNICATIONS_AND_MEDIA_REFERRALS);
	addFieldElement(COMMUNITY_ENGAGEMENT);
	addFieldElement(COMMUNITY_ENGAGEMENT_REFERRALS);
	addFieldElement(BECOMING_A_CANADIAN_CITIZEN);
	addFieldElement(BECOMING_A_CANADIAN_CITIZEN_REFERRALS);
	addFieldElement(INTERPERSONAL_CONFLICT);
	addFieldElement(INTERPERSONAL_CONFLICT_REFERRALS);
	addFieldElement(WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
	addFieldElement(COMPUTER_SKILLS);
	addFieldElement(DOCUMENT_USE);
	addFieldElement(INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
	addFieldElement(LEADERSHIP_TRAINING);
	addFieldElement(NUMERACY);
	addFieldElement(WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE);
	addFieldElement(LIFE_SKILLS);
	addFieldElement(RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA);
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
	addFieldElement(END_DATE_OF_SERVICE_YYYY_MM_DD);
	addFieldElement(REASON_FOR_UPDATE);
}
