
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Your Accounts</title>
    <!--Animaciones-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
    <!-- Boottraps -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <!-- Style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
</head>
<body>
<div class="title animate__animated animate__zoomIn animate__slow">
    <h1 class="h1 d-none d-md-block">Accounts registered on the site</h1>
    <h1 class="h3 d-block d-md-none">Accounts registered on the site</h1>
</div>
<div class="container animate__animated animate__slow animate__bounceInUp animate__delay-1s">
    <table class="table text-white table-bordered table-responsive">
        <thead class="table">
        <tr class="text-white text-center">
            <th>Account id</th>
            <th>Account type</th>
            <th>Account name</th>
            <th>Account email linked</th>
            <th>Account name user/nickname</th>
            <th>Account password</th>
            <th>Options</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${accountsList}" var="account">
            <tr>
                <td class="col-3">${account.accountId}</td>
                <td class="col-3">${account.typeAccount}</td>
                <td class="col-3">${account.nameAccount}</td>
                <td class="col-3">${account.emailAccount}</td>
                <td>${account.userNameAccount}</td>
                <td>${account.userPasswAccount}</td>
                <td>
                   <div class="btn-group">
                       <spring:url value="/interface/update/${account.accountId}" var="actualizarURL"/>
                       <a class="btn btn-info" href="${actualizarURL}" role="button">Edit</a>
                       <spring:url value="/interface/delete/${account.accountId}" var="eliminarURL"/>
                       <a class="btn btn-info" href="${eliminarURL}" role="button">Delete</a>
                   </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/interface/create" var="crearURL"/>
    <a class="btn btn-info" href="${crearURL}" role="button">Add Account</a>
    <a class="btn btn-info" href="${pageContext.request.contextPath}/logout" role="button">Logout</a>
</div>
<!-- Boottraps -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
</body>
</html>
