/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author Karol
 */
public class Implementacion<T extends Base> {
    
    
    private LinkedList<T> pilas;

    public Implementacion() {
        pilas = new LinkedList<>();
    }

    public void aPilar(T elemento) {
        pilas.addLast(elemento);
    }

    public T desapilar() {
        return pilas.removeLast();
    }

    public boolean estaVacia() {
        return pilas.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T e : pilas) {
            sb.append(" ").append(e.toString());
        }
        sb.append("]");

        return sb.toString();
    }

  public LinkedList<T> getLista() {
    return pilas;
}


   
}
  

