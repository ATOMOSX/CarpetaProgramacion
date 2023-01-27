package org.juand.ejemplos.set;

import org.juand.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {

        //iteramos usando el HashSet
        LinkedList<Alumno> alumnoLinkedList = new LinkedList<>();
        System.out.println(alumnoLinkedList + ", size " + alumnoLinkedList.size());
        System.out.println("Esta vacia = " + alumnoLinkedList.isEmpty());
        alumnoLinkedList.add(new Alumno("Juan", 5.0));
        alumnoLinkedList.add(new Alumno("Daniela", 4.8));
        alumnoLinkedList.add(new Alumno("Pepe", 2.6));
        alumnoLinkedList.add(new Alumno("Zeus", 1.4));
        alumnoLinkedList.add(new Alumno("Zeus", 4.6));
        System.out.println(alumnoLinkedList + ", size " + alumnoLinkedList.size());

        //Aqui en estos metodos agregamos un alumno al inicio y al final de la lista
        alumnoLinkedList.addFirst(new Alumno("Sasha", 5.0));
        alumnoLinkedList.addLast(new Alumno("Eileen", 4.9));
        System.out.println(alumnoLinkedList + ", size " + alumnoLinkedList.size());

        //imprimimos los alumnos
        System.out.println("Primero " + alumnoLinkedList.getFirst());
        System.out.println("Ultimo " + alumnoLinkedList.getLast());
        System.out.println("Con indice 4 " + alumnoLinkedList.get(4));

        //removemos los alumnos del inicio y final de la lista y también un alumno en específico
        alumnoLinkedList.removeFirst();
        alumnoLinkedList.removeLast();
        alumnoLinkedList.remove(new Alumno("Daniela", 4.8 ));
        //Estos metodos son muy similares al remove, la diferencia es que estos no tienen
        //una exception por si la lista esta vacia, solo manda que es null
        //Alumno sasha = alumnoLinkedList.pop();
        //alumnoLinkedList.pollLast();
        System.out.println(alumnoLinkedList + ", size " + alumnoLinkedList.size());

        Alumno alumno = new Alumno("Lucas", 4.8);
        alumnoLinkedList.addLast(alumno);
        System.out.println("Indice de lucas: " + alumnoLinkedList.indexOf(alumno));

        alumnoLinkedList.remove(2);
        System.out.println(alumnoLinkedList + ", size = " + alumnoLinkedList.size());
        System.out.println("Indice de lucas= " +  alumnoLinkedList.indexOf(alumno));

        //Aqui con el set podemos modificar cualquier posicion que queramos, solo tenemos
        //que agregar los datos que se necesitan
        alumnoLinkedList.set(2, new Alumno("Lalo", 4.0));
        System.out.println(alumnoLinkedList + ", size = " + alumnoLinkedList.size());

    }
}
