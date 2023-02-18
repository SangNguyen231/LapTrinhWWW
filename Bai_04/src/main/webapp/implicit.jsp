<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setAttribute("tuoi", 18);
	request.setAttribute("diachi", "12 Nguyen Van Bao");

	Object obj = request.getParameter("name");
	if (obj != null) {
		String name = obj.toString();
		out.print(name);
	} else
		//out.print("Null");
		response.sendRedirect("multiply_table.jsp");
	/* out.println("<hr/>");
	Enumeration<String>lst=request.getAttributeNames();
	while(lst.hasMoreElements())
		out.print(lst.nextElement()+"<br/>"); */
	%>
</body>
</html>