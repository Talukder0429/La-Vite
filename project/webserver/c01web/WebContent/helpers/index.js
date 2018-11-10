var doTest;

function Init()
{
	doTest = document.getElementById("doTest");
	setTestState(getCheckboxState(doTest));
}

function changeState()
{
	setTestState(getCheckboxState(doTest));
}

function getCheckboxState(box)
{
	return box.checked;
}

function setTestState(state)
{
	sessionStorage.setItem("doTest", state);
}

window.onload = Init;