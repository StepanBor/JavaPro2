<%--
  Created by IntelliJ IDEA.
  User: SteBor
  Date: 19.08.2018
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">

    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Expand at md</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample04">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                <div class="dropdown-menu" aria-labelledby="dropdown04">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-md-0">
            <input class="form-control" type="text" placeholder="Search">
        </form>
    </div>
</nav>

<div class="panel-body">
    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
        <thead>
        <tr>
            <th>Id</th>
            <th>Login</th>
            <th>Password</th>
            <th>Name</th>
            <th>Lastname</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Role</th>
            <th>Group</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${requestScope.clients!=null}">
            <c:forEach var="clients" items="${requestScope.clients.content}">
                <tr>
                    <td><c:out value="${clients.getId()}"/></td>
                    <td><c:out value="${clients.getLogin()}"/></td>
                    <td><c:out value="${clients.getPassword()}"/></td>
                    <td><c:out value="${clients.getName()}"/></td>
                    <td><c:out value="${clients.getLastname()}"/></td>
                    <td><c:out value="${clients.getAdress()}"/></td>
                    <td><c:out value="${clients.getPhone()}"/></td>
                    <td><c:out value="${clients.getEmail()}"/></td>
                    <td><c:out value="${clients.getRole()}"/></td>
                    <td><c:out value="${clients.getClientGroup()}"/></td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-end">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1">Previous</a>
        </li>
        <c:forEach var="i" begin="1" end="${pages}">
            <li><a href="><c:out value="${i}"/></a></li>
            <li class="page-item"><a class="page-link" href="/?page=<c:out value="${i - 1}"/>">1</a></li>
        </c:forEach>

        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>
<h1>Admin</h1>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script>

</script>
</body>
</html>
