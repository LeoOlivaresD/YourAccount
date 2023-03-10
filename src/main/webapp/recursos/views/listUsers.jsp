<%--
  Created by IntelliJ IDEA.
  User: Leonardo
  Date: 10-03-2023
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>List Users</title>
</head>
<body>
<table class="table">
    <thead class="table-info">
    <tr>
        <th>ID</th>
        <th>Email</th>
        <th>Password</th>
        <th>Name User</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userForm}" var="userForm">
        <tr>
            <td>${userForm.idUser}</td>
            <td>${userForm.email}</td>
            <td>${userForm.password}</td>
            <td>${userForm.name}</td>
            <td>
                <spring:url value="/user/update/${userForm.idUser}" var="actualizarURL"/>
                <a class="btn btn-info" href="${actualizarURL}" role="button">Editar</a>
            </td>
            <td>
                <spring:url value="/user/delete/${userForm.idUser}" var="eliminarURL"/>
                <a class="btn btn-info" href="${eliminarURL}" role="button">Eliminar</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<spring:url value="/user/create" var="crearURL"/>
<a class="btn btn-info" href="${crearURL}" role="button">Agregar Usuario</a>
</body>
</html>
