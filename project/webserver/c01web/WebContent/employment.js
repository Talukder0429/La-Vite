// elements
var updateRecordID;
var uniqueId;
var DOB;
var postalCode;
var employmentIntervention;
var referralTo;
var languageOfService;
var officalLanguage;
var typeOfInstitution;
var referredBy;
var referralDate;
var employmentStatus;
var educationStatus;
var occupationCanada;
var intendedOccupation;
var interventionType;
var interventionReceived;
var lti_statusOfIntervention;
var lti_leaveIntervention;
var lti_startDate;
var lti_endDate;
var lti_placement;
var lti_EmployerSize;
var lti_mentorHoursPerWeek;
var lti_clientMentor;
var essentialSkills;
var computerSkills;
var documentUse;
var interpersonalSkills;
var leadershipTraining;
var numeracy;
var shortTermIntervention;
var sti_date;
var supportService;
var careNewcomerChildren;
var childOneAge;
var childOne_TOC;
var childTwoAge;
var childTwo_TOC;
var childThreeAge;
var childThreeTOC;
var childFourAge;
var childFour_TOC;
var childFiveAge;
var childFive_TOC;
var transportation;
var provisionDisabilities;
var translation;
var translationFrom;
var translationTo;
var interpretation;
var interpretationFrom;
var interpretationTo;
var crisisCounselling;
var timeWithClient_HR;
var timeWithClient_Min;
var reasonForUpdate;

//connection info
var server = "c01web/"
var page = "Employment";

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
	data += AddParam("updateRecordID", updateRecordID.value);
	data += AddParam("uniqueId", uniqueId.value);
	data += AddParam("Date Of Birth", DOB.value);
	data += AddParam("postalCode", postalCode.value);
	if (employmentIntervention[1].checked)
	{
		data += AddParam("employmentIntervention", "1");
	}
	else
	{
		data += AddParam("employmentIntervention", "0");
	}
	data += AddParam("referralTo", referralTo.value);
	data += AddParam("languageOfService", languageOfService.value);
	data += AddParam("officalLanguage", officalLanguage.value);
	data += AddParam("typeofInstituion", typeofInstitution.value);
	data += AddParam("referredBy", referredBy.value);
	data += AddParam("referralDate", referralDate.value);
	data += AddParam("employmentStatus", employmentStatus.value);
	data += AddParam("educationStatus", educationStatus.value);
	data += AddParam("occupationCanada", occupationCanada.value);
	data += AddParam("intendedOccupation", intendedOccupation.value);
	data += AddParam("interventionReceived", interventionReceived.value);
	data += AddParam("interventionType", interventionType.value);
	data += AddParam("lti_statusOfIntervention", lti_statusOfIntervention.value);
	data += AddParam("lti_leaveIntervention", lti_leaveIntervention.value);
	data += AddParam("lti_startDate", lti_startDate.value);
	data += AddParam("lti_endDate", lti_endDate.value);
	data += AddParam("lti_placement", lti_placement.value);
	data += AddParam("lti_EmployerSize", lti_EmployerSize.value);
	data += AddParam("lti_mentorHoursPerWeek", lti_mentorHoursPerWeek.value);
	data += AddParam("lti_clientMentor", lti_clientMentor.value);
	data += AddParam("essentialSkills", essentialSkills.value);
	if (essentialSkills[1].checked)
	{
		data += AddParam("essentialSkills", "1");
	}
	else
	{
		data += AddParam("essentialSkills", "0");
	}
	data += AddParam("computerSkills", computerSkills.value);
	if (computerSkills[1].checked)
	{
		data += AddParam("computerSkills", "1");
	}
	else
	{
		data += AddParam("computerSkills", "0");
	}
	data += AddParam("documentUse", documentUse.value);
	if (documentUse[1].checked)
	{
		data += AddParam("documentUse", "1");
	}
	else
	{
		data += AddParam("documentUse", "0");
	}
	data += AddParam("interpersonalSkills", interpersonalSkills.value);
	if (interpersonalSkills[1].checked)
	{
		data += AddParam("interpersonalSkills", "1");
	}
	else
	{
		data += AddParam("interpersonalSkills", "0");
	}
	data += AddParam("leadershipTraining", leadershipTraining.value);
	if (leadershipTraining[1].checked)
	{
		data += AddParam("leadershipTraining", "1");
	}
	else
	{
		data += AddParam("leadershipTraining", "0");
	}
	data += AddParam("numeracy", numeracy.value);
	if (numeracy[1].checked)
	{
		data += AddParam("numeracy", "1");
	}
	else
	{
		data += AddParam("numeracy", "0");
	}
	data += AddParam("shortTermIntervention", shortTermIntervention.value);
	data += AddParam("sti_date", sti_date.value);
	data += AddParam("supportService", supportService.value);
	if (supportService[1].checked)
	{
		data += AddParam("supportService", "1");
	}
	else
	{
		data += AddParam("supportService", "0");
	}
	data += AddParam("careNewcomerChildren", careNewcomerChildren.value);
	if (careNewcomerChildren[1].checked)
	{
		data += AddParam("careNewcomerChildren", "1");
	}
	else
	{
		data += AddParam("careNewcomerChildren", "0");
	}
	data += AddParam("childOneAge", childOneAge.value);
	data += AddParam("childOne_TOC", childOne_TOC.value);
	data += AddParam("childTwoAge", childTwoAge.value);
	data += AddParam("childTwo_TOC", childTwo_TOC.value);
	data += AddParam("childThreeAge", childThreeAge.value);
	data += AddParam("childThree_TOC", childThree_TOC.value);
	data += AddParam("childFourAge", childFourAge.value);
	data += AddParam("childFour_TOC", childFour_TOC.value);
	data += AddParam("childFiveAge", childFiveAge.value);
	data += AddParam("childFive_TOC", childFive_TOC.value);
	
	data += AddParam("transportation", transportation.value);
	if (transportation[1].checked)
	{
		data += AddParam("transportation", "1");
	}
	else
	{
		data += AddParam("transportation", "0");
	}
	data += AddParam("provisionDisabilities", provisionDisabilities.value);
	if (provisionDisabilities[1].checked)
	{
		data += AddParam("provisionDisabilities", "1");
	}
	else
	{
		data += AddParam("provisionDisabilities", "0");
	}
	data += AddParam("translation", transportation.value);
	if (translation[1].checked)
	{
		data += AddParam("translation", "1");
	}
	else
	{
		data += AddParam("translation", "0");
	}
	data += AddParam("translationFrom", translationFrom.value);
	data += AddParam("translationTo", translationTo.value);
	data += AddParam("interpretation", leadershipTraining.value);
	if (interpretation[1].checked)
	{
		data += AddParam("interpretation", "1");
	}
	else
	{
		data += AddParam("interpretation", "0");
	}
	data += AddParam("interpretationFrom", interpretationFrom.value);
	data += AddParam("interpretationTo", interpretationTo.value);
	data += AddParam("crisisCounselling", crisisCounselling.value);
	if (crisisCounselling[1].checked)
	{
		data += AddParam("crisisCounselling", "1");
	}
	else
	{
		data += AddParam("crisisCounselling", "0");
	}
	data += AddParam("timeWithClient_HR", timeWithClient_HR.value);
	data += AddParam("timeWithClient_Min", timeWithClient_Min.value);
	data += AddParam("reasonForUpdate", reasonForUpdate.value);

	data = data.substring(0, data.length - 1); //removes & at the end

	request.send(data);
}

function AddParam(key, value)
{
	return key + "=" + value + "&";
}

//called after fields are found
function Init()
{
	employmentIntervention[0].checked = true;
	essentialSkills[0].checked = true;
	computerSkills[0].checked = true;
	documentUse[0].checked = true;
	interpersonalSkills[0].checked = true;
	leadershipTraining[0].checked = true;
	numeracy[0].checked = true;
	supportService[0].checked = true;
	careNewcomerChildren[0].checked = true;
	provisionDisabilities[0].checked = true;
	transportation[0].checked = true;
	translation[0].checked = true;
	interpretation[0].checked = true;
	crisisCounselling[0].checked = true;
}

function FindFields()
{
	// Find them here on document load
	updateRecordID = document.getElementById("updateRecordID");
	uniqueId = document.getElementById("uniqueId");
	DOB = document.getElementById("DOB");
	postalCode = document.getElementById("postalCode");
	employmentIntervention = document.getElementsByName("employmentIntervention");
	referralTo = document.getElementById("referralTo");
	languageOfService = document.getElementById("languageOfService");
	officalLanguage = document.getElementById("officalLanguage");
	typeofInstituion = document.getElementById("typeofInstituion");
	referredBy = document.getElementById("referredBy");
	referralDate = document.getElementById("referralDate");
	employmentStatus = document.getElementById("employmentStatus");
	educationStatus = document.getElementById("educationStatus");
	occupationCanada = document.getElementById("occupationCanada");
	intendedOccupation = document.getElementById("intendedOccupation");
	interventionReceived = document.getElementsByName("interventionReceived");
	
	interventionType = document.getElementById("interventionType");
	lti_statusOfIntervention = document.getElementById("lti_statusOfIntervention");
	lti_leaveIntervention = document.getElementById("lti_leaveIntervention");
	lti_startDate = document.getElementById("lti_startDate");
	lti_endDate = document.getElementsByName("lti_endDate");
	lti_placement = document.getElementById("lti_placement");
	lti_EmployerSize = document.getElementById("lti_EmployerSize");
	lti_mentorHoursPerWeek = document.getElementById("lti_mentorHoursPerWeek");
	lti_clientMentor = document.getElementById("lti_clientMentor");
	essentialSkills = document.getElementById("essentialSkills");
	computerSkills = document.getElementById("computerSkills");
	documentUse = document.getElementById("documentUse");
	interpersonalSkills = document.getElementById("interpersonalSkills");
	leadershipTraining = document.getElementById("leadershipTraining");
	numeracy = document.getElementById("numeracy");
	shortTermIntervention = document.getElementsByName("shortTermIntervention");
	sti_date = document.getElementById("sti_date");
	supportService = document.getElementById("supportService");
	careNewcomerChildren = document.getElementById("careNewcomerChildren");
	childOneAge = document.getElementById("childOneAge");
	childOne_TOC = document.getElementsByName("childOne_TOC");
	childTwoAge = document.getElementById("childTwoAge");
	childTwo_TOC = document.getElementById("childTwo_TOC");
	childThreeAge = document.getElementById("childThreeAge");
	childThree_TOC = document.getElementById("childThree_TOC");
	childFourAge = document.getElementsByName("childFourAge");
	childFour_TOC = document.getElementById("childFour_TOC");
	childFiveAge = document.getElementById("childFiveAge");
	childFive_TOC = document.getElementById("childFive_TOC");
	transportation = document.getElementById("transportation");
	provisionDisabilities = document.getElementsByName("provisionDisabilities");
	translation = document.getElementById("translation");
	translationFrom = document.getElementById("translationFrom");
	translationTo = document.getElementsByName("translationTo");
	interpretation = document.getElementById("interpretation");
	interpretationFrom = document.getElementsByName("interpretationFrom");
	interpretationTo = document.getElementById("interpretationTo");
	crisisCounselling = document.getElementsByName("crisisCounselling");
	timeWithClient_HR = document.getElementById("timeWithClient_HR");
	timeWithClient_Min = document.getElementsByName("timeWithClient_Min");
	reasonForUpdate = document.getElementById("reasonForUpdate");

	Init();
}