/*// elements
var unique_identifier;
var unique_identifier_value;
var date_of_birth;
var phone_number;
var has_email_address;
var email_address;
var street_number;
var street_name;
var street_type;
var street_direction;
var unit;
var city;
var province;
var postal_code;
var language;
var has_consent;

//connection info
var server = "c01web/"
var page = "ClientProfile";

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
	data += AddParam("phone_number", phone_number.value);
	if (has_email_address[1].checked)
	{
		data += AddParam("has_email_address", "1");
	}
	else
	{
		data += AddParam("has_email_address", "0");
	}
	data += AddParam("email_address", email_address.value);
	data += AddParam("street_number", street_number.value);
	data += AddParam("street_name", street_name.value);
	data += AddParam("street_type", street_type.value);
	data += AddParam("street_direction", street_direction.value);
	data += AddParam("unit", unit.value);
	data += AddParam("city", city.value);
	data += AddParam("province", province.value);
	data += AddParam("postal_code", postal_code.value);
	data += AddParam("language", language.value);
	if (has_consent[1].checked)
	{
		data += AddParam("has_consent", "1");
	}
	else
	{
		data += AddParam("has_consent", "0");
	}
	
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
	has_email_address[0].checked = true;
	has_consent[0].checked = true;
}

function FindFields()
{
	// Find them here on document load
	unique_identifier = document.getElementById("unique_identifier");
	unique_identifier_value = document.getElementById("unique_identifier_value");
	date_of_birth = document.getElementById("date_of_birth");
	phone_number = document.getElementById("phone_number");
	has_email_address = document.getElementsByName("has_email_address");
	email_address = document.getElementById("email_address");
	street_number = document.getElementById("street_number");
	street_name = document.getElementById("street_name");
	street_type = document.getElementById("street_type");
	street_direction = document.getElementById("street_direction");
	unit = document.getElementById("unit");
	city = document.getElementById("city");
	province = document.getElementById("province");
	postal_code = document.getElementById("postal_code");
	language = document.getElementById("language");
	has_consent = document.getElementsByName("has_consent");
	
	Init();
}*/
var elements = new Array();

function Init()
{
	createMapping();
	generatePageElements();
}

function generatePageElements()
{
	generateField(UNIQUE_IDENTIFIER);
}

//important leave this
window.onload = Init;
