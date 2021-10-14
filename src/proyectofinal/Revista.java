/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author andre
 */
public class Revista {
    private int NroRegistro,idsuc;

    public int getIdsuc() {
        return idsuc;
    }

    public void setIdsuc(int idsuc) {
        this.idsuc = idsuc;
    }
    private String titulo,periodicidad,tipo;

    public int getNroRegistro() {
        return NroRegistro;
    }

    public void setNroRegistro(int NroRegistro) {
        this.NroRegistro = NroRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}