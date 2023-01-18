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

        bolsaFruta.addProducto(new Fruta("Mango", 5500.0, 1, "Amarillo"))
                .addProducto(new Fruta("Manzana", 2000.0, 0.5, "Roja"))
                .addProducto(new Fruta("Pera", 2500.0, 0.4, "Verde"))
                .addProducto(new Fruta("Manzana", 2000.0, 0.4, "verde"))
                .addProducto(new Fruta("Durazno", 10000.0, 1, "Amarillo"));

        bolsaLimpieza.addProducto(new Limpieza("Limpido", 4500.0, 1, "limpido"))
                .addProducto(new Limpieza("Fabuloso", 8000.0, 1, "Aroma para el piso"))
                .addProducto(new Limpieza("Aromatel", 22000.0, 2, "Aroma para la ropa"))
                .addProducto(new Limpieza("Fab",));
    }
}
