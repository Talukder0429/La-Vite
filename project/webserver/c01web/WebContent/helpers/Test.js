function runTesting()
{
	var doTests = getTestingStatus();
	if (!doTests)
	{
		return;
	}
	
	for (a = 0; a < fields.length; a++)
	{
		var field = fields[a];
		setRandomValue(field);
	}
	
	submitButton.click();
}

function getTestingStatus()
{
	return (sessionStorage.getItem("doTest") === "true"); //compares what is returned with the string 'true'
}

function setRandomValue(field)
{
	if (isString(field))
	{
		setRandomValueString(field);
	}
	else if (isBoolean(field))
	{
		setRandomValueBoolean(field);
	}
	else if (isSelect(field))
	{
		setRandomValueSelect(field);
	}
	else
	{
		console.log("no type found for: " + field);
	}
}

function setRandomValueString(field)
{
	var textbox = getElement(field);
	setFieldValue(field, getRandomString(10));
	
	if (getName(field).includes("YYYY-MM-DD")) //if it is a date field
	{
		var date = "";
		//each of these lines adds an integer from 0-9 to the string
		date += (getRandomInteger(2) + 1); //1-2
		date += getRandomInteger(10); //0-9
		date += getRandomInteger(10);
		date += getRandomInteger(10);
		
		date += "-";
		var m0 = getRandomInteger(2);
		date += m0;
		if (m0 == 0)
		{
			date += getRandomInteger(9) + 1; //1-9
		}
		else
		{
			date += getRandomInteger(2) + 1;
		}
		
		date += "-";
		date += getRandomInteger(3); //0-2
		date += getRandomInteger(9) + 1;
		
		setFieldValue(field, date);
	}
}

function setRandomValueBoolean(field)
{
	var buttons = getElement(field);
	var button0 = buttons[0];
	var button1 = buttons[1];
	
	var isTrue = !!getRandomInteger(2);
	setFieldValue(field, isTrue);
}

function setRandomValueSelect(field)
{
	var select = getElement(field);
	var index = getRandomInteger(select.length);
	setFieldValue(field, index);
}

function getRandomString(length)
{
	var result = "";
	
	for (i = 0; i < length; i++)
	{
		result += getRandomCharacter();
	}
	
	return result;
}

function getRandomCharacter()
{
	var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	return possible.charAt(getRandomInteger(possible.length));
}

//returns number from 0 to max, 0 inclusive, max exclusive
function getRandomInteger(max)
{
	return Math.floor(Math.random() * max);
}