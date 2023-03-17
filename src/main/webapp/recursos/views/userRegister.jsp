<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Your Account</title>

    <!-- Boottraps -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <!-- Style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css">
</head>
<body>
<div class="title"><h1>Welcome to Your Account</h1></div>

<div class="secondTitle">
    <h4>Create your User</h4>
</div>
<div class="container d-flex justify-content-center align-content-center">

    <spring:url value="/user/save" var="saveURL" htmlEscape="true"/>
    <form:form modelAttribute="userForm" method="post" action="${saveURL}" cssClass="form">
        <form:hidden path="idUser"/>
        <div class="form-group row">
            <label for="email" class="col-sm-3 col-form-label">Email</label>
            <div class="col-sm-6">
                <form:input path="email" cssClass="form-control" id="email"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="password" class="col-sm-3 col-form-label">Password</label>
            <div class="col-sm-6">
                <form:input type="password" path="password" cssClass="form-control" id="password"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="name" class="col-sm-3 col-form-label">Name</label>
            <div class="col-sm-6">
                <form:input path="name" cssClass="form-control" id="name"/>
            </div>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-info col-sm-5">Registrarse</button>
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
