var types = new Object();
var names = new Object();

//Each new type goes here
const FIELDTYPE_STRING = "string";
const FIELDTYPE_BOOLEAN = "boolean";
const FIELDTYPE_SELECT = "select";

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////        NEW FIELDS GO HERE                                         /////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Regular string fields you fill on your own go here
const UNIQUE_IDENTIFIER_VALUE = "unique_identifier_value";
const DATE_OF_BIRTH = "date_of_birth";
const PHONE_NUMBER = "phone_number";
const EMAIL_ADDRESS = "email_address";
const STREET_NUMBER = "street_number";
const STREET_NAME = "street_name";
const UNIT = "unit";
const CITY = "city";
const POSTAL_CODE = "postal_code";

const END_DATE_OF_SERVICE_YYYY_MM_DD = "end_date_of_service_yyyy_mm_dd";
const START_DATE_OF_ASSESSMENT_YYYY_MM_DD = "start_date_of_assessment_yyyy_mm_dd";
const END_DATE_OF_ASSESSMENT_YYYY_MM_DD = "end_date_of_assessment_yyyy_mm_dd";
const REFERRAL_DATE_YYYY_MM_DD = "referral_date_yyyy_mm_dd";
const LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD = "long_term_intervention_start_date_yyyy_mm_dd";
const LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD = "long_term_intervention_end_date_yyyy_mm_dd";
const SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD = "short_term_intervention_date_yyyy_mm_dd";
const TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS = "time_spent_with_client_addressing_clients_employment_needs_hours";
const COURSE_CODE = "course_code";
const DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD = "date_of_clients_first_class_yyyy_mm_dd";
const NOTES = "notes";
const IN_PERSON_INSTRUCTION_PERCENT = "in_person_instruction_percent";
const ONLINE_DISTANCE_INSTRUCTION_PERCENT = "online_distance_instruction_percent";
const TOTAL_NUMBER_OF_SPOTS_IN_COURSE = "total_number_of_spots_in_course";

//Boolean fields go here
const HAS_EMAIL_ADDRESS = "has_email_address";
const HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION = "has_consent_for_future_research_or_consultation";

const INTERPERSONAL_CONFLICT = "interpersonal_conflict";
const INTERPERSONAL_CONFLICT_REFERRALS = "interpersonal_conflict_referrals";
const WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE = "was_life_skills_or_responsibilities_of_citizenship_information_received_as_part_of_this_service";
const RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA = "rights_and_responsibilities_of_citizenship_based_on_discover_canada";
const INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA = "increase_knowledge_of_life_in_canada";
const INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS = "increase_knowledge_of_life_in_canada_referrals";
const INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES = "increase_knowledge_of_community_and_government_services";
const INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS = "increase_knowledge_of_community_and_government_services_referrals";
const INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA = "increase_knowledge_of_working_in_canada";
const INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS = "increase_knowledge_of_working_in_canada_referrals";
const INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA = "increase_knowledge_of_education_in_canada";
const INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS = "increase_knowledge_of_education_in_canada_referrals";
const INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS = "increase_the_following_social_networks";
const INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS = "increase_the_following_social_networks_referrals";
const INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS = "increase_the_following_professional_networks";
const INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS = "increase_the_following_professional_networks_referrals";
const INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES = "increase_the_following_access_to_local_community_services";
const INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS = "increase_the_following_access_to_local_community_services_referrals";
const INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT = "increase_the_following_level_of_community_involvement";
const INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS = "increase_the_following_level_of_community_involvement_referrals";
const IMPROVE_LANGUAGE_SKILLS = "improve_language_skills";
const IMPROVE_LANGUAGE_SKILLS_REFERRALS = "improve_language_skills_referrals";
const IMPROVE_OTHER_SKILLS = "improve_other_skills";
const IMPROVE_OTHER_SKILLS_REFERRALS = "improve_other_skills_referrals";
const FIND_EMPLOYMENT = "find_employment";
const SUPPORT_SERVICES_MAY_BE_REQUIRED = "support_services_may_be_required";
const NON_IRCC_PROGRAM_SERVICES_NEEDED = "non_ircc_program_services_needed";
const FOOD_CLOTHING_OTHER_MATERIAL_NEEDS = "food_clothing_other_material_needs";
const FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS = "food_clothing_other_material_needs_referrals";
const HOUSING_ACCOMMODATION = "housing_accommodation";
const HOUSING_ACCOMMODATION_REFERRALS = "housing_accommodation_referrals";
const HEALTH_MENTAL_HEALTH_WELL_BEING = "health_mental_health_well_being";
const HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS = "health_mental_health_well_being_referrals";
const FINANCIAL = "financial";
const FINANCIAL_REFERRALS = "financial_referrals";
const FAMILY_SUPPORT = "family_support";
const FAMILY_SUPPORT_REFERRALS = "family_support_referrals";
const LANGUAGE_NON_IRCC = "language_non_ircc";
const LANGUAGE_NON_IRCC_REFERRALS = "language_non_ircc_referrals";
const EDUCATION_SKILLS_DEVELOPMENT = "education_skills_development";
const EDUCATION_SKILLS_DEVELOPMENT_REFERRALS = "education_skills_development_referrals";
const EMPLOYMENT_RELATED = "employment_related";
const EMPLOYMENT_RELATED_REFERRALS = "employment_related_referrals";
const LEGAL_INFORMATION_AND_SERVICES = "legal_information_and_services";
const LEGAL_INFORMATION_AND_SERVICES_REFERRALS = "legal_information_and_services_referrals";
const COMMUNITY_SERVICES = "community_services";
const COMMUNITY_SERVICES_REFERRALS = "community_services_referrals";
const SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT = "settlement_plan_completed_and_shared_with_client";
const CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION = "consent_for_future_research_consultation";
const REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION = "registration_in_an_employment_intervention";
const COURSE_HELD_ON_AN_ONGOING_BASIS = "course_held_on_an_ongoing_basis";

//Fields that have a specific list of choices go here (ones that have drop-down lists)
const UNIQUE_IDENTIFIER = "unique_identifier";
const STREET_TYPE = "street_type";
const STREET_DIRECTION = "street_direction";
const PROVINCE = "province";
const OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";

const OFFICIAL_LANGUAGE_OF_PREFERENCE = "official_language_of_preference";
const IMPROVE_LANGUAGE_SKILLS_TO = "improve_language_skills_to";
const IMPROVE_OTHER_SKILLS_TO = "improve_other_skills_to";
const FIND_EMPLOYMENT_REFERRALS = "find_employment_referrals";
const FIND_EMPLOYMENT_TIMEFRAME = "find_employment_timeframe";
const FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE = "find_employment_minimum_one_years_work_experience";
const FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL = "find_employment_intends_to_work_in_an_occupation_corresponding_to_which_national_occupation_classification_skill_level";
const FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA = "find_employment_intends_to_obtain_credential_recognition_or_obtain_license_to_work_in_canada";
const CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN = "client_intends_to_become_a_canadian_citizen";
const A_REFERRAL_TO = "a_referral_to";
const EMPLOYMENT_STATUS = "employment_status";
const EDUCATION_STATUS = "education_status";
const OCCUPATION_IN_CANADA = "occupation_in_canada";
const INTENDED_OCCUPATION = "intended_occupation";
const INTERVENTION_TYPE = "intervention_type";
const LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED = "long_term_intervention_intervention_received";
const LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION = "long_term_intervention_status_of_intervention";
const LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION = "long_term_intervention_reason_for_leaving_intervention";
const LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER = "long_term_intervention_size_of_employer";
const LONG_TERM_INTERVENTION_PLACEMENT_WAS = "long_term_intervention_placement_was";
const LONG_TERM_INTERVENTION_HOURS_PER_WEEK = "long_term_intervention_hours_per_week";
const LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT = "long_term_intervention_client_met_mentor_regularly_at";
const LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR = "long_term_intervention_average_hours_week_in_contact_with_mentor";
const LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED = "long_term_intervention_profession_trade_for_which_services_were_received";
const SHORT_TERM_INTERVENTION_SERVICE_RECEIVED = "short_term_intervention_service_received";
const TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES = "time_spent_with_client_addressing_clients_employment_needs_minutes";
const FORMAT_OF_TRAINING_PROVIDED = "format_of_training_provided";
const CLASSES_HELD_AT = "classes_held_at";

function mapTypes()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Regular string fields you fill on your own go here
	setType(UNIQUE_IDENTIFIER_VALUE, FIELDTYPE_STRING);
	setType(DATE_OF_BIRTH, FIELDTYPE_STRING);
	setType(PHONE_NUMBER, FIELDTYPE_STRING);
	setType(EMAIL_ADDRESS, FIELDTYPE_STRING);
	setType(STREET_NUMBER, FIELDTYPE_STRING);
	setType(STREET_NAME, FIELDTYPE_STRING);
	setType(UNIT, FIELDTYPE_STRING);
	setType(CITY, FIELDTYPE_STRING);
	setType(POSTAL_CODE, FIELDTYPE_STRING);
	
	setType(END_DATE_OF_SERVICE_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(START_DATE_OF_ASSESSMENT_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(END_DATE_OF_ASSESSMENT_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(REFERRAL_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS, FIELDTYPE_STRING);
	setType(COURSE_CODE, FIELDTYPE_STRING);
	setType(DATE_OF_CLIENTS_FIRST_CLASS_YYYY_MM_DD, FIELDTYPE_STRING);
	setType(NOTES, FIELDTYPE_STRING);
	setType(IN_PERSON_INSTRUCTION_PERCENT, FIELDTYPE_STRING);
	setType(ONLINE_DISTANCE_INSTRUCTION_PERCENT, FIELDTYPE_STRING);
	setType(TOTAL_NUMBER_OF_SPOTS_IN_COURSE, FIELDTYPE_STRING);
	
	//Boolean fields go here
	setType(HAS_EMAIL_ADDRESS, FIELDTYPE_BOOLEAN);
	setType(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION, FIELDTYPE_BOOLEAN);
	
	setType(INTERPERSONAL_CONFLICT, FIELDTYPE_BOOLEAN);
	setType(INTERPERSONAL_CONFLICT_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE, FIELDTYPE_BOOLEAN);
	setType(RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA, FIELDTYPE_BOOLEAN);
	setType(INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT, FIELDTYPE_BOOLEAN);
	setType(INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(IMPROVE_LANGUAGE_SKILLS, FIELDTYPE_BOOLEAN);
	setType(IMPROVE_LANGUAGE_SKILLS_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(IMPROVE_OTHER_SKILLS, FIELDTYPE_BOOLEAN);
	setType(IMPROVE_OTHER_SKILLS_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(FIND_EMPLOYMENT, FIELDTYPE_BOOLEAN);
	setType(FIND_EMPLOYMENT_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(SUPPORT_SERVICES_MAY_BE_REQUIRED, FIELDTYPE_BOOLEAN);
	setType(NON_IRCC_PROGRAM_SERVICES_NEEDED, FIELDTYPE_BOOLEAN);
	setType(FOOD_CLOTHING_OTHER_MATERIAL_NEEDS, FIELDTYPE_BOOLEAN);
	setType(FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(HOUSING_ACCOMMODATION, FIELDTYPE_BOOLEAN);
	setType(HOUSING_ACCOMMODATION_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(HEALTH_MENTAL_HEALTH_WELL_BEING, FIELDTYPE_BOOLEAN);
	setType(HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(FINANCIAL, FIELDTYPE_BOOLEAN);
	setType(FINANCIAL_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(FAMILY_SUPPORT, FIELDTYPE_BOOLEAN);
	setType(FAMILY_SUPPORT_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(LANGUAGE_NON_IRCC, FIELDTYPE_BOOLEAN);
	setType(LANGUAGE_NON_IRCC_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(EDUCATION_SKILLS_DEVELOPMENT, FIELDTYPE_BOOLEAN);
	setType(EDUCATION_SKILLS_DEVELOPMENT_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(EMPLOYMENT_RELATED, FIELDTYPE_BOOLEAN);
	setType(EMPLOYMENT_RELATED_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(LEGAL_INFORMATION_AND_SERVICES, FIELDTYPE_BOOLEAN);
	setType(LEGAL_INFORMATION_AND_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(COMMUNITY_SERVICES, FIELDTYPE_BOOLEAN);
	setType(COMMUNITY_SERVICES_REFERRALS, FIELDTYPE_BOOLEAN);
	setType(SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT, FIELDTYPE_BOOLEAN);
	setType(CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION, FIELDTYPE_BOOLEAN);
	setType(REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION, FIELDTYPE_BOOLEAN);
	setType(COURSE_HELD_ON_AN_ONGOING_BASIS, FIELDTYPE_BOOLEAN);
	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	setType(UNIQUE_IDENTIFIER, FIELDTYPE_SELECT);
	setType(STREET_TYPE, FIELDTYPE_SELECT);
	setType(STREET_DIRECTION, FIELDTYPE_SELECT);
	setType(PROVINCE, FIELDTYPE_SELECT);
	setType(OFFICIAL_LANGUAGE_OF_PREFERENCE, FIELDTYPE_SELECT);
	
	setType(IMPROVE_LANGUAGE_SKILLS_TO, FIELDTYPE_SELECT);
	setType(IMPROVE_OTHER_SKILLS_TO, FIELDTYPE_SELECT);
	setType(FIND_EMPLOYMENT_TIMEFRAME, FIELDTYPE_SELECT);
	setType(FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE, FIELDTYPE_SELECT);
	setType(FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL, FIELDTYPE_SELECT);
	setType(FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA, FIELDTYPE_SELECT);
	setType(CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN, FIELDTYPE_SELECT);
	setType(A_REFERRAL_TO, FIELDTYPE_SELECT);
	setType(EMPLOYMENT_STATUS, FIELDTYPE_SELECT);
	setType(EDUCATION_STATUS, FIELDTYPE_SELECT);
	setType(OCCUPATION_IN_CANADA, FIELDTYPE_SELECT);
	setType(INTENDED_OCCUPATION, FIELDTYPE_SELECT);
	setType(INTERVENTION_TYPE, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_PLACEMENT_WAS, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_HOURS_PER_WEEK, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR, FIELDTYPE_SELECT);
	setType(LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED, FIELDTYPE_SELECT);
	setType(SHORT_TERM_INTERVENTION_SERVICE_RECEIVED, FIELDTYPE_SELECT);
	setType(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES, FIELDTYPE_SELECT);
	setType(FORMAT_OF_TRAINING_PROVIDED, FIELDTYPE_SELECT);
	setType(CLASSES_HELD_AT, FIELDTYPE_SELECT);
}

function mapLists()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW LISTS GO HERE                                          /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	mapListToField(UNIQUE_IDENTIFIER, LIST_UNIQUE_IDENTIFIER);
	mapListToField(STREET_TYPE, LIST_STREET_TYPE);
	mapListToField(STREET_DIRECTION, LIST_STREET_DIRECTION);
	mapListToField(PROVINCE, LIST_PROVINCE);
	mapListToField(OFFICIAL_LANGUAGE_OF_PREFERENCE, LIST_OFFICIAL_LANGUAGE_OF_PREFERENCE);

	mapListToField(IMPROVE_LANGUAGE_SKILLS_TO, LIST_IMPROVE_LANGUAGE_SKILLS_TO);
	mapListToField(IMPROVE_OTHER_SKILLS_TO, LIST_IMPROVE_OTHER_SKILLS_TO);
	mapListToField(FIND_EMPLOYMENT_TIMEFRAME, LIST_FIND_EMPLOYMENT_TIMEFRAME);
	mapListToField(FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE, LIST_FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE);
	mapListToField(FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL, LIST_FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL);
	mapListToField(FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA, LIST_FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA);
	mapListToField(CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN, LIST_CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN);
	mapListToField(A_REFERRAL_TO, LIST_A_REFERRAL_TO);
	mapListToField(EMPLOYMENT_STATUS, LIST_EMPLOYMENT_STATUS);
	mapListToField(EDUCATION_STATUS, LIST_EDUCATION_STATUS);
	mapListToField(OCCUPATION_IN_CANADA, LIST_OCCUPATION_IN_CANADA);
	mapListToField(INTENDED_OCCUPATION, LIST_INTENDED_OCCUPATION);
	mapListToField(INTERVENTION_TYPE, LIST_INTERVENTION_TYPE);
	mapListToField(LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED, LIST_LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED);
	mapListToField(LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION, LIST_LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION);
	mapListToField(LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION, LIST_LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION);
	mapListToField(LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER, LIST_LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER);
	mapListToField(LONG_TERM_INTERVENTION_PLACEMENT_WAS, LIST_LONG_TERM_INTERVENTION_PLACEMENT_WAS);
	mapListToField(LONG_TERM_INTERVENTION_HOURS_PER_WEEK, LIST_LONG_TERM_INTERVENTION_HOURS_PER_WEEK);
	mapListToField(LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT, LIST_LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT);
	mapListToField(LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR, LIST_LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR);
	mapListToField(LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED, LIST_LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED);
	mapListToField(SHORT_TERM_INTERVENTION_SERVICE_RECEIVED, LIST_SHORT_TERM_INTERVENTION_SERVICE_RECEIVED);
	mapListToField(TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES, LIST_TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES);
	mapListToField(FORMAT_OF_TRAINING_PROVIDED, LIST_FORMAT_OF_TRAINING_PROVIDED);
	mapListToField(CLASSES_HELD_AT, LIST_CLASSES_HELD_AT);
}

/*function mapNames()
{
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////		  NEW FIELDS GO HERE                                         /////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Regular string fields you fill on your own go here
	autoGenerateName(UNIQUE_IDENTIFIER_VALUE);
	autoGenerateName(DATE_OF_BIRTH);
	autoGenerateName(PHONE_NUMBER);
	autoGenerateName(EMAIL_ADDRESS);
	autoGenerateName(STREET_NUMBER);
	autoGenerateName(STREET_NAME);
	autoGenerateName(UNIT);
	autoGenerateName(CITY);
	autoGenerateName(POSTAL_CODE);
	
	//Boolean fields go here
	autoGenerateName(HAS_EMAIL_ADDRESS);
	autoGenerateName(HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION);
	
	//Fields that have a specific list of choices go here (ones that have drop-down lists)
	autoGenerateName(UNIQUE_IDENTIFIER);
	autoGenerateName(STREET_TYPE);
	autoGenerateName(STREET_DIRECTION);
	autoGenerateName(PROVINCE);
	autoGenerateName(OFFICIAL_LANGUAGE_OF_PREFERENCE);
}*/

function setType(field, type)
{
	types[field] = type;
	
	//this should be removed in the future, but for now it saves a lot of lines
	autoGenerateName(field);
}

function getType(field)
{
	return types[field];
}

function setName(field, name)
{
	names[field] = name;
}

function getName(field)
{
	return names[field];
}

function autoGenerateName(field)
{
	//nifty solution I found to capitalize first letter of each word
	var result = field.toLowerCase()
		.split('_')
		.map((s) => s.charAt(0).toUpperCase() + s.substring(1))
		.join(' ');
	result += ": ";
	setName(field, result);
}

//Each new type has to have a function to check if field is of that type
function isString(field)
{
	return (getType(field) === FIELDTYPE_STRING);
}

function isBoolean(field)
{
	return (getType(field) === FIELDTYPE_BOOLEAN);
}

function isSelect(field)
{
	return (getType(field) === FIELDTYPE_SELECT);
}