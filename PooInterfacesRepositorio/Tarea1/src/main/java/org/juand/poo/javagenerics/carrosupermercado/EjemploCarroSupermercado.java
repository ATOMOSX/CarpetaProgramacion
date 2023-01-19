package org.juand.poo.javagenerics.carrosupermercado;

import org.juand.poo.javagenerics.carrosupermercado.bolsasupermercado.BolsaSupermercado;
import org.juand.poo.javagenerics.carrosupermercado.bolsasupermercado.producto.*;

public class EjemploCarroSupermercado {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaLacteo.addProducto(new Lacteo("Yogurt", 3500.0, 25, 10))
                .addProducto(new Lacteo("Leche", 5500.0, 20, 10))
                .addProducto(new Lacteo("Leche saborizada", 10500.0, 40, 10))
                .addProducto(new Lacteo("Bonyurt", 3000.0, 15, 5))
                .addProducto(new Lacteo("Queso", 11000.0, 50, 4));

        System.out.println("================ Bolsa de lacteos ================");
        for (Lacteo lacteo : bolsaLacteo.getProductos()){
            System.out.println(lacteo.getNombre() + ", con un precio de " + lacteo.getPrecio() +
                    " mil pesos.\nCon " + lacteo.getProteinas() + " y una cantidad de " + lacteo.getCantidad() + " gr");
        }

        bolsaFruta.addProducto(new Fruta("Mango", 5500.0, 1, "Amarillo"))
                .addProducto(new Fruta("Manzana", 2000.0, 0.5, "Roja"))
                .addProducto(new Fruta("Pera", 2500.0, 0.4, "Verde"))
                .addProducto(new Fruta("Manzana", 2000.0, 0.4, "verde"))
                .addProducto(new Fruta("Durazno", 10000.0, 1, "Amarillo"));

        System.out.println("================ Bolsa de frutas ================");
        for (Fruta fruta : bolsaFruta.getProductos()){
            System.out.println(fruta.getNombre() + " " + fruta.getColor() + ", con un precio de " + fruta.getPrecio() +
                    " mil pesos. ");
        }

        bolsaLimpieza.addProducto(new Limpieza("Limpido", 4500.0, 1, "limpido"))
                .addProducto(new Limpieza("Fabuloso", 8000.0, 1, "Aroma para el piso"))
                .addProducto(new Limpieza("Aromatel", 22000.0, 2, "Aroma para la ropa"))
                .addProducto(new Limpieza("Fab", 35520.0, 3, "Detergente liquido para la ropa"))
                .addProducto(new Limpieza("Axion", 7800.0, 0.3, "Jabon para la loza"));

        System.out.println("================ Bolsa de limpieza ================");
        for (Limpieza limpieza : bolsaLimpieza.getProductos()){
            System.out.println(limpieza.getNombre() + " con un precio de " + limpieza.getPrecio() +
                    " mil pesos.\n Este es un producto de " + limpieza.getComponentes() + " y contiene " +
                    limpieza.getLitros() + " litros.");
        }

        bolsaNoPerecible.addProducto(new NoPerecible("Arroz", 3200.0, 500, 500))
                .addProducto(new NoPerecible("Frijol", 9000.0, 500, 500))
                .addProducto(new NoPerecible("Arbejas", 4550.0, 500, 500))
                .addProducto(new NoPerecible("Pasta", 3000.0, 100, 250))
                .addProducto(new NoPerecible("Harina", 4800.0, 400, 500));

        System.out.println("================ Bolsa de productos no perecible ================");
        for (NoPerecible noPerecible : bolsaNoPerecible.getProductos()){
            System.out.println(noPerecible.getNombre() + " con un precio de " + noPerecible.getPrecio() +
                    " mil pesos.");
        }
    }
}
