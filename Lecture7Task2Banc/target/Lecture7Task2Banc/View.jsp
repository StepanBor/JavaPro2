<%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 26.07.2018
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Bank</title>
</head>
<body>

<h2>Users</h2>
<table border="1">
    <caption>Users</caption>
    <tr>
        <th>id</th>
        <th>Name</th>
    </tr>
    <c:if test="${requestScope.users!=null}">
        <c:forEach var="user" items="${requestScope.users}">
            <tr>
                <td><c:out value="${user.getId()}"/></td>
                <td><c:out value="${user.getName()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<h2>Accounts</h2>
<table border="1">
    <caption>Accounts</caption>
    <tr>
        <th>id</th>
        <th>User name</th>
        <th>Currency</th>
        <th>Amount</th>
    </tr>
    <c:if test="${requestScope.accaunts!=null}">
        <c:forEach var="accaunt" items="${requestScope.accaunts}">
            <tr>
                <td><c:out value="${accaunt.getId()}"/></td>
                <td><c:out value="${accaunt.getUser()}"/></td>
                <td><c:out value="${accaunt.getCurrency()}"/></td>
                <td><c:out value="${accaunt.getAmmaunt()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<h2>Transactions</h2>
<table border="1">
    <caption>Transactions</caption>
    <tr>
        <th>id</th>
        <th>Account</th>
        <th>Withdraw</th>
        <th>Put</th>
    </tr>
    <c:if test="${requestScope.transactions!=null}">
        <c:forEach var="accaunt" items="${requestScope.transactions}">
            <tr>
                <td><c:out value="${transactions.getId()}"/></td>
                <td><c:out value="${transactions.getFromAcc()}"/></td>
                <td><c:out value="${transactions.getWithdraw()}"/></td>
                <td><c:out value="${transactions.getPut()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<h2>Currency</h2>
<table border="1">
    <caption>Currency</caption>
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Abs unit rate</th>
    </tr>
    <c:if test="${requestScope.transactions!=null}">
        <c:forEach var="curency" items="${requestScope.currency}">
            <tr>
                <td><c:out value="${curency.getId()}"/></td>
                <td><c:out value="${curency.getCurrencyName()}"/></td>
                <td><c:out value="${curency.getAbsUnit()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<h2>Add new user</h2>
<form action="/Controller">
<table border="1">
    <caption>new user</caption>
    <input type="hidden"  value="notNull" name="addUser">
    <input type="text" name="userName" placeholder="user name">
    <input type="submit" value="Add new user">
</table>
</form><br>

<h2>Add new user</h2>
<form action="/Controller">
    <table border="1">
        <caption>new user</caption>
        <input type="hidden"  value="notNull" name="addUser">
        <input type="text" name="userName" placeholder="user name">
        <input type="submit" value="Add new user">
    </table>
</form><br>

</body>
</html>
