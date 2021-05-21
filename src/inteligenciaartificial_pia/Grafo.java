/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial_pia;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author ASUS
 */
public class Grafo {

    ArrayList<Nodo> nodos = new ArrayList<>();
    ArrayList<Arista> aristas = new ArrayList<>();

    Grafo() {

    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }

    //Funciones
    public void agregarArista(ArrayList<Nodo> seleccionados, String tamaño) {
        Point punto1 = new Point();
        Point punto2 = new Point();
        Point puntoT = new Point();
        punto1.x = seleccionados.get(0).getNodo().getBounds().x;
        punto1.y = seleccionados.get(0).getNodo().getBounds().y;
        punto2.x = seleccionados.get(1).getNodo().getBounds().x;
        punto2.y = seleccionados.get(1).getNodo().getBounds().y;
        puntoT.x = (int) ((punto1.x + punto2.x) / 2);
        puntoT.y = (int) ((punto1.y + punto2.y) / 2);
        this.aristas.add(new Arista(new Line2D.Double(punto1.x + 7, punto1.y + 7, punto2.x + 7, punto2.y + 7), Color.black, Float.parseFloat(tamaño), puntoT.x + 7, puntoT.y + 7, seleccionados));
    }

    public void agregarArista2(ArrayList<Nodo> seleccionados, String tamaño) {
        Point punto1 = new Point();
        punto1.x = seleccionados.get(0).getNodo().getBounds().x;
        punto1.y = seleccionados.get(1).getNodo().getBounds().y;
        this.aristas.add(new Arista(new Ellipse2D.Double(punto1.x + 5, punto1.y - 15, 40, 40), Color.BLACK, Float.parseFloat(tamaño), punto1.x + 20, punto1.y, seleccionados));
    }

    public void eliminarNodo(ArrayList<Nodo> seleccionados, Nodo seleccionado) {
        for (Nodo nodo : this.nodos) {
            if (seleccionado.equals(nodo)) {
                nodos.remove(nodo);
                borrarAristasNodoEspecifico(seleccionado);
                break;
            }
        }
    }

    public void borrarAristasNodoEspecifico(Nodo seleccionado) {
        ArrayList<Arista> auxiliar = new ArrayList<>();
        for (Arista a : aristas) {
            if (a.getNodos().get(0).equals(seleccionado) || a.getNodos().get(1).equals(seleccionado)) {
                auxiliar.add(a);
            }
        }
        for (Arista aux : auxiliar) {
            aristas.remove(aux);
        }
    }

}
