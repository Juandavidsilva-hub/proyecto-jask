/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Karol
 */
public class Tiempo {
    private int Tiempo;
    private int TiempoTotal;

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getTiempoTotal() {
        return TiempoTotal+=Tiempo;
    }

    public void setTiempoTotal(int TiempoTotal) {
        this.TiempoTotal = TiempoTotal;
    }

    public Tiempo(int Tiempo, int TiempoTotal) {
        this.Tiempo = Tiempo;
        this.TiempoTotal = TiempoTotal;
    }

    @Override
    public String toString() {
        return "timer{" + "Tiempo=" + Tiempo + ", TiempoTotal=" + TiempoTotal + '}';
    }
    
    
}
