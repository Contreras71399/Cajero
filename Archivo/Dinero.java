package Cajero;

import java.io.Serializable;

public class Billete implements Serializable {
    private static final long serialVersionUID = 1L;

    private int Denon;
    private int Total;

    public Billete(int Deno, int Total) {
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }

    public int getDen() {
        return denominacion;
    }

    public void setDeno(int Deno) {
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "$" + denominacion + " - Cantidad: " + cantidad;
    }
}
