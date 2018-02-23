package com.example.mario.cuentos;

/**
 * Created by mario on 29/11/2017.
 */

public class Cuento {

    private String titulo;
    private String avance;
    private String texto;

    public Cuento(String titulo, String avance, String texto) {
        this.titulo = titulo;
        this.avance = avance;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvance() {
        return avance;
    }

    public void setAvance(String avance) {
        this.avance = avance;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
