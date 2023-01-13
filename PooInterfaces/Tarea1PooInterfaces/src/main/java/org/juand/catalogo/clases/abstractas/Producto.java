package org.juand.catalogo.clases.abstractas;

import org.juand.catalogo.interfaces.IProducto;

public class Producto implements IProducto {

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }
}
