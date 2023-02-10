package org.juand.contadordeveces;

import java.util.Collections;


public class EjemploContador {
    public static void main(String[] args) {

        contadorPalabras contador = frase -> {

            String[] arregloFrase = frase.replace(", ", "").
                    replace("." ,"").toLowerCase().split(" ");

            int maximoContador = 0;
            String palabra = null;
            for (String i : arregloFrase) {
                int contadorFor = 0;
                for (String j : arregloFrase) {
                    if (i.equalsIgnoreCase(j)) {
                        contadorFor++;
                    }
                }
                if (contadorFor > maximoContador) {
                    maximoContador = contadorFor;
                    palabra = i;
                }
            }
            return Collections.singletonMap(palabra, maximoContador);
        };

        contador.contadorPalabras("el gato al rato, el rato a la cuerda, la cuerda al palo, daba el arriero a Sancho," +
                " Sancho a la moza, la moza a él, el ventero a la moza...").forEach((a, b) -> System.out.println(
                        "La palabra " + a + " se repite " + b + " veces."));

    }
}
