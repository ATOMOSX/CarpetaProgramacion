package org.juand.catalogo.clases.abstractas;

public class Iphone extends Electronico{

    private String Color;
    private String modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        Color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    public String getColor() {
        return Color;
    }

    public String getModelo() {
        return modelo;
    }
}
