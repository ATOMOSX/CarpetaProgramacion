package org.juand.poo.javagenerics.carrosupermercado.bolsasupermercado.producto;

public class Limpieza extends Producto{

    private double litros;
    private String componentes;

    public Limpieza(String nombre, Double precio, double litros, String componentes) {
        super(nombre, precio);
        this.litros = litros;
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }
}
