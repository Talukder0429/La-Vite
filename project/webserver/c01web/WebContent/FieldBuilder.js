function generateField(field)
{
	if (isString(field))
	{
		generateFieldString(field);
	}
	else if (isBoolean(field))
	{
		generateFieldBoolean(field);
	}
	else if (isSelect(field))
	{
		generateFieldSelect(field);
	}
	else
	{
		console.log("no type found for: " + field);
	}
}

//Each type has to be able to generate an element for itself
function generateFieldString(field)
{
}

function generateFieldBoolean(field)
{
}

function generateFieldSelect(field)
{
	generateFieldString();
}