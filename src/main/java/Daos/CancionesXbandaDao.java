package Daos;

import Beans.CancionesBeans;

import java.sql.*;
import java.util.ArrayList;

public class CancionesXbandaDao {
    public ArrayList<CancionesBeans> listarCancionesXBanda(String bandaId){
        ArrayList<CancionesBeans> listaCancionesXBanda = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "select * from cancion\n" +
                "where banda = ?";
        String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";
        try (Connection connection = DriverManager.getConnection(url, "root", "root");
             /*Usaremos prepared Statement*/
             PreparedStatement ptsmtbanda = connection.prepareStatement(sql))
        {
            ptsmtbanda.setString(1,bandaId);
            try (ResultSet rs = ptsmtbanda.executeQuery()){
                while(rs.next()){
                    CancionesBeans cxbanda = new CancionesBeans();
                    cxbanda.setIdCancion(rs.getInt(1));
                    cxbanda.setNombrecancion(rs.getString(2));
                    cxbanda.setBanda(rs.getString(3));

                    listaCancionesXBanda.add(cxbanda);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaCancionesXBanda;
    }
}
