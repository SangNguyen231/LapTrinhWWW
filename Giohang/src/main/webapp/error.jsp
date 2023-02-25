<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<h1>Error</h1>
<body>
	<%
		if(exception!=null){
			%>
			<h2><%=exception.getMessage() %></h2>
			<% 
		}
	%>
</body>
</html>