<%@ page import="com.gmail.stepan1983.User" %><%--
  Created by IntelliJ IDEA.
  User: SteBor
  Date: 26.06.2018
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionary</title>
</head>
<body>
<%User user=(User) session.getAttribute("User");%>
<%--<%String userName=(String) session.getAttribute("UserName");%>--%>
<%--<%String lastName=(String) session.getAttribute("UserName");%>--%>
<h1>You are logged in as<%=user.getName()%> </h1><br>
<table border="1">
    <caption>File list</caption>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getLastName()%></td>

    </tr>
</table>
</body>
</html>
