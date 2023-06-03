package Servlets;

import Daos.CancionesXbandaDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CancionesXbandaServlet", value = {"/CancionesXbanda"})
public class CancionesXbandaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CancionesXbandaDao cancionxbandadao = new CancionesXbandaDao();

        String bandaId = request.getParameter("bandaId");
            request.setAttribute("listaCancionesXBanda", cancionxbandadao.listarCancionesXBanda(bandaId));
            RequestDispatcher view =request.getRequestDispatcher("CancionesXbanda.jsp");
            view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}