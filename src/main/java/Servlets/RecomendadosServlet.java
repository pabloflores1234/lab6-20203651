package Servlets;

import Daos.RecomendadosDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RecomendadosServlet",urlPatterns = {"/listaRecomendados"})
public class RecomendadosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        RecomendadosDao recomendadosDao = new RecomendadosDao();
        request.setAttribute("listaCancionesRecomendadas",recomendadosDao.listarCancionesRecomendadas());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaRecomendados.jsp");
        requestDispatcher.forward(request,response);

    }
}