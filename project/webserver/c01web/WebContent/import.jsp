<html>
<head>
</head>
<body>
	<h3>Upload a CSV</h3>
	<form action="FileUploadHandler" enctype="multipart/form-data"
		method="post">
		<script type="text/javascript" src="helpers\Fields.js"></script>
		<script type="text/javascript" src="helpers\FieldBuilder.js"></script>
		<script type="text/javascript" src="helpers\RequestHelper.js"></script>
		<script type="text/javascript" src="helpers\Lists.js"></script>
		<script type="text/javascript" src="helpers\Init.js"></script>
		
		<input type="file" accept=".csv" name="file_name"><br> <br> 
		<input type="radio" name="command" value="client_profile"/>Client Profile<br> <br>
		<input type="radio" name="command" value="needs_assessment_and_referrals"/>Needs Assessment And Referrals<br> <br>
		<input type="radio" name="command" value="community_connections"/>Community Connections<br> <br>
		<input type="radio" name="command" value="information_and_orientation"/>Information And Orientation<br> <br>
		<input type="radio" name="command" value="employment"/>Employment<br> <br>
		<input type="radio" name="command" value="language_training_client_enrollment"/>Language Training Client Enrollment<br> <br>
		<input type="radio" name="command" value="language_training_course_setup"/>Language Training Course Setup<br> <br>
		<input type="radio" name="command" value="language_training_client_exit"/>Language Training Client Exit<br> <br>
		<input type="submit" value="Upload File" onclick="submit()" /><br> <br>
		<a href="index.jsp">Back</a> <br />
	</form>
</body>
</html>
