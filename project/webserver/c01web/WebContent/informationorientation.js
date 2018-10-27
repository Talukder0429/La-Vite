// elements
var update_record_id;
var unique_identifier;
var unique_identifier_value;
var date_of_birth;
var postal_code_service;
var date_of_service;
var service_language;
var language_preference;
var provider_type;
var referred_by;
var services_recived;
var length_of_orientation;
var length_of_orientation_hour;
var length_of_orientation_mim;
var num_clients_in_group;
var directed_at_target;
var target_children;
var target_youth;
var target_senior;
var target_gender;
var target_refugee;
var target_ECL;
var target_poor_hearing;
var target_poor_sight;
var target_lgbtq;
var target_families_parents;
var target_other_impairments;
var target_profession;
var target_trade;
var target_language_minorities;
var overview_canada;
var overview_canada_referral;
var info_src;
var referral_src;
var right_freedom;
var right_freedom_referral;
var law;
var law_ref;
var docs;
var docs_ref;
var eng_fr;
var eng_fr_ref;
var employment;
var employment_ref;
var education;
var education_ref;
var housing;
var housing_ref;
var health;
var health_ref;
var money;
var money_ref;
var transportation;
var transportation_ref;
var comm_media;
var comm_media_ref;
var community_engagment;
var community_engagment_ref;
var becoming_cad;
var becoming_cad_ref;
var interpersonal_conflict;
var interpersonal_conflict_ref;
var training_recived;
var computer_skill;
var document_use;
var interpersonal_skill;
var leadership_training;
var numeracy;
var LS_RoC_info_recived;
var life_skills;
var rights_responsibillities_citizenship;
var support_services_recived;
var care_children;
var child1_age;
var child1_care;
var child2_age;
var child2_care;
var child3_age;
var child3_care;
var child4_age;
var child4_care;
var child5_age;
var child5_care;
var transportation_child;
var disability_provision;
var transtation;
var transtation_1;
var transtation_2;
var interpretation;
var interpretation_1;
var interpretation_2;
var crisis_counselling;
var date_of_termination;
var update_reason;

// connection info
var server = "c01web/"
var page = "InformationOrientation";

function SubmitData() {
	var request = new XMLHttpRequest();
	request.open("POST", "http://localhost:8080/" + server + page, true);
	request.setRequestHeader('Content-type',
			'application/x-www-form-urlencoded');

	request.onreadystatechange = function() {
		if (request.readyState == 4) {
			alert(request.status + "\n" + request.responseText);
		}
	}

	// Add element to request
	var data = "";
	data += AddParam("update_record_id", update_record_id.value);
	data += AddParam("unique_identifier", unique_identifier.value);
	data += AddParam("unique_identifier_value", unique_identifier_value.value);
	data += AddParam("date_of_birth", date_of_birth.value);
	data += AddParam("postal_code_service", postal_code_service.value);
	data += AddParam("date_of_service", date_of_service.value);
	data += AddParam("service_language", service_language.value);
	data += AddParam("language_preference", language_preference.value);
	data += AddParam("provider_type", provider_type.value);
	data += AddParam("referred_by", referred_by.value);
	data += AddParam("services_recived", services_recived.value);
	data += AddParam("length_of_orientation", length_of_orientation.value);
	data += AddParam("length_of_orientation_hour",
			length_of_orientation_hour.value);
	data += AddParam("length_of_orientation_mim",
			length_of_orientation_mim.value);
	data += AddParam("num_clients_in_group", num_clients_in_group.value);
	if (directed_at_target[1].checked) {
		data += AddParam("directed_at_target", "1");
	} else {
		data += AddParam("directed_at_target", "0");
	}
	if (target_children[1].checked) {
		data += AddParam("target_children", "1");
	} else {
		data += AddParam("target_children", "0");
	}
	if (target_youth[1].checked) {
		data += AddParam("target_youth", "1");
	} else {
		data += AddParam("target_youth", "0");
	}
	if (target_senior[1].checked) {
		data += AddParam("target_senior", "1");
	} else {
		data += AddParam("target_senior", "0");
	}
	if (target_gender[1].checked) {
		data += AddParam("target_gender", "1");
	} else {
		data += AddParam("target_gender", "0");
	}
	if (target_refugee[1].checked) {
		data += AddParam("target_refugee", "1");
	} else {
		data += AddParam("target_refugee", "0");
	}
	if (target_ECL[1].checked) {
		data += AddParam("target_ECL", "1");
	} else {
		data += AddParam("target_ECL", "0");
	}
	if (target_poor_hearing[1].checked) {
		data += AddParam("target_poor_hearing", "1");
	} else {
		data += AddParam("target_poor_hearing", "0");
	}
	if (target_poor_sight[1].checked) {
		data += AddParam("target_poor_sight", "1");
	} else {
		data += AddParam("target_poor_sight", "0");
	}
	if (target_lgbtq[1].checked) {
		data += AddParam("target_lgbtq", "1");
	} else {
		data += AddParam("target_lgbtq", "0");
	}
	if (target_families_parents[1].checked) {
		data += AddParam("target_families_parents", "1");
	} else {
		data += AddParam("target_families_parents", "0");
	}
	if (target_other_impairments[1].checked) {
		data += AddParam("target_other_impairments", "1");
	} else {
		data += AddParam("target_other_impairments", "0");
	}
	if (target_profession[1].checked) {
		data += AddParam("target_profession", "1");
	} else {
		data += AddParam("target_profession", "0");
	}
	if (target_trade[1].checked) {
		data += AddParam("target_trade", "1");
	} else {
		data += AddParam("target_trade", "0");
	}
	if (target_language_minorities[1].checked) {
		data += AddParam("target_language_minorities", "1");
	} else {
		data += AddParam("target_language_minorities", "0");
	}
	if (overview_canada[1].checked) {
		data += AddParam("overview_canada", "1");
	} else {
		data += AddParam("overview_canada", "0");
	}
	if (overview_canada_referral[1].checked) {
		data += AddParam("overview_canada_referral", "1");
	} else {
		data += AddParam("overview_canada_referral", "0");
	}
	if (info_src[1].checked) {
		data += AddParam("info_src", "1");
	} else {
		data += AddParam("info_src", "0");
	}
	if (referral_src[1].checked) {
		data += AddParam("referral_src", "1");
	} else {
		data += AddParam("referral_src", "0");
	}
	if (right_freedom[1].checked) {
		data += AddParam("right_freedom", "1");
	} else {
		data += AddParam("right_freedom", "0");
	}
	if (right_freedom_referral[1].checked) {
		data += AddParam("right_freedom_referral", "1");
	} else {
		data += AddParam("right_freedom_referral", "0");
	}
	if (law[1].checked) {
		data += AddParam("law", "1");
	} else {
		data += AddParam("law", "0");
	}
	if (law_ref[1].checked) {
		data += AddParam("law_ref", "1");
	} else {
		data += AddParam("law_ref", "0");
	}
	if (docs[1].checked) {
		data += AddParam("docs", "1");
	} else {
		data += AddParam("docs", "0");
	}
	if (docs_ref[1].checked) {
		data += AddParam("docs_ref", "1");
	} else {
		data += AddParam("docs_ref", "0");
	}
	if (eng_fr[1].checked) {
		data += AddParam("eng_fr", "1");
	} else {
		data += AddParam("eng_fr", "0");
	}
	if (eng_fr_ref[1].checked) {
		data += AddParam("eng_fr_ref", "1");
	} else {
		data += AddParam("eng_fr_ref", "0");
	}
	if (employment[1].checked) {
		data += AddParam("employment", "1");
	} else {
		data += AddParam("employment", "0");
	}
	if (employment_ref[1].checked) {
		data += AddParam("employment_ref", "1");
	} else {
		data += AddParam("employment_ref", "0");
	}
	if (education[1].checked) {
		data += AddParam("education", "1");
	} else {
		data += AddParam("education", "0");
	}
	if (education_ref[1].checked) {
		data += AddParam("education_ref", "1");
	} else {
		data += AddParam("education_ref", "0");
	}
	if (housing[1].checked) {
		data += AddParam("housing", "1");
	} else {
		data += AddParam("housing", "0");
	}
	if (housing_ref[1].checked) {
		data += AddParam("housing_ref", "1");
	} else {
		data += AddParam("housing_ref", "0");
	}
	if (health[1].checked) {
		data += AddParam("health", "1");
	} else {
		data += AddParam("health", "0");
	}
	if (health_ref[1].checked) {
		data += AddParam("health_ref", "1");
	} else {
		data += AddParam("health_ref", "0");
	}
	if (money[1].checked) {
		data += AddParam("money", "1");
	} else {
		data += AddParam("money", "0");
	}
	if (money_ref[1].checked) {
		data += AddParam("money_ref", "1");
	} else {
		data += AddParam("money_ref", "0");
	}
	if (transportation[1].checked) {
		data += AddParam("transportation", "1");
	} else {
		data += AddParam("transportation", "0");
	}
	if (transportation_ref[1].checked) {
		data += AddParam("transportation_ref", "1");
	} else {
		data += AddParam("transportation_ref", "0");
	}
	if (comm_media[1].checked) {
		data += AddParam("comm_media", "1");
	} else {
		data += AddParam("comm_media", "0");
	}
	if (comm_media_ref[1].checked) {
		data += AddParam("comm_media_ref", "1");
	} else {
		data += AddParam("comm_media_ref", "0");
	}
	if (community_engagment[1].checked) {
		data += AddParam("community_engagment", "1");
	} else {
		data += AddParam("community_engagment", "0");
	}
	if (community_engagment_ref[1].checked) {
		data += AddParam("community_engagment_ref", "1");
	} else {
		data += AddParam("community_engagment_ref", "0");
	}
	if (becoming_cad[1].checked) {
		data += AddParam("becoming_cad", "1");
	} else {
		data += AddParam("becoming_cad", "0");
	}
	if (becoming_cad_ref[1].checked) {
		data += AddParam("becoming_cad_ref", "1");
	} else {
		data += AddParam("becoming_cad_ref", "0");
	}
	if (interpersonal_conflict[1].checked) {
		data += AddParam("interpersonal_conflict", "1");
	} else {
		data += AddParam("interpersonal_conflict", "0");
	}
	if (interpersonal_conflict_ref[1].checked) {
		data += AddParam("interpersonal_conflict_ref", "1");
	} else {
		data += AddParam("interpersonal_conflict_ref", "0");
	}
	if (training_recived[1].checked) {
		data += AddParam("training_recived", "1");
	} else {
		data += AddParam("training_recived", "0");
	}
	if (computer_skill[1].checked) {
		data += AddParam("computer_skill", "1");
	} else {
		data += AddParam("computer_skill", "0");
	}
	if (document_use[1].checked) {
		data += AddParam("document_use", "1");
	} else {
		data += AddParam("document_use", "0");
	}
	if (interpersonal_skill[1].checked) {
		data += AddParam("interpersonal_skill", "1");
	} else {
		data += AddParam("interpersonal_skill", "0");
	}
	if (leadership_training[1].checked) {
		data += AddParam("leadership_training", "1");
	} else {
		data += AddParam("leadership_training", "0");
	}
	if (numeracy[1].checked) {
		data += AddParam("numeracy", "1");
	} else {
		data += AddParam("numeracy", "0");
	}
	if (LS_RoC_info_recived[1].checked) {
		data += AddParam("LS_RoC_info_recived", "1");
	} else {
		data += AddParam("LS_RoC_info_recived", "0");
	}
	if (life_skills[1].checked) {
		data += AddParam("life_skills", "1");
	} else {
		data += AddParam("life_skills", "0");
	}
	if (rights_responsibillities_citizenship[1].checked) {
		data += AddParam("rights_responsibillities_citizenship", "1");
	} else {
		data += AddParam("rights_responsibillities_citizenship", "0");
	}
	if (support_services_recived[1].checked) {
		data += AddParam("support_services_recived", "1");
	} else {
		data += AddParam("support_services_recived", "0");
	}
	if (care_children[1].checked) {
		data += AddParam("care_children", "1");
	} else {
		data += AddParam("care_children", "0");
	}
	data += AddParam("child1_age", child1_age.value);
	data += AddParam("child1_care", child1_care.value);
	data += AddParam("child2_age", child2_age.value);
	data += AddParam("child2_care", child2_care.value);
	data += AddParam("child3_age", child3_age.value);
	data += AddParam("child3_care", child3_care.value);
	data += AddParam("child4_age", child4_age.value);
	data += AddParam("child4_care", child4_care.value);
	data += AddParam("child5_age", child5_age.value);
	data += AddParam("child5_care", child5_care.value);
	if (transportation_child[1].checked) {
		data += AddParam("transportation_child", "1");
	} else {
		data += AddParam("transportation_child", "0");
	}
	if (disability_provision[1].checked) {
		data += AddParam("disability_provision", "1");
	} else {
		data += AddParam("disability_provision", "0");
	}
	if (transtation[1].checked) {
		data += AddParam("transtation", "1");
	} else {
		data += AddParam("transtation", "0");
	}
	data += AddParam("transtation_1", transtation_1.value);
	data += AddParam("transtation_2", transtation_2.value);
	if (interpretation[1].checked) {
		data += AddParam("interpretation", "1");
	} else {
		data += AddParam("interpretation", "0");
	}
	data += AddParam("interpretation_1", interpretation_1.value);
	data += AddParam("interpretation_2", interpretation_2.value);
	if (crisis_counselling[1].checked) {
		data += AddParam("crisis_counselling", "1");
	} else {
		data += AddParam("crisis_counselling", "0");
	}
	data += AddParam("date_of_termination", date_of_termination.value);
	data += AddParam("update_reason", update_reason.value);

	data = data.substring(0, data.length - 1); // removes & at the end

	request.send(data);
}

function AddParam(key, value) {
	return key + "=" + value + "&";
}

// called after fields are found
function Init() {
	directed_at_target[0].checked = true;
	target_children[0].checked = true;
	target_youth[0].checked = true;
	target_senior[0].checked = true;
	target_gender[0].checked = true;
	target_refugee[0].checked = true;
	target_ECL[0].checked = true;
	target_poor_hearing[0].checked = true;
	target_poor_sight[0].checked = true;
	target_lgbtq[0].checked = true;
	target_families_parents[0].checked = true;
	target_other_impairments[0].checked = true;
	target_profession[0].checked = true;
	target_trade[0].checked = true;
	target_language_minorities[0].checked = true;
	overview_canada[0].checked = true;
	overview_canada_referral[0].checked = true;
	info_src[0].checked = true;
	referral_src[0].checked = true;
	right_freedom[0].checked = true;
	right_freedom_referral[0].checked = true;
	law[0].checked = true;
	law_ref[0].checked = true;
	docs[0].checked = true;
	docs_ref[0].checked = true;
	eng_fr[0].checked = true;
	eng_fr_ref[0].checked = true;
	employment[0].checked = true;
	employment_ref[0].checked = true;
	education[0].checked = true;
	education_ref[0].checked = true;
	housing[0].checked = true;
	housing_ref[0].checked = true;
	health[0].checked = true;
	health_ref[0].checked = true;
	money[0].checked = true;
	money_ref[0].checked = true;
	transportation[0].checked = true;
	transportation_ref[0].checked = true;
	comm_media[0].checked = true;
	comm_media_ref[0].checked = true;
	community_engagment[0].checked = true;
	community_engagment_ref[0].checked = true;
	becoming_cad[0].checked = true;
	becoming_cad_ref[0].checked = true;
	interpersonal_conflict[0].checked = true;
	interpersonal_conflict_ref[0].checked = true;
	training_recived[0].checked = true;
	computer_skill[0].checked = true;
	document_use[0].checked = true;
	interpersonal_skill[0].checked = true;
	leadership_training[0].checked = true;
	numeracy[0].checked = true;
	LS_RoC_info_recived[0].checked = true;
	life_skills[0].checked = true;
	rights_responsibillities_citizenship[0].checked = true;
	support_services_recived[0].checked = true;
	care_children[0].checked = true;
	transportation_child[0].checked = true;
	disability_provision[0].checked = true;
	transtation[0].checked = true;
	interpretation[0].checked = true;
	crisis_counselling[0].checked = true;
}

function FindFields() {
	// Find them here on document load
	update_record_id = document.getElementById("update_record_id");
	unique_identifier = document.getElementById("unique_identifier");
	unique_identifier_value = document
			.getElementById("unique_identifier_value");
	date_of_birth = document.getElementById("date_of_birth");
	postal_code_service = document.getElementById("postal_code_service");
	date_of_service = document.getElementById("date_of_service");
	service_language = document.getElementById("service_language");
	language_preference = document.getElementById("language_preference");
	provider_type = document.getElementById("provider_type");
	referred_by = document.getElementById("referred_by");
	services_recived = document.getElementById("services_recived");
	length_of_orientation = document.getElementById("length_of_orientation");
	length_of_orientation_hour = document
			.getElementById("length_of_orientation_hour");
	length_of_orientation_mim = document
			.getElementById("length_of_orientation_mim");
	num_clients_in_group = document.getElementById("num_clients_in_group");
	directed_at_target = document.getElementById("directed_at_target");
	target_children = document.getElementById("target_children");
	target_youth = document.getElementById("target_youth");
	target_senior = document.getElementById("target_senior");
	target_gender = document.getElementById("target_gender");
	target_refugee = document.getElementById("target_refugee");
	target_ECL = document.getElementById("target_ECL");
	target_poor_hearing = document.getElementById("target_poor_hearing");
	target_poor_sight = document.getElementById("target_poor_sight");
	target_lgbtq = document.getElementById("target_lgbtq");
	target_families_parents = document
			.getElementById("target_families_parents");
	target_other_impairments = document
			.getElementById("target_other_impairments");
	target_profession = document.getElementById("target_profession");
	target_trade = document.getElementById("target_trade");
	target_language_minorities = document
			.getElementById("target_language_minorities");
	overview_canada = document.getElementById("overview_canada");
	overview_canada_referral = document
			.getElementById("overview_canada_referral");
	info_src = document.getElementById("info_src");
	referral_src = document.getElementById("referral_src");
	right_freedom = document.getElementById("right_freedom");
	right_freedom_referral = document.getElementById("right_freedom_referral");
	law = document.getElementById("law");
	law_ref = document.getElementById("law_ref");
	docs = document.getElementById("docs");
	docs_ref = document.getElementById("docs_ref");
	eng_fr = document.getElementById("eng_fr");
	eng_fr_ref = document.getElementById("eng_fr_ref");
	employment = document.getElementById("employment");
	employment_ref = document.getElementById("employment_ref");
	education = document.getElementById("education");
	education_ref = document.getElementById("education_ref");
	housing = document.getElementById("housing");
	housing_ref = document.getElementById("housing_ref");
	health = document.getElementById("health");
	health_ref = document.getElementById("health_ref");
	money = document.getElementById("money");
	money_ref = document.getElementById("money_ref");
	transportation = document.getElementById("transportation");
	transportation_ref = document.getElementById("transportation_ref");
	comm_media = document.getElementById("comm_media");
	comm_media_ref = document.getElementById("comm_media_ref");
	community_engagment = document.getElementById("community_engagment");
	community_engagment_ref = document
			.getElementById("community_engagment_ref");
	becoming_cad = document.getElementById("becoming_cad");
	becoming_cad_ref = document.getElementById("becoming_cad_ref");
	interpersonal_conflict = document.getElementById("interpersonal_conflict");
	interpersonal_conflict_ref = document
			.getElementById("interpersonal_conflict_ref");
	training_recived = document.getElementById("training_recived");
	computer_skill = document.getElementById("computer_skill");
	document_use = document.getElementById("document_use");
	interpersonal_skill = document.getElementById("interpersonal_skill");
	leadership_training = document.getElementById("leadership_training");
	numeracy = document.getElementById("numeracy");
	LS_RoC_info_recived = document.getElementById("LS_RoC_info_recived");
	life_skills = document.getElementById("life_skills");
	rights_responsibillities_citizenship = document
			.getElementById("rights_responsibillities_citizenship");
	support_services_recived = document
			.getElementById("support_services_recived");
	care_children = document.getElementById("care_children");
	child1_age = document.getElementById("child1_age");
	child1_care = document.getElementById("child1_care");
	child2_age = document.getElementById("child2_age");
	child2_care = document.getElementById("child2_care");
	child3_age = document.getElementById("child3_age");
	child3_care = document.getElementById("child3_care");
	child4_age = document.getElementById("child4_age");
	child4_care = document.getElementById("child4_care");
	child5_age = document.getElementById("child5_age");
	child5_care = document.getElementById("child5_care");
	transportation_child = document.getElementById("transportation_child");
	disability_provision = document.getElementById("disability_provision");
	transtation = document.getElementById("transtation");
	transtation_1 = document.getElementById("transtation_1");
	transtation_2 = document.getElementById("transtation_2");
	interpretation = document.getElementById("interpretation");
	interpretation_1 = document.getElementById("interpretation_1");
	interpretation_2 = document.getElementById("interpretation_2");
	crisis_counselling = document.getElementById("crisis_counselling");
	date_of_termination = document.getElementById("date_of_termination");
	update_reason = document.getElementById("update_reason");

	Init();
}