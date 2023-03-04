<%--
  Created by IntelliJ IDEA.
  User: VoVanHai
  Date: 27/02/2023
  Time: 14:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New USer</title>
</head>
<body>
  <form action="Controller">
    <input type="hidden" name="action" value="add_new_user"/>

    Enter username:<input name="username" maxlength="50"/><br/>
    Enter email:<input name="email" maxlength="50"/><br/>
    Enter password:<input type="password" name="password" maxlength="50"/><br/>
    <input type="hidden" name="state" value="disable"/>
    <input type="submit" value="Save"/>
  </form>

</body>
</html>
