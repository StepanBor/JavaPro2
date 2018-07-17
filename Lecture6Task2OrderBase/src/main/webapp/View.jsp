<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 15.07.2018
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Orders</title>
</head>
<body>

<h2>Products</h2>
<table border="1">
    <caption>Products</caption>
    <tr>
        <th>Product id</th>
        <th>Product name</th>
        <th>Product description</th>
        <th>Prise</th>
    </tr>
<c:if test="${requestScope.products!=null}">
    <c:forEach var="prod" items="${requestScope.products}">
        <tr>
            <td><c:out value="${prod.getProductId()}"/></td>
            <td><c:out value="${prod.getProductName()}"/></td>
            <td><c:out value="${prod.getDescription()}"/></td>
            <td><c:out value="${prod.getPrice()}"/></td>
        </tr>
    </c:forEach>
</c:if>
</table><br>

<h2>Clients</h2>
<table border="1">
    <caption>Clients</caption>
    <tr>
        <th>Client id</th>
        <th>Client name</th>
        <th>Client phone</th>
    </tr>
    <c:if test="${requestScope.clients!=null}">
        <c:forEach var="client" items="${requestScope.clients}">
            <tr>
                <td><c:out value="${client.getClientId()}"/></td>
                <td><c:out value="${client.getName()}"/></td>
                <td><c:out value="${client.getPhone()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<h2>Orders</h2>
<table border="1">
    <caption>Orders</caption>
    <tr>
        <th>Order id</th>
        <th>Client id</th>
        <th>Product id</th>
    </tr>
    <c:if test="${requestScope.orders!=null}">
        <c:forEach var="order" items="${requestScope.orders}">
            <tr>
                <td><c:out value="${order.getOrderId()}"/></td>
                <td><c:out value="${order.getClient()}"/></td>
                <td><c:out value="${order.getProduct()}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table><br>

<form action="/Controller" method="post">
    <table border="1">
        <caption>Add new client</caption>
        <tr>
            <th><input type="text" name="clientName" placeholder="name"></th>
            <th><input type="text" name="phone" placeholder="phone"></th>
        </tr>
    </table>
    <input type="submit" value="Create new client">
</form><br>

<form action="/Controller" method="post">
    <table border="1">
        <caption>Add new product</caption>
        <tr>
            <th><input type="text" name="productName" placeholder="product name"></th>
            <th><input type="text" name="description" placeholder="description"></th>
            <th><input type="text" name="price" placeholder="price" pattern="^[ 0-9]+$"></th>
        </tr>
    </table>
    <input type="submit" value="Create new product">
</form><br>

<form action="/Controller" method="post">
    <table border="1">
        <caption>Create order</caption>
        <tr>
            <th>
                <c:if test="${requestScope.clients!=null}">
                    <select name="clientId">
                        <option disabled>choose client id</option>
                        <c:forEach var="client" items="${requestScope.clients}">
                            <option value="<c:out value="${client.getClientId()}"/>"><c:out value="${client.getClientId()}"/></option>
                        </c:forEach>
                    </select>
                </c:if>
            </th>

            <th>
                <c:if test="${requestScope.products!=null}">
                    <select name="productId">
                        <option disabled>choose product id</option>
                        <c:forEach var="product" items="${requestScope.products}">
                            <option value="<c:out value="${product.getProductId()}"/>"><c:out value="${product.getProductId()}"/></option>
                        </c:forEach>
                    </select>
                </c:if>
            </th>
        </tr>
    </table>
    <input type="submit" value="create order">
</form>

<form action="/Controller">
    <input type="hidden"  value="notNull" name="getOrders">
    <input type="submit" value="Get all orders, clients, products">
</form>
</body>
</html>
