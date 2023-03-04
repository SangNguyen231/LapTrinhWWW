<%@ page import="vn.edu.iuh.fit.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: VoVanHai
  Date: 28/02/2023
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit selected user</title>
    <%
        User selUser = (User) session.getAttribute("selUser");
    %>
    <form action="Controller">
        <input type="hidden" name="action" value="update_user"/>

        <h1>User ID:<input name="userid" readonly="true" value="<%=selUser.getUserId()%>"/></h1>
        Enter username:<input name="username" maxlength="50" readonly="true" value="<%=selUser.getUserName()%>" /><br/>

        Enter email:<input name="email"  maxlength="50" value="<%=selUser.getEmail()%>" /><br/>
        Enter password:<input type="password" name="password" maxlength="50" value="<%=selUser.getPassword()%>"/><br/>
        <select name="state">
            <option value="disable">disable</option>
            <option value="enable">enable</option>
        </select>
        <input type="submit" value="Update"/>
    </form>
</head>
<body>

</body>
</html>
