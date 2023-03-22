
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Your Accounts</title>
    <!-- Boottraps -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <!-- Style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css">
</head>
<body>
<div class="title">
    <h1>Accounts registered on the site</h1>
</div>
<div class="container">
    <table class="table">
        <thead class="table">
        <tr class="text-white">
            <th>Id User</th>
            <th>Account id</th>
            <th>Account type</th>
            <th>Account name</th>
            <th>Account email linked</th>
            <th>Account name user/nickname</th>
            <th>Account password</th>
            <th style="text-align: right">Options</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${accountsList}" var="account">
            <tr>
                <td>${account.accountId}</td>
                <td>${account.typeAccount}</td>
                <td>${account.nameAccount}</td>
                <td>${account.emailAccount}</td>
                <td>${account.userNameAccount}</td>
                <td>${account.userPasswAccount}</td>
                <td>
                    <spring:url value="/interface/update/${account.accountId}" var="actualizarURL"/>
                    <a class="btn btn-info" href="${actualizarURL}" role="button">Edit</a>
                </td>
                <td>
                    <spring:url value="/interface/delete/${account.accountId}" var="eliminarURL"/>
                    <a class="btn btn-info" href="${eliminarURL}" role="button">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/interface/create" var="crearURL"/>
    <a class="btn btn-info" href="${crearURL}" role="button">Add Account</a>
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
