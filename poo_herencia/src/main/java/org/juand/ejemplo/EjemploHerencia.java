package org.juand.ejemplo;

import org.juand.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Juan David");
        alumno.setApellido("Lopez Muñoz");
        alumno.setInstitucion("I.E Marcelino Champagnat");
        Profesor profesor = new Profesor();
        profesor.setNombre("Daniela");
        profesor.setApellido("Gomez");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() +
                " " + alumno.getInstitucion());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() +
                " " + profesor.getApellido() + " " );
    }
}
