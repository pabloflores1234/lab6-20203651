package Daos;

import Beans.RecomendadosBeans;

import java.sql.*;
import java.util.ArrayList;

public class RecomendadosDao {
    public ArrayList<RecomendadosBeans> listarCancionesRecomendadas(){
        ArrayList<RecomendadosBeans> listaCancionesRecomendadas = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "select idcancion, nombre_cancion, banda, count(cancion_idcancion) as \"Número de Reproducciones\"\n" +
                "from cancion c\n" +
                "inner join reproduccion r on r.cancion_idcancion = c.idcancion\n" +
                "group by cancion_idcancion\n" +
                "having count(cancion_idcancion) > 2\n" +
                "order by count(cancion_idcancion) desc;";
        String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";
        try (Connection connection = DriverManager.getConnection(url, "root", "root");
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while(resultSet.next()){

                RecomendadosBeans cancion = new RecomendadosBeans();
                cancion.setIdCancionRecomendada(resultSet.getInt(1));
                cancion.setNombrecancionRecomendada(resultSet.getString(2));
                cancion.setBandaRecomendada(resultSet.getString(3));

                listaCancionesRecomendadas.add(cancion);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaCancionesRecomendadas;
    }
}

