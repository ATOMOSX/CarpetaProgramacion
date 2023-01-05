package org.juand.ejemplo;

import org.juand.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Juan David");
        alumno.setApellido("Lopez Muñoz");
        alumno.setInstitucion("I.E Marcelino Champagnat");
        alumno.setNotaCastellano(4.2);
        alumno.setNotaHistoria(3.2);
        alumno.setNotaMatematica(3.0);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Inszk");
        alumnoInternacional.setPais("Rusia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("I.E Marcelino Champagnat");
        alumnoInternacional.setNotaIdiomas(3.9);
        alumnoInternacional.setNotaCastellano(3.0);
        alumnoInternacional.setNotaHistoria(4.9);
        alumnoInternacional.setNotaMatematica(4.2);

        Profesor profesor = new Profesor();
        profesor.setNombre("Daniela");
        profesor.setApellido("Gomez");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() +
                " " + alumno.getInstitucion());
        System.out.println("Alumno: " + alumnoInternacional.getNombre() + " " + alumnoInternacional.getApellido() +
                " " + alumnoInternacional.getInstitucion() + " " + alumnoInternacional.getPais());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() +
                " " + profesor.getApellido() + " " );

        Class claseAlumnoInternacional = alumnoInternacional.getClass();

        while (claseAlumnoInternacional.getSuperclass() != null){
            String hija = claseAlumnoInternacional.getName();
            String padre = claseAlumnoInternacional.getSuperclass().getName();
            System.out.println(hija + " Es una clase hija de la clase padre " + padre);
            claseAlumnoInternacional = claseAlumnoInternacional.getSuperclass();
        }
    }
}
