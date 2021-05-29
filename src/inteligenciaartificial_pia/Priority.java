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

    public Priority(Nodo nodes, Float cost, ArrayList<Nodo> path) {
        this.node = nodes;
        this.cost = cost;
        path.add(getNode());
        this.path = path;
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
}
