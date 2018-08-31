<%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 22.08.2018
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Online book store</title>
    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!-- Bootstrap CSS CDN -->
    <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"--%>
    <%--integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"--%>
    <%--crossorigin="anonymous">--%>
    <link rel="stylesheet" href="<c:url value="/static/CSS/bootstrap.min.css"/>" rel="stylesheet">
    <!--Custom CSS -->
    <link rel="stylesheet" href="<c:url value="/static/CSS/SideBar.css"/> ">


    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
          integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
    <%--<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"--%>
    <%--integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"--%>
    <%--crossorigin="anonymous"></script>--%>
    <%--<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"--%>
    <%--integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"--%>
    <%--crossorigin="anonymous"></script>--%>

    <%--Data tables--%>
    <%--<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>--%>
    <script type="text/javascript" language="javascript"
            src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
</head>
<body>

<div class="wrapper">
    <!-- Sidebar  -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Online book store</h3>
        </div>

        <ul class="list-unstyled components">
            <p>Dummy Heading</p>
            <li class="active">
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Home</a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="#">Home 1</a>
                    </li>
                    <li>
                        <a href="#">Home 2</a>
                    </li>
                    <li>
                        <a href="#">Home 3</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">About</a>
            </li>
            <li>
                <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Pages</a>
                <ul class="collapse list-unstyled" id="pageSubmenu">
                    <li>
                        <a href="#">Page 1</a>
                    </li>
                    <li>
                        <a href="#">Page 2</a>
                    </li>
                    <li>
                        <a href="#">Page 3</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">Portfolio</a>
            </li>
            <li>
                <a href="#">Contact</a>
            </li>
        </ul>

        <ul class="list-unstyled CTAs">
            <li>
                <a href="#" class="download">Download source</a>
            </li>
            <li>
                <a href="#" class="article">Back to article</a>
            </li>
        </ul>
    </nav>

    <!-- Page Content  -->
    <div id="content">

        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <%--<div class="container-fluid">--%>
            <a href="/" class="navbar-brand"><img height="50" width="55"
                                                  src="<c:url value="/static/national-book-store-logo-education-and-book-vector-18869286.jpg"/> ">
            </a>
            <span class="navbar-text">Online book store</span>
            <button type="button" id="sidebarCollapse" class="btn btn-info">
                <i class="fas fa-align-left"></i>
                <span>Toggle Sidebar</span>
            </button>
            <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarMenu">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarMenu">
                <ul class="nav navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Page</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Page</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Page</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-user-shield"></i> Admin profile
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#"><i class="fas fa-user-circle"></i> User profile</a>
                            <a class="dropdown-item" href="#"><i class="fas fa-users-cog"></i> Settings</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
                        </div>
                    </li>
                </ul>
            </div>


            <%--</div>--%>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            Users
                        </div>
                        <div class="card-body">
                            <table class="table table-striped table-bordered table-hover" id="dataTable">
                                <thead>
                                <tr>
                                    <th>Id <i class="fas fa-sort-numeric-up"></i></th>
                                    <th>Login</th>
                                    <%--<th>Password</th>--%>
                                    <th>Name</th>
                                    <%--<th>Lastname</th>--%>
                                    <%--<th>Address</th>--%>
                                    <th>Phone</th>
                                    <th>Email</th>
                                    <th>Role</th>
                                    <th>View details</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:if test="${requestScope.clients!=null}">
                                    <c:forEach var="clients" items="${requestScope.clients}">
                                        <tr>
                                            <td><c:out value="${clients.getId()}"/></td>
                                            <td><c:out value="${clients.getLogin()}"/></td>
                                                <%--<td><c:out value="${clients.getPassword()}"/></td>--%>
                                            <td><c:out value="${clients.getName()}"/></td>
                                                <%--<td><c:out value="${clients.getLastname()}"/></td>--%>
                                                <%--<td><c:out value="${clients.getAdress()}"/></td>--%>
                                            <td><c:out value="${clients.getPhone()}"/></td>
                                            <td><c:out value="${clients.getEmail()}"/></td>
                                            <td><c:out value="${clients.getRole()}"/></td>
                                                <%--<td><c:out value="${clients.getClientGroup()}"/></td>--%>
                                            <td>
                                                <a href="/adminPage?page=<c:out value="${requestScope.page}"/>&clientId=<c:out value="${clients.getId()}"/>">View
                                                    details</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </c:if>
                                </tbody>
                            </table>
                            <nav aria-label="Page navigation">
                                <ul class="pagination justify-content-end">
                                    <c:choose>
                                        <c:when test="${requestScope.page > 0}">
                                            <li class="page-item">
                                                <a class="page-link"
                                                   href="/adminPage?page=<c:out value="${requestScope.page - 1}"/>">Previous</a>
                                            </li>
                                        </c:when>

                                        <c:otherwise>
                                            <li class="page-item disabled">
                                                <a class="page-link"
                                                   href="/adminPage?page=<c:out value="${requestScope.page - 1}"/>">Previous</a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:forEach var="i" begin="1" end="${requestScope.clientsPagesNum}">
                                        <c:choose>
                                            <c:when test="${(requestScope.page+1)==i}">
                                                <li class="page-item active"><a class="page-link"
                                                                                href="/adminPage?page=<c:out value="${i - 1}"/>"><c:out
                                                        value="${i}"/></a></li>
                                            </c:when>
                                            <c:otherwise>
                                                <%--<li><a href="></a></li>--%>
                                                <li class="page-item"><a class="page-link"
                                                                         href="/adminPage?page=<c:out value="${i - 1}"/>"><c:out
                                                        value="${i}"/></a></li>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                    <c:choose>
                                        <c:when test="${requestScope.page < requestScope.clientsPagesNum-1}">
                                            <li class="page-item">
                                                <a class="page-link"
                                                   href="/adminPage?page=<c:out value="${requestScope.page + 1}"/>">Next</a>
                                            </li>
                                        </c:when>

                                        <c:otherwise>
                                            <li class="page-item disabled">
                                                <a class="page-link"
                                                   href="/adminPage?page=<c:out value="${requestScope.page + 1}"/>">Next</a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>

                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            User details
                        </div>
                        <div class="card-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="card card-body">

                                            <img src="/photo/<c:out value="${requestScope.clientDetails.getId()}"/>"
                                                 width="100px"
                                                 height="100px"/>
                                            <ol class="list-unstyled mb-4">
                                                <li>Login: <c:out
                                                        value="${requestScope.clientDetails.getLogin()}"/></li>
                                                <hr>
                                                <li>Name: <c:out value="${requestScope.clientDetails.getName()}"/></li>
                                                <hr>
                                                <li>Lastname: <c:out
                                                        value="${requestScope.clientDetails.getLastname()}"/></li>
                                                <hr>
                                                <li>Email: <c:out
                                                        value="${requestScope.clientDetails.getEmail()}"/></li>
                                                <hr>
                                                <li>Phone: <c:out
                                                        value="${requestScope.clientDetails.getPhone()}"/></li>
                                                <hr>
                                                <li>Role: <c:out value="${requestScope.clientDetails.getRole()}"/></li>
                                                <hr>
                                            </ol>

                                        </div>

                                    </div>

                                    <div class="col-md-8">
                                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                                            <li class="nav-item">
                                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home"
                                                   role="tab"
                                                   aria-controls="home" aria-selected="true">User orders</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile"
                                                   role="tab"
                                                   aria-controls="profile" aria-selected="false">Profile</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact"
                                                   role="tab"
                                                   aria-controls="contact" aria-selected="false">Contact</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content" id="myTabContent">
                                            <div class="tab-pane fade show active" id="home" role="tabpanel"
                                                 aria-labelledby="home-tab" <%--style="overflow: scroll;/*width: 300px;*/height: 500px"--%>>
                                                <table class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                    <tr>
                                                        <th>order Id</th>
                                                        <th>sum</th>
                                                        <th>order list</th>
                                                        <th>status</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody>
                                                    <c:forEach var="order" items="${requestScope.orders}">
                                                        <tr>
                                                            <td><c:out value="${order.getId()}"/></td>
                                                            <td><c:out value="${order.getOrderPrice()}"/></td>
                                                            <%--<td style="word-break: break-all"><c:out value="${order.getOrderList()}"/></td>--%>
                                                            <td style="word-break: break-all">
                                                                <div style="overflow: scroll;/*width: 300px;*/height: 100px">
                                                                    <ul class="list-unstyled mb-4">
                                                                        <c:forEach var="list" items="${order.getOrderList()}">
                                                                            <li>Book name: <c:out value="${list.getBookName()}"/></li>
                                                                            <li>Book prise: <c:out value="${list.getPrice()}"/></li>
                                                                            <hr>
                                                                        </c:forEach>
                                                                    </ul>
                                                                </div>

                                                            </td>
                                                            <td><c:out value="${order.getStatus()}"/></td>
                                                        </tr>
                                                    </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                            <div class="tab-pane fade" id="profile" role="tabpanel"
                                                 aria-labelledby="profile-tab">
                                                <h1>tab2</h1></div>
                                            <div class="tab-pane fade" id="contact" role="tabpanel"
                                                 aria-labelledby="contact-tab">
                                                <h1>tab3</h1></div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>


<!-- Popper.JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
        integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
        crossorigin="anonymous"></script>
<!-- Bootstrap JS -->
<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"--%>
<%--integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"--%>
<%--crossorigin="anonymous"></script>--%>

<%--bootstrap js--%>
<script src="<c:url value="/static/script/bootstrap.min.js"/>"></script>
<!-- jQuery Custom Scroller CDN -->
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>--%>


<%--sidebar--%>
<script type="text/javascript">
    $(document).ready(function () {
        $('#sidebarCollapse').on('click', function () {
            $('#sidebar').toggleClass('active');
        });
    });
    $('#add_group').click(function () {
        window.location.href = '/group_add_page';
    });
</script>
</body>
</html>
