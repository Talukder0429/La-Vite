var serverLocation = "http://localhost:8080/";
var server = "c01web/"

//pretty ugly way of doing this, but the arrays work in parallel, so elements[i] = element for field called fieldNames[i]
var elements = new Array();
var fields = new Array();

function addFieldElement(fieldName)
{
	var element = generateField(fieldName);
	elements.push(element);
	fields.push(fieldName);
}

function sendRequest(servletUrl)
{
	var request = new XMLHttpRequest();
	request.open("POST", serverLocation + server + servletUrl, true);
	request.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

	request.onreadystatechange = function()
	{
		if(request.readyState == 4)
		{
			alert(request.status + "\n" + request.responseText);
		}
	}
	
	var data = buildDataString();
	request.send(data);
}

function buildDataString()
{
	var result = "";
	
	for (a = 0; a < fields.length; a++)
	{
		var field = fields[a];
		result += getParamString(field);
	}
	
	result = result.substring(0, result.length - 1); //removes & at the end
	return result;
}

function getParamString(field)
{
	var result = field;
	result += "=";
	result += getFieldValue(field);
	result += "&";
	return result;
}

function getFieldValue(field)
{
	if (isString(field))
	{
		return getStringFieldValue(field);
	}
	else if (isBoolean(field))
	{
		return getBooleanFieldValue(field);
	}
	else if (isSelect(field))
	{
		return getSelectFieldValue(field);
	}
	else
	{
		console.log("no type found for: " + field);
	}
	return null;
}

//each new type needs a way to extract the value
function getStringFieldValue(field)
{
	var textbox = getElement(field);
	return textbox.value;
}

function getBooleanFieldValue(field)
{
	var buttons = getElement(field);
	var button0 = buttons[0];
	var button1 = buttons[1];
	var buttonUnknown = buttons[2];
	
	if (buttonUnknown.checked)
	{
		return "";
	}
	if (button0.checked)
	{
		return "No";
	}
	if (button1.checked)
	{
		return "Yes";
	}
}

function getSelectFieldValue(field)
{
	var select = getElement(field);
	var option = select.options[select.selectedIndex];
	return option.value;
}

function getElement(field)
{
	return elements[fields.indexOf(field)];
}