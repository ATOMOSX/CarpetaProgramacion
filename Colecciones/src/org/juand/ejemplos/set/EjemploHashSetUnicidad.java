package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        //iteramos usando el HashSet
        Set<Alumno> alumnoSet = new HashSet<>();
        alumnoSet.add(new Alumno("Juan", 5.0));
        alumnoSet.add(new Alumno("Daniela", 4.8));
        alumnoSet.add(new Alumno("Pepe", 2.6));
        alumnoSet.add(new Alumno("Zeus", 1.4));
        alumnoSet.add(new Alumno("Zeus", 4.6));

        System.out.println("===================== Iterando usando un sout =====================");
        System.out.println("alumnoSet = " + alumnoSet);

        System.out.println("===================== Iterando usando un foreach =====================");
        for (Alumno alumno : alumnoSet){
            System.out.println(alumno);
        }

        System.out.println("===================== Iterando usando un while e iterator =====================");
        Iterator<Alumno> alumnoIterator = alumnoSet.iterator();
        while (alumnoIterator.hasNext()){
            Alumno alumno = alumnoIterator.next();
            System.out.println(alumno);
        }

        System.out.println("===================== Iterando usando un foreach lambda=====================");
        alumnoSet.forEach(System.out::println);

        //iteramos usando el TreeSet
        Set<Alumno> alumnoSet2 = new TreeSet<>();
        alumnoSet2.add(new Alumno("Juan", 5.0));
        alumnoSet2.add(new Alumno("Daniela", 4.8));
        alumnoSet2.add(new Alumno("Pepe", 2.6));
        alumnoSet2.add(new Alumno("Zeus", 1.4));
        alumnoSet2.add(new Alumno("Zeus", 4.6));

        System.out.println("===================== Iterando usando un sout =====================");
        System.out.println("alumnoSet = " + alumnoSet2);

        System.out.println("===================== Iterando usando un foreach =====================");
        for (Alumno alumno : alumnoSet2){
            System.out.println(alumno);
        }

        System.out.println("===================== Iterando usando un while e iterator =====================");
        Iterator<Alumno> alumnoIterator2 = alumnoSet2.iterator();
        while (alumnoIterator2.hasNext()){
            Alumno alumno = alumnoIterator2.next();
            System.out.println(alumno);
        }

        System.out.println("===================== Iterando usando un foreach lambda=====================");
        alumnoSet2.forEach(System.out::println);


    }
}
