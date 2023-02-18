<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MT</title>
</head>
<body>
	<!-- ghi chú html -->
	<%--hjhjhjhjhj --%>
	<%!int z = 0;

	int cong(int a, int b) {
		return a + b;
	}%>
	<h2>
		3+4 =
		<%=cong(3, 4)%></h2>
	<%
	//ghi chú 1 dòng
	/*
		ghi chú nhiều dòng
	*/
	for (int i = 2; i <= 10; i++) {
		for (int j = 1; j <= 10; j++) {
			String s = i + " x " + j + " = " + (i * j);
	%>
	<p>
		<%=s%>
	</p>
	<br />
	<%
	}
	out.println("<hr/>");
	}
	%>
</body>
</html>