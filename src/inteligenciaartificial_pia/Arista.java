/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.awt.Color;
import java.awt.Shape;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Arista implements Serializable{
    Shape arista;
    ArrayList<Nodo> nodos = new ArrayList<>();
    Color color;
    float tamaño;
    int xt, yt;
    
    public Arista(Shape arista, Color color, float tamaño, int xt, int yt, ArrayList<Nodo> nodos){
        super();
        this.arista = arista;
        this.color = color;
        this.tamaño = tamaño;
        this.xt = xt;
        this.yt = yt;
        this.nodos = nodos;
    }

    public Shape getArista() {
        return arista;
    }

    public void setArista(Shape arista) {
        this.arista = arista;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public int getXt() {
        return xt;
    }

    public void setXt(int xt) {
        this.xt = xt;
    }

    public int getYt() {
        return yt;
    }

    public void setYt(int yt) {
        this.yt = yt;
    }
    
    
    
}
