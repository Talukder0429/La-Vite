var LIST_PROVINCE = ["Newfoundland and Labrador","Prince Edward Island","Nova Scotia","New Brunswick","Québec","Ontario","Manitoba","Saskatchewan","Alberta","Northwest Territories","British Columbia","Yukon","Nunavut"];

var listMap = new Object();

function mapListToField(field, list)
{
	listMap[field] = list;
}

function getFieldList(field)
{
	return listMap[field];
}