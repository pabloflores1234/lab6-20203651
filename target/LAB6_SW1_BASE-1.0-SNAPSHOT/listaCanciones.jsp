<%@ page import="Beans.CancionesBeans" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<% ArrayList<CancionesBeans> listaCanciones = (ArrayList<CancionesBeans>) request.getAttribute("listaCanciones");%>
<html>
        <jsp:include page="/static/head.jsp">
            <jsp:param name="title" value="Lista de Canciones"/>
        </jsp:include>
<body>
    <div class='container'>
        <jsp:include page="/includes/navbar.jsp">
            <jsp:param name="page" value="canciones"/>
        </jsp:include>
        <div class="pb-5 pt-4 px-3 titlecolor">
            <div class="col-lg-6">
                    <div class="col">
                        <h1 class="text-light">Lista de Canciones</h1>
                    </div>
            </div>
            <table>
                <thead>
                <tr>
                    <th class="text-light">ID</th>
                    <th class="text-light">CANCION</th>
                    <th class="text-light">BANDA</th>
                </tr>
                </thead>
                <tbody>
                <%for (CancionesBeans c: listaCanciones) {%>
                <tr>
                    <td class="text-light border"><%=c.getIdCancion() %></td>
                    <td class="text-light border"><%=c.getNombrecancion()%></td>
                    <td class="text-light border"><%=c.getBanda()%></td>
                </tr>
                <%}%>
                </tbody>
            </table>
        </div>


    </div>
    <jsp:include page="/static/scripts.jsp"/>
</body>
</html>
