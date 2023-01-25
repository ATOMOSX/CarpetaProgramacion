package org.juand.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>(Comparator.reverseOrder());
        stringSet.add("Uno");
        stringSet.add("Dos");
        stringSet.add("Tres");
        stringSet.add("Tres");
        stringSet.add("Cuatro");
        stringSet.add("Cinco");

        System.out.println("stringSet = " + stringSet);

        Set<Integer> numeros = new TreeSet<>((a, b) -> b.compareTo(a));
        numeros.add(10);
        numeros.add(1);
        numeros.add(8);
        numeros.add(9);
        numeros.add(2);

        System.out.println("numeros = " + numeros);
    }
}
