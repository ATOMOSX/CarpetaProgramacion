package org.juand.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Juan David");
        alumno.setApellido("Lopez Muñoz");

        Profesor profesor = new Profesor();
        profesor.setNombre("Daniela");
        profesor.setApellido("Gomez");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + " ");
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() +
                " " + profesor.getApellido() + " " );
    }
}
