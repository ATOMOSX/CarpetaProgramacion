package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new HashSet<>();
        alumnoSet.add(new Alumno("Juan", 5.0));
        alumnoSet.add(new Alumno("Daniela", 4.8));
        alumnoSet.add(new Alumno("Pepe", 2.6));
        alumnoSet.add(new Alumno("Zeus", 1.4));
        alumnoSet.add(new Alumno("Zeus", 4.6));

        System.out.println("alumnoSet = " + alumnoSet);

    }
}
