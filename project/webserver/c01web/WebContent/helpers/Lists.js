//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////		  NEW LISTS GO HERE                                          /////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
var LIST_UNIQUE_IDENTIFIER = ["FOSS/GCMS Client ID","Temporary Resident or Minister’s Permit Number","IMM5292, IMM5509, IMM1000 Number"];
var LIST_STREET_TYPE = ["Abbey","Acres","Allée","Alley","Autoroute","Avenue","Bay","Beach","Bend","Boulevard","Bypass","Byway","Campus","Cape","Carré","Carrefour","Centre","Cercle","Chase","Chemin","Circle","Circuit","Close","Common","Concession","Corners","Côte","Cour","Cours","Court","Cove","Crescent ","Croissant","Crossing","CulDeSac","Dale","Dell","Diversion","Downs","Drive","ésplanade","Estate","Expressway","Extension","Farm","Field","Forest","Freeway","Front","Gardens","Gate","Glade","Glen","Green","Grounds","Grove","Harbour","Heath","Heights","Highlands","Highway","Hill","Holl","Île","Impasse","Inlet","Iceland","Key","Knoll","Landing","Lane","Limits","Line","Link","Lookout","Loop","Mall","Manor","Maze","Meadow","Mews","Montée","Moor","Mount","Mountain","Orchard","Parade","Parc","Park","Parkway","Passage","Path","Pathway","Pines","Place","Platau","Plaza","Point","Pointe","Port","Private","Promenade","Quai","Quay","Ramp","Rang","Range","Ridge","Rise","Road","RondPoint","Route","Row","Rue","Ruelle","Run","Sentier","Square","Street","Subdivision","Terrace","Terrasse","Thicket","Towers","Townline","Trail","Turnabout","Vale","Via","View","Village","Villas","Vista","Voie","Work","Way","Wharf","Wood","Wynd","Not Applicable"];
var LIST_STREET_DIRECTION = ["E - East","N - North","NE - Northeast","NW - Northwest","S - South","SE - Southeast","SW - Southwest","W - West"];
var LIST_PROVINCE = ["Newfoundland and Labrador","Prince Edward Island","Nova Scotia","New Brunswick","Québec","Ontario","Manitoba","Saskatchewan","Alberta","Northwest Territories","British Columbia","Yukon","Nunavut"];
var LIST_OFFICIAL_LANGUAGE_OF_PREFERENCE = ["English","French","Unknown/No preference"];

var listMap = new Object();

function mapListToField(field, list)
{
	listMap[field] = list;
}

function getFieldList(field)
{
	return listMap[field];
}