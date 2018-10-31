var form;

function findForm()
{
	form = document.getElementById("form");
}

function generateField(field)
{
	if (isString(field))
	{
		return generateFieldString(field);
	}
	else if (isBoolean(field))
	{
		return generateFieldBoolean(field);
	}
	else if (isSelect(field))
	{
		return generateFieldSelect(field);
	}
	else
	{
		console.log("no type found for: " + field);
	}
	return null;
}

//Each type has to be able to generate an element for itself
function generateFieldString(field)
{
	//creates title for element
	var title = document.createElement("span");
	title.innerHTML = getName(field);
	
	var textbox = document.createElement("textarea");
	textbox.id = field;
	textbox.rows = 1;
	textbox.cols = 35;
	
	form.appendChild(title);
	form.appendChild(textbox);
	form.appendChild(document.createElement("br"));
}

function generateFieldBoolean(field)
{
}

function generateFieldSelect(field)
{
	generateFieldString(field);
}