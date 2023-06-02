<%--
  Created by IntelliJ IDEA.
  User: PABLO
  Date: 1/06/2023
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
        <jsp:include page="/static/head.jsp">
            <jsp:param name="title" value="Lista de Canciones"/>
        </jsp:include>
<head>
    <title>Title</title>
</head>
<body>
    <div class='container'>
        <jsp:include page="/includes/navbar.jsp">
            <jsp:param name="page" value="tours"/>
        </jsp:include>
        <div class="pb-5 pt-4 px-3 titlecolor">
            <div class="col-lg-6">
                <h1 class='text-light'>Lista de Canciones por banda</h1>
                <a class="btn btn-warning" href="… ">Mostrar todas las canciones</a>
            </div>
        </div>
    </div>
</body>
</html>
