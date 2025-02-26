/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import Modelo.Base;
import java.util.Random;

/**
 *
 * @author Karol
 */
public class Emergencia implements Base{
    
    String tEmergencia;
    Random nPrioridad;
    Random tiempo;
    
    int id ;

    public Emergencia() {
    }

    public Emergencia(Random nPrioridad, Random tiempo, String tEmergencia, int id) {
        this.nPrioridad = nPrioridad;
        this.tiempo = tiempo;
        this.tEmergencia = tEmergencia;
        this.id = id;
    }
    

    public Random getnPrioridad() {
        return nPrioridad;
    }

    public void setnPrioridad(Random nPrioridad) {
        this.nPrioridad = nPrioridad;
    }

    public Random getTiempo() {
        return tiempo;
    }

    public void setTiempo(Random tiempo) {
        this.tiempo = tiempo;
    }

    public String gettEmergencia() {
        return tEmergencia;
    }

    public void settEmergencia(String tEmergencia) {
        this.tEmergencia = tEmergencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
   

    @Override
    public Base copy() {
        return (Base) new Emergencia(nPrioridad, tiempo, tEmergencia, id );
    }

    @Override
    public String toString() {
        return "Emergencia{" + "nPrioridad=" + nPrioridad + ", tiempo=" + tiempo + ", tEmergencia=" + tEmergencia + ", id=" + id + '}';
    }
    
    
    
}
