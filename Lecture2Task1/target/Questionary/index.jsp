
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login or create account</title>
</head>
<body>
<h1>Create account</h1>
<form action="http://localhost:8080/Qeustionary" method="post">

    <label for="UserName">Name</label><br>
    <input id="UserName" name="UserName"><br>
    <label for="LastName">Lastname</label><br>
    <input id="Lastname" name="LastName"><br>

    <label for="Password">Password</label><br>
    <input id="Password" name="Password"><br>
    <input type="hidden" name="newUser" value="newUser">
    <input type="submit" value="Create account"><br>

</form>
<h2>Login</h2>
<form action="/Qeustionary" method="post">

    <label for="UserLogin">User Name</label><br>
    <input id="UserLogin" name="UserName"><br>

    <label for="UserPassword">User Password</label><br>
    <input id="UserPassword" name="Password"><br>
    <input type="hidden" name="signIn" value="signIn">
    <input type="submit" value="Login">

</form>
</body>
</html>
