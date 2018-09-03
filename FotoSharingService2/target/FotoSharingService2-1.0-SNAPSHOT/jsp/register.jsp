<%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 03.09.2018
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Register</title>

    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="<c:url value="/static/CSS/bootstrap.min.css"/>" rel="stylesheet">
    <!--Custom CSS -->
    <link rel="stylesheet" href="<c:url value="/static/CSS/SideBar.css"/> ">


    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
          integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
</head>

<body>

<div class="container">
<div class="row">
    <div class="col-md-6">
        <div class="card">
            <div class="card-header">Register an Account</div>
            <div class="card-body">
                <form action="/createAccaunt" method="post">
                    <div class="form-group">
                        <div class="form-row">
                            <div class="col-md-6">
                                <div class="form-label-group">
                                    <label for="login">Login</label>
                                    <input type="text" id="login" class="form-control" placeholder="Login" required="required" autofocus="autofocus"
                                           name="login">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-label-group">
                                    <label for="Name">Name</label>
                                    <input type="text" id="Name" class="form-control" placeholder="Name" required="required"
                                           name="name">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-label-group">
                            <label for="inputEmail">Email address</label>
                            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="required"
                                   name="email">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-row">
                            <div class="col-md-6">
                                <div class="form-label-group">
                                    <label for="inputPassword">Password</label>
                                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-label-group">
                                    <label for="confirmPassword">Confirm password</label>
                                    <input type="password" id="confirmPassword" class="form-control" placeholder="Confirm password" required="required">
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--<a class="btn btn-primary btn-block" href="login.html">Register</a>--%>
                    <br>
                    <hr>
                    <input type="submit" class="btn btn-sm btn-success btn-block">
                </form>
                <div class="text-center">
                    <a class="d-block small mt-3" href="login.html">Login Page</a>
                    <%--<a class="d-block small" href="forgot-password.html">Forgot Password?</a>--%>
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

<%--bootstrap js--%>
<script src="<c:url value="/static/script/bootstrap.min.js"/>"></script>

</body>

</html>

