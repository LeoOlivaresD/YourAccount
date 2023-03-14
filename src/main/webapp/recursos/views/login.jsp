
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
  <!-- Boottraps -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
        integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
  <!-- Style-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css">
</head>
<body>
<section>
  <div class="container d-flex justify-content-center">
    <%
      String error = (String)request.getAttribute("error");
      if (error != null && error.equals("true")){
        out.println("<h3 class='alert alert-danger text-center'>Incorrect user</h3>");
    %>
    <form action="${pageContext.request.contextPath}/login" method="post">
      <div class="form-group text-white">
        <label for="name">Name user </label>
        <input type="text" class="form-control" id="name" name="name">
      </div>
      <div class="form-group text-white">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" name="password">
      </div>
      <button type="submit" class="btn btn-primary"> Log in </button>
    </form>
  </div>
</section>
<!-- Boottraps -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
</body>
</html>
