// elements
var unique_identifier;
var unique_identifier_value;
var date_of_birth;
var phone_number;
var has_email_address;
var email_address;

//connection info
var server = "c01web/"
var page = "needsAndAssessment";

function SubmitData()
{
	var request = new XMLHttpRequest();
	request.open("POST", "http://localhost:8080/" + server + page, true);
	request.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

	request.onreadystatechange = function()
	{
		if(request.readyState == 4)
		{
			alert(request.status + "\n" + request.responseText);
		}
	}

	//Add element to request
	var data = "";
	data += AddParam("unique_identifier", unique_identifier.value);
	data += AddParam("unique_identifier_value", unique_identifier_value.value);
	data += AddParam("date_of_birth", date_of_birth.value);
	data += AddParam("postal_code_where_the_service_was_recieved", postal_code_where_the_service_was_recieved.value);
	data += AddParam("start_date_of_assessment", start_date_of_assessment.value);
	data += AddParam("language_of_service", language_of_service.value);
	data += AddParam("official_language_of_preference", official_language_of_preference.value);
	data += AddParam("type_of_institution", type_of_institution.value);
	data += AddParam("referred_by", referred_by.value);
	
	if(increase_knowledge_of_life_in_canada[0].checked){data += AddParam("increase_knowledge_of_life_in_canada", "1");}
	else{data += AddParam("increase_knowledge_of_life_in_canada", "0");}
	
	if(increase_knowledge_of_life_in_canada_referrals[0].checked){data += AddParam("increase_knowledge_of_life_in_canada_referrals", "1");}
	else{data += AddParam("increase_knowledge_of_life_in_canada_referrals", "0");}

	if(increase_knowledge_of_com_and_gov_services[0].checked){data += AddParam("increase_knowledge_of_com_and_gov_services", "1");}
	else{data += AddParam("increase_knowledge_of_com_and_gov_services", "0");}

	if(increase_knowledge_of_com_and_gov_services_referrals[0].checked){data += AddParam("increase_knowledge_of_com_and_gov_services_referrals", "1");}
	else{data += AddParam("increase_knowledge_of_com_and_gov_services_referrals", "0");}

	if(increase_knowledge_of_working_in_canada[0].checked){data += AddParam("increase_knowledge_of_working_in_canada", "1");}
	else{data += AddParam("increase_knowledge_of_working_in_canada", "0");}

	if(increase_knowledge_of_working_in_canada_referrals[0].checked){data += AddParam("increase_knowledge_of_working_in_canada_referrals", "1");}
	else{data += AddParam("increase_knowledge_of_working_in_canada_referrals", "0");}

	if(increase_knowledge_of_education_in_canada[0].checked){data += AddParam("increase_knowledge_of_education_in_canada", "1");}
	else{data += AddParam("increase_knowledge_of_education_in_canada", "0");}

	if(increase_knowledge_of_education_in_canada_referrals[0].checked){data += AddParam("increase_knowledge_of_education_in_canada_referrals", "1");}
	else{data += AddParam("increase_knowledge_of_education_in_canada_referrals", "0");}
	

	if(increase_following_social_networks[0].checked){data += AddParam("increase_following_social_networks", "1");}
	else{data += AddParam("increase_following_social_networks", "0");}


	if(increase_following_social_networks_referrals[0].checked){data += AddParam("increase_following_social_networks_referrals", "1");}
	else{data += AddParam("increase_following_social_networks_referrals", "0");}


	if(increase_following_professional_networks[0].checked){data += AddParam("increase_following_professional_networks", "1");}
	else{data += AddParam("increase_following_professional_networks", "0");}


	if(increase_following_professional_networks_referrals[0].checked){data += AddParam("increase_following_professional_networks_referrals", "1");}
	else{data += AddParam("increase_following_professional_networks_referrals", "0");}


	if(increase_following_access_to_local_community_services[0].checked){data += AddParam("increase_following_access_to_local_community_services", "1");}
	else{data += AddParam("increase_following_access_to_local_community_services", "0");}


	if(increase_following_access_to_local_community_services_referrals[0].checked){data += AddParam("increase_following_access_to_local_community_services_referrals", "1");}
	else{data += AddParam("increase_following_access_to_local_community_services_referrals", "0");}


	if(increase_following_level_of_community_involvement[0].checked){data += AddParam("increase_following_level_of_community_involvement", "1");}
	else{data += AddParam("increase_following_level_of_community_involvement", "0");}


	if(increase_following_level_of_community_involvement_referrals[0].checked){data += AddParam("increase_following_level_of_community_involvement_referrals", "1");}
	else{data += AddParam("increase_following_level_of_community_involvement_referrals", "0");}


	if(improve_language_skills[0].checked){data += AddParam("improve_language_skills", "1");}
	else{data += AddParam("improve_language_skills", "0");}


	if(improve_language_skills_referrals[0].checked){data += AddParam("improve_language_skills_referrals", "1");}
	else{data += AddParam("improve_language_skills_referrals", "0");}

	data += AddParam("improve_language_skill_to",improve_language_skill_to.value);
	
	if(improve_other_skills[0].checked){data += AddParam("improve_other_skills", "1");}
	else{data += AddParam("improve_other_skills", "0");}


	if(improve_other_skills_referrals[0].checked){data += AddParam("improve_other_skills_referrals", "1");}
	else{data += AddParam("improve_other_skills_referrals", "0");}

	data += AddParam("improve_other_skills_to",improve_other_skills_to.value);

	if(find_employment[0].checked){data += AddParam("find_employment", "1");}
	else{data += AddParam("find_employment", "0");}


	if(find_employment_referrals[0].checked){data += AddParam("find_employment_referrals", "1");}
	else{data += AddParam("find_employment_referrals", "0");}

	data += AddParam("find_employment_timeframe",find_employment_timeframe.value);
	
	if(find_employment_mimimum_one_year_experience[0].checked){data += AddParam("find_employment_mimimum_one_year_experience", "1");}
	else{data += AddParam("find_employment_mimimum_one_year_experience", "0");}

	data += AddParam("find_employment_intends_occupation_NOC_skill_level",find_employment_intends_occupation_NOC_skill_level.value);

	if(find_employment_intends_credential_regonition_and_license[0].checked){data += AddParam("find_employment_intends_credential_regonition_and_license", "1");}
	else{data += AddParam("find_employment_intends_credential_regonition_and_license", "0");}


	if(client_intends_to_become_citizen[0].checked){data += AddParam("client_intends_to_become_citizen", "1");}
	else{data += AddParam("client_intends_to_become_citizen", "0");}


	if(support_services_may_be_required[0].checked){data += AddParam("support_services_may_be_required", "1");}
	else{data += AddParam("support_services_may_be_required", "0");}


	if(care_fore_newcomer_children[0].checked){data += AddParam("care_fore_newcomer_children", "1");}
	else{data += AddParam("care_fore_newcomer_children", "0");}


	if(transportation[0].checked){data += AddParam("transportation", "1");}
	else{data += AddParam("transportation", "0");}


	if(provisions_for_disabilities[0].checked){data += AddParam("provisions_for_disabilities", "1");}
	else{data += AddParam("provisions_for_disabilities", "0");}


	if(translation[0].checked){data += AddParam("translation", "1");}
	else{data += AddParam("translation", "0");}


	if(interpretation[0].checked){data += AddParam("interpretation", "1");}
	else{data += AddParam("interpretation", "0");}


	if(crisis_counselling[0].checked){data += AddParam("crisis_counselling", "1");}
	else{data += AddParam("crisis_counselling", "0");}


	if(non_IRRC_program_services_needed[0].checked){data += AddParam("non_IRRC_program_services_needed", "1");}
	else{data += AddParam("non_IRRC_program_services_needed", "0");}


	if(food_clothing_other_material_needs[0].checked){data += AddParam("food_clothing_other_material_needs", "1");}
	else{data += AddParam("food_clothing_other_material_needs", "0");}


	if(food_clothing_other_material_needs_referrals[0].checked){data += AddParam("food_clothing_other_material_needs_referrals", "1");}
	else{data += AddParam("food_clothing_other_material_needs_referrals", "0");}


	if(housing_accommodation[0].checked){data += AddParam("housing_accommodation", "1");}
	else{data += AddParam("housing_accommodation", "0");}


	if(housing_accommodation_referrals[0].checked){data += AddParam("housing_accommodation_referrals", "1");}
	else{data += AddParam("housing_accommodation_referrals", "0");}


	if(health_mental_health_wellbeing[0].checked){data += AddParam("health_mental_health_wellbeing", "1");}
	else{data += AddParam("health_mental_health_wellbeing", "0");}


	if(health_mental_health_wellbeing_referrals[0].checked){data += AddParam("health_mental_health_wellbeing_referrals", "1");}
	else{data += AddParam("health_mental_health_wellbeing_referrals", "0");}


	if(financial[0].checked){data += AddParam("financial", "1");}
	else{data += AddParam("financial", "0");}

	if(financial_referrals[0].checked){data += AddParam("financial_referrals", "1");}
	else{data += AddParam("financial_referrals", "0");}
	
	if(family_support[0].checked){data += AddParam("family_support", "1");}
	else{data += AddParam("family_support", "0");}

	if(family_support_referrals[0].checked){data += AddParam("family_support_referrals", "1");}
	else{data += AddParam("family_support_referrals", "0");}

	
	if(language_nonIRCC[0].checked){data += AddParam("language_nonIRCC", "1");}
	else{data += AddParam("language_nonIRCC", "0");}

	
	if(language_nonIRCC_referrals[0].checked){data += AddParam("language_nonIRCC_referrals", "1");}
	else{data += AddParam("language_nonIRCC_referrals", "0");}

	
	if(education_skills_development[0].checked){data += AddParam("education_skills_development", "1");}
	else{data += AddParam("education_skills_development", "0");}

	
	if(education_skills_development_referrals[0].checked){data += AddParam("education_skills_development_referrals", "1");}
	else{data += AddParam("education_skills_development_referrals", "0");}

	
	if(employment_related[0].checked){data += AddParam("employment_related", "1");}
	else{data += AddParam("employment_related", "0");}

	
	if(employment_related_referrals[0].checked){data += AddParam("employment_related_referrals", "1");}
	else{data += AddParam("employment_related_referrals", "0");}

	
	if(legal_information_and_services[0].checked){data += AddParam("legal_information_and_services", "1");}
	else{data += AddParam("legal_information_and_services", "0");}

	
	if(legal_information_and_services_referrals[0].checked){data += AddParam("legal_information_and_services_referrals", "1");}
	else{data += AddParam("legal_information_and_services_referrals", "0");}

	
	if(community_services[0].checked){data += AddParam("community_services", "1");}
	else{data += AddParam("community_services", "0");}

	
	if(community_services_referrals[0].checked){data += AddParam("community_services_referrals", "1");}
	else{data += AddParam("community_services_referrals", "0");}

	
	if(support_services_received[0].checked){data += AddParam("support_services_received", "1");}
	else{data += AddParam("support_services_received", "0");}

	
	if(care_for_newcomer_children2[0].checked){data += AddParam("care_for_newcomer_children2", "1");}
	else{data += AddParam("care_for_newcomer_children2", "0");}

	data += AddParam("child1_age",child1_age.value);
	data += AddParam("child1_type_of_care",child1_type_of_care.value);
	data += AddParam("child2_age",child2_age.value);
	data += AddParam("child2_type_of_care",child2_type_of_care.value);
	data += AddParam("child3_age",child3_age.value);
	data += AddParam("child3_type_of_care",child3_type_of_care.value);
	data += AddParam("child4_age",child4_age.value);
	data += AddParam("child4_type_of_care",child4_type_of_care.value);
	data += AddParam("child5_age",child5_age.value);
	data += AddParam("child5_type_of_care",child5_type_of_care.value);

	if(child_transportation[0].checked){data += AddParam("child_transportation", "1");}
	else{data += AddParam("child_transportation", "0");}
	
	if(child_provisions_for_disabilities[0].checked){data += AddParam("child_provisions_for_disabilities", "1");}
	else{data += AddParam("child_provisions_for_disabilities", "0");}

	
	if(child_translation[0].checked){data += AddParam("child_translation", "1");}
	else{data += AddParam("child_translation", "0");}

	data += AddParam("child_translation_between",child_translation_between.value);
	data += AddParam("child_translation_and",child_translation_and.value);
	
	if(child_interpretation[0].checked){data += AddParam("child_interpretation", "1");}
	else{data += AddParam("child_interpretation", "0");}
	
	data += AddParam("child_interpretation_between",child_interpretation_between.value);
	data += AddParam("child_interpretation_and",child_interpretation_and.value);
	
	if(child_crisis_counselling[0].checked){data += AddParam("child_crisis_counselling", "1");}
	else{data += AddParam("child_crisis_counselling", "0");}

	
	if(settlement_plan_compeleted_and_shared_with_client[0].checked){data += AddParam("settlement_plan_compeleted_and_shared_with_client", "1");}
	else{data += AddParam("settlement_plan_compeleted_and_shared_with_client", "0");}

	
	data += AddParam("end_date_of_assessment_YYYY_MM_DD",end_date_of_assessment_YYYY_MM_DD.value);
	data += AddParam("reason_for_update",reason_for_update.value);

	request.send(data);
}

function AddParam(key, value)
{
	return key + "=" + value + "&";
}

function FindFields()
{
	// Find them here on document load
	unique_identifier = document.getElementById("unique_identifier");
	unique_identifier_value = document.getElementById("unique_identifier_value");
	date_of_birth = document.getElementById("date_of_birth");
	postal_code_where_the_service_was_recieved = document.getElementById("postal_code_where_the_service_was_recieved");
	start_date_of_assessment = document.getElementById("start_date_of_assessment");
	language_of_service = document.getElementById("language_of_service");
	official_language_of_preference = document.getElementById("official_language_of_preference");
	type_of_institution = document.getElementById("type_of_institution");
	referred_by = document.getElementById("referred_by");
	
	increase_knowledge_of_life_in_canada = document.getElementsByName("increase_knowledge_of_life_in_canada");
	increase_knowledge_of_life_in_canada_referrals = document.getElementsByName("increase_knowledge_of_life_in_canada_referrals");
	increase_knowledge_of_com_and_gov_services = document.getElementsByName("increase_knowledge_of_com_and_gov_services");
	increase_knowledge_of_com_and_gov_services_referrals = document.getElementsByName("increase_knowledge_of_com_and_gov_services_referrals");
	increase_knowledge_of_working_in_canada = document.getElementsByName("increase_knowledge_of_working_in_canada");
	increase_knowledge_of_working_in_canada_referrals = document.getElementsByName("increase_knowledge_of_working_in_canada_referrals");
	increase_knowledge_of_education_in_canada = document.getElementsByName("increase_knowledge_of_education_in_canada");
	increase_knowledge_of_education_in_canada_referrals = document.getElementsByName("increase_knowledge_of_education_in_canada_referrals");
	increase_following_social_networks = document.getElementsByName("increase_following_social_networks");
	increase_following_social_networks_referrals = document.getElementsByName("increase_following_social_networks_referrals");
	increase_following_professional_networks = document.getElementsByName("increase_following_professional_networks");
	increase_following_professional_networks_referrals = document.getElementsByName("increase_following_professional_networks_referrals");
	increase_following_access_to_local_community_services = document.getElementsByName("increase_following_access_to_local_community_services");
	increase_following_access_to_local_community_services_referrals = document.getElementsByName("increase_following_access_to_local_community_services_referrals");
	increase_following_level_of_community_involvement = document.getElementsByName("increase_following_level_of_community_involvement");
	increase_following_level_of_community_involvement_referrals = document.getElementsByName("increase_following_level_of_community_involvement_referrals");
	improve_language_skills = document.getElementsByName("improve_language_skills");
	improve_language_skills_referrals = document.getElementsByName("improve_language_skills_referrals");
	improve_language_skill_to = document.getElementById("improve_language_skill_to");
	improve_other_skills = document.getElementsByName("improve_other_skills");
	improve_other_skills_referrals = document.getElementsByName("improve_other_skills_referrals");
	improve_other_skills_to = document.getElementById("improve_other_skills_to");
	find_employment = document.getElementsByName("find_employment");
	find_employment_referrals = document.getElementsByName("find_employment_referrals");
	find_employment_timeframe = document.getElementById("find_employment_timeframe");
	find_employment_mimimum_one_year_experience = document.getElementsByName("find_employment_mimimum_one_year_experience");
	find_employment_intends_occupation_NOC_skill_level = document.getElementById("find_employment_intends_occupation_NOC_skill_level");
	find_employment_intends_credential_regonition_and_license = document.getElementsByName("find_employment_intends_credential_regonition_and_license");
	client_intends_to_become_citizen = document.getElementsByName("client_intends_to_become_citizen");
	support_services_may_be_required = document.getElementsByName("support_services_may_be_required");
	care_fore_newcomer_children = document.getElementsByName("care_fore_newcomer_children");
	transportation = document.getElementsByName("transportation");
	provisions_for_disabilities = document.getElementsByName("provisions_for_disabilities");
	translation = document.getElementsByName("translation");
	interpretation = document.getElementsByName("interpretation");
	crisis_counselling = document.getElementsByName("crisis_counselling");
	non_IRRC_program_services_needed = document.getElementsByName("non_IRRC_program_services_needed");
	food_clothing_other_material_needs = document.getElementsByName("food_clothing_other_material_needs");
	food_clothing_other_material_needs_referrals = document.getElementsByName("food_clothing_other_material_needs_referrals");
	housing_accommodation = document.getElementsByName("housing_accommodation");
	housing_accommodation_referrals = document.getElementsByName("housing_accommodation_referrals");
	health_mental_health_wellbeing = document.getElementsByName("health_mental_health_wellbeing");
	health_mental_health_wellbeing_referrals = document.getElementsByName("health_mental_health_wellbeing_referrals");
	financial = document.getElementsByName("financial");
	financial_referrals = document.getElementsByName("financial_referrals");
	family_support = document.getElementsByName("family_support");
	family_support_referrals = document.getElementsByName("family_support_referrals");
	language_nonIRCC = document.getElementsByName("language_nonIRCC");
	language_nonIRCC_referrals = document.getElementsByName("language_nonIRCC_referrals");
	education_skills_development = document.getElementsByName("education_skills_development");
	education_skills_development_referrals = document.getElementsByName("education_skills_development_referrals");
	employment_related = document.getElementsByName("employment_related");
	employment_related_referrals = document.getElementsByName("employment_related_referrals");
	legal_information_and_services = document.getElementsByName("employment_related_referrals");
	legal_information_and_services_referrals = document.getElementsByName("legal_information_and_services_referrals");
	community_services = document.getElementsByName("community_services");
	community_services_referrals = document.getElementsByName("community_services_referrals");
	support_services_received = document.getElementsByName("support_services_received");
	care_for_newcomer_children2 = document.getElementsByName("care_for_newcomer_children2");
	child1_age = document.getElementById("child1_age");
	child1_type_of_care = document.getElementById("child1_type_of_care");
	child2_age = document.getElementById("child2_age");
	child2_type_of_care = document.getElementById("child2_type_of_care");
	child3_age = document.getElementById("child3_age");
	child3_type_of_care = document.getElementById("child3_type_of_care");
	child4_age = document.getElementById("child4_age");
	child4_type_of_care = document.getElementById("child4_type_of_care");
	child5_age = document.getElementById("child5_age");
	child5_type_of_care = document.getElementById("child5_type_of_care");
	child_transportation  = document.getElementsByName("child_transportation");
	child_provisions_for_disabilities = document.getElementsByName("child_provisions_for_disabilities");
	child_translation = document.getElementsByName("child_translation");
	child_translation_between = document.getElementById("child_translation_between");
	child_translation_and = document.getElementById("child_translation_and");
	child_interpretation = document.getElementsByName("child_interpretation");
	child_interpretation_between = document.getElementById("child_interpretation_between");
	child_interpretation_and = document.getElementById("child_interpretation_and");
	child_crisis_counselling = document.getElementsByName("child_crisis_counselling");
	settlement_plan_compeleted_and_shared_with_client = document.getElementsByName("settlement_plan_compeleted_and_shared_with_client");
	end_date_of_assessment_YYYY_MM_DD = document.getElementById("end_date_of_assessment_YYYY_MM_DD");
	reason_for_update = document.getElementById("reason_for_update");
	
}