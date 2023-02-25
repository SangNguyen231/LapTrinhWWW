<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource 
	driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
	url="jdbc:sqlserver://localhost:1433;databaseName=qlsv"
	user="sa"
	password="12345678"
	scope="page"
	var="ds"/>
	
	<sql:query var="sql1" 
	dataSource="ds"
	sql="select * from Product" scope="session">
	</sql:query>
	
	
</body>
</html>