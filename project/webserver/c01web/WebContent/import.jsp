<html>
<head>
</head>
<body>
	<h3>Upload a CSV</h3>
	<form action="FileUploadHandler" enctype="multipart/form-data"
		method="post">
		<input type="file" name="file_name"><br> <br> <input
			type="submit" value="Upload File" />
	</form>
	<%
		String file_name = (String) request.getParameter("filename");
		if (file_name != null) {
			out.println(file_name + " File uploaded successfully");
		}
	%>
</body>
</html>
