<%@page import="session04.objs.CartItem"%>
<%@page import="java.util.ArrayList"%>
<%@page import="session04.objs.ShoppingCart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your cart</title>
</head>
<body>
	<%
	ShoppingCart cart =(ShoppingCart)session.getAttribute("giohang");
	ArrayList<CartItem> lst = cart.getCart();
	for(CartItem item: lst){
		out.println(item);
		out.println("<hr/>");
	}
	%>
</body>
</html>