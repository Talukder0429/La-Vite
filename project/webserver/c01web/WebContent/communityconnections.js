// elements
var update_record_id;
var unique_identifier;
var unique_identifier_value;
var date_of_birth;
var postal_code;
var language_of_service;
var official_language_of_preference;
var referred_by;
var activity_under_which;
var type_of_institution;
var type_of_event;
var type_of_service;
var main_topic_of_service;
var service_received;
var number_of_unique_participants;
var did_volunteers;
var directed_at_group;
var target_group_children;
var target_group_youth;
var target_group_senior;
var target_group_gender_specific;
var target_group_refugees;
var target_group_ethnic;
var target_group_deaf;
var target_group_blind;
var target_group_lgbtq;
var target_group_families;
var target_group_other_impairments;
var target_group_profession;
var target_group_trade;
var target_group_minority;
var status_of_service;
var reason_for_leaving;
var start_date;
var end_date;
var projected_end_date;
var essential_skills;
var computer_skills;
var document_use;
var leadership_training;
var life_skills;
var numeracy;
var support_services_received;
var care_for_newcomer_children;
var child_1_age;
var child_1_care;
var child_2_age;
var child_2_care;
var child_3_age;
var child_3_care;
var child_4_age;
var child_4_care;
var child_5_age;
var child_5_care;
var transportation;
var provisions_for_disabilities;
var translation;
var between_1;
var and_1;
var interpretation;
var between_2;
var and_2;
var crisis_counselling;
var length_of_service_hours;
var length_of_service_minutes;
var reason_for_update;

//connection info
var server = "c01web/"
var page = "CommunityConnections";

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
	data += AddParam("update_record_id", update_record_id.value);
	data += AddParam("unique_identifier", unique_identifier.value);
	data += AddParam("unique_identifier_value", unique_identifier_value.value);
	data += AddParam("date_of_birth", date_of_birth.value);
	data += AddParam("postal_code", postal_code.value);
	data += AddParam("language_of_service", language_of_service.value);
	data += AddParam("official_language_of_preference", official_language_of_preference.value);
	data += AddParam("referred_by", referred_by.value);
	data += AddParam("activity_under_which", activity_under_which.value);
	data += AddParam("type_of_institution", type_of_institution.value);
	data += AddParam("type_of_event", type_of_event.value);
	data += AddParam("type_of_service", type_of_service.value);
	data += AddParam("main_topic_of_service", main_topic_of_service.value);
	data += AddParam("service_received", service_received.value);
	data += AddParam("number_of_unique_participants", number_of_unique_participants.value);
	
	if (did_volunteers[1].checked)
	{
		data += AddParam("did_volunteers", "1");
	}
	else
	{
		data += AddParam("did_volunteers", "0");
	}
	
	if (directed_at_group[1].checked)
	{
		data += AddParam("directed_at_group", "1");
	}
	else
	{
		data += AddParam("directed_at_group", "0");
	}
	
	if (target_group_children[1].checked)
	{
		data += AddParam("target_group_children", "1");
	}
	else
	{
		data += AddParam("target_group_children", "0");
	}
	
	if (target_group_youth[1].checked)
	{
		data += AddParam("target_group_youth", "1");
	}
	else
	{
		data += AddParam("target_group_youth", "0");
	}
	
	if (target_group_senior[1].checked)
	{
		data += AddParam("target_group_senior", "1");
	}
	else
	{
		data += AddParam("target_group_senior", "0");
	}
	
	if (target_group_gender_specific[1].checked)
	{
		data += AddParam("target_group_gender_specific", "1");
	}
	else
	{
		data += AddParam("target_group_gender_specific", "0");
	}
	
	if (target_group_refugees[1].checked)
	{
		data += AddParam("target_group_refugees", "1");
	}
	else
	{
		data += AddParam("target_group_refugees", "0");
	}
	
	if (target_group_ethnic[1].checked)
	{
		data += AddParam("target_group_ethnic", "1");
	}
	else
	{
		data += AddParam("target_group_ethnic", "0");
	}
	
	if (target_group_deaf[1].checked)
	{
		data += AddParam("target_group_deaf", "1");
	}
	else
	{
		data += AddParam("target_group_deaf", "0");
	}
	
	if (target_group_blind[1].checked)
	{
		data += AddParam("target_group_blind", "1");
	}
	else
	{
		data += AddParam("target_group_blind", "0");
	}
	
	if (target_group_lgbtq[1].checked)
	{
		data += AddParam("target_group_lgbtq", "1");
	}
	else
	{
		data += AddParam("target_group_lgbtq", "0");
	}
	
	if (target_group_families[1].checked)
	{
		data += AddParam("target_group_families", "1");
	}
	else
	{
		data += AddParam("target_group_families", "0");
	}
	
	if (target_group_other_impairments[1].checked)
	{
		data += AddParam("target_group_other_impairments", "1");
	}
	else
	{
		data += AddParam("target_group_other_impairments", "0");
	}
	
	if (target_group_profession[1].checked)
	{
		data += AddParam("target_group_profession", "1");
	}
	else
	{
		data += AddParam("target_group_profession", "0");
	}
	
	if (target_group_trade[1].checked)
	{
		data += AddParam("target_group_trade", "1");
	}
	else
	{
		data += AddParam("target_group_trade", "0");
	}
	
	if (target_group_minority[1].checked)
	{
		data += AddParam("target_group_minority", "1");
	}
	else
	{
		data += AddParam("target_group_minority", "0");
	}
	
	data += AddParam("status_of_service", status_of_service.value);
	data += AddParam("reason_for_leaving", reason_for_leaving.value);
	data += AddParam("start_date", start_date.value);
	data += AddParam("end_date", end_date.value);
	data += AddParam("projected_end_date", projected_end_date.value);
	
	if (essential_skills[1].checked)
	{
		data += AddParam("essential_skills", "1");
	}
	else
	{
		data += AddParam("essential_skills", "0");
	}
	
	if (computer_skills[1].checked)
	{
		data += AddParam("computer_skills", "1");
	}
	else
	{
		data += AddParam("computer_skills", "0");
	}
	
	if (document_use[1].checked)
	{
		data += AddParam("document_use", "1");
	}
	else
	{
		data += AddParam("document_use", "0");
	}
	
	if (interpersonal_skills[1].checked)
	{
		data += AddParam("interpersonal_skills", "1");
	}
	else
	{
		data += AddParam("interpersonal_skills", "0");
	}
	
	if (leadership_training[1].checked)
	{
		data += AddParam("leadership_training", "1");
	}
	else
	{
		data += AddParam("leadership_training", "0");
	}
	
	if (life_skills[1].checked)
	{
		data += AddParam("life_skills", "1");
	}
	else
	{
		data += AddParam("life_skills", "0");
	}
	
	if (numeracy[1].checked)
	{
		data += AddParam("numeracy", "1");
	}
	else
	{
		data += AddParam("numeracy", "0");
	}
	
	if (support_services_received[1].checked)
	{
		data += AddParam("support_services_received", "1");
	}
	else
	{
		data += AddParam("support_services_received", "0");
	}
	
	if (care_for_newcomer_children[1].checked)
	{
		data += AddParam("care_for_newcomer_children", "1");
	}
	else
	{
		data += AddParam("care_for_newcomer_children", "0");
	}
	
	data += AddParam("child_1_age", child_1_age.value);
	data += AddParam("child_1_care", child_1_care.value);
	data += AddParam("child_2_age", child_2_age.value);
	data += AddParam("child_2_care", child_2_care.value);
	data += AddParam("child_3_age", child_3_age.value);
	data += AddParam("child_3_care", child_3_care.value);
	data += AddParam("child_4_age", child_4_age.value);
	data += AddParam("child_4_care", child_4_care.value);
	data += AddParam("child_5_age", child_5_age.value);
	data += AddParam("child_5_care", child_5_care.value);
	
	if (transportation[1].checked)
	{
		data += AddParam("transportation", "1");
	}
	else
	{
		data += AddParam("transportation", "0");
	}
	
	if (provisions_for_disabilities[1].checked)
	{
		data += AddParam("provisions_for_disabilities", "1");
	}
	else
	{
		data += AddParam("provisions_for_disabilities", "0");
	}
	
	if (translation[1].checked)
	{
		data += AddParam("translation", "1");
	}
	else
	{
		data += AddParam("translation", "0");
	}
	
	data += AddParam("between_1", between_1.value);
	data += AddParam("and_1", and_1.value);
	
	if (interpretation[1].checked)
	{
		data += AddParam("interpretation", "1");
	}
	else
	{
		data += AddParam("interpretation", "0");
	}
	
	data += AddParam("between_2", between_2.value);
	data += AddParam("and_2", and_2.value);
	
	if (crisis_counselling[1].checked)
	{
		data += AddParam("crisis_counselling", "1");
	}
	else
	{
		data += AddParam("crisis_counselling", "0");
	}
	
	data += AddParam("length_of_service_hours", length_of_service_hours.value);
	data += AddParam("length_of_service_minutes", length_of_service_minutes.value);
	data += AddParam("reason_for_update", reason_for_update.value);
	
	data = data.substring(0, data.length - 1);

	request.send(data);
}

function AddParam(key, value)
{
	return key + "=" + value + "&";
}

//called after fields are found
function Init()
{
	did_volunteers[0].checked = true;
	directed_at_group[0].checked = true;
	target_group_children[0].checked = true;
	target_group_youth[0].checked = true;
	target_group_senior[0].checked = true;
	target_group_gender_specific[0].checked = true;
	target_group_refugees[0].checked = true;
	target_group_ethnic[0].checked = true;
	target_group_deaf[0].checked = true;
	target_group_blind[0].checked = true;
	target_group_lgbtq[0].checked = true;
	target_group_families[0].checked = true;
	target_group_other_impairments[0].checked = true;
	target_group_profession[0].checked = true;
	target_group_trade[0].checked = true;
	target_group_minority[0].checked = true;
	essential_skills[0].checked = true;
	computer_skills[0].checked = true;
	document_use[0].checked = true;
	interpersonal_skills[0].checked = true;
	leadership_training[0].checked = true;
	life_skills[0].checked = true;
	numeracy[0].checked = true;
	support_services_received[0].checked = true;
	care_for_newcomer_children[0].checked = true;
	transportation[0].checked = true;
	provisions_for_disabilities[0].checked = true;
	translation[0].checked = true;
	interpretation[0].checked = true;
	crisis_counselling[0].checked = true;
}

function FindFields()
{
	// Find them here on document load
	update_record_id = document.getElementById("update_record_id");
	unique_identifier = document.getElementById("unique_identifier");
	unique_identifier_value = document.getElementById("unique_identifier_value");
	date_of_birth = document.getElementById("date_of_birth");
	postal_code = document.getElementById("postal_code");
	language_of_service = document.getElementById("language_of_service");
	official_language_of_preference = document.getElementById("official_language_of_preference");
	referred_by = document.getElementById("referred_by");
	activity_under_which = document.getElementById("activity_under_which");
	type_of_institution = document.getElementById("type_of_institution");
	type_of_event = document.getElementById("type_of_event");
	type_of_service = document.getElementById("type_of_service");
	main_topic_of_service = document.getElementById("main_topic_of_service");
	service_received = document.getElementById("service_received");
	number_of_unique_participants = document.getElementById("number_of_unique_participants");
	did_volunteers = document.getElementsByName("did_volunteers");
	directed_at_group = document.getElementsByName("directed_at_group");
	target_group_children = document.getElementsByName("target_group_children");
	target_group_youth = document.getElementsByName("target_group_youth");
	target_group_senior = document.getElementsByName("target_group_senior");
	target_group_gender_specific = document.getElementsByName("target_group_gender_specific");
	target_group_refugees = document.getElementsByName("target_group_refugees");
	target_group_ethnic = document.getElementsByName("target_group_ethnic");
	target_group_deaf = document.getElementsByName("target_group_deaf");
	target_group_blind = document.getElementsByName("target_group_blind");
	target_group_lgbtq = document.getElementsByName("target_group_lgbtq");
	target_group_families = document.getElementsByName("target_group_families");
	target_group_other_impairments = document.getElementsByName("target_group_other_impairments");
	target_group_profession = document.getElementsByName("target_group_profession");
	target_group_trade = document.getElementsByName("target_group_trade");
	target_group_minority = document.getElementsByName("target_group_minority");
	status_of_service = document.getElementById("status_of_service");
	reason_for_leaving = document.getElementById("reason_for_leaving");
	start_date = document.getElementById("start_date");
	end_date = document.getElementById("end_date");
	projected_end_date = document.getElementById("projected_end_date");
	essential_skills = document.getElementsByName("essential_skills");
	computer_skills = document.getElementsByName("computer_skills");
	document_use = document.getElementsByName("document_use");
	interpersonal_skills = document.getElementsByName("interpersonal_skills");
	leadership_training = document.getElementsByName("leadership_training");
	life_skills = document.getElementsByName("life_skills");
	numeracy = document.getElementsByName("numeracy");
	support_services_received = document.getElementsByName("support_services_received");
	care_for_newcomer_children = document.getElementsByName("care_for_newcomer_children");
	child_1_age = document.getElementById("child_1_age");
	child_1_care = document.getElementById("child_1_care");
	child_2_age = document.getElementById("child_2_age");
	child_2_care = document.getElementById("child_2_care");
	child_3_age = document.getElementById("child_3_age");
	child_3_care = document.getElementById("child_3_care");
	child_4_age = document.getElementById("child_4_age");
	child_4_care = document.getElementById("child_4_care");
	child_5_age = document.getElementById("child_5_age");
	child_5_care = document.getElementById("child_5_care");
	transportation = document.getElementsByName("transportation");
	provisions_for_disabilities = document.getElementsByName("provisions_for_disabilities");
	translation = document.getElementsByName("translation");
	between_1 = document.getElementById("between_1");
	and_1 = document.getElementById("and_1");
	interpretation = document.getElementsByName("interpretation");
	between_2 = document.getElementById("between_2");
	and_2 = document.getElementById("and_2");
	crisis_counselling = document.getElementsByName("crisis_counselling");
	length_of_service_hours = document.getElementById("length_of_service_hours");
	length_of_service_minutes = document.getElementById("length_of_service_minutes");
	reason_for_update = document.getElementById("reason_for_update");
	Init();
	
}