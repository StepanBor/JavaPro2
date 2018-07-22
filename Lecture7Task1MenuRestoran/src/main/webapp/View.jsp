<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 22.07.2018
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Menu</title>
</head>
<body>
<h2>Menu</h2>
<table border="1">
    <caption>Menu</caption>
    <tr>
        <th>id</th>
        <th>Dish name</th>
        <th>Price</th>
        <th>Weight</th>
        <th>Discount</th>
    </tr>
    <c:if test="${requestScope.menu!=null}">
        <c:forEach var="dish" items="${requestScope.menu}">
            <tr>
                <td><c:out value="${dish.getId()}"/></td>
                <td><c:out value="${dish.getName()}"/></td>
                <td><c:out value="${dish.getPrice()}"/></td>
                <td><c:out value="${dish.getWeight()}"/></td>
                <td><c:out value="${dish.getDiscount()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getMenu">
    <input type="submit" value="Show menu">
</form><br>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getDishByPrice">
    <input type="text" name="lowerPrice" placeholder="lower price">
    <input type="text" name="higerPrice" placeholder="higer price">
    <input type="submit" value="Get dish by price">
</form><br>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getDishWithDiscount">
    <input type="submit" value="Show dish with discount">
</form><br>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getDishByMaxWeight">
    <input type="text" name="maxWeight" placeholder="weight limit">
    <input type="submit" value="Get dish set by weight">
</form><br>

<form action="/Controller" method="post">
    <table border="1">
        <caption>Add new menu item</caption>
        <tr>
            <th><input type="text" name="dishName" placeholder="name"></th>
            <th><input type="text" name="dishPrice" placeholder="price"></th>
            <th><input type="text" name="dishWeight" placeholder="weight"></th>
            <th><input type="text" name="dishDiscount" placeholder="dishDiscount"></th>
        </tr>
    </table>
    <input type="submit" value="Create new dish">
</form><br>

</body>
</html>
