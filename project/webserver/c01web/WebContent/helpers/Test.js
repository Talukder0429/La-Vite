function runTesting()
{
	var doTests = true;
	if (!doTests)
	{
		return;
	}
	
	for (a = 0; a < fields.length; a++)
	{
		var field = fields[a];
		setRandomValue(field);
	}
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