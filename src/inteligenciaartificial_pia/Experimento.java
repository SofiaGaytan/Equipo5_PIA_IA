/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

/**
 *
 * @author ASUS
 */
public class Experimento {
    int indice;
    long tiempo;

    public Experimento(int indice, long tiempo) {
        this.indice = indice;
        this.tiempo = tiempo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
