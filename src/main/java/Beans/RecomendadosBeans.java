package Beans;

public class RecomendadosBeans {
    private int IdCancionRecomendada;
    private String nombrecancionRecomendada;
    private String bandaRecomendada;

    public int getIdCancionRecomendada() {
        return IdCancionRecomendada;
    }

    public void setIdCancionRecomendada(int idCancionRecomendada) {
        IdCancionRecomendada = idCancionRecomendada;
    }

    public String getNombrecancionRecomendada() {
        return nombrecancionRecomendada;
    }

    public void setNombrecancionRecomendada(String nombrecancionRecomendada) {
        this.nombrecancionRecomendada = nombrecancionRecomendada;
    }

    public String getBandaRecomendada() {
        return bandaRecomendada;
    }

    public void setBandaRecomendada(String bandaRecomendada) {
        this.bandaRecomendada = bandaRecomendada;
    }
}
