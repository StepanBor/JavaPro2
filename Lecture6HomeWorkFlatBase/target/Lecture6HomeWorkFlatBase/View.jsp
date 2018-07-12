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
            <input name="intParametr" type="text" value="Numerical perametr">
        </th>

        <th>

            <select name="parametrName">
                <option disabled>Choose parametr name</option>
                <option value="area">Area</option>
                <option value="roomNum">Room number</option>
                <option value="price">Price</option>
            </select>

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
</body>
</html>
