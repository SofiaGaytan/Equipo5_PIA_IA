/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.awt.Color;
import java.awt.Shape;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ASUS
 */
public class Nodo {
    private Shape nodo;
    private Color color;
    private int num;
    private Map<String, Float> adyacentes = new TreeMap<>();
    
    public Nodo(Shape nodo, Color color, int num){
        super();
        this.nodo = nodo;
        this.color = color;
        this.num =  num;
    }
    
    public Nodo(){
        
    }
    
    public Shape getNodo() {
        return nodo;
    }

    public void setNodo(Shape nodo) {
        this.nodo = nodo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Map<String, Float> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(Map<String, Float> adyacentes) {
        this.adyacentes = adyacentes;
    }
}
