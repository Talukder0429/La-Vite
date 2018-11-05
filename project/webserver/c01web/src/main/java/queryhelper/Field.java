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
		        put(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
		        put(DATE_OF_BIRTH, FIELDTYPE_STRING);
		        put(PHONE_NUMBER, FIELDTYPE_STRING);
		        put(EMAIL_ADDRESS, FIELDTYPE_STRING);
		        put(STREET_NUMBER, FIELDTYPE_STRING);
		        put(STREET_NAME, FIELDTYPE_STRING);
		        put(UNIT, FIELDTYPE_STRING);
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
		        
		        //Boolean fields go here
		        put(HAS_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
		        put(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION, FIELDTYPE_BOOLEAN);
		        
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
		        
		        //Fields that have a specific list of choices go here (ones that have drop-down lists)
		        put(UNIQUE_IDENTIFIER, FIELDTYPE_SELECT);
		        put(STREET_TYPE, FIELDTYPE_SELECT);
		        put(STREET_DIRECTION, FIELDTYPE_SELECT);
		        put(PROVINCE, FIELDTYPE_SELECT);
		        put(OFFICIAL_LANGUAGE_OF_PREFERENCE, FIELDTYPE_SELECT);
		        
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
		    }});
	
	
	
	//Each new type goes here
	public static final String FIELDTYPE_STRING = "string";
	public static final String FIELDTYPE_BOOLEAN = "boolean";
	public static final String FIELDTYPE_SELECT = "select";
	
	
	
	//Each new table has its referenced name go here
	public static final String TABLE_CLIENT_PROFILE = "client_profile";
	
	
	
	// TODO
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////        NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Regular string fields you fill on your own go here
	public static final String UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
	public static final String DATE_OF_BIRTH = "date_of_birth";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String STREET_NUMBER = "street_number";
	public static final String STREET_NAME = "street_name";
	public static final String UNIT = "unit";
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

	//Boolean fields go here
	public static final String HAS_EMAIL_ADDRESS = "has_email_address";
	public static final String HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION = "has_consent_for_future_research_or_consultation";
	
	
	public static final String INTERPERSONAL_CONFLICT = "interpersonal_conflict";
	public static final String INTERPERSONAL_CONFLICT_REFERRALS = "interpersonal_conflict_referrals";
	public static final String WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE = "was_life_skills_or_responsibilities_of_citizenship_information_received_as_part_of_this_service";
	public static final String RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA = "rights_and_responsibilities_of_citizenship_based_on_discover_canada";
	public static final String INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA = "increase_knowledge_of_life_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS = "increase_knowledge_of_life_in_canada_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES = "increase_knowledge_of_community_and_government_services";
	public static final String INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS = "increase_knowledge_of_community_and_government_services_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA = "increase_knowledge_of_working_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS = "increase_knowledge_of_working_in_canada_referrals";
	public static final String INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA = "increase_knowledge_of_education_in_canada";
	public static final String INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS = "increase_knowledge_of_education_in_canada_referrals";
	public static final String INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS = "increase_the_following_social_networks";
	public static final String INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS = "increase_the_following_social_networks_referrals";
	public static final String INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS = "increase_the_following_professional_networks";
	public static final String INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS = "increase_the_following_professional_networks_referrals";
	public static final String INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES = "increase_the_following_access_to_local_community_services";
	public static final String INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS = "increase_the_following_access_to_local_community_services_referrals";
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
	public static final String CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION = "consent_for_future_research_consultation";
	public static final String REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION = "registration_in_an_employment_intervention";
	public static final String COURSE_HELD_ON_AN_ONGOING_BASIS = "course_held_on_an_ongoing_basis";


	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	public static final String UNIQUE_IDENTIFIER = "unique_identifier";
	public static final String STREET_TYPE = "street_type";
	public static final String STREET_DIRECTION = "street_direction";
	public static final String PROVINCE = "province";
	
	public static final String OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";
	public static final String IMPROVE_LANGUAGE_SKILLS_TO = "improve_language_skills_to";
	public static final String IMPROVE_OTHER_SKILLS_TO = "improve_other_skills_to";
	public static final String FIND_EMPLOYMENT_TIMEFRAME = "find_employment_timeframe";
	public static final String FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE = "find_employment_minimum_one_years_work_experience";
	public static final String FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL = "find_employment_intends_to_work_in_an_occupation_corresponding_to_which_national_occupation_classification_skill_level";
	public static final String FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA = "find_employment_intends_to_obtain_credential_recognition_or_obtain_license_to_work_in_canada";
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
	public static final String LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED = "long_term_intervention_profession_trade_for_which_services_were_received";
	public static final String SHORT_TERM_INTERVENTION_SERVICE_RECEIVED = "short_term_intervention_service_received";
	public static final String TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES = "time_spent_with_client_addressing_clients_employment_needs_minutes";
	public static final String FORMAT_OF_TRAINING_PROVIDED = "format_of_training_provided";
	public static final String CLASSES_HELD_AT = "classes_held_at";
	
	
	public static final boolean isType(String field, String type)
	{
		return (FIELD_TYPES.get(field) == type);
	}
}
