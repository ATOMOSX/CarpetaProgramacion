package org.juand.poo.javagenerics.carrosupermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T>{

    private List<T> productos;
    private int indiceProductos;
    private int maximo = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){
        if (this.productos.size() <= maximo){
            this.productos.add(producto);
        }else {
            throw new RuntimeException("No hay mas espacio para agregar un producto " +
                    "Recuerde que el maximo son 5");
        }
    }

    public List<T> getProductos() {
        return productos;
    }

    public void setProductos(List<T> productos) {
        this.productos = productos;
    }
}
