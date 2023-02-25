<%@page import="session04.objs.ProductItem"%>
<%@page import="session04.objs.ItemList"%>
<%@page import="session04.db.ConnectDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Welcome to Tèo's Shop</h1>
	<%!
		ConnectDB db=new ConnectDB();
		ItemList lst = db.getAllProducts();
	%>
	<form method="get" action="Add2CartSvl">
		<table border="1">
			<%
			session.setAttribute("allProducts",lst);
			
			for(ProductItem item: lst.getAllItems()){
				%>
					<tr>
						<td><%=item.getItemID() %></td>
						<td><%=item.getName()%></td> 
						<td><%=item.getDescription()%></td>
						<td><a href="Add2CartSvl?id=<%= item.getItemID() %>">Add2 cart</a></td>
					</tr>
				<%
			}
			%>
		</table>
		<hr>
		<a href="cart.jsp">View Cart</a>
	</form>
</body>
</html>