<%@page import="session04.objs.ProductItem"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="p1" scope="session" class="session04.objs.ProductItem"/>
	<jsp:setProperty property="itemID" name="p1" value="sp0001"/>
	<jsp:setProperty property="name" name="p1" value="Bánh xèo"/>
	<jsp:setProperty property="description" name="p1" value="bánh xèo"/>
	
	<%-- <%
		ProductItem item =new ProductItem("sp0001","Bánh xèo","bánh xèo");
		session.setAttribute("p1", item);
	%>	 --%>
	<hr/>
	<a href ="testEL_rs.jsp">View Item</a>
</body>
</html>