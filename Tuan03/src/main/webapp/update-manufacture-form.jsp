<%@page import="tuan03.entities.Manufacturer"%>
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
	Manufacturer manufacturer = (Manufacturer) session.getAttribute("selManufacture");
	%>

	<form action="manufacture">
		<input type="hidden" name="action" value="update-manufacture" />
		<h1>
			Manufacture ID:<input name="manufactureid" readonly="true"
				value="<%=manufacturer.getManId()%>" />
		</h1>
		Enter Man Contact Email:<input name="contactemail" maxlength="50"
			value="<%=manufacturer.getManContactEmail()%>" /><br /> Enter Man
		Contact Name:<input name="contactname" maxlength="50"
			value="<%=manufacturer.getManContactName()%>" /><br /> Enter Man
		Contact Phone:<input name="contactphone" maxlength="50"
			value="<%=manufacturer.getManContactPhone()%>" /><br /> Enter Man
		Name:<input name="name" maxlength="50"
			value="<%=manufacturer.getManName()%>" /><br /> Enter Man Website:<input
			name="website" maxlength="50"
			value="<%=manufacturer.getManWebsite()%>" /><br /> <input
			type="submit" value="Update" />
	</form>

</body>
</html>