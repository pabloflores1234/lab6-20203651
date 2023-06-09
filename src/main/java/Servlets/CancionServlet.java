package Servlets;

import Daos.CancionesDao;
import Beans.CancionesBeans;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CancionServlet",urlPatterns = {"/listaCanciones"})
public class CancionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        CancionesDao cancionDao = new CancionesDao();
        request.setAttribute("listaCanciones",cancionDao.listarCanciones());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaCanciones.jsp");
        requestDispatcher.forward(request,response);

    }
}

