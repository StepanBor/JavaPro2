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
</table>
<br>

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
                <td><c:out value="${accaunt.getUser().getId()}"/></td>
                <td><c:out value="${accaunt.getCurrency().getCurrencyName()}"/></td>
                <td><c:out value="${accaunt.getAmmaunt()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<br>

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
        <c:forEach var="transactions" items="${requestScope.transactions}">
            <tr>
                <td><c:out value="${transactions.getId()}"/></td>
                <td><c:out value="${transactions.getFromAcc()}"/></td>
                <td><c:out value="${transactions.getWithdraw()}"/></td>
                <td><c:out value="${transactions.getPut()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<br>

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
</table>
<br>

<h2>Add new user</h2>
<form action="/Controller" method="post">
    <input type="hidden" value="notNull" name="addUser">
    <input type="text" name="userName" placeholder="user name">
    <input type="submit" value="Add new user">
</form>
<br>

<h2>Add new account</h2>
<form action="/Controller" method="post">
    <table border="1">
        <caption>new account</caption>
        <c:if test="${requestScope.users!=null}">
            <tr>
                <td>
                    <select name="userId">
                        <option disabled>choose user id</option>
                        <c:forEach var="user" items="${requestScope.users}">
                            <option value="<c:out value="${user.getId()}"/>">
                                <c:out value="${user.getId()}"/>
                            </option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <select name="currencyId">
                        <option disabled>choose currency id</option>
                        <c:forEach var="currency" items="${requestScope.currency}">
                            <option value="<c:out value="${currency.getId()}"/>">
                                <c:out value="${currency.getId()}"/>
                            </option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <input type="text" name="amaunt" placeholder="monney" pattern="^[ 0-9]+$">
                </td>
            </tr>
        </c:if>
    </table>
    <input type="hidden" value="notNull" name="addAccaunt">
    <input type="submit" value="Add new account">
</form>
<br>

<h2>Put money to account</h2>
<form action="/Controller" method="post">
    <table border="1">
        <caption>put money</caption>
        <tr>
            <td>
                <select name="accId">
                    <option disabled>choose acc id</option>
                    <c:forEach var="acc" items="${requestScope.accaunts}">
                        <option value="<c:out value="${acc.getId()}"/>">
                            <c:out value="${acc.getId()}"/>
                        </option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <input type="text" name="sum" placeholder="money">
            </td>
        </tr>
    </table>
    <input type="hidden" value="notNull" name="putMoney">
    <input type="submit" value="Put money">
</form>
<br>

<h2>Transfer money</h2>
<form action="/Controller">
    <table border="1">
        <caption>transfer money</caption>
        <c:if test="${requestScope.users!=null}">
            <tr>
                <td>
                    <select name="fromAccId">
                        <option disabled>from account id</option>
                        <c:forEach var="acc" items="${requestScope.accaunts}">
                            <option value="<c:out value="${acc.getId()}"/>">
                                <c:out value="${acc.getId()}"/>
                            </option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <select name="toAccId">
                        <option disabled>to account id</option>
                        <c:forEach var="acc" items="${requestScope.accaunts}">
                            <option value="<c:out value="${acc.getId()}"/>">
                                <c:out value="${acc.getId()}"/>
                            </option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <select name="curId">
                        <option disabled>choose currency id</option>
                        <c:forEach var="currency" items="${requestScope.currency}">
                            <option value="<c:out value="${currency.getId()}"/>">
                                <c:out value="${currency.getId()}"/>
                            </option>
                        </c:forEach>
                    </select>
                </td>
                <td>
                    <input type="text" name="sum" placeholder="monney" pattern="^[ 0-9]+$">
                </td>
            </tr>
        </c:if>
    </table>
    <input type="hidden" value="notNull" name="transferMoney">
    <input type="submit" value="Transfer money">
</form>
<br>

<h2>Get user money</h2>
<form action="/Controller">
    <c:if test="${requestScope.users!=null}">
        <tr>
            <td>
                <select name="userId">
                    <option disabled>choose user id</option>
                    <c:forEach var="user" items="${requestScope.users}">
                        <option value="<c:out value="${user.getId()}"/>">
                            <c:out value="${user.getId()}"/>
                        </option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <c:if test="${requestScope.userMoney!=null}">
                    <c:out value="${requestScope.userMoney}"/>UAH
                </c:if>
            </td>
        </tr>
    </c:if>
    <input type="hidden" value="notNull" name="getUserMoney">
    <input type="submit" value="get user money">
</form>
<br>
</body>
</html>
