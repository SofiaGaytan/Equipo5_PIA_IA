/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Priority {

    private final Nodo node;
    private final Float cost;
    private final ArrayList<Nodo> path;
    private final ArrayList<String> recorrido;

    public Priority(Nodo nodes, Float cost, ArrayList<Nodo> path, ArrayList<String> recorrido) {
        this.node = nodes;
        this.cost = cost;
        this.path = path;
        if(this.node != null){
            path.add(getNode());
        }
        this.recorrido = recorrido;
    }

    public ArrayList<Nodo> getPath() {
        return (ArrayList<Nodo>) path.clone();
    }

    public Float getCost() {
        return cost;
    }

    public Nodo getNode() {
        return node;
    }

    public ArrayList<String> getRecorrido() {
        return recorrido;
    }
    
}
