package org.juand.poo.javagenerics.carrosupermercado.producto;

public class Lacteo extends Producto{

    private int proteinas;
    private int cantidad;

    public Lacteo(String nombre, Double precio, int proteinas, int cantidad) {
        super(nombre, precio);
        this.proteinas = proteinas;
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
