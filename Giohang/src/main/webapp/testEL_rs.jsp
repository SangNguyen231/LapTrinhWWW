<%@page import="session04.objs.ProductItem"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>ID: ${sessionScope.p1.itemID }</p>
	<p>Name: ${sessionScope.p1.name }</p>
	<p>Description: ${sessionScope.p1.description }</p>
	
	<%
		ProductItem item=(ProductItem)session.getAttribute("p1"); 
	%>
	<p>Description: <%=item.getDescription() %></p>
</body>
</html>