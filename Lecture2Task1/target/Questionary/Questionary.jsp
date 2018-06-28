<%@ page import="com.gmail.stepan1983.User" %>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %>

<%--
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
<%User user = (User) session.getAttribute("User");%>
<%--<%String userName=(String) session.getAttribute("UserName");%>--%>
<%--<%String lastName=(String) session.getAttribute("UserName");%>--%>
<h1>You are logged in as <%=user.getName()%>
</h1><br>
<table border="1">
    <caption>User Info</caption>
    <tr>
        <th><%=user.getName()%>
        </th>
        <th><%=user.getLastName()%>
        </th>

    </tr>
</table>
<form action="/QeustionaryController" method="post">
    <p><b>Which declaration of the main method below would allow a class to be started as a standalone program. </b></p>
    <p><input name="question1" type="radio" value="A " checked> (A) public static int main(char args[])</p>
    <p><input name="question1" type="radio" value="B "> (B) public static void main(String args[])</p>
    <p><input name="question1" type="radio" value="C "> (C) public static void MAIN(String args[])</p>

    <p><b>What is the meaning of the return data type void? </b></p>
    <p><input name="question2" type="radio" value="A "> (A) An empty memory space is returned so that the developers can
        utilize it. </p>
    <p><input name="question2" type="radio" value="B " checked> (B) void is not supported in Java. </p>
    <p><input name="question2" type="radio" value="C "> (C) void returns no data type. </p>

    <p><b>Which of the following are Java keywords? </b></p>
    <p><input name="question3" type="radio" value="A "> (A) throw.</p>
    <p><input name="question3" type="radio" value="B " checked> (B) HelloWorld.</p>
    <p><input name="question3" type="radio" value="C "> (C) All of the above.</p>

    <input type="hidden" name="answers" value="answers">
    <p><input type="submit" value="Send answers"></p>
</form>

<table border="2">
    <caption>Users statistics</caption>
    <tr>
        <th>User info</th>
        <th>Answers</th>
    </tr>
    <%
        if (session.getAttribute("Users") != null) {
            TreeMap<User, ArrayList<String>> Users = (TreeMap<User, ArrayList<String>>) session.getAttribute("Users");
            Set<User> keySet = Users.keySet();
            for (User us : keySet) {
                out.println("<tr><td>" + us + "</td><td>" + Users.get(us) + "</td></tr>");
            }
        }

    %>
</table>

<table border="2">
    <caption>Question answers statistics</caption>
    <tr>
        <th>Qestion number</th>
        <th>Answers</th>
    </tr>
    <c:out value="${sessionScope.QuestionStats}"/>
    <%--<c:out value="${2+2}"/>--%>

    <c:if test="${sessionScope.QuestionStats != null}">
        <c:forEach var="entry" items="${sessionScope.QuestionStats}">

            <tr>
                <td><c:out value="${entry.key+1}"></c:out></td>
                <td>
                    <table border="1">
                        <c:forEach var="entry2" items="${entry.value}">
                            <tr>
                                <td><c:out value="${entry2.key}"></c:out></td>
                                <td><c:out value="${entry2.value}"></c:out></td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>

        </c:forEach>
    </c:if>


</table>

<br>Click this link to <a href="/QeustionaryController">logout</a>

</body>
</html>
