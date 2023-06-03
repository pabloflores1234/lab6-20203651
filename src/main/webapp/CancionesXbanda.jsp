<%@ page import="Beans.CancionesBeans" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Daos.CancionesXbandaDao" %>

<% ArrayList<CancionesBeans> listaCancionesXBanda = (ArrayList<CancionesBeans>) request.getAttribute("listaCancionesXBanda");%>


<html>
<jsp:include page="/static/head.jsp">
    <jsp:param name="title" value="Lista de Canciones por Banda"/>
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
                <a class="btn btn-warning" href="<%=request.getContextPath()%>/listaCanciones">Mostrar todas las canciones</a>
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
            <%for (CancionesBeans cxbanda: listaCancionesXBanda) {%>
            <tr>
                <td class="text-light border"><%=cxbanda.getIdCancion() %></td>
                <td class="text-light border"><%=cxbanda.getNombrecancion()%></td>
                <td class="text-light border"><%=cxbanda.getBanda()%></td>
            </tr>
            <%}%>
            </tbody>
        </table>
    </div>


</div>
<jsp:include page="/static/scripts.jsp"/>
</body>
</html>