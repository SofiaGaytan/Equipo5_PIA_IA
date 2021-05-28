/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Edge implements Serializable{

    private final Nodo destination;
    private final float cost;

    public Edge(Nodo destination, float cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public Nodo getDestination() {
        return destination;
    }
}
