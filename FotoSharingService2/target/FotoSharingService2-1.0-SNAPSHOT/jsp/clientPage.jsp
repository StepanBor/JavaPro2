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


    <!-- Page Content  -->
    <div id="content">

        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <%--<div class="container-fluid">--%>
            <a href="/" class="navbar-brand"><img height="50" width="55"
                                                  src="<c:url value="/static/public-storage-logo.png"/> ">
            </a>
            <span class="navbar-text">Online foto storage</span>
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
                            Photos
                        </div>
                        <div class="card-body">
                            <table class="table table-striped table-bordered table-hover" id="dataTable">
                                <thead>
                                <tr>
                                    <th><a href="/clientPage?sortBy=id&changeSortDirect=1"> Photo Id <i
                                            class="fas fa-sort"></i></a></th>
                                    <th><a href="#"> Preview </a></th>
                                    <th><a href="#"> Published by user </a></th>
                                    <th><a href="/clientPage?sortBy=publishDate&changeSortDirect=1"> Publish date <i
                                            class="fas fa-sort"></i></a></th>
                                    <th>View details</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:if test="${requestScope.photos!=null}">
                                    <c:forEach var="photos" items="${requestScope.photos}">
                                        <tr>
                                            <td><c:out value="${photos.getId()}"/></td>
                                            <td><img height="50" width="55"
                                                     src="/photo/<c:url value="${photos.getId()}"/>"></td>
                                            <td><c:out value="${photos.getClient().getLogin()}"/></td>
                                            <td><c:out value="${photos.getPublishDate()}"/></td>
                                            <td>
                                                <a href="/clientPage?page=<c:out value="${requestScope.page}"/>&photoId=<c:out value="${photos.getId()}"/>">View
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
                                                   href="/clientPage?page=<c:out value="${requestScope.page - 1}"/>&sortBy=<c:out value="${sortBy}"/>">Previous</a>
                                            </li>
                                        </c:when>

                                        <c:otherwise>
                                            <li class="page-item disabled">
                                                <a class="page-link"
                                                   href="/clientPage?page=<c:out value="${requestScope.page - 1}"/>&sortBy=<c:out value="${sortBy}"/>">Previous</a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:forEach var="i" begin="1" end="${requestScope.photoPagesNum}">
                                        <c:choose>
                                            <c:when test="${(requestScope.page+1)==i}">
                                                <li class="page-item active"><a class="page-link"
                                                                                href="/clientPage?page=<c:out value="${i - 1}"/>&sortBy=<c:out value="${sortBy}"/>"><c:out
                                                        value="${i}"/></a></li>
                                            </c:when>
                                            <c:otherwise>
                                                <%--<li><a href="></a></li>--%>
                                                <li class="page-item"><a class="page-link"
                                                                         href="/clientPage?page=<c:out value="${i - 1}"/>&sortBy=<c:out value="${sortBy}"/>"><c:out
                                                        value="${i}"/></a></li>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                    <c:choose>
                                        <c:when test="${requestScope.page < requestScope.photoPagesNum-1}">
                                            <li class="page-item">
                                                <a class="page-link"
                                                   href="/clientPage?page=<c:out value="${requestScope.page + 1}"/>&sortBy=<c:out value="${sortBy}"/>">Next</a>
                                            </li>
                                        </c:when>

                                        <c:otherwise>
                                            <li class="page-item disabled">
                                                <a class="page-link"
                                                   href="/clientPage?page=<c:out value="${requestScope.page + 1}"/>&sortBy=<c:out value="${sortBy}"/>">Next</a>
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
                                            <img src="/avatar/<c:out value="${requestScope.clientDetails.getId()}"/>"
                                                 width="100px"
                                                 height="100px"/>
                                            <ol class="list-unstyled mb-4">
                                                <li>Login: <c:out
                                                        value="${requestScope.clientDetails.getLogin()}"/></li>
                                                <hr>
                                                <li>Name: <c:out value="${requestScope.clientDetails.getName()}"/></li>
                                                <hr>
                                                <li>Name: <c:out value="${requestScope.clientDetails.getEmail()}"/></li>
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
                                                 aria-labelledby="home-tab">
                                                <div class="container-fluid">
                                                    <table class="table table-striped table-bordered table-hover">
                                                        <thead>
                                                        <tr>
                                                            <%--<th>photo Id</th>--%>
                                                            <th>User photos</th>
                                                            <%--<th>publishDate</th>--%>
                                                        </tr>
                                                        </thead>
                                                        <tbody>
                                                        <%--<c:forEach var="clientPhoto" items="${requestScope.clientDetails.clientPhoto}">--%>
                                                        <tr>
                                                            <%--<td><c:out value="${clientPhoto.getId()}"/></td>--%>
                                                            <td style="word-break: break-all">
                                                                <div style="overflow: scroll;/*width: 300px;*/height: 200px">
                                                                    <ul class="list-unstyled mb-4">
                                                                        <c:forEach var="clientPhoto"
                                                                                   items="${requestScope.clientDetails.clientPhoto}">
                                                                            <a href="/photo/<c:out value="${clientPhoto.getId()}"/>">
                                                                                /photo/<c:out
                                                                                    value="${clientPhoto.getId()}"/></a>
                                                                            <hr>
                                                                        </c:forEach>
                                                                    </ul>
                                                                </div>

                                                            </td>
                                                        </tr>
                                                        <%--</c:forEach>--%>
                                                        </tbody>
                                                    </table>
                                                    <img class="img-fluid" src="/photo/<c:out value="${requestScope.photoId}"/>"
                                                        style=" max-width: 100%; height: auto;"/>
                                                </div>
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
    var growth = true;

    function myFanction() {
        if (growth) {
            $('#sortBy').removeClass('fa-sort-numeric-up');
            $('#sortBy').addClass('fa-sort-numeric-down');
            growth = false
        } else {
            $('#sortBy').removeClass('fa-sort-numeric-down');
            $('#sortBy').addClass('fa-sort-numeric-up');
            growth = true
        }
    };

</script>
</body>
</html>
