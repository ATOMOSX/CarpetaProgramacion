package org.juand.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Sumar entero: " + calculadora.sumar(10, 20));
        System.out.println("Sumar Float: " + calculadora.sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + calculadora.sumar(10.0f, 35));
        System.out.println("Sumar int-float: " + calculadora.sumar(35, 10.5f));
        System.out.println("Sumar double: " + calculadora.sumar(3.2, 15.6));
        System.out.println("Sumar String: " + calculadora.sumar("25", "30"));
        System.out.println("Sumar 3 enteros: " + calculadora.sumar(10, 20, 30));

        //Vamos a sumar numeros long para ver con que metodo se asemeja
        System.out.println("Sumar long: " + calculadora.sumar(30L, 120L));
        System.out.println("Sumar int-char " + calculadora.sumar(10, '@'));
    }
}
