function Init()
{
	mapTypes();
	//mapNames();
	mapLists();
	overrideNames();
	
	findForm();
	
	generatePageElements();
	
	runTesting();
}

function submit()
{
	sendRequest(servletUrl);
}

//important leave this
window.onload = Init;
