<%@ page import="java.util.TreeMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <!-- Bootstrap Core CSS -->

    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="<c:url value="/static/CSS/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Font Awesome JS -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
          integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3" style="margin-top: 100px">
            <div class="card bg-light border-primary mb-3">
                <div class="card-header border-primary mb-3">
                    <h3>Please Sign In</h3>
                </div>
                <div class="card-body">
                    <form role="form" action="/fromForm" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="login" name="j_login" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Email" name="j_password" type="password" >
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Password" name="j_password" type="password" >
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Confirm password" name="j_password" type="password" >
                                    </div>
                                </div>
                            </div>

                            <input type="submit" class="btn btn-lg btn-primary btn-block">
                        </fieldset>
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="/createAccaunt">Create accaunt</a>
                        <a class="d-block small" href="/forgotPassword">Forgot Password?</a>
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