package org.juand.eliminar;

import java.util.function.Function;

public class EliminarCasos {
    public static void main(String[] args) {

        Function<String, String> eliminar = frase -> frase.replace(",", "")
                 .replace(" ", "").replace(".", "")
                 .replace(":", "").toUpperCase();
        System.out.println(eliminar.apply("Juan, David , limpia la casa: cuando no esta la familia."));
    }
}
