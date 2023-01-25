package org.juand.ejemplos.set;

import java.util.*;

public class EjemplosHasSetAgregar {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
         hashSet.add("Uno");
         hashSet.add("Dos");
         hashSet.add("Tres");
         hashSet.add("Cuatro");
         hashSet.add("Cinco");

        List<String> stringList = new ArrayList<>(hashSet);
        Collections.sort(stringList);

        System.out.println("================= Elementos no ordenados =================");
        System.out.println(hashSet);

        System.out.println("================= Elementos ordenados =================");
        System.out.println("stringList = " + stringList);

        boolean b = hashSet.add("Tres");
        System.out.println("\nPermite elementos duplicados? " + b);
    }
}
