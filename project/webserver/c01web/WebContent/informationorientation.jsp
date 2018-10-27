<html>
	<head>
		<script type="text/javascript" src="informationorientation.js"></script>
		<!--other script and also external css included over here-->
	</head>
	<body onload="FindFields()">
		<span>update_record_id: </span><textarea id="update_record_id" rows="1" cols="35"></textarea><br />
		<span>unique_identifier: </span><textarea id="unique_identifier" rows="1" cols="35"></textarea><br />
		<span>unique_identifier_value: </span><textarea id="unique_identifier_value" rows="1" cols="35"></textarea><br />
		<span>date_of_birth: </span><textarea id="date_of_birth" rows="1" cols="35"></textarea><br />
		<span>postal_code_service: </span><textarea id="postal_code_service" rows="1" cols="35"></textarea><br />
		<span>date_of_service: </span><textarea id="date_of_service" rows="1" cols="35"></textarea><br />
		<span>service_language: </span><textarea id="service_language" rows="1" cols="35"></textarea><br />
		<span>language_preference: </span><textarea id="language_preference" rows="1" cols="35"></textarea><br />
		<span>provider_type: </span><textarea id="provider_type" rows="1" cols="35"></textarea><br />
		<span>referred_by: </span><textarea id="referred_by" rows="1" cols="35"></textarea><br />
		<span>services_recived: </span><textarea id="services_recived" rows="1" cols="35"></textarea><br />
		<span>length_of_orientation: </span><textarea id="length_of_orientation" rows="1" cols="35"></textarea><br />
		<span>length_of_orientation_hour: </span><textarea id="length_of_orientation_hour" rows="1" cols="35"></textarea><br />
		<span>length_of_orientation_mim: </span><textarea id="length_of_orientation_mim" rows="1" cols="35"></textarea><br />
		<span>num_clients_in_group: </span><textarea id="num_clients_in_group" rows="1" cols="35"></textarea><br />
		<div id="directed_at_target">
			<input type="radio" name="directed_at_target" value="False"> No<br>
			<input type="radio" name="directed_at_target" value="True"> Yes<br>
		</div>
		<div id="target_children">
			<input type="radio" name="target_children" value="False"> No<br>
			<input type="radio" name="target_children" value="True"> Yes<br>
		</div>
		<div id="target_youth">
			<input type="radio" name="target_youth" value="False"> No<br>
			<input type="radio" name="target_youth" value="True"> Yes<br>
		</div>
		<div id="target_senior">
			<input type="radio" name="target_senior" value="False"> No<br>
			<input type="radio" name="target_senior" value="True"> Yes<br>
		</div>
		<div id="target_gender">
			<input type="radio" name="target_gender" value="False"> No<br>
			<input type="radio" name="target_gender" value="True"> Yes<br>
		</div>
		<div id="target_refugee">
			<input type="radio" name="target_refugee" value="False"> No<br>
			<input type="radio" name="target_refugee" value="True"> Yes<br>
		</div>
		<div id="target_ECL">
			<input type="radio" name="target_ECL" value="False"> No<br>
			<input type="radio" name="target_ECL" value="True"> Yes<br>
		</div>
		<div id="target_poor_hearing">
			<input type="radio" name="target_poor_hearing" value="False"> No<br>
			<input type="radio" name="target_poor_hearing" value="True"> Yes<br>
		</div>
		<div id="target_poor_sight">
			<input type="radio" name="target_poor_sight" value="False"> No<br>
			<input type="radio" name="target_poor_sight" value="True"> Yes<br>
		</div>
		<div id="target_lgbtq">
			<input type="radio" name="target_lgbtq" value="False"> No<br>
			<input type="radio" name="target_lgbtq" value="True"> Yes<br>
		</div>
		<div id="target_families_parents">
			<input type="radio" name="target_families_parents" value="False"> No<br>
			<input type="radio" name="target_families_parents" value="True"> Yes<br>
		</div>
		<div id="target_other_impairments">
			<input type="radio" name="target_other_impairments" value="False"> No<br>
			<input type="radio" name="target_other_impairments" value="True"> Yes<br>
		</div>
		<div id="target_profession">
			<input type="radio" name="target_profession" value="False"> No<br>
			<input type="radio" name="target_profession" value="True"> Yes<br>
		</div>
		<div id="target_trade">
			<input type="radio" name="target_trade" value="False"> No<br>
			<input type="radio" name="target_trade" value="True"> Yes<br>
		</div>
		<div id="target_language_minorities">
			<input type="radio" name="target_language_minorities" value="False"> No<br>
			<input type="radio" name="target_language_minorities" value="True"> Yes<br>
		</div>
		<div id="overview_canada">
			<input type="radio" name="overview_canada" value="False"> No<br>
			<input type="radio" name="overview_canada" value="True"> Yes<br>
		</div>
		<div id="overview_canada_referral">
			<input type="radio" name="overview_canada_referral" value="False"> No<br>
			<input type="radio" name="overview_canada_referral" value="True"> Yes<br>
		</div>
		<div id="info_src">
			<input type="radio" name="info_src" value="False"> No<br>
			<input type="radio" name="info_src" value="True"> Yes<br>
		</div>
		<div id="referral_src">
			<input type="radio" name="referral_src" value="False"> No<br>
			<input type="radio" name="referral_src" value="True"> Yes<br>
		</div>
		<div id="right_freedom">
			<input type="radio" name="right_freedom" value="False"> No<br>
			<input type="radio" name="right_freedom" value="True"> Yes<br>
		</div>
		<div id="right_freedom_referral">
			<input type="radio" name="right_freedom_referral" value="False"> No<br>
			<input type="radio" name="right_freedom_referral" value="True"> Yes<br>
		</div>
		<div id="law">
			<input type="radio" name="law" value="False"> No<br>
			<input type="radio" name="law" value="True"> Yes<br>
		</div>
		<div id="law_ref">
			<input type="radio" name="law_ref" value="False"> No<br>
			<input type="radio" name="law_ref" value="True"> Yes<br>
		</div>
		<div id="docs">
			<input type="radio" name="docs" value="False"> No<br>
			<input type="radio" name="docs" value="True"> Yes<br>
		</div>
		<div id="docs_ref">
			<input type="radio" name="docs_ref" value="False"> No<br>
			<input type="radio" name="docs_ref" value="True"> Yes<br>
		</div>
		<div id="eng_fr">
			<input type="radio" name="eng_fr" value="False"> No<br>
			<input type="radio" name="eng_fr" value="True"> Yes<br>
		</div>
		<div id="eng_fr_ref">
			<input type="radio" name="eng_fr_ref" value="False"> No<br>
			<input type="radio" name="eng_fr_ref" value="True"> Yes<br>
		</div>
		<div id="employment">
			<input type="radio" name="employment" value="False"> No<br>
			<input type="radio" name="employment" value="True"> Yes<br>
		</div>
		<div id="employment_ref">
			<input type="radio" name="employment_ref" value="False"> No<br>
			<input type="radio" name="employment_ref" value="True"> Yes<br>
		</div>
		<div id="education">
			<input type="radio" name="education" value="False"> No<br>
			<input type="radio" name="education" value="True"> Yes<br>
		</div>
		<div id="education_ref">
			<input type="radio" name="education_ref" value="False"> No<br>
			<input type="radio" name="education_ref" value="True"> Yes<br>
		</div>
		<div id="housing">
			<input type="radio" name="housing" value="False"> No<br>
			<input type="radio" name="housing" value="True"> Yes<br>
		</div>
		<div id="housing_ref">
			<input type="radio" name="housing_ref" value="False"> No<br>
			<input type="radio" name="housing_ref" value="True"> Yes<br>
		</div>
		<div id="health">
			<input type="radio" name="health" value="False"> No<br>
			<input type="radio" name="health" value="True"> Yes<br>
		</div>
		<div id="health_ref">
			<input type="radio" name="health_ref" value="False"> No<br>
			<input type="radio" name="health_ref" value="True"> Yes<br>
		</div>
		<div id="money">
			<input type="radio" name="money" value="False"> No<br>
			<input type="radio" name="money" value="True"> Yes<br>
		</div>
		<div id="money_ref">
			<input type="radio" name="money_ref" value="False"> No<br>
			<input type="radio" name="money_ref" value="True"> Yes<br>
		</div>
		<div id="transportation">
			<input type="radio" name="transportation" value="False"> No<br>
			<input type="radio" name="transportation" value="True"> Yes<br>
		</div>
		<div id="transportation_ref">
			<input type="radio" name="transportation_ref" value="False"> No<br>
			<input type="radio" name="transportation_ref" value="True"> Yes<br>
		</div>
		<div id="comm_media">
			<input type="radio" name="comm_media" value="False"> No<br>
			<input type="radio" name="comm_media" value="True"> Yes<br>
		</div>
		<div id="comm_media_ref">
			<input type="radio" name="comm_media_ref" value="False"> No<br>
			<input type="radio" name="comm_media_ref" value="True"> Yes<br>
		</div>
		<div id="community_engagment">
			<input type="radio" name="community_engagment" value="False"> No<br>
			<input type="radio" name="community_engagment" value="True"> Yes<br>
		</div>
		<div id="community_engagment_ref">
			<input type="radio" name="community_engagment_ref" value="False"> No<br>
			<input type="radio" name="community_engagment_ref" value="True"> Yes<br>
		</div>
		<div id="becoming_cad">
			<input type="radio" name="becoming_cad" value="False"> No<br>
			<input type="radio" name="becoming_cad" value="True"> Yes<br>
		</div>
		<div id="becoming_cad_ref">
			<input type="radio" name="becoming_cad_ref" value="False"> No<br>
			<input type="radio" name="becoming_cad_ref" value="True"> Yes<br>
		</div>
		<div id="interpersonal_conflict">
			<input type="radio" name="interpersonal_conflict" value="False"> No<br>
			<input type="radio" name="interpersonal_conflict" value="True"> Yes<br>
		</div>
		<div id="interpersonal_conflict_ref">
			<input type="radio" name="interpersonal_conflict_ref" value="False"> No<br>
			<input type="radio" name="interpersonal_conflict_ref" value="True"> Yes<br>
		</div>
		<div id="training_recived">
			<input type="radio" name="training_recived" value="False"> No<br>
			<input type="radio" name="training_recived" value="True"> Yes<br>
		</div>
		<div id="computer_skill">
			<input type="radio" name="computer_skill" value="False"> No<br>
			<input type="radio" name="computer_skill" value="True"> Yes<br>
		</div>
		<div id="document_use">
			<input type="radio" name="document_use" value="False"> No<br>
			<input type="radio" name="document_use" value="True"> Yes<br>
		</div>
		<div id="interpersonal_skill">
			<input type="radio" name="interpersonal_skill" value="False"> No<br>
			<input type="radio" name="interpersonal_skill" value="True"> Yes<br>
		</div>
		<div id="leadership_training">
			<input type="radio" name="leadership_training" value="False"> No<br>
			<input type="radio" name="leadership_training" value="True"> Yes<br>
		</div>
		<div id="numeracy">
			<input type="radio" name="numeracy" value="False"> No<br>
			<input type="radio" name="numeracy" value="True"> Yes<br>
		</div>
		<div id="LS_RoC_info_recived">
			<input type="radio" name="LS_RoC_info_recived" value="False"> No<br>
			<input type="radio" name="LS_RoC_info_recived" value="True"> Yes<br>
		</div>
		<div id="life_skills">
			<input type="radio" name="life_skills" value="False"> No<br>
			<input type="radio" name="life_skills" value="True"> Yes<br>
		</div>
		<div id="rights_responsibillities_citizenship">
			<input type="radio" name="rights_responsibillities_citizenship" value="False"> No<br>
			<input type="radio" name="rights_responsibillities_citizenship" value="True"> Yes<br>
		</div>
		<div id="support_services_recived">
			<input type="radio" name="support_services_recived" value="False"> No<br>
			<input type="radio" name="support_services_recived" value="True"> Yes<br>
		</div>
		<div id="care_children">
			<input type="radio" name="care_children" value="False"> No<br>
			<input type="radio" name="care_children" value="True"> Yes<br>
		</div>
		<span>child1_age: </span><textarea id="child1_age" rows="1" cols="35"></textarea><br />
		<span>child1_care: </span><textarea id="child1_care" rows="1" cols="35"></textarea><br />
		<span>child2_age: </span><textarea id="child2_age" rows="1" cols="35"></textarea><br />
		<span>child2_care: </span><textarea id="child2_care" rows="1" cols="35"></textarea><br />
		<span>child3_age: </span><textarea id="child3_age" rows="1" cols="35"></textarea><br />
		<span>child3_care: </span><textarea id="child3_care" rows="1" cols="35"></textarea><br />
		<span>child4_age: </span><textarea id="child4_age" rows="1" cols="35"></textarea><br />
		<span>child4_care: </span><textarea id="child4_care" rows="1" cols="35"></textarea><br />
		<span>child5_age: </span><textarea id="child5_age" rows="1" cols="35"></textarea><br />
		<span>child5_care: </span><textarea id="child5_care" rows="1" cols="35"></textarea><br />
		<div id="transportation_child">
			<input type="radio" name="transportation_child" value="False"> No<br>
			<input type="radio" name="transportation_child" value="True"> Yes<br>
		</div>
		<div id="disability_provision">
			<input type="radio" name="disability_provision" value="False"> No<br>
			<input type="radio" name="disability_provision" value="True"> Yes<br>
		</div>
		<div id="transtation">
			<input type="radio" name="transtation" value="False"> No<br>
			<input type="radio" name="transtation" value="True"> Yes<br>
		</div>
		<span>transtation_1: </span><textarea id="transtation_1" rows="1" cols="35"></textarea><br />
		<span>transtation_2: </span><textarea id="transtation_2" rows="1" cols="35"></textarea><br />
		<div id="interpretation">
			<input type="radio" name="interpretation" value="False"> No<br>
			<input type="radio" name="interpretation" value="True"> Yes<br>
		</div>
		<span>interpretation_1: </span><textarea id="interpretation_1" rows="1" cols="35"></textarea><br />
		<span>interpretation_2: </span><textarea id="interpretation_2" rows="1" cols="35"></textarea><br />
		<div id="crisis_counselling">
			<input type="radio" name="crisis_counselling" value="False"> No<br>
			<input type="radio" name="crisis_counselling" value="True"> Yes<br>
		</div>
		<span>date_of_termination: </span><textarea id="date_of_termination" rows="1" cols="35"></textarea><br />
		<span>update_reason: </span><textarea id="update_reason" rows="1" cols="35"></textarea><br />
		
		<input type="submit" onclick="SubmitData()">
	</body>
</html>
