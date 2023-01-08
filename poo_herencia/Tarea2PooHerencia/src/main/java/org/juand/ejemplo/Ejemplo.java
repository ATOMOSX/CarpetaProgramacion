package org.juand.ejemplo;

import org.juand.verduleria.*;

public class Ejemplo {
    public static void main(String[] args) {

        Producto[] productos = new Producto[4];

        productos[0] = new Lacteo(120, 100, "Bonyurt", 50000);
        productos[1] = new Fruta("Piña", 20000.0, 1400, "verde");
        productos[2] = new Limpieza("Ariel", 30500, "Jabon en liquido", 4 );
        productos[3] = new NoPerecedores("Atún", 50500, 250, 315);

        System.out.println("======================== Productos en venta desde el aire, att: adm. Avianca ========================");
        for (Producto producto : productos){

            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            if (producto instanceof Lacteo){
                System.out.println("Cantidad: " + ((Lacteo) producto).getCantidad());
                System.out.println("Proteinas: " + ((Lacteo) producto).getProteinas());
                System.out.println();
            } else if (producto instanceof Fruta) {
                System.out.println("Peso: " + ((Fruta) producto).getPeso());
                System.out.println("Color: " + ((Fruta) producto).getColor());
                System.out.println();
            } else if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
                System.out.println();
            } else if (producto instanceof NoPerecedores) {
                System.out.println("Contenido: " + ((NoPerecedores) producto).getContenido());
                System.out.println("Calorias: " + ((NoPerecedores) producto).getCalorias());
                System.out.println();
            }
        }
    }
}
