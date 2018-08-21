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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">

    <!-- MetisMenu CSS -->
    <link href="<c:url value="/static/vendor/metisMenu/metisMenu.min.css"/> " rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="<c:url value="/static/vendor/datatables-plugins/dataTables.bootstrap.css"/> " rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="<c:url value="/static/vendor/datatables-responsive/dataTables.responsive.css"/> " rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/static/dist/css/sb-admin-2.css"/> " rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/static/vendor/font-awesome/css/font-awesome.min.css"/> " rel="stylesheet"
          type="text/css">

    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

</head>
<body>
<div class="row">
    <div class="col-lg-12">
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Expand at md</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04"
                aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
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
                    <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown04"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Dropdown</a>
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
</div>
</div>
<div class="row">
    <div class="col-lg-4">
        <%--<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">--%>
            <%--<div class="navbar-default sidebar" role="navigation">--%>
                <%--<div class="sidebar-nav navbar-collapse">--%>
                    <%--<ul class="nav" id="side-menu">--%>
                        <%--<li class="sidebar-search">--%>
                            <%--<div class="input-group custom-search-form">--%>
                                <%--<input type="text" class="form-control" placeholder="Search...">--%>
                                <%--<span class="input-group-btn">--%>
                                <%--<button class="btn btn-default" type="button">--%>
                                    <%--<i class="fa fa-search"></i>--%>
                                <%--</button>--%>
                            <%--</span>--%>
                            <%--</div>--%>
                            <%--<!-- /input-group -->--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="index.html"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>--%>
                            <%--<ul class="nav nav-second-level">--%>
                                <%--<li>--%>
                                    <%--<a href="flot.html">Flot Charts</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="morris.html">Morris.js Charts</a>--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                            <%--<!-- /.nav-second-level -->--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="tables.html"><i class="fa fa-table fa-fw"></i> Tables</a>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="forms.html"><i class="fa fa-edit fa-fw"></i> Forms</a>--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>--%>
                            <%--<ul class="nav nav-second-level">--%>
                                <%--<li>--%>
                                    <%--<a href="panels-wells.html">Panels and Wells</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="buttons.html">Buttons</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="notifications.html">Notifications</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="typography.html">Typography</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="icons.html"> Icons</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="grid.html">Grid</a>--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                            <%--<!-- /.nav-second-level -->--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span--%>
                                    <%--class="fa arrow"></span></a>--%>
                            <%--<ul class="nav nav-second-level">--%>
                                <%--<li>--%>
                                    <%--<a href="#">Second Level Item</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">Second Level Item</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="#">Third Level <span class="fa arrow"></span></a>--%>
                                    <%--<ul class="nav nav-third-level">--%>
                                        <%--<li>--%>
                                            <%--<a href="#">Third Level Item</a>--%>
                                        <%--</li>--%>
                                        <%--<li>--%>
                                            <%--<a href="#">Third Level Item</a>--%>
                                        <%--</li>--%>
                                        <%--<li>--%>
                                            <%--<a href="#">Third Level Item</a>--%>
                                        <%--</li>--%>
                                        <%--<li>--%>
                                            <%--<a href="#">Third Level Item</a>--%>
                                        <%--</li>--%>
                                    <%--</ul>--%>
                                    <%--<!-- /.nav-third-level -->--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                            <%--<!-- /.nav-second-level -->--%>
                        <%--</li>--%>
                        <%--<li>--%>
                            <%--<a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span--%>
                                    <%--class="fa arrow"></span></a>--%>
                            <%--<ul class="nav nav-second-level">--%>
                                <%--<li>--%>
                                    <%--<a href="blank.html">Blank Page</a>--%>
                                <%--</li>--%>
                                <%--<li>--%>
                                    <%--<a href="login.html">Login Page</a>--%>
                                <%--</li>--%>
                            <%--</ul>--%>
                            <%--<!-- /.nav-second-level -->--%>
                        <%--</li>--%>
                    <%--</ul>--%>
                <%--</div>--%>
                <%--<!-- /.sidebar-collapse -->--%>
            <%--</div>--%>
            <%--<!-- /.navbar-static-side -->--%>
        <%--</nav>--%>

    </div>
    <div class="col-lg-8">
        <div class="panel-body">
            <table  class="table table-striped table-bordered table-hover" id="dataTables-example">
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
        <nav aria-label="Page navigation">
            <ul class="pagination justify-content-end">
                <c:choose>
                    <c:when test="${requestScope.page > 0}">
                        <li class="page-item">
                            <a class="page-link"
                               href="/admin?page=<c:out value="${requestScope.page - 1}"/>">Previous</a>
                        </li>
                    </c:when>

                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link"
                               href="/admin?page=<c:out value="${requestScope.page - 1}"/>">Previous</a>
                        </li>
                    </c:otherwise>
                </c:choose>

                <c:forEach var="i" begin="1" end="${requestScope.clientsPagesNum}">
                    <c:choose>
                        <c:when test="${(requestScope.page+1)==i}">
                            <li class="page-item active"><a class="page-link"
                                                            href="/admin?page=<c:out value="${i - 1}"/>"><c:out
                                    value="${i}"/></a></li>
                        </c:when>
                        <c:otherwise>
                            <%--<li><a href="></a></li>--%>
                            <li class="page-item"><a class="page-link"
                                                     href="/admin?page=<c:out value="${i - 1}"/>"><c:out
                                    value="${i}"/></a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <c:choose>
                    <c:when test="${requestScope.page < requestScope.clientsPagesNum-1}">
                        <li class="page-item">
                            <a class="page-link" href="/admin?page=<c:out value="${requestScope.page + 1}"/>">Next</a>
                        </li>
                    </c:when>

                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link" href="/admin?page=<c:out value="${requestScope.page + 1}"/>">Next</a>
                        </li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </nav>
    </div>
</div>

<h1>Admin</h1>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
<!-- jQuery -->
<script src="<c:url value="/static/vendor/jquery/jquery.min.js"/> "></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/static/vendor/bootstrap/js/bootstrap.min.js"/> "></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="<c:url value="/static/vendor/metisMenu/metisMenu.min.js"/> "></script>

<!-- DataTables JavaScript -->
<script src="<c:url value="/static/vendor/datatables/js/jquery.dataTables.min.js"/> "></script>
<script src="<c:url value="/static/vendor/datatables-plugins/dataTables.bootstrap.min.js"/> "></script>
<%--<script src="<c:url value=" /static/vendor/datatables-responsive/dataTables.responsive.js"/>"></script>--%>

<!-- Custom Theme JavaScript -->
<script src="<c:url value="/static/dist/js/sb-admin-2.js"/> "></script>

<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>

</body>
</html>
