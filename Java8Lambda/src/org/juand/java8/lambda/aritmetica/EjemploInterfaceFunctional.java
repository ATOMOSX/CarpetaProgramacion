package org.juand.java8.lambda.aritmetica;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritcmatica suma = (a, b) -> a + b;
        Aritcmatica resta = (a, b) -> a - b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10, 5, suma));
        System.out.println(calculadora.computar(15, 20, resta));
        System.out.println(calculadora.computar(10, 5, (a, b) -> a * b));

        //Ahora lo hacemos con el segundo método que generamos en la clase calculadora
        System.out.println(calculadora.computarBiFunctional(10, 5, (a, b) -> a / b));
    }
}
