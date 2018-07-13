<%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 11.07.2018
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Apartment base</title>

</head>
<body>
<h1>Apartment base</h1>

<table border="1">
    <caption> Apartments</caption>
    <tr>
        <th>Adres</th>
        <th>District</th>
        <th>Area</th>
        <th>Room number</th>
        <th>Price</th>
    </tr>
    <c:if test="${requestScope.Appartments!=null}">
        <c:forEach var="app" items="${requestScope.Appartments}">

            <tr>
                <td><c:out value="${app.getAddress()}"/></td>
                <td><c:out value="${app.getDistrict()}"/></td>
                <td><c:out value="${app.getArea()}"/></td>
                <td><c:out value="${app.getRoomNum()}"/></td>
                <td><c:out value="${app.getPrice()}"/></td>
            </tr>

        </c:forEach>
    </c:if>

</table>



<form action="/Controller">
    <table border="1">
        <caption>Input query</caption>

        <th>

            <select name="parametrName">
                <option disabled>Choose parametr name</option>
                <option value="area">Area</option>
                <option value="roomNum">Room number</option>
                <option value="price">Price</option>
            </select>

        </th>

        <th>
            <input name="intParametr" type="text" value="0" pattern="^[ 0-9]+$">
        </th>

        <th>
            <select name="operator">
                <option disabled>Choose operator</option>
                <option value=">=">>=</option>
                <option value="<="><=</option>
            </select>
        </th>
    </table>
    <input type="submit" value="Submit query">
</form>

<form action="/Controller">
    <table border="1">
        <caption>Input query</caption>
        <th>

            <select name="parametrName">
                <option disabled>Choose parametr name</option>
                <option value="adres">Adres</option>
                <option value="district">District</option>
            </select>

        </th>
        <th>
            <input name="parametr" type="text" value="text parametr">
        </th>
    </table>
    <input type="submit" value="Submit query">
</form>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getAll">
    <input type="submit" value="Get all appartments">
</form>

<form action="/Controller" method="post">
    <table border="1">
        <caption>Create new apartment</caption>
        <tr>
            <th><input name="adres" type="text" placeholder="adress"></th>
            <th><input name="district" type="text" placeholder="district"></th>
            <th><input name="area" type="text" placeholder="area" pattern="^[ 0-9]+$"></th>
            <th><input name="roomNum" type="text" placeholder="room number" pattern="^[ 0-9]+$"></th>
            <th><input name="price" type="text" placeholder="price" pattern="^[ 0-9]+$"></th>

        </tr>
    </table>
    <input type="submit">
</form>
</body>
</html>
