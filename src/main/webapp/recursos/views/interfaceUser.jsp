<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile</title>
    <!--Animaciones-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
    <!-- Boottraps -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <!-- Style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css">
</head>
<body>

<div class="title animate__animated animate__zoomIn animate__slow">
    <h1>Profile User</h1>
</div>

<div class="secondTitle animate__animated animate__zoomIn animate__slow">
    <h3>Start adding an account</h3>
</div>

<div class="container d-flex justify-content-center align-content-center animate__animated animate__slow animate__bounceInUp animate__delay-1s">
    <spring:url value="/interface/save" var="saveURL" htmlEscape="true"/>
    <form:form modelAttribute="accountForm" method="post" action="${saveURL}" cssClass="form">
        <form:hidden path="accountId"/>
        <div class="form-group row">
            <label for="type" class="col-sm-4 col-form-label">Account type</label>
            <div class="col-sm-8">
                <form:input path="typeAccount" cssClass="form-control" id="type" placeholder="Example: social network, gaming"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="nameAccount" class="col-sm-4 col-form-label">Name for account</label>
            <div class="col-sm-8">
                <form:input path="nameAccount" cssClass="form-control" id="nameAccount"
                            placeholder="Example: Facebook, Fornite"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="emailAccount" class="col-sm-4 col-form-label">Email linked to account</label>
            <div class="col-sm-8">
                <form:input type="email" path="emailAccount" cssClass="form-control" id="emailAccount"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="userNameAccount" class="col-sm-4 col-form-label">User name/nickname Account</label>
            <div class="col-sm-8">
                <form:input path="userNameAccount" cssClass="form-control" id="userNameAccount"
                            placeholder="Example: cs_shoot"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="userPasswAccount" class="col-sm-4 col-form-label">Password Account</label>
            <div class="col-sm-8">
                <form:input path="userPasswAccount"  cssClass="form-control" id="userPasswAccount" type="password"/>
            </div>
        </div>
        <div class="form-group row" style="display: block">
            <div class="col-sm-8">
                <form:hidden path="user.idUser"  cssClass="form-control" id="userId" value = "${usedId}"/>
            </div>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-info col-sm-4">Add Account</button>
        </div>
        <div class="form-group">
            <a class="btn btn-info" href="${pageContext.request.contextPath}/logout" role="button">Logout</a>
        </div>
    </form:form>

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
