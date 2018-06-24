<%--
  Created by IntelliJ IDEA.
  User: SteBor
  Date: 23.06.2018
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create user</h1>
<form action="http://localhost:8080/Controller2" method="get">
    <label for="name">Name</label>
    <input type="text" id="name" name="name"><br>
    <label for="lastname">Lastname</label>
    <input type="text" id="lastname" name="lastname"><br>
    <label for="birthday">birthday</label>
    <input type="text" id="birthday" name="birthday"><br>
    <label for="sex">Sex</label>
    <input type="text" id="sex" name="sex"><br>
    <label for="group">group</label>
    <input type="text" id="group" name="group"><br>
    <label for="cource">cource</label>
    <input type="text" id="cource" name="cource"><br>


</form>
</body>
</html>
