//change this to your own servlet mapped url
var servletUrl = "LanguageTrainingCourseSetup"

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
	addFieldElement(COURSE_CODE);
	addFieldElement(NOTES);
	addFieldElement(COURSE_HELD_ON_AN_ONGOING_BASIS);
	addFieldElement(OFFICIAL_LANGUAGE_OF_PREFERENCE); // actual field is missing, should be called offical language of course
	addFieldElement(FORMAT_OF_TRAINING_PROVIDED);
	addFieldElement(CLASSES_HELD_AT);
	addFieldElement(IN_PERSON_INSTRUCTION_PERCENT);
	addFieldElement(ONLINE_DISTANCE_INSTRUCTION_PERCENT);
	addFieldElement(TOTAL_NUMBER_OF_SPOTS_IN_COURSE);
	addFieldElement(NUMBER_OF_IRCC_FUNDED_SPOTS_IN_COURSE);
	addFieldElement(NEW_STUDENTS_CAN_ENROL_IN_THE_COURSE);
	addFieldElement(SUPPORT_SERVICES_AVAILABLE_FOR_CLIENT_IN_THIS_COURSE);
	addFieldElement(CARE_FOR_NEWCOMER_CHILDREN);
	addFieldElement(TRANSPORTATION_ADULT);
	addFieldElement(TRANSPORTATION_CHILD);
	addFieldElement(PROVISIONS_FOR_DISABILITIES);
	addFieldElement(COURSE_START_DATE_YYYY_MM_DD);
	addFieldElement(COURSE_END_DATE_YYYY_MM_DD);
	addFieldElement(SCHEDULE_MORNING);
	addFieldElement(SCHEDULE_AFTERNOON);
	addFieldElement(SCHEDULE_EVENING);
	addFieldElement(SCHEDULE_ANYTIME);
	addFieldElement(SCHEDULE_WEEKEND);
	addFieldElement(SCHEDULE_ONLINE);
	addFieldElement(INSTRUCTIONAL_HOURS_PER_CLASS);
	addFieldElement(CLASSES_PER_WEEK);
	addFieldElement(WEEKS_OF_INSTRUCTION);
	addFieldElement(WEEKS_OF_INSTRUCTION_PER_YEAR);
	addFieldElement(DOMINANT_FOCUS_OF_THE_COURSE);
	addFieldElement(COURSE_DIRECTED_AT_A_SPECIFIC_TARGET_GROUP);
	addFieldElement(CHILDREN_0_14_YRS);
	addFieldElement(YOUTH_15_24_YRS);
	addFieldElement(SENIOR);
	addFieldElement(GENDER_SPECIFIC);
	addFieldElement(REFUGEES);
	addFieldElement(OFFICIAL_LANGUAGE_MINORITIES);
	addFieldElement(ETHNIC_CULTURAL_LINGUISTIC_GROUP);
	addFieldElement(DEAF_OR_HARD_OF_HEARING);
	addFieldElement(BLIND_OR_PARTIALLY_SIGHTED);
	addFieldElement(CLIENTS_WITH_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL);
	addFieldElement(LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ);
	addFieldElement(FAMILIES_PARENTS);
	addFieldElement(CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION);
	addFieldElement(CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE);
	addFieldElement(MATERIALS_USED_IN_COURSE);
	addFieldElement(CITIZENSHIP_PREPARATION);
	addFieldElement(PBLA_LANGUAGE_COMPANION);
	addFieldElement(CONTACT_NAME);
	addFieldElement(STREET_NUMBER);
	addFieldElement(STREET_NAME);
	addFieldElement(STREET_TYPE);
	addFieldElement(STREET_DIRECTION);
	addFieldElement(UNIT_SUITE_APT);
	addFieldElement(PROVINCE);
	addFieldElement(CITY);
	addFieldElement(POSTAL_CODE);
	addFieldElement(TELEPHONE_EXTENSION);
	//TELEPHONE_NUMBER
	addFieldElement(EMAIL_ADDRESS);
	addFieldElement(LISTENING_SKILL_LEVEL_1);
	addFieldElement(LISTENING_SKILL_LEVEL_2);
	addFieldElement(LISTENING_SKILL_LEVEL_3);
	addFieldElement(LISTENING_SKILL_LEVEL_4);
	addFieldElement(LISTENING_SKILL_LEVEL_5);
	addFieldElement(LISTENING_SKILL_LEVEL_6);
	addFieldElement(LISTENING_SKILL_LEVEL_7);
	addFieldElement(LISTENING_SKILL_LEVEL_8);
	addFieldElement(LISTENING_SKILL_LEVEL_9);
	addFieldElement(LISTENING_SKILL_LEVEL_10);
	addFieldElement(LISTENING_SKILL_LEVEL_11);
	addFieldElement(LISTENING_SKILL_LEVEL_12);
	addFieldElement(SPEAKING_SKILL_LEVEL_1);
	addFieldElement(SPEAKING_SKILL_LEVEL_2);
	addFieldElement(SPEAKING_SKILL_LEVEL_3);
	addFieldElement(SPEAKING_SKILL_LEVEL_4);
	addFieldElement(SPEAKING_SKILL_LEVEL_5);
	addFieldElement(SPEAKING_SKILL_LEVEL_6);
	addFieldElement(SPEAKING_SKILL_LEVEL_7);
	addFieldElement(SPEAKING_SKILL_LEVEL_8);
	addFieldElement(SPEAKING_SKILL_LEVEL_9);
	addFieldElement(SPEAKING_SKILL_LEVEL_10);
	addFieldElement(SPEAKING_SKILL_LEVEL_11);
	addFieldElement(SPEAKING_SKILL_LEVEL_12);
	addFieldElement(READING_SKILL_LEVEL_1);
	addFieldElement(READING_SKILL_LEVEL_2);
	addFieldElement(READING_SKILL_LEVEL_3);
	addFieldElement(READING_SKILL_LEVEL_4);
	addFieldElement(READING_SKILL_LEVEL_5);
	addFieldElement(READING_SKILL_LEVEL_6);
	addFieldElement(READING_SKILL_LEVEL_7);
	addFieldElement(READING_SKILL_LEVEL_8);
	addFieldElement(READING_SKILL_LEVEL_9);
	addFieldElement(READING_SKILL_LEVEL_10);
	addFieldElement(READING_SKILL_LEVEL_11);
	addFieldElement(READING_SKILL_LEVEL_12);
	addFieldElement(READING_SKILL_LEVEL_13);
	addFieldElement(READING_SKILL_LEVEL_14);
	addFieldElement(READING_SKILL_LEVEL_15);
	addFieldElement(READING_SKILL_LEVEL_16);
	addFieldElement(READING_SKILL_LEVEL_17);
	addFieldElement(WRITING_SKILL_LEVEL_1);
	addFieldElement(WRITING_SKILL_LEVEL_2);
	addFieldElement(WRITING_SKILL_LEVEL_3);
	addFieldElement(WRITING_SKILL_LEVEL_4);
	addFieldElement(WRITING_SKILL_LEVEL_5);
	addFieldElement(WRITING_SKILL_LEVEL_6);
	addFieldElement(WRITING_SKILL_LEVEL_7);
	addFieldElement(WRITING_SKILL_LEVEL_8);
	addFieldElement(WRITING_SKILL_LEVEL_9);
	addFieldElement(WRITING_SKILL_LEVEL_10);
	addFieldElement(WRITING_SKILL_LEVEL_11);
	addFieldElement(WRITING_SKILL_LEVEL_12);
	addFieldElement(WRITING_SKILL_LEVEL_13);
	addFieldElement(WRITING_SKILL_LEVEL_14);
	addFieldElement(WRITING_SKILL_LEVEL_15);
	addFieldElement(WRITING_SKILL_LEVEL_16);
	addFieldElement(WRITING_SKILL_LEVEL_17);
}