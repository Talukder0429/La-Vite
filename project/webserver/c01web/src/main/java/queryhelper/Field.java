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
				
				//was missing from aggregate form
				put(TELEPHONE_NUMBER, FIELDTYPE_STRING);
				put(WAS_A_CERTIFICATE_ISSUED_TO_THE_CLIENT, FIELDTYPE_BOOLEAN);
				//
				
		        put(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
		        put(PHONE_NUMBER, FIELDTYPE_STRING);
		        put(EMAIL_ADDRESS, FIELDTYPE_STRING);
		        put(STREET_NUMBER, FIELDTYPE_STRING);
		        put(STREET_NAME, FIELDTYPE_STRING);
		        put(UNIT_SUITE_APT, FIELDTYPE_STRING);
		        put(CITY, FIELDTYPE_STRING);
		        put(POSTAL_CODE, FIELDTYPE_STRING);
		        
		        put(END_DATE_OF_SERVICE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(START_DATE_OF_ASSESSMENT_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(END_DATE_OF_ASSESSMENT_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(REFERRAL_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS, FIELDTYPE_STRING);
		        put(COURSE_CODE, FIELDTYPE_STRING);
		        put(DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(NOTES, FIELDTYPE_STRING);
		        put(IN_PERSON_INSTRUCTION_PERCENT, FIELDTYPE_STRING);
		        put(ONLINE_DISTANCE_INSTRUCTION_PERCENT, FIELDTYPE_STRING);
		        put(TOTAL_NUMBER_OF_SPOTS_IN_COURSE, FIELDTYPE_STRING);
		        
		        	//103
		        put(PROCESSING_DETAILS, FIELDTYPE_STRING);
		        put(UPDATE_RECORD_ID, FIELDTYPE_STRING);
		        put(DATE_OF_BIRTH_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED, FIELDTYPE_STRING);
		        put(START_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(END_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(PROJECTED_END_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
		        put(START_DATE_OF_SERVICE_YYYY_MM_DD, FIELDTYPE_STRING);
		        
		        	//207-309
		        put(NUMBER_OF_IRCC_FUNDED_SPOTS_IN_COURSE, FIELDTYPE_STRING);
				put(COURSE_START_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
				put(COURSE_END_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
				put(CONTACT_NAME, FIELDTYPE_STRING);
				put(TELEPHONE_EXTENSION, FIELDTYPE_STRING);
				put(DATE_CLIENT_EXITED_COURSE_YYYY_MM_DD, FIELDTYPE_STRING);
		        
		        //Boolean fields go here
		        put(DOES_THE_CLIENT_HAVE_AN_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
		        put(CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION, FIELDTYPE_BOOLEAN);
		        
		        put(INTERPERSONAL_CONFLICT, FIELDTYPE_BOOLEAN);
		        put(INTERPERSONAL_CONFLICT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE, FIELDTYPE_BOOLEAN);
		        put(RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA, FIELDTYPE_BOOLEAN);
		        put(INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT, FIELDTYPE_BOOLEAN);
		        put(INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(IMPROVE_LANGUAGE_SKILLS, FIELDTYPE_BOOLEAN);
		        put(IMPROVE_LANGUAGE_SKILLS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(IMPROVE_OTHER_SKILLS, FIELDTYPE_BOOLEAN);
		        put(IMPROVE_OTHER_SKILLS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(FIND_EMPLOYMENT, FIELDTYPE_BOOLEAN);
		        put(FIND_EMPLOYMENT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(SUPPORT_SERVICES_MAY_BE_REQUIRED, FIELDTYPE_BOOLEAN);
		        put(NON_IRCC_PROGRAM_SERVICES_NEEDED, FIELDTYPE_BOOLEAN);
		        put(FOOD_CLOTHING_OTHER_MATERIAL_NEEDS, FIELDTYPE_BOOLEAN);
		        put(FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(HOUSING_ACCOMMODATION, FIELDTYPE_BOOLEAN);
		        put(HOUSING_ACCOMMODATION_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(HEALTH_MENTAL_HEALTH_WELL_BEING, FIELDTYPE_BOOLEAN);
		        put(HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(FINANCIAL, FIELDTYPE_BOOLEAN);
		        put(FINANCIAL_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(FAMILY_SUPPORT, FIELDTYPE_BOOLEAN);
		        put(FAMILY_SUPPORT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(LANGUAGE_NON_IRCC, FIELDTYPE_BOOLEAN);
		        put(LANGUAGE_NON_IRCC_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(EDUCATION_SKILLS_DEVELOPMENT, FIELDTYPE_BOOLEAN);
		        put(EDUCATION_SKILLS_DEVELOPMENT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(EMPLOYMENT_RELATED, FIELDTYPE_BOOLEAN);
		        put(EMPLOYMENT_RELATED_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(LEGAL_INFORMATION_AND_SERVICES, FIELDTYPE_BOOLEAN);
		        put(LEGAL_INFORMATION_AND_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(COMMUNITY_SERVICES, FIELDTYPE_BOOLEAN);
		        put(COMMUNITY_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT, FIELDTYPE_BOOLEAN);
		        put(CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION, FIELDTYPE_BOOLEAN);
		        put(REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION, FIELDTYPE_BOOLEAN);
		        put(COURSE_HELD_ON_AN_ONGOING_BASIS, FIELDTYPE_BOOLEAN);
		        
		        	//103
		        put(DID_VOLUNTEERS_FROM_THE_HOST_COMMUNITY_PARTICIPATE_IN_THE_ACTIVITY, FIELDTYPE_BOOLEAN);
		        put(DIRECTED_AT_A_SPECIFIC_TARGET_GROUP, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_CHILDREN_0_14_YRS, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_YOUTH_15_24_YRS, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_SENIOR, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_GENDER_SPECIFIC, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_REFUGEES, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_ETHNIC_CULTURAL_LINGUISTIC_GROUP, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_DEAF_OR_HARD_OF_HEARING, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_BLIND_OR_PARTIALLY_SIGHTED, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_FAMILIES_PARENTS, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE, FIELDTYPE_BOOLEAN);
		        put(TARGET_GROUP_OFFICIAL_LANGUAGE_MINORITIES, FIELDTYPE_BOOLEAN);
		        put(WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE, FIELDTYPE_BOOLEAN);
		        put(COMPUTER_SKILLS, FIELDTYPE_BOOLEAN);
		        put(DOCUMENT_USE, FIELDTYPE_BOOLEAN);
		        put(INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE, FIELDTYPE_BOOLEAN);
		        put(LEADERSHIP_TRAINING, FIELDTYPE_BOOLEAN);
		        put(LIFE_SKILLS, FIELDTYPE_BOOLEAN);
		        put(NUMERACY, FIELDTYPE_BOOLEAN);
		        put(SUPPORT_SERVICES_RECEIVED, FIELDTYPE_BOOLEAN);
		        put(CARE_FOR_NEWCOMER_CHILDREN_ADULT, FIELDTYPE_BOOLEAN);
		        put(CARE_FOR_NEWCOMER_CHILDREN_CHILD, FIELDTYPE_BOOLEAN);
		        put(PROVISIONS_FOR_DISABILITIES_ADULT, FIELDTYPE_BOOLEAN);
		        put(PROVISIONS_FOR_DISABILITIES_CHILD, FIELDTYPE_BOOLEAN);
		        put(TRANSLATION_ADULT, FIELDTYPE_BOOLEAN);
		        put(TRANSLATION_CHILD, FIELDTYPE_BOOLEAN);
		        put(INTERPRETATION_ADULT, FIELDTYPE_BOOLEAN);
		        put(INTERPRETATION_CHILD, FIELDTYPE_BOOLEAN);
		        put(CRISIS_COUNSELLING_ADULT, FIELDTYPE_BOOLEAN);
		        put(CRISIS_COUNSELLING_CHILD, FIELDTYPE_BOOLEAN);
		        put(OVERVIEW_OF_CANADA, FIELDTYPE_BOOLEAN);
		        put(OVERVIEW_OF_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(SOURCES_OF_INFORMATION, FIELDTYPE_BOOLEAN);
		        put(SOURCES_OF_INFORMATION_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(RIGHTS_AND_FREEDOMS, FIELDTYPE_BOOLEAN);
		        put(RIGHTS_AND_FREEDOMS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(CANADIAN_LAW_AND_JUSTICE, FIELDTYPE_BOOLEAN);
		        put(CANADIAN_LAW_AND_JUSTICE_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(IMPORTANT_DOCUMENTS, FIELDTYPE_BOOLEAN);
		        put(IMPORTANT_DOCUMENTS_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(IMPROVING_ENGLISH_OR_FRENCH, FIELDTYPE_BOOLEAN);
		        put(IMPROVING_ENGLISH_OR_FRENCH_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(EMPLOYMENT_AND_INCOME, FIELDTYPE_BOOLEAN);
		        put(EMPLOYMENT_AND_INCOME_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(EDUCATION, FIELDTYPE_BOOLEAN);
		        put(EDUCATION_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(HOUSING, FIELDTYPE_BOOLEAN);
		        put(HOUSING_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(HEALTH, FIELDTYPE_BOOLEAN);
		        put(HEALTH_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(MONEY_AND_FINANCES, FIELDTYPE_BOOLEAN);
		        put(MONEY_AND_FINANCES_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(TRANSPORTATION_ADULT, FIELDTYPE_BOOLEAN);
		        put(TRANSPORTATION_CHILD, FIELDTYPE_BOOLEAN);
		        put(TRANSPORTATION_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(COMMUNICATIONS_AND_MEDIA, FIELDTYPE_BOOLEAN);
		        put(COMMUNICATIONS_AND_MEDIA_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(COMMUNITY_ENGAGEMENT, FIELDTYPE_BOOLEAN);
		        put(COMMUNITY_ENGAGEMENT_REFERRALS, FIELDTYPE_BOOLEAN);
		        put(BECOMING_A_CANADIAN_CITIZEN, FIELDTYPE_BOOLEAN);
		        put(BECOMING_A_CANADIAN_CITIZEN_REFERRALS, FIELDTYPE_BOOLEAN);
		        
		        	// 207 - 309
		        put(SUPPORT_SERVICES_AVAILABLE_FOR_CLIENT_IN_THIS_COURSE, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_MORNING, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_AFTERNOON, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_EVENING, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_WEEKEND, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_ANYTIME, FIELDTYPE_BOOLEAN);
				put(SCHEDULE_ONLINE, FIELDTYPE_BOOLEAN);
				put(COURSE_DIRECTED_AT_A_SPECIFIC_TARGET_GROUP, FIELDTYPE_BOOLEAN);
				put(CHILDREN_0_14_YRS, FIELDTYPE_BOOLEAN);
				put(YOUTH_15_24_YRS, FIELDTYPE_BOOLEAN);
				put(SENIOR, FIELDTYPE_BOOLEAN);
				put(GENDER_SPECIFIC, FIELDTYPE_BOOLEAN);
				put(REFUGEES, FIELDTYPE_BOOLEAN);
				put(OFFICIAL_LANGUAGE_MINORITIES, FIELDTYPE_BOOLEAN);
				put(ETHNIC_CULTURAL_LINGUISTIC_GROUP, FIELDTYPE_BOOLEAN);
				put(DEAF_OR_HARD_OF_HEARING, FIELDTYPE_BOOLEAN);
				put(BLIND_OR_PARTIALLY_SIGHTED, FIELDTYPE_BOOLEAN);
				put(CLIENTS_WITH_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL, FIELDTYPE_BOOLEAN);
				put(LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ, FIELDTYPE_BOOLEAN);
				put(FAMILIES_PARENTS, FIELDTYPE_BOOLEAN);
				put(CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION, FIELDTYPE_BOOLEAN);
				put(CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE, FIELDTYPE_BOOLEAN);
				put(MATERIALS_USED_IN_COURSE, FIELDTYPE_BOOLEAN);
				put(CITIZENSHIP_PREPARATION, FIELDTYPE_BOOLEAN);
				put(PBLA_LANGUAGE_COMPANION, FIELDTYPE_BOOLEAN);
				
		        //Fields that have a specific list of choices go here (ones that have drop-down lists)
		        put(UNIQUE_IDENTIFIER, FIELDTYPE_SELECT);
		        put(STREET_TYPE, FIELDTYPE_SELECT);
		        put(STREET_DIRECTION, FIELDTYPE_SELECT);
		        put(PROVINCE, FIELDTYPE_SELECT);
		        put(OFFICIAL_LANGUAGE_OF_PREFERENCE, FIELDTYPE_SELECT);
		        put(OFFICIAL_LANGUAGE_OF_COURSE, FIELDTYPE_SELECT);
		        
		        put(IMPROVE_LANGUAGE_SKILLS_TO, FIELDTYPE_SELECT);
		        put(IMPROVE_OTHER_SKILLS_TO, FIELDTYPE_SELECT);
		        put(FIND_EMPLOYMENT_TIMEFRAME, FIELDTYPE_SELECT);
		        put(FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE, FIELDTYPE_SELECT);
		        put(FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL, FIELDTYPE_SELECT);
		        put(FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA, FIELDTYPE_SELECT);
		        put(CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN, FIELDTYPE_SELECT);
		        put(A_REFERRAL_TO, FIELDTYPE_SELECT);
		        put(EMPLOYMENT_STATUS, FIELDTYPE_SELECT);
		        put(EDUCATION_STATUS, FIELDTYPE_SELECT);
		        put(OCCUPATION_IN_CANADA, FIELDTYPE_SELECT);
		        put(INTENDED_OCCUPATION, FIELDTYPE_SELECT);
		        put(INTERVENTION_TYPE, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_PLACEMENT_WAS, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_HOURS_PER_WEEK, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR, FIELDTYPE_SELECT);
		        put(LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED, FIELDTYPE_SELECT);
		        put(SHORT_TERM_INTERVENTION_SERVICE_RECEIVED, FIELDTYPE_SELECT);
		        put(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES, FIELDTYPE_SELECT);
		        put(FORMAT_OF_TRAINING_PROVIDED, FIELDTYPE_SELECT);
		        put(CLASSES_HELD_AT, FIELDTYPE_SELECT);
		        
		        	//103
		        put(LANGUAGE_OF_SERVICE, FIELDTYPE_SELECT);
		        put(REFERRED_BY, FIELDTYPE_SELECT);
		        put(ACTIVITY_UNDER_WHICH_CLIENT_RECEIVED_SERVICES, FIELDTYPE_SELECT);
		        put(TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES, FIELDTYPE_SELECT);
		        put(TYPE_OF_EVENT_ATTENDED, FIELDTYPE_SELECT);
		        put(TYPE_OF_SERVICE, FIELDTYPE_SELECT);
		        put(MAIN_TOPIC_FOCUS_OF_THE_SERVICE_RECEIVED, FIELDTYPE_SELECT);
		        put(SERVICE_RECEIVED, FIELDTYPE_SELECT);
		        put(NUMBER_OF_UNIQUE_PARTICIPANTS, FIELDTYPE_SELECT);
		        put(STATUS_OF_SERVICE, FIELDTYPE_SELECT);
		        put(REASON_FOR_LEAVING_SERVICE, FIELDTYPE_SELECT);
		        put(CHILD_1_AGE, FIELDTYPE_SELECT);
		        put(CHILD_1_TYPE_OF_CARE, FIELDTYPE_SELECT);
		        put(CHILD_2_AGE, FIELDTYPE_SELECT);
		        put(CHILD_2_TYPE_OF_CARE, FIELDTYPE_SELECT);
		        put(CHILD_3_AGE, FIELDTYPE_SELECT);
		        put(CHILD_3_TYPE_OF_CARE, FIELDTYPE_SELECT);
		        put(CHILD_4_AGE, FIELDTYPE_SELECT);
		        put(CHILD_4_TYPE_OF_CARE, FIELDTYPE_SELECT);
		        put(CHILD_5_AGE, FIELDTYPE_SELECT);
		        put(CHILD_5_TYPE_OF_CARE, FIELDTYPE_SELECT);
		        put(BETWEEN_TRANSLATION, FIELDTYPE_SELECT);
		        put(AND_TRANSLATION, FIELDTYPE_SELECT);
		        put(BETWEEN_INTERPRETATION, FIELDTYPE_SELECT);
		        put(AND_INTERPRETATION, FIELDTYPE_SELECT);
		        put(TOTAL_LENGTH_OF_SERVICE_HOURS, FIELDTYPE_SELECT);
		        put(TOTAL_LENGTH_OF_SERVICE_MINUTES, FIELDTYPE_SELECT);
		        put(REASON_FOR_UPDATE, FIELDTYPE_SELECT);
		        put(TOTAL_LENGTH_OF_ORIENTATION, FIELDTYPE_SELECT);
		        put(TOTAL_LENGTH_OF_ORIENTATION_HOURS, FIELDTYPE_SELECT);
		        put(TOTAL_LENGTH_OF_ORIENTATION_MINUTES, FIELDTYPE_SELECT);
		        put(NUMBER_OF_CLIENTS_IN_GROUP, FIELDTYPE_SELECT);
		        	//207 - 309
		        put(NEW_STUDENTS_CAN_ENROL_IN_THE_COURSE, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_1, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_2, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_3, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_4, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_5, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_6, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_7, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_8, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_9, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_10, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_11, FIELDTYPE_SELECT);
				put(LISTENING_SKILL_LEVEL_12, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_1, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_2, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_3, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_4, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_5, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_6, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_7, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_8, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_9, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_10, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_11, FIELDTYPE_SELECT);
				put(SPEAKING_SKILL_LEVEL_12, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_1, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_2, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_3, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_4, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_5, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_6, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_7, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_8, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_9, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_10, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_11, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_12, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_13, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_14, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_15, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_16, FIELDTYPE_SELECT);
				put(READING_SKILL_LEVEL_17, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_1, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_2, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_3, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_4, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_5, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_6, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_7, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_8, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_9, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_10, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_11, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_12, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_13, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_14, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_15, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_16, FIELDTYPE_SELECT);
				put(WRITING_SKILL_LEVEL_17, FIELDTYPE_SELECT);
				put(INSTRUCTIONAL_HOURS_PER_CLASS, FIELDTYPE_SELECT);
				put(CLASSES_PER_WEEK, FIELDTYPE_SELECT);
				put(WEEKS_OF_INSTRUCTION, FIELDTYPE_SELECT);
				put(WEEKS_OF_INSTRUCTION_PER_YEAR, FIELDTYPE_SELECT);
				put(DOMINANT_FOCUS_OF_THE_COURSE, FIELDTYPE_SELECT);
				put(CLIENTS_TRAINING_STATUS, FIELDTYPE_SELECT);
				put(REASON_FOR_EXITING_COURSE, FIELDTYPE_SELECT);
				put(LISTENING_CLB_LEVEL, FIELDTYPE_SELECT);
				put(SPEAKING_CLB_LEVEL, FIELDTYPE_SELECT);
				put(READING_CLB_LEVEL, FIELDTYPE_SELECT);
				put(WRITING_CLB_LEVEL, FIELDTYPE_SELECT);
				put(LISTENING_LEVEL_INDICATED_ON_CERTIFICATE, FIELDTYPE_SELECT);
				put(SPEAKING_LEVEL_INDICATED_ON_CERTIFICATE, FIELDTYPE_SELECT);
		    }});
	
	
	
	//Each new type goes here
	public static final String FIELDTYPE_STRING = "string";
	public static final String FIELDTYPE_BOOLEAN = "boolean";
	public static final String FIELDTYPE_SELECT = "select";
	
	
	
	//Each new table has its referenced name go here
	public static final String TABLE_CLIENT_PROFILE = "client_profile";
	public static final String TABLE_NEEDS_ASSESSMENT_AND_REFERRALS = "needs_assessment_and_referrals";
	public static final String TABLE_COMMUNITY_CONNECTIONS = "community_connections";
	public static final String TABLE_INFORMATION_AND_ORIENTATION = "information_and_orientation";
	
	public static final String TABLE_EMPLOYMENT = "employment";
	public static final String TABLE_LANGUAGE_TRAINING_CLIENT_ENROLLMENT = "language_training_client_enrollment";
	public static final String TABLE_LANGUAGE_TRAINING_COURSE_SETUP = "language_training_course_setup";
	public static final String TABLE_LANGUAGE_TRAINING_CLIENT_EXIT = "language_training_client_exit";
	
	// TODO
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////        NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//these field names are used for fields that have names that are too long but must remain unique
	private static final String LONGFIELD_1 = "longfield_1";
	private static final String LONGFIELD_2 = "longfield_2";
	private static final String LONGFIELD_3 = "longfield_3";
	private static final String LONGFIELD_4 = "longfield_4";
	private static final String LONGFIELD_5 = "longfield_5";
	private static final String LONGFIELD_6 = "longfield_6";
	private static final String LONGFIELD_7 = "longfield_7";
	private static final String LONGFIELD_8 = "longfield_8";
	private static final String LONGFIELD_9 = "longfield_9";
	private static final String LONGFIELD_10 = "longfield_10";
	private static final String LONGFIELD_11 = "longfield_11";
	private static final String LONGFIELD_12 = "longfield_12";
	//Regular string fields you fill on your own go here
	
	// WAS MISSING FROM AGGREGATE FORM
	public static final String TELEPHONE_NUMBER = "telephone_number";
	public static final String WAS_A_CERTIFICATE_ISSUED_TO_THE_CLIENT = "was_a_certificate_issued_to_the_client";
	// WAS MISSING FROM AGGREGATE FORM
	
	public static final String UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String STREET_NUMBER = "street_number";
	public static final String STREET_NAME = "street_name";
	public static final String UNIT_SUITE_APT = "unit_suite_apt";
	public static final String CITY = "city";
	public static final String POSTAL_CODE = "postal_code";
	
	
	public static final String END_DATE_OF_SERVICE_YYYY_MM_DD = "end_date_of_service_yyyy_mm_dd";
	public static final String START_DATE_OF_ASSESSMENT_YYYY_MM_DD = "start_date_of_assessment_yyyy_mm_dd";
	public static final String END_DATE_OF_ASSESSMENT_YYYY_MM_DD = "end_date_of_assessment_yyyy_mm_dd";
	public static final String REFERRAL_DATE_YYYY_MM_DD = "referral_date_yyyy_mm_dd";
	public static final String LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD = "long_term_intervention_start_date_yyyy_mm_dd";
	public static final String LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD = "long_term_intervention_end_date_yyyy_mm_dd";
	public static final String SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD = "short_term_intervention_date_yyyy_mm_dd";
	public static final String TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS = "time_spent_with_client_addressing_clients_employment_needs_hours";
	public static final String COURSE_CODE = "course_code";
	public static final String DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD = "date_of_clients_first_class_yyyy_mm_dd";
	public static final String NOTES = "notes";
	public static final String IN_PERSON_INSTRUCTION_PERCENT = "in_person_instruction_percent";
	public static final String ONLINE_DISTANCE_INSTRUCTION_PERCENT = "online_distance_instruction_percent";
	public static final String TOTAL_NUMBER_OF_SPOTS_IN_COURSE = "total_number_of_spots_in_course";
	
		//103
	public static final String PROCESSING_DETAILS = "processing_details";
	public static final String UPDATE_RECORD_ID = "update_record_id";
	public static final String DATE_OF_BIRTH_YYYY_MM_DD = "date_of_birth_yyyy_mm_dd";
	public static final String POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED = "postal_code_where_the_service_was_received";
	public static final String START_DATE_YYYY_MM_DD = "start_date_yyyy_mm_dd";
	public static final String END_DATE_YYYY_MM_DD = "end_date_yyyy_mm_dd";
	public static final String PROJECTED_END_DATE_YYYY_MM_DD = "projected_end_date_yyyy_mm_dd";
	public static final String START_DATE_OF_SERVICE_YYYY_MM_DD = "start_date_of_service_yyyy_mm_dd";
		// 207 - 309
	public static final String NUMBER_OF_IRCC_FUNDED_SPOTS_IN_COURSE = "number_of_ircc_funded_spots_in_course";
	public static final String CONTACT_NAME = "contact_name";
	public static final String TELEPHONE_EXTENSION = "telephone_extension";
	public static final String COURSE_START_DATE_YYYY_MM_DD = "course_start_date_yyyy_mm_dd";
	public static final String COURSE_END_DATE_YYYY_MM_DD = "course_end_date_yyyy_mm_dd";
	public static final String DATE_CLIENT_EXITED_COURSE_YYYY_MM_DD = "date_client_exited_course_yyyy_mm_dd";

	//Boolean fields go here
	public static final String DOES_THE_CLIENT_HAVE_AN_EMAIL_ADDRESS = "does_the_client_have_an_email_address";
	public static final String CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION = "consent_for_future_research_consultation";
	
	
	public static final String INTERPERSONAL_CONFLICT = "interpersonal_conflict";
	public static final String INTERPERSONAL_CONFLICT_REFERRALS = "interpersonal_conflict_referrals";
	//public static final String WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE = "was_life_skills_or_responsibilities_of_citizenship_information_received_as_part_of_this_service";
	public static final String WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE = LONGFIELD_9;
	//public static final String RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA = "rights_and_responsibilities_of_citizenship_based_on_discover_canada";
	public static final String RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA = LONGFIELD_10;
	public static final String INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA = "increase_knowledge_of_life_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS = "increase_knowledge_of_life_in_canada_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES = "increase_knowledge_of_community_and_government_services";
	//public static final String INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS = "increase_knowledge_of_community_and_government_services_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS = LONGFIELD_1;
	public static final String INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA = "increase_knowledge_of_working_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS = "increase_knowledge_of_working_in_canada_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA = "increase_knowledge_of_education_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS = "increase_knowledge_of_education_in_canada_referrals";
	public static final String INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS = "increase_the_following_social_networks";
	public static final String INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS = "increase_the_following_social_networks_referrals";
	public static final String INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS = "increase_the_following_professional_networks";
	public static final String INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS = "increase_the_following_professional_networks_referrals";
	public static final String INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES = "increase_the_following_access_to_local_community_services";
	//public static final String INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS = "increase_the_following_access_to_local_community_services_referrals";
	public static final String INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS = LONGFIELD_2;
	public static final String INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT = "increase_the_following_level_of_community_involvement";
	public static final String INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS = "increase_the_following_level_of_community_involvement_referrals";
	public static final String IMPROVE_LANGUAGE_SKILLS = "improve_language_skills";
	public static final String IMPROVE_LANGUAGE_SKILLS_REFERRALS = "improve_language_skills_referrals";
	public static final String IMPROVE_OTHER_SKILLS = "improve_other_skills";
	public static final String IMPROVE_OTHER_SKILLS_REFERRALS = "improve_other_skills_referrals";
	public static final String FIND_EMPLOYMENT = "find_employment";
	public static final String FIND_EMPLOYMENT_REFERRALS = "find_employment_referrals";
	public static final String SUPPORT_SERVICES_MAY_BE_REQUIRED = "support_services_may_be_required";
	public static final String NON_IRCC_PROGRAM_SERVICES_NEEDED = "non_ircc_program_services_needed";
	public static final String FOOD_CLOTHING_OTHER_MATERIAL_NEEDS = "food_clothing_other_material_needs";
	public static final String FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS = "food_clothing_other_material_needs_referrals";
	public static final String HOUSING_ACCOMMODATION = "housing_accommodation";
	public static final String HOUSING_ACCOMMODATION_REFERRALS = "housing_accommodation_referrals";
	public static final String HEALTH_MENTAL_HEALTH_WELL_BEING = "health_mental_health_well_being";
	public static final String HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS = "health_mental_health_well_being_referrals";
	public static final String FINANCIAL = "financial";
	public static final String FINANCIAL_REFERRALS = "financial_referrals";
	public static final String FAMILY_SUPPORT = "family_support";
	public static final String FAMILY_SUPPORT_REFERRALS = "family_support_referrals";
	public static final String LANGUAGE_NON_IRCC = "language_non_ircc";
	public static final String LANGUAGE_NON_IRCC_REFERRALS = "language_non_ircc_referrals";
	public static final String EDUCATION_SKILLS_DEVELOPMENT = "education_skills_development";
	public static final String EDUCATION_SKILLS_DEVELOPMENT_REFERRALS = "education_skills_development_referrals";
	public static final String EMPLOYMENT_RELATED = "employment_related";
	public static final String EMPLOYMENT_RELATED_REFERRALS = "employment_related_referrals";
	public static final String LEGAL_INFORMATION_AND_SERVICES = "legal_information_and_services";
	public static final String LEGAL_INFORMATION_AND_SERVICES_REFERRALS = "legal_information_and_services_referrals";
	public static final String COMMUNITY_SERVICES = "community_services";
	public static final String COMMUNITY_SERVICES_REFERRALS = "community_services_referrals";
	public static final String SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT = "settlement_plan_completed_and_shared_with_client";
	//public static final String CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION = "consent_for_future_research_consultation";
	public static final String REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION = "registration_in_an_employment_intervention";
	public static final String COURSE_HELD_ON_AN_ONGOING_BASIS = "course_held_on_an_ongoing_basis";

		//103
	//public static final String DID_VOLUNTEERS_FROM_THE_HOST_COMMUNITY_PARTICIPATE_IN_THE_ACTIVITY = "did_volunteers_from_the_host_community_participate_in_the_activity";
	public static final String DID_VOLUNTEERS_FROM_THE_HOST_COMMUNITY_PARTICIPATE_IN_THE_ACTIVITY = LONGFIELD_5;
	public static final String DIRECTED_AT_A_SPECIFIC_TARGET_GROUP = "directed_at_a_specific_target_group";
	public static final String TARGET_GROUP_CHILDREN_0_14_YRS = "target_group_children_0_14_yrs";
	public static final String TARGET_GROUP_YOUTH_15_24_YRS = "target_group_youth_15_24_yrs";
	public static final String TARGET_GROUP_SENIOR = "target_group_senior";
	public static final String TARGET_GROUP_GENDER_SPECIFIC = "target_group_gender_specific";
	public static final String TARGET_GROUP_REFUGEES = "target_group_refugees";
	public static final String TARGET_GROUP_ETHNIC_CULTURAL_LINGUISTIC_GROUP = "target_group_ethnic_cultural_linguistic_group";
	public static final String TARGET_GROUP_DEAF_OR_HARD_OF_HEARING = "target_group_deaf_or_hard_of_hearing";
	public static final String TARGET_GROUP_BLIND_OR_PARTIALLY_SIGHTED = "target_group_blind_or_partially_sighted";
	public static final String TARGET_GROUP_LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ = "target_group_lesbian_gay_bisexual_transgender_queer_lgbtq";
	public static final String TARGET_GROUP_FAMILIES_PARENTS = "target_group_families_parents";
	public static final String TARGET_GROUP_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL = "target_group_other_impairments_physical_mental";
	//public static final String TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION = "target_group_clients_with_international_training_in_a_regulated_profession";
	public static final String TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION = LONGFIELD_6;
	//public static final String TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE = "target_group_clients_with_international_training_in_a_regulated_trade";
	public static final String TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE = LONGFIELD_7;
	public static final String TARGET_GROUP_OFFICIAL_LANGUAGE_MINORITIES = "target_group_official_language_minorities";
	//public static final String WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE = "was_essential_skills_and_aptitudes_training_received_as_part_of_the_service";
	public static final String WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE = LONGFIELD_8;
	public static final String COMPUTER_SKILLS = "computer_skills";
	public static final String DOCUMENT_USE = "document_use";
	public static final String INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE = "interpersonal_skills_and_workplace_culture";
	public static final String LEADERSHIP_TRAINING = "leadership_training";
	public static final String LIFE_SKILLS = "life_skills";
	public static final String NUMERACY = "numeracy";
	public static final String SUPPORT_SERVICES_RECEIVED = "support_services_received";
	//XXX duplicate
	public static final String CARE_FOR_NEWCOMER_CHILDREN_ADULT = "care_for_newcomer_children_adult";
	public static final String CARE_FOR_NEWCOMER_CHILDREN_CHILD = "care_for_newcomer_children_child";
	//XXX duplicate
	public static final String TRANSPORTATION_ADULT = "transportation_adult";
	public static final String TRANSPORTATION_CHILD = "transportation_child";
	//XXX duplicate
	public static final String PROVISIONS_FOR_DISABILITIES_ADULT = "provisions_for_disabilities_adult";
	public static final String PROVISIONS_FOR_DISABILITIES_CHILD = "provisions_for_disabilities_child";
	//XXX duplicate
	public static final String TRANSLATION_ADULT = "translation_adult";
	public static final String TRANSLATION_CHILD = "translation_child";
	//XXX duplicate
	public static final String INTERPRETATION_ADULT = "interpretation_adult";
	public static final String INTERPRETATION_CHILD = "interpretation_child";
	//XXX duplicate
	public static final String CRISIS_COUNSELLING_ADULT = "crisis_counselling_adult";
	public static final String CRISIS_COUNSELLING_CHILD = "crisis_counselling_child";
	public static final String OVERVIEW_OF_CANADA = "overview_of_canada";
	public static final String OVERVIEW_OF_CANADA_REFERRALS = "overview_of_canada_referrals";
	public static final String SOURCES_OF_INFORMATION = "sources_of_information";
	public static final String SOURCES_OF_INFORMATION_REFERRALS = "sources_of_information_referrals";
	public static final String RIGHTS_AND_FREEDOMS = "rights_and_freedoms";
	public static final String RIGHTS_AND_FREEDOMS_REFERRALS = "rights_and_freedoms_referrals";
	public static final String CANADIAN_LAW_AND_JUSTICE = "canadian_law_and_justice";
	public static final String CANADIAN_LAW_AND_JUSTICE_REFERRALS = "canadian_law_and_justice_referrals";
	public static final String IMPORTANT_DOCUMENTS = "important_documents";
	public static final String IMPORTANT_DOCUMENTS_REFERRALS = "important_documents_referrals";
	public static final String IMPROVING_ENGLISH_OR_FRENCH = "improving_english_or_french";
	public static final String IMPROVING_ENGLISH_OR_FRENCH_REFERRALS = "improving_english_or_french_referrals";
	public static final String EMPLOYMENT_AND_INCOME = "employment_and_income";
	public static final String EMPLOYMENT_AND_INCOME_REFERRALS = "employment_and_income_referrals";
	public static final String EDUCATION = "education";
	public static final String EDUCATION_REFERRALS = "education_referrals";
	public static final String HOUSING = "housing";
	public static final String HOUSING_REFERRALS = "housing_referrals";
	public static final String HEALTH = "health";
	public static final String HEALTH_REFERRALS = "health_referrals";
	public static final String MONEY_AND_FINANCES = "money_and_finances";
	public static final String MONEY_AND_FINANCES_REFERRALS = "money_and_finances_referrals";
	public static final String TRANSPORTATION_REFERRALS = "transportation_referrals";
	public static final String COMMUNICATIONS_AND_MEDIA = "communications_and_media";
	public static final String COMMUNICATIONS_AND_MEDIA_REFERRALS = "communications_and_media_referrals";
	public static final String COMMUNITY_ENGAGEMENT = "community_engagement";
	public static final String COMMUNITY_ENGAGEMENT_REFERRALS = "community_engagement_referrals";
	public static final String BECOMING_A_CANADIAN_CITIZEN = "becoming_a_canadian_citizen";
	public static final String BECOMING_A_CANADIAN_CITIZEN_REFERRALS = "becoming_a_canadian_citizen_referrals";
		// 207 - 309
	
	public static final String SUPPORT_SERVICES_AVAILABLE_FOR_CLIENT_IN_THIS_COURSE = "support_services_available_for_client_in_this_course";
	public static final String COURSE_DIRECTED_AT_A_SPECIFIC_TARGET_GROUP = "course_directed_at_a_specific_target_group";
	public static final String CHILDREN_0_14_YRS = "children_0_14_yrs";
	public static final String YOUTH_15_24_YRS = "youth_15_24_yrs";
	public static final String SENIOR = "senior";
	public static final String GENDER_SPECIFIC = "gender_specific";
	public static final String REFUGEES = "refugees";
	public static final String OFFICIAL_LANGUAGE_MINORITIES = "official_language_minorities";
	public static final String ETHNIC_CULTURAL_LINGUISTIC_GROUP = "ethnic_cultural_linguistic_group";
	public static final String DEAF_OR_HARD_OF_HEARING = "deaf_or_hard_of_hearing";
	public static final String BLIND_OR_PARTIALLY_SIGHTED = "blind_or_partially_sighted";
	public static final String CLIENTS_WITH_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL = "clients_with_other_impairments_physical_mental";
	public static final String LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ = "lesbian_gay_bisexual_transgender_queer_lgbtq";
	public static final String FAMILIES_PARENTS = "families_parents";
	public static final String CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION = "clients_with_international_training_in_a_regulated_profession";
	public static final String CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE = "clients_with_international_training_in_a_regulated_trade";
	public static final String MATERIALS_USED_IN_COURSE = "materials_used_in_course";
	public static final String CITIZENSHIP_PREPARATION = "citizenship_preparation";
	public static final String PBLA_LANGUAGE_COMPANION = "pbla_language_companion";
	public static final String SCHEDULE_MORNING = "schedule_morning";
	public static final String SCHEDULE_AFTERNOON = "schedule_afternoon";
	public static final String SCHEDULE_EVENING = "schedule_evening";
	public static final String SCHEDULE_WEEKEND = "schedule_weekend";
	public static final String SCHEDULE_ANYTIME = "schedule_anytime";
	public static final String SCHEDULE_ONLINE = "schedule_online";
	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	public static final String UNIQUE_IDENTIFIER = "unique_identifier";
	public static final String STREET_TYPE = "street_type";
	public static final String STREET_DIRECTION = "street_direction";
	public static final String PROVINCE = "province";
	
	public static final String OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";
	public static final String OFFICIAL_LANGUAGE_OF_COURSE = "official_language_of_course";
	public static final String IMPROVE_LANGUAGE_SKILLS_TO = "improve_language_skills_to";
	public static final String IMPROVE_OTHER_SKILLS_TO = "improve_other_skills_to";
	public static final String FIND_EMPLOYMENT_TIMEFRAME = "find_employment_timeframe";
	public static final String FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE = "find_employment_minimum_one_years_work_experience";
	//public static final String FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL = "find_employment_intends_to_work_in_an_occupation_corresponding_to_which_national_occupation_classification_skill_level";
	public static final String FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL = LONGFIELD_3;
	//public static final String FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA = "find_employment_intends_to_obtain_credential_recognition_or_obtain_license_to_work_in_canada";
	public static final String FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA = LONGFIELD_4;
	public static final String CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN = "client_intends_to_become_a_canadian_citizen";
	public static final String A_REFERRAL_TO = "a_referral_to";
	public static final String EMPLOYMENT_STATUS = "employment_status";
	public static final String EDUCATION_STATUS = "education_status";
	public static final String OCCUPATION_IN_CANADA = "occupation_in_canada";
	public static final String INTENDED_OCCUPATION = "intended_occupation";
	public static final String INTERVENTION_TYPE = "intervention_type";
	public static final String LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED = "long_term_intervention_intervention_received";
	public static final String LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION = "long_term_intervention_status_of_intervention";
	public static final String LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION = "long_term_intervention_reason_for_leaving_intervention";
	public static final String LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER = "long_term_intervention_size_of_employer";
	public static final String LONG_TERM_INTERVENTION_PLACEMENT_WAS = "long_term_intervention_placement_was";
	public static final String LONG_TERM_INTERVENTION_HOURS_PER_WEEK = "long_term_intervention_hours_per_week";
	public static final String LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT = "long_term_intervention_client_met_mentor_regularly_at";
	public static final String LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR = "long_term_intervention_average_hours_week_in_contact_with_mentor";
	//public static final String LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED = "long_term_intervention_profession_trade_for_which_services_were_received";
	public static final String LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED = LONGFIELD_11;
	public static final String SHORT_TERM_INTERVENTION_SERVICE_RECEIVED = "short_term_intervention_service_received";
	//public static final String TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES = "time_spent_with_client_addressing_clients_employment_needs_minutes";
	public static final String TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES = LONGFIELD_12;
	public static final String FORMAT_OF_TRAINING_PROVIDED = "format_of_training_provided";
	public static final String CLASSES_HELD_AT = "classes_held_at";
	
		//103
	public static final String LANGUAGE_OF_SERVICE = "language_of_service";
	public static final String REFERRED_BY = "referred_by";
	public static final String ACTIVITY_UNDER_WHICH_CLIENT_RECEIVED_SERVICES = "activity_under_which_client_received_services";
	public static final String TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES = "type_of_institution_organization_where_client_received_services";
	public static final String TYPE_OF_EVENT_ATTENDED = "type_of_event_attended";
	public static final String TYPE_OF_SERVICE = "type_of_service";
	public static final String MAIN_TOPIC_FOCUS_OF_THE_SERVICE_RECEIVED = "main_topic_focus_of_the_service_received";
	public static final String SERVICE_RECEIVED = "service_received";
	public static final String NUMBER_OF_UNIQUE_PARTICIPANTS = "number_of_unique_participants";
	public static final String STATUS_OF_SERVICE = "status_of_service";
	public static final String REASON_FOR_LEAVING_SERVICE = "reason_for_leaving_service";
	public static final String CHILD_1_AGE = "child_1_age";
	public static final String CHILD_1_TYPE_OF_CARE = "child_1_type_of_care";
	public static final String CHILD_2_AGE = "child_2_age";
	public static final String CHILD_2_TYPE_OF_CARE = "child_2_type_of_care";
	public static final String CHILD_3_AGE = "child_3_age";
	public static final String CHILD_3_TYPE_OF_CARE = "child_3_type_of_care";
	public static final String CHILD_4_AGE = "child_4_age";
	public static final String CHILD_4_TYPE_OF_CARE = "child_4_type_of_care";
	public static final String CHILD_5_AGE = "child_5_age";
	public static final String CHILD_5_TYPE_OF_CARE = "child_5_type_of_care";
	public static final String BETWEEN_TRANSLATION = "between_translation";
	public static final String AND_TRANSLATION = "and_translation";
	public static final String BETWEEN_INTERPRETATION = "between_interpretation";
	public static final String AND_INTERPRETATION = "and_interpretation";
	public static final String TOTAL_LENGTH_OF_SERVICE_HOURS = "total_length_of_service_hours";
	public static final String TOTAL_LENGTH_OF_SERVICE_MINUTES = "total_length_of_service_minutes";
	public static final String REASON_FOR_UPDATE = "reason_for_update";
	public static final String TOTAL_LENGTH_OF_ORIENTATION = "total_length_of_orientation";
	public static final String TOTAL_LENGTH_OF_ORIENTATION_HOURS = "total_length_of_orientation_hours";
	public static final String TOTAL_LENGTH_OF_ORIENTATION_MINUTES = "total_length_of_orientation_minutes";
	public static final String NUMBER_OF_CLIENTS_IN_GROUP = "number_of_clients_in_group";
	
	// 207 - 309
	
	public static final String LISTENING_SKILL_LEVEL_1 = "listening_skill_level_1";
	public static final String LISTENING_SKILL_LEVEL_2 = "listening_skill_level_2";
	public static final String LISTENING_SKILL_LEVEL_3 = "listening_skill_level_3";
	public static final String LISTENING_SKILL_LEVEL_4 = "listening_skill_level_4";
	public static final String LISTENING_SKILL_LEVEL_5 = "listening_skill_level_5";
	public static final String LISTENING_SKILL_LEVEL_6 = "listening_skill_level_6";
	public static final String LISTENING_SKILL_LEVEL_7 = "listening_skill_level_7";
	public static final String LISTENING_SKILL_LEVEL_8 = "listening_skill_level_8";
	public static final String LISTENING_SKILL_LEVEL_9 = "listening_skill_level_9";
	public static final String LISTENING_SKILL_LEVEL_10 = "listening_skill_level_10";
	public static final String LISTENING_SKILL_LEVEL_11 = "listening_skill_level_11";
	public static final String LISTENING_SKILL_LEVEL_12 = "listening_skill_level_12";
	public static final String SPEAKING_SKILL_LEVEL_1 = "speaking_skill_level_1";
	public static final String SPEAKING_SKILL_LEVEL_2 = "speaking_skill_level_2";
	public static final String SPEAKING_SKILL_LEVEL_3 = "speaking_skill_level_3";
	public static final String SPEAKING_SKILL_LEVEL_4 = "speaking_skill_level_4";
	public static final String SPEAKING_SKILL_LEVEL_5 = "speaking_skill_level_5";
	public static final String SPEAKING_SKILL_LEVEL_6 = "speaking_skill_level_6";
	public static final String SPEAKING_SKILL_LEVEL_7 = "speaking_skill_level_7";
	public static final String SPEAKING_SKILL_LEVEL_8 = "speaking_skill_level_8";
	public static final String SPEAKING_SKILL_LEVEL_9 = "speaking_skill_level_9";
	public static final String SPEAKING_SKILL_LEVEL_10 = "speaking_skill_level_10";
	public static final String SPEAKING_SKILL_LEVEL_11 = "speaking_skill_level_11";
	public static final String SPEAKING_SKILL_LEVEL_12 = "speaking_skill_level_12";
	public static final String READING_SKILL_LEVEL_1 = "reading_skill_level_1";
	public static final String READING_SKILL_LEVEL_2 = "reading_skill_level_2";
	public static final String READING_SKILL_LEVEL_3 = "reading_skill_level_3";
	public static final String READING_SKILL_LEVEL_4 = "reading_skill_level_4";
	public static final String READING_SKILL_LEVEL_5 = "reading_skill_level_5";
	public static final String READING_SKILL_LEVEL_6 = "reading_skill_level_6";
	public static final String READING_SKILL_LEVEL_7 = "reading_skill_level_7";
	public static final String READING_SKILL_LEVEL_8 = "reading_skill_level_8";
	public static final String READING_SKILL_LEVEL_9 = "reading_skill_level_9";
	public static final String READING_SKILL_LEVEL_10 = "reading_skill_level_10";
	public static final String READING_SKILL_LEVEL_11 = "reading_skill_level_11";
	public static final String READING_SKILL_LEVEL_12 = "reading_skill_level_12";
	public static final String READING_SKILL_LEVEL_13 = "reading_skill_level_13";
	public static final String READING_SKILL_LEVEL_14 = "reading_skill_level_14";
	public static final String READING_SKILL_LEVEL_15 = "reading_skill_level_15";
	public static final String READING_SKILL_LEVEL_16 = "reading_skill_level_16";
	public static final String READING_SKILL_LEVEL_17 = "reading_skill_level_17";
	public static final String WRITING_SKILL_LEVEL_1 = "writing_skill_level_1";
	public static final String WRITING_SKILL_LEVEL_2 = "writing_skill_level_2";
	public static final String WRITING_SKILL_LEVEL_3 = "writing_skill_level_3";
	public static final String WRITING_SKILL_LEVEL_4 = "writing_skill_level_4";
	public static final String WRITING_SKILL_LEVEL_5 = "writing_skill_level_5";
	public static final String WRITING_SKILL_LEVEL_6 = "writing_skill_level_6";
	public static final String WRITING_SKILL_LEVEL_7 = "writing_skill_level_7";
	public static final String WRITING_SKILL_LEVEL_8 = "writing_skill_level_8";
	public static final String WRITING_SKILL_LEVEL_9 = "writing_skill_level_9";
	public static final String WRITING_SKILL_LEVEL_10 = "writing_skill_level_10";
	public static final String WRITING_SKILL_LEVEL_11 = "writing_skill_level_11";
	public static final String WRITING_SKILL_LEVEL_12 = "writing_skill_level_12";
	public static final String WRITING_SKILL_LEVEL_13 = "writing_skill_level_13";
	public static final String WRITING_SKILL_LEVEL_14 = "writing_skill_level_14";
	public static final String WRITING_SKILL_LEVEL_15 = "writing_skill_level_15";
	public static final String WRITING_SKILL_LEVEL_16 = "writing_skill_level_16";
	public static final String WRITING_SKILL_LEVEL_17 = "writing_skill_level_17";
	public static final String LISTENING_CLB_LEVEL = "listening_clb_level";
	public static final String SPEAKING_CLB_LEVEL = "speaking_clb_level";
	public static final String READING_CLB_LEVEL = "reading_clb_level";
	public static final String WRITING_CLB_LEVEL = "writing_clb_level";
	public static final String LISTENING_LEVEL_INDICATED_ON_CERTIFICATE = "listening_level_indicated_on_certificate";
	public static final String SPEAKING_LEVEL_INDICATED_ON_CERTIFICATE = "speaking_level_indicated_on_certificate";
	public static final String INSTRUCTIONAL_HOURS_PER_CLASS = "instructional_hours_per_class";
	public static final String CLASSES_PER_WEEK = "classes_per_week";
	public static final String WEEKS_OF_INSTRUCTION = "weeks_of_instruction";
	public static final String WEEKS_OF_INSTRUCTION_PER_YEAR = "weeks_of_instruction_per_year";
	public static final String NEW_STUDENTS_CAN_ENROL_IN_THE_COURSE = "new_students_can_enrol_in_the_course";
	public static final String DOMINANT_FOCUS_OF_THE_COURSE = "dominant_focus_of_the_course";
	public static final String CLIENTS_TRAINING_STATUS = "clients_training_status";
	public static final String REASON_FOR_EXITING_COURSE = "reason_for_exiting_course";
	
		//
	public static final boolean isType(String field, String type)
	{
		return (FIELD_TYPES.get(field) == type);
	}
}
