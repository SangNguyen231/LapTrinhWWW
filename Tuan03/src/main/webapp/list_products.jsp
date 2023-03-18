<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="tuan03.entities.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Products</title>
</head>
<body>
	<%
	List<Product> lstProducts = (List<Product>) session.getAttribute("products");
	%>
	<br />
	<table border="1" width="80%" align="center">
		<tr>
			<th>ID</th>
			<th>Product Name</th>
			<th>Description</th>
			<th><a href="controller?action=add_new_product">Add New Product</a></th>
		</tr>
		<%
		for (Product product : lstProducts) {
		%>
		<tr>
			<td><%=product.getProductId()%></td>
			<td><%=product.getProductName()%></td>
			<td><%=product.getDescription()%></td>
			<td><a
				href="controller?action=update_product_view&id=<%=product.getProductId()%>">Edit
			</a> <a href=""
				onclick='if(confirm("Are you sure to execute this action?"))
                    {window.open("controller?action=delete_product&id=<%=product.getProductId()%>");window.close();}'>Delete</a>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>