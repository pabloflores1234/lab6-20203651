<%@ page import="Beans.RecomendadosBeans" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<% ArrayList<RecomendadosBeans> listaCancionesRecomendadas = (ArrayList<RecomendadosBeans>) request.getAttribute("listaCancionesRecomendadas");%>
<html>
<jsp:include page="/static/head.jsp">
  <jsp:param name="title" value="Lista de Recomendados"/>
</jsp:include>
<body>
<div class='container'>
  <jsp:include page="/includes/navbar.jsp">
    <jsp:param name="page" value="recomendados"/>
  </jsp:include>
  <div class="pb-5 pt-4 px-3 titlecolor">
    <div class="col-lg-6">
      <div class="col">
        <h1 class="text-light">Lista de Canciones Recomendadas</h1>
      </div>
    </div>
    <table>
      <thead>
      <tr>
        <th class="text-light">ID</th>
        <th class="text-light">CANCION</th>
        <th class="text-light">BANDA</th>
        <th class="text-light">Ver</th>
        <th class="text-light">Agregar a Favoritos</th>

      </tr>
      </thead>
      <tbody>
      <%for (RecomendadosBeans R: listaCancionesRecomendadas) {%>
      <tr>
        <td class="text-light border"><%=R.getIdCancionRecomendada() %></td>
        <td class="text-light border"><%=R.getNombrecancionRecomendada()%></td>
        <td class="text-light border"><%=R.getBandaRecomendada()%></td>
        <td>
          <button class="btn btn-success">+</button>
        </td>
        <td>
          <a class="btn btn-success" href="<%=request.getContextPath()%>/CancionesXbanda?bandaId=<%=R.getBandaRecomendada()%>">Más de la banda</a>
        </td>


      </tr>
      <%}%>
      </tbody>
    </table>
  </div>


</div>
<jsp:include page="/static/scripts.jsp"/>
</body>
</html>

