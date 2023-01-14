package org.juand.catalogo;

import org.juand.catalogo.clases.abstractas.*;
import org.juand.catalogo.interfaces.IProducto;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[4];

        productos[0] = new Iphone(4200568, "Apple", "Rojo", "Iphone 14");
        productos[1] = new Libro(50000,"Erik lamela", "Mamatsu", "Las aventuras de Mamatsu");
        productos[2] = new Comics(30000, "Daniela Gomez", "Marvel", "Resumen importante del universo marvel", "Iroman");
        productos[3] = new TvLcd(1800000, "Samsumg", 43);

        for (IProducto producto : productos){
            System.out.println();
            System.out.println("Tipo de: " + producto.getClass().getCanonicalName());
            System.out.println("Precio sin iva: " + producto.getPrecio());
            System.out.println("Precio final con iva: " + producto.getPrecioVenta());

            if (producto instanceof Libro){
                System.out.println("Titulo: " + ((Libro) producto).getTitulo());
                System.out.println("Autor: " + ((Libro) producto).getAutor());
                System.out.println("Editorial: " + ((Libro) producto).getEditorial());

                if (producto instanceof Comics){
                    System.out.println("Personaje principal: " + ((Comics) producto).getPersonaje());
                }
            }

            if (producto instanceof  Electronico){
                System.out.println("Fabricante: " + ((Electronico) producto).getFabricante());

                if (producto instanceof Iphone){
                    System.out.println("Color: " + ((Iphone) producto).getColor());
                    System.out.println("Modelo: " + ((Iphone) producto).getModelo());
                }else if (producto instanceof TvLcd){
                    System.out.println("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }
        }
    }
}
