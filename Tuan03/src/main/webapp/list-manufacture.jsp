<%@page import="tuan03.entities.Manufacturer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Manufacturer> list = (List<Manufacturer>) session.getAttribute("manufacture");
	%>
	<table border="1" width="80%" align="center">
		<tr>
			<th>ID</th>
			<th>Man Contact Email</th>
			<th>Man Contact Name</th>
			<th>Man Contact Phone</th>
			<th>Man Name</th>
			<th>Man Website</th>
			<th><a href="manufacture?action=add-new-manufacture">Add New
					Product</a></th>
		</tr>
		<%
		for (Manufacturer manufacturer : list) {
		%>
		<tr>
			<td><%=manufacturer.getManId()%></td>
			<td><%=manufacturer.getManContactEmail()%></td>
			<td><%=manufacturer.getManContactName()%></td>
			<td><%=manufacturer.getManContactPhone()%></td>
			<td><%=manufacturer.getManName()%></td>
			<td><%=manufacturer.getManWebsite()%></td>
			<td><a href="manufacture?action=update-manufacture-form&id=<%=manufacturer.getManId()%>">Edit</a> | <a
				href=""
				onclick='if(confirm("Are you sure to execute this action?"))
                    {window.open("manufacture?action=delete-manufacture&id=<%=manufacturer.getManId()%>");window.close();}'>Delete</a>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>