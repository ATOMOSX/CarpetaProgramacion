package org.juand.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corbina", "lenguado", "robalo", "atun", "pejerrey", "lenguado", "atun"};

        Set<String> unicos = new HashSet<>();

        for (String pez : peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " Elementos no duplicados: " + unicos);
    }
}
