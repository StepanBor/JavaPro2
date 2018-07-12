
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<body>
<h1>Apartment base</h1>

<table>
    <caption> Apartments </caption>
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
</body>
</html>
