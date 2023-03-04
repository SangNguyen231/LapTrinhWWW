<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: VoVanHai
  Date: 27/02/2023
  Time: 14:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Users</title>
</head>
<body>
    <%
        List<User> lstUsers = (List<User>) session.getAttribute("users");
    %>

    <br/>
    <table border="1" width="80%" align="center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>email</th>
            <th>password</th>
            <th>State</th>
            <th><a href="Controller?action=add_new_user_view">Add New User</a></th>
        </tr>
    <%
        for(User user: lstUsers){
    %>
        <tr>
            <td><%=user.getUserId()%></td>
            <td><%=user.getUserName()%></td>
            <td><%=user.getEmail()%></td>
            <td><%=user.getPassword()%></td>
            <td><%=user.getState()%></td>
            <td>
                <a href="Controller?action=edit_user_view&id=<%=user.getUserId()%>">Edit  </a>
                <a href=""
                   onclick='if(confirm("Are you sure to execute this action?"))
                    {window.open("Controller?action=delete_user&id=<%=user.getUserId()%>");window.close();}'
                >Delete</a>
            </td>
        </tr>
    <%
        }
    %>
    </table>
</body>
</html>
