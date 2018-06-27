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
<h1>You are logged in as <%=user.getName()%> </h1><br>
<table border="1">
    <caption>File list</caption>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getLastName()%></td>

    </tr>
</table>
<form action="/QeustionaryController" method="post">
    <p><b>Which declaration of the main method below would allow a class to be started as a standalone program. </b></p>
    <p><input name="question1" type="radio" value="A" checked> (A) public static int main(char args[])</p>
    <p><input name="question1" type="radio" value="B"> (B) public static void main(String args[])</p>
    <p><input name="question1" type="radio" value="C"> (C) public static void MAIN(String args[])</p>

    <p><b>What is the meaning of the return data type void? </b></p>
    <p><input name="question2" type="radio" value="A"> (A) An empty memory space is returned so that the developers can utilize it. </p>
    <p><input name="question2" type="radio" value="B" checked> (B) void is not supported in Java. </p>
    <p><input name="question2" type="radio" value="C"> (C) void returns no data type. </p>

    <p><b>Which of the following are Java keywords? </b></p>
    <p><input name="question3" type="radio" value="A"> (A) throw.</p>
    <p><input name="question3" type="radio" value="B" checked> (B) HelloWorld.</p>
    <p><input name="question3" type="radio" value="C"> (D) All of the above.</p>

    <input type="hidden" name="answers" value="answers">
    <p><input type="submit" value="Send answers"></p>
</form>
</body>
</html>
