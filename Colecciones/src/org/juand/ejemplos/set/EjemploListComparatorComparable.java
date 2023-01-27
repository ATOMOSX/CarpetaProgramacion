package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparatorComparable {
    public static void main(String[] args) {

        //iteramos usando el HashSet
        List<Alumno> alumnoSet = new ArrayList<>();
        alumnoSet.add(new Alumno("Juan", 5.0));
        alumnoSet.add(new Alumno("Daniela", 4.8));
        alumnoSet.add(new Alumno("Pepe", 2.6));
        alumnoSet.add(new Alumno("Zeus", 1.4));
        alumnoSet.add(new Alumno("Zeus", 4.6));

        //Formas de organizar una lista
        Collections.sort(alumnoSet, (a, b) -> a.getNota().compareTo(b.getNota()));
        alumnoSet.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        alumnoSet.sort(Comparator.comparing((Alumno alumno) -> alumno.getNombre()).reversed());
        alumnoSet.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(alumnoSet);

        System.out.println("===================== Iterando usando un foreach lambda=====================");
        alumnoSet.forEach(System.out::println);


    }
}
