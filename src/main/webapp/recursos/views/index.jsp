<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


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
<div class="title container justify-content-center align-content-center vh-30"><h1>Welcome to Your Account</h1></div>
<div class="secondTitle">
    <h4>Create your User</h4>
</div>

<div style="text-align: center">
    <spring:url value="/user/create" var="create"/>
    <a class="comenzar btn btn-info" href="${create}" role="button">Comenzar</a>
</div>

<!-- Boottraps -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
<!--Events js-->
<script src="${pageContext.request.contextPath}/res/js/events.js"></script>
</body>
</html>
