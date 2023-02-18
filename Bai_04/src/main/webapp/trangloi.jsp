<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Errror Page</title>
</head>
<body>
	<h1>There is an error in your web application</h1>
	<%=exception.getMessage()%>
</body>
</html>