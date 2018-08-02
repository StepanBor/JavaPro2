<%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 02.08.2018
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>Archive</title>
</head>
<body>
<div align="center">
    <%--<form action="/view" method="POST">--%>
    <%--Photo id: <input type="text" name="photo_id">--%>
    <%--<input type="submit"/>--%>
    <%--</form>--%>

    <form action="/add" enctype="multipart/form-data" method="POST">
        File: <input type="file" name="fileToAdd">
        <input type="submit"/>
    </form>
</div>
<h2>Photos</h2>
<form action="/delete/img" method="POST">
    <table border="1">
        <caption>Images</caption>
        <tr>

            <th>id</th>
            <th>delete?</th>

        </tr>
        <c:if test="${requestScope.archList!=null}">

            <c:forEach var="arch" items="${requestScope.archList}">


                <tr>
                    <td>
                        <a href="/getArch?id=<c:out value="${arch.getId()}"/>"><c:out value="${arch.getId()}"/></a>
                    </td>

                    <td>
                        <input name="delete[]" type="checkbox" value="<c:out value="${arch.key}"></c:out>"> Delete
                    </td>

                </tr>


            </c:forEach>
        </c:if>
    </table>
    <input type="submit">
</form>
<br>

</body>
</html>
