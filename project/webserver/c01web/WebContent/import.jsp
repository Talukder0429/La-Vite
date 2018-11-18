<html>
<head>
</head>
<body>
	<h3>Upload a CSV</h3>
	<form action="FileUploadHandler" enctype="multipart/form-data"
		method="post">
		<input type="file" name="file_name"><br> <br> 
		<input type="radio" name="command" value="clientprofile"/>Client Profile<br> <br>
		<input type="radio" name="command" value="needsassessmentandreferrals"/>Needs Assessment And Referrals<br> <br>
		<input type="radio" name="command" value="communityconnections"/>Community Connections<br> <br>
		<input type="radio" name="command" value="informationandorientation"/>Information And Orientation<br> <br>
		<input type="radio" name="command" value="employment"/>Employment<br> <br>
		<input type="radio" name="command" value="languagetrainingclientenrollment"/>Language Training Client Enrollment<br> <br>
		<input type="radio" name="command" value="languagetrainingcoursesetup"/>Language Training Course Setup<br> <br>
		<input type="radio" name="command" value="languagetrainingclientexit"/>Language Training Client Exit<br> <br>
		<input type="submit" value="Upload File" />
	</form>
</body>
</html>
