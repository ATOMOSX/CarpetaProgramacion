package org.juand.poo.javagenerics.carrosupermercado.producto;

public class NoPerecible extends Producto{

    private int calorias;
    private int contenido;

    public NoPerecible(String nombre, Double precio, int calorias, int contenido) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}
