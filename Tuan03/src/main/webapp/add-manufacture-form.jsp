<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="manufacture">
		<input type="hidden" name="action" value="add-manufacture" /> 
		Enter Man Contact Email:<input name="contactemail" maxlength="50" /><br />
		Enter Man Contact Name:<input name="contactname" maxlength="50" /><br />
		Enter Man Contact Phone:<input name="contactphone" maxlength="50" /><br />
		Enter Man Name:<input name="name" maxlength="50" /><br />
		Enter Man Website:<input name="website" maxlength="50" /><br />
		<input type="hidden" name="state" value="disable"/> 
		<input type="submit" value="Save" />
	</form>
</body>
</html>