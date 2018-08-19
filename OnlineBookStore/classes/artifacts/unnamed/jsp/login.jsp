<%--
  Created by IntelliJ IDEA.
  User: SteBor
  Date: 19.08.2018
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/fromForm" method="post">
    <label for="login"><h2>Login</h2></label>
    <input type="text" name="j_login" id="login">
    <label for="pass"><h2>Password</h2></label>
    <input type="password" name="j_password" id="pass">
    <input type="submit">
</form>

</body>
</html>
