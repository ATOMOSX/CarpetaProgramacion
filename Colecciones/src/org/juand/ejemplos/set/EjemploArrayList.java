package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {

        //iteramos usando el HashSet
        List<Alumno> alumnoArrayList = new ArrayList<>();
        System.out.println(alumnoArrayList + ", size " + alumnoArrayList.size());
        System.out.println("Esta vacia = " + alumnoArrayList.isEmpty());
        alumnoArrayList.add(new Alumno("Juan", 5.0));
        alumnoArrayList.add(new Alumno("Daniela", 4.8));
        alumnoArrayList.add(new Alumno("Pepe", 2.6));
        alumnoArrayList.add(new Alumno("Zeus", 1.4));
        alumnoArrayList.add(new Alumno("Zeus", 4.6));

        System.out.println(alumnoArrayList + ", size " + alumnoArrayList.size());
        //Se puede eliminar a uno siempre y cuando sean con los mismos datos
        alumnoArrayList.remove(new Alumno("Pepe", 2.6));
        //Se puede eliminar también solo por índice
        //alumnoArrayList.remove(2);
        System.out.println(alumnoArrayList + ", size " + alumnoArrayList.size());

        boolean b = alumnoArrayList.contains(new Alumno("Pepe", 2.6));
        //Sale false, porque arriba eliminamos a pepe, entonces la lista no lo contiene
        System.out.println("La lista contiene a Pepe = " + b);

        //Convertir la lista en un arreglo
        Object[] objects = alumnoArrayList.toArray();
        for (int i = 0; i < objects.length; i++){
            System.out.println("Desde el arreglo se imprime: " + objects[i]);
        }

    }
}
