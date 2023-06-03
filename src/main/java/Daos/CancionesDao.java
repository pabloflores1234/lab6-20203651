package Daos;

import Beans.CancionesBeans;

import java.sql.*;
import java.util.ArrayList;

public class CancionesDao {
    public ArrayList<CancionesBeans> listarCanciones(){
        ArrayList<CancionesBeans> listaCanciones = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "select * from cancion;";
        String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";
        try (Connection connection = DriverManager.getConnection(url, "root", "root");
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while(resultSet.next()){

                CancionesBeans cancion = new CancionesBeans();
                cancion.setIdCancion(resultSet.getInt(1));
                cancion.setNombrecancion(resultSet.getString(2));
                cancion.setBanda(resultSet.getString(3));

                listaCanciones.add(cancion);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaCanciones;
    }
}
