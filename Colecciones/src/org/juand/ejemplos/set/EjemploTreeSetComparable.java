package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        alumnoSet.add(new Alumno("Juan", 5.0));
        alumnoSet.add(new Alumno("Daniela", 4.8));
        alumnoSet.add(new Alumno("Pepe", 2.6));
        alumnoSet.add(new Alumno("Zeus", 1.4));

        System.out.println("alumnoSet = " + alumnoSet);

    }
}
