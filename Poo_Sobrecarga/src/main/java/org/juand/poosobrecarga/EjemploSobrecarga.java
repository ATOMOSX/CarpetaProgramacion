package org.juand.poosobrecarga;

import static org.juand.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar entero: " + sumar(10, 20));
        System.out.println("Sumar Float: " + sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + sumar(10.0f, 35));
        System.out.println("Sumar int-float: " + sumar(35, 10.5f));
        System.out.println("Sumar double: " + sumar(3.2, 15.6));
        System.out.println("Sumar String: " + sumar("25", "30"));
        System.out.println("Sumar 3 enteros: " + sumar(10, 20, 30));
        System.out.println("Sumar todos los enteros posibles enteros: " + sumar(10, 20, 30, 40, 50, 60, 70));
        System.out.println("Sumar todos los enteros y float posibles: " + sumar(50.0f, 10, 20, 30, 40, 50, 60, 70));
        System.out.println("Sumar todos los double posibles: " + sumar(10, 20.50, 30.30, 40.10, 50.6, 60.5, 70.5));

        //Vamos a sumar numerous long para ver con que método se asemeja
        System.out.println("Sumar long: " + sumar(30L, 120L));
        System.out.println("Sumar int-char " + sumar(10, '@'));
    }
}
