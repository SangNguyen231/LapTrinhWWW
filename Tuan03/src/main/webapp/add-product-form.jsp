<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<form action="controller">
		<input type="hidden" name="action" value="add_product" /> 
		Enter Product Name:<input name="productname" maxlength="50" /><br /> 
		Enter Description:<input name="description" maxlength="50" /><br />
		Enter ManufactuerId:<input name="manufactuerid" maxlength="50"/>
		<input type="hidden" name="state" value="disable"/> 
		<input type="submit" value="Save" />
	</form>
</body>
</html>