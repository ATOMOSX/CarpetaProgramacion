package org.juand.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> function1 = parametro -> "Hola que tal " + parametro;
        String resultado = function1.apply("Andres");
        System.out.println(resultado);

        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("andres"));

        BiFunction<String, String, String> function3 = (a, b) ->
                a.toUpperCase().concat(b.toUpperCase());
        String r2 = function3.apply("andres", "jose");

        BiFunction<String, String, Integer> function4 = String::compareTo; //(a,b) -> a.compareTo(b)
        System.out.println(function4.apply("andres", "andres2"));

        BiFunction<String, String, String> function5 = String::concat; //(a,b) -> a.concant(b)
        System.out.println(function5.apply("andres", "jose"));
    }
}
