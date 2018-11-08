<html>
	<head>
		<script type="text/javascript" src="needsAndAssessment.js"></script>
		<!--other script and also external css included over here-->
	</head>
	<body onload="FindFields()">
		<span>Unique Identifier: </span><textarea id="unique_identifier" rows="1" cols="35"></textarea><br />
		<span>Unique Identifier Value: </span><textarea id="unique_identifier_value" rows="1" cols="35"></textarea><br />
		<span>Date of Birth: </span><textarea id="date_of_birth" rows="1" cols="35"></textarea><br />
		<span>postal_code_where_the_service_was_recieved: </span><textarea id="postal_code_where_the_service_was_recieved" rows="1" cols="35"></textarea><br />
		<span>start_date_of_assessment: </span><textarea id="start_date_of_assessment" rows="1" cols="35"></textarea><br />
		<span>language_of_service: </span><textarea id="language_of_service" rows="1" cols="35"></textarea><br />
		<span>official_language_of_preference: </span><textarea id="official_language_of_preference" rows="1" cols="35"></textarea><br />
		<span>type_of_institution: </span><textarea id="type_of_institution" rows="1" cols="35"></textarea><br />
		<span>referred_by: </span><textarea id="referred_by" rows="1" cols="35"></textarea><br />
		<span>increase_knowledge_of_life_in_canada: </span> <br />
		<div id="increase_knowledge_of_life_in_canada">
			<input type="radio" name="increase_knowledge_of_life_in_canada" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_life_in_canada" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_life_in_canada_referrals: </span> <br />
		<div id="increase_knowledge_of_life_in_canada">
			<input type="radio" name="increase_knowledge_of_life_in_canada_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_life_in_canada_referrals" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_com_and_gov_services: </span> <br />
		<div id="increase_knowledge_of_com_and_gov_services">
			<input type="radio" name="increase_knowledge_of_com_and_gov_services" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_com_and_gov_services" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_com_and_gov_services_referrals: </span> <br />
		<div id="increase_knowledge_of_com_and_gov_services_referrals">
			<input type="radio" name="increase_knowledge_of_com_and_gov_services_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_com_and_gov_services_referrals" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_working_in_canada: </span> <br />
		<div id="increase_knowledge_of_working_in_canada">
			<input type="radio" name="increase_knowledge_of_working_in_canada" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_working_in_canada" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_working_in_canada_referrals: </span> <br />
		<div id="increase_knowledge_of_working_in_canada_referrals">
			<input type="radio" name="increase_knowledge_of_working_in_canada_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_working_in_canada_referrals" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_education_in_canada: </span> <br />
		<div id="increase_knowledge_of_education_in_canada">
			<input type="radio" name="increase_knowledge_of_education_in_canada" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_education_in_canada" value="False"> No<br>
		</div>
		<span>increase_knowledge_of_education_in_canada_referrals: </span> <br />
		<div id="increase_knowledge_of_education_in_canada_referrals">
			<input type="radio" name="increase_knowledge_of_education_in_canada_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_knowledge_of_education_in_canada_referrals" value="False"> No<br>
		</div>
		<span>increase_following_social_networks: </span> <br />
		<div id="increase_following_social_networks">
			<input type="radio" name="increase_following_social_networks" value="True"> Yes<br>
			<input type="radio" name="increase_following_social_networks" value="False"> No<br>
		</div>
		<span>increase_following_social_networks_referrals: </span> <br />
		<div id="increase_following_social_networks_referrals">
			<input type="radio" name="increase_following_social_networks_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_following_social_networks_referrals" value="False"> No<br>
		</div>
		<span>increase_following_professional_networks: </span> <br />
		<div id="increase_following_professional_networks">
			<input type="radio" name="increase_following_professional_networks" value="True"> Yes<br>
			<input type="radio" name="increase_following_professional_networks" value="False"> No<br>
		</div>
		<span>increase_following_professional_networks_referrals: </span> <br />
		<div id="increase_following_professional_networks_referrals">
			<input type="radio" name="increase_following_professional_networks_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_following_professional_networks_referrals" value="False"> No<br>
		</div>
		<span>increase_following_access_to_local_community_services: </span> <br />
		<div id="increase_following_access_to_local_community_services">
			<input type="radio" name="increase_following_access_to_local_community_services" value="True"> Yes<br>
			<input type="radio" name="increase_following_access_to_local_community_services" value="False"> No<br>
		</div>
		<span>increase_following_access_to_local_community_services_referrals: </span> <br />
		<div id="increase_following_access_to_local_community_services_referrals">
			<input type="radio" name="increase_following_access_to_local_community_services_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_following_access_to_local_community_services_referrals" value="False"> No<br>
		</div>
		<span>increase_following_level_of_community_involvement: </span> <br />
		<div id="increase_following_level_of_community_involvement">
			<input type="radio" name="increase_following_level_of_community_involvement" value="True"> Yes<br>
			<input type="radio" name="increase_following_level_of_community_involvement" value="False"> No<br>
		</div>
		<span>increase_following_level_of_community_involvement_referrals: </span> <br />
		<div id="increase_following_level_of_community_involvement_referrals">
			<input type="radio" name="increase_following_level_of_community_involvement_referrals" value="True"> Yes<br>
			<input type="radio" name="increase_following_level_of_community_involvement_referrals" value="False"> No<br>
		</div>
		<span>improve_language_skills: </span> <br />
		<div id="improve_language_skills">
			<input type="radio" name="improve_language_skills" value="True"> Yes<br>
			<input type="radio" name="improve_language_skills" value="False"> No<br>
		</div>
		<span>improve_language_skills_referrals: </span> <br />
		<div id="improve_language_skills_referrals">
			<input type="radio" name="improve_language_skills_referrals" value="True"> Yes<br>
			<input type="radio" name="improve_language_skills_referrals" value="False"> No<br>
		</div>
		
		<span>improve_language_skill_to: </span><textarea id="improve_language_skill_to" rows="1" cols="35"></textarea><br />
		
		<span>improve_other_skills: </span> <br />
		<div id="improve_other_skills">
			<input type="radio" name="improve_other_skills" value="True"> Yes<br>
			<input type="radio" name="improve_other_skills" value="False"> No<br>
		</div>
		<span>improve_other_skills_referrals: </span> <br />
		<div id="improve_other_skills_referrals">
			<input type="radio" name="improve_other_skills_referrals" value="True"> Yes<br>
			<input type="radio" name="improve_other_skills_referrals" value="False"> No<br>
		</div>
		
		<span>improve_other_skills_to: </span><textarea id="improve_other_skills_to" rows="1" cols="35"></textarea><br />
		
		<span>find_employment: </span> <br />
		<div id="find_employment">
			<input type="radio" name="find_employment" value="True"> Yes<br>
			<input type="radio" name="find_employment" value="False"> No<br>
		</div>
		
		<span>find_employment_referrals: </span> <br />
		<div id="find_employment_referrals">
			<input type="radio" name="find_employment_referrals" value="True"> Yes<br>
			<input type="radio" name="find_employment_referrals" value="False"> No<br>
		</div>
		
		<span>find_employment_timeframe: </span><textarea id="find_employment_timeframe" rows="1" cols="35"></textarea><br />

		<span>find_employment_mimimum_one_year_experience: </span> <br />
		<div id="find_employment_mimimum_one_year_experience">
			<input type="radio" name="find_employment_mimimum_one_year_experience" value="True"> Yes<br>
			<input type="radio" name="find_employment_mimimum_one_year_experience" value="False"> No<br>
		</div>
		<span>find_employment_intends_occupation_NOC_skill_level: </span><textarea id="find_employment_intends_occupation_NOC_skill_level" rows="1" cols="35"></textarea><br />
		
		<span>find_employment_intends_credential_regonition_and_license: </span> <br />
		<div id="find_employment_intends_credential_regonition_and_license">
			<input type="radio" name="find_employment_intends_credential_regonition_and_license" value="True"> Yes<br>
			<input type="radio" name="find_employment_intends_credential_regonition_and_license" value="False"> No<br>
		</div>
		<span>client_intends_to_become_citizen: </span> <br />
		<div id="client_intends_to_become_citizen">
			<input type="radio" name="client_intends_to_become_citizen" value="True"> Yes<br>
			<input type="radio" name="client_intends_to_become_citizen" value="False"> No<br>
		</div>
		<span>support_services_may_be_required: </span> <br />
		<div id="support_services_may_be_required">
			<input type="radio" name="support_services_may_be_required" value="True"> Yes<br>
			<input type="radio" name="support_services_may_be_required" value="False"> No<br>
		</div>
		<span>care_fore_newcomer_children: </span> <br />
		<div id="care_fore_newcomer_children">
			<input type="radio" name="care_fore_newcomer_children" value="True"> Yes<br>
			<input type="radio" name="care_fore_newcomer_children" value="False"> No<br>
		</div>
		<span>transportation: </span> <br />
		<div id="transportation">
			<input type="radio" name="transportation" value="True"> Yes<br>
			<input type="radio" name="transportation" value="False"> No<br>
		</div>
		<span>provisions_for_disabilities: </span> <br />
		<div id="provisions_for_disabilities">
			<input type="radio" name="provisions_for_disabilities" value="True"> Yes<br>
			<input type="radio" name="provisions_for_disabilities" value="False"> No<br>
		</div>
		<span>translation: </span> <br />
		<div id="translation">
			<input type="radio" name="translation" value="True"> Yes<br>
			<input type="radio" name="translation" value="False"> No<br>
		</div>
		<span>interpretation: </span> <br />
		<div id="interpretation">
			<input type="radio" name="interpretation" value="True"> Yes<br>
			<input type="radio" name="interpretation" value="False"> No<br>
		</div>
		<span>crisis_counselling: </span> <br />
		<div id="crisis_counselling">
			<input type="radio" name="crisis_counselling" value="True"> Yes<br>
			<input type="radio" name="crisis_counselling" value="False"> No<br>
		</div>
		<span>non_IRRC_program_services_needed: </span> <br />
		<div id="non_IRRC_program_services_needed">
			<input type="radio" name="non_IRRC_program_services_needed" value="True"> Yes<br>
			<input type="radio" name="non_IRRC_program_services_needed" value="False"> No<br>
		</div>
		<span>food_clothing_other_material_needs: </span> <br />
		<div id="food_clothing_other_material_needs">
			<input type="radio" name="food_clothing_other_material_needs" value="True"> Yes<br>
			<input type="radio" name="food_clothing_other_material_needs" value="False"> No<br>
		</div>
		<span>food_clothing_other_material_needs_referrals: </span> <br />
		<div id="food_clothing_other_material_needs_referrals">
			<input type="radio" name="food_clothing_other_material_needs_referrals" value="True"> Yes<br>
			<input type="radio" name="food_clothing_other_material_needs_referrals" value="False"> No<br>
		</div>
		<span>housing_accommodation: </span> <br />
		<div id="housing_accommodation">
			<input type="radio" name="housing_accommodation" value="True"> Yes<br>
			<input type="radio" name="housing_accommodation" value="False"> No<br>
		</div>
		<span>housing_accommodation_referrals: </span> <br />
		<div id="housing_accommodation_referrals">
			<input type="radio" name="housing_accommodation_referrals" value="True"> Yes<br>
			<input type="radio" name="housing_accommodation_referrals" value="False"> No<br>
		</div>
		<span>health_mental_health_wellbeing: </span> <br />
		<div id="health_mental_health_wellbeing">
			<input type="radio" name="health_mental_health_wellbeing" value="True"> Yes<br>
			<input type="radio" name="health_mental_health_wellbeing" value="False"> No<br>
		</div>
		<span>health_mental_health_wellbeing_referrals: </span> <br />
		<div id="health_mental_health_wellbeing_referrals">
			<input type="radio" name="health_mental_health_wellbeing_referrals" value="True"> Yes<br>
			<input type="radio" name="health_mental_health_wellbeing_referrals" value="False"> No<br>
		</div>
		<span>financial: </span> <br />
		<div id="finanical">
			<input type="radio" name="financial" value="True"> Yes<br>
			<input type="radio" name="financial" value="False"> No<br>
		</div>
		<span>financial_referrals: </span> <br />
		<div id="financial_referrals">
			<input type="radio" name="financial_referrals" value="True"> Yes<br>
			<input type="radio" name="financial_referrals" value="False"> No<br>
		</div>
		<span>family_support: </span> <br />
		<div id="family_support">
			<input type="radio" name="family_support" value="True"> Yes<br>
			<input type="radio" name="family_support" value="False"> No<br>
		</div>
		<span>family_support_referrals: </span> <br />
		<div id="family_support_referrals">
			<input type="radio" name="family_support_referrals" value="True"> Yes<br>
			<input type="radio" name="family_support_referrals" value="False"> No<br>
		</div>
		<span>language_nonIRCC: </span> <br />
		<div id="language_nonIRCC">
			<input type="radio" name="language_nonIRCC" value="True"> Yes<br>
			<input type="radio" name="language_nonIRCC" value="False"> No<br>
		</div>
		<span>language_nonIRCC_referrals: </span> <br />
		<div id="language_nonIRCC_referrals">
			<input type="radio" name="language_nonIRCC_referrals" value="True"> Yes<br>
			<input type="radio" name="language_nonIRCC_referrals" value="False"> No<br>
		</div>
		<span>education_skills_development: </span> <br />
		<div id="education_skills_development">
			<input type="radio" name="education_skills_development" value="True"> Yes<br>
			<input type="radio" name="education_skills_development" value="False"> No<br>
		</div>
		<span>education_skills_development_referrals: </span> <br />
		<div id="education_skills_development_referrals">
			<input type="radio" name="education_skills_development_referrals" value="True"> Yes<br>
			<input type="radio" name="education_skills_development_referrals" value="False"> No<br>
		</div>
		<span>employment_related: </span> <br />
		<div id="employment_related">
			<input type="radio" name="employment_related" value="True"> Yes<br>
			<input type="radio" name="employment_related" value="False"> No<br>
		</div>
		<span>employment_related_referrals: </span> <br />
		<div id="employment_related_referrals">
			<input type="radio" name="employment_related_referrals" value="True"> Yes<br>
			<input type="radio" name="employment_related_referrals" value="False"> No<br>
		</div>
		<span>legal_information_and_services: </span> <br />
		<div id="legal_information_and_services">
			<input type="radio" name="legal_information_and_services" value="True"> Yes<br>
			<input type="radio" name="legal_information_and_services" value="False"> No<br>
		</div>
		<span>legal_information_and_services_referrals: </span> <br />
		<div id="legal_information_and_services_referrals">
			<input type="radio" name="legal_information_and_services_referrals" value="True"> Yes<br>
			<input type="radio" name="legal_information_and_services_referrals" value="False"> No<br>
		</div>
		<span>community_services: </span> <br />
		<div id="community_services">
			<input type="radio" name="community_services" value="True"> Yes<br>
			<input type="radio" name="community_services" value="False"> No<br>
		</div>
		<span>community_services_referrals: </span> <br />
		<div id="community_services_referrals">
			<input type="radio" name="community_services_referrals" value="True"> Yes<br>
			<input type="radio" name="community_services_referrals" value="False"> No<br>
		</div>
		<span>support_services_received: </span> <br />
		<div id="support_services_received">
			<input type="radio" name="support_services_received" value="True"> Yes<br>
			<input type="radio" name="support_services_received" value="False"> No<br>
		</div>
		<span>care_for_newcomer_children2: </span> <br />
		<div id="care_for_newwcomer_children2">
			<input type="radio" name="care_for_newcomer_children2" value="True"> Yes<br>
			<input type="radio" name="care_for_newcomer_children2" value="False"> No<br>
		</div>
		<span>child1_age: </span><textarea id="child1_age" rows="1" cols="35"></textarea><br />
		<span>child1_type_of_care: </span><textarea id="child1_type_of_care" rows="1" cols="35"></textarea><br />
		<span>child2_age: </span><textarea id="child2_age" rows="1" cols="35"></textarea><br />
		<span>child2_type_of_care: </span><textarea id="child2_type_of_care" rows="1" cols="35"></textarea><br />
		<span>child3_age: </span><textarea id="child3_age" rows="1" cols="35"></textarea><br />
		<span>child3_type_of_care: </span><textarea id="child3_type_of_care" rows="1" cols="35"></textarea><br />
		<span>child4_age: </span><textarea id="child4_age" rows="1" cols="35"></textarea><br />
		<span>child4_type_of_care: </span><textarea id="child4_type_of_care" rows="1" cols="35"></textarea><br />
		<span>child5_age: </span><textarea id="child5_age" rows="1" cols="35"></textarea><br />
		<span>child5_type_of_care: </span><textarea id="child5_type_of_care" rows="1" cols="35"></textarea><br />
		
		<span>child_transportation: </span> <br />
		<div id="child_transportation">
			<input type="radio" name="child_transportation" value="True"> Yes<br>
			<input type="radio" name="child_transportation" value="False"> No<br>
		</div>
		<span>child_provisions_for_disabilities: </span> <br />
		<div id="child_provisions_for_disabilities">
			<input type="radio" name="child_provisions_for_disabilities" value="True"> Yes<br>
			<input type="radio" name="child_provisions_for_disabilities" value="False"> No<br>
		</div>
		<span>child_translation: </span> <br />
		<div id="child_translation">
			<input type="radio" name="child_translation" value="True"> Yes<br>
			<input type="radio" name="child_translation" value="False"> No<br>
		</div>
		
		<span>child_translation_between: </span><textarea id="child_translation_between" rows="1" cols="35"></textarea><br />
		<span>child_translation_and: </span><textarea id="child_translation_and" rows="1" cols="35"></textarea><br />

		<span>child_interpretation: </span> <br />
		<div id="child_interpretation">
			<input type="radio" name="child_interpretation" value="True"> Yes<br>
			<input type="radio" name="child_interpretation" value="False"> No<br>
		</div>
		
		<span>child_interpretation_between: </span><textarea id="child_interpretation_between" rows="1" cols="35"></textarea><br />
		<span>child_interpretation_and: </span><textarea id="child_interpretation_and" rows="1" cols="35"></textarea><br />
		
		<span>child_crisis_counselling: </span> <br />
		<div id="child_crisis_counselling">
			<input type="radio" name="child_crisis_counselling" value="True"> Yes<br>
			<input type="radio" name="child_crisis_counselling" value="False"> No<br>
		</div>
		<span>settlement_plan_compeleted_and_shared_with_client: </span> <br />
		<div id="settlement_plan_compeleted_and_shared_with_client">
			<input type="radio" name="settlement_plan_compeleted_and_shared_with_client" value="True"> Yes<br>
			<input type="radio" name="settlement_plan_compeleted_and_shared_with_client" value="False"> No<br>
		</div>
		
		<span>end_date_of_assessment_YYYY_MM_DD: </span><textarea id="end_date_of_assessment_YYYY_MM_DD" rows="1" cols="35"></textarea><br />
		<span>reason_for_update: </span><textarea id="reason_for_update" rows="1" cols="35"></textarea><br />
		
		
		
		
		
		<input type="submit" onclick="SubmitData()">
	</body>
</html>
