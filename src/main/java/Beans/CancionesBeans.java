package Beans;

public class CancionesBeans {

        private int IdCancion;
        private String nombrecancion;
        private String banda;


    public int getIdCancion() {
        return IdCancion;
    }

    public void setIdCancion(int idCancion) {
        IdCancion = idCancion;
    }

    public String getNombrecancion() {
        return nombrecancion;
    }

    public void setNombrecancion(String nombrecancion) {
        this.nombrecancion = nombrecancion;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
}
