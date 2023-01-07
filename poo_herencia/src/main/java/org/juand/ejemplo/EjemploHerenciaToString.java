package org.juand.ejemplo;

import org.juand.pooherencia.Alumno;
import org.juand.pooherencia.AlumnoInternacional;
import org.juand.pooherencia.Persona;
import org.juand.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("========= Creando la instancia de la clase alumno =========");
        Alumno alumno = new Alumno("Juan David", "Lopez Muñoz", 22, "I.E Marcelino Champagnat");
        alumno.setNotaCastellano(4.2);
        alumno.setNotaHistoria(3.2);
        alumno.setNotaMatematica(3.0);
        alumno.setEmail("sigfrid2912@hotmail.es");
        imprimir(alumno);
        System.out.println();

        System.out.println("========= Creando la instancia de la clase alumno internacional =========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Inszk", "Rusia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("I.E Marcelino Champagnat");
        alumnoInternacional.setNotaIdiomas(3.9);
        alumnoInternacional.setNotaCastellano(3.0);
        alumnoInternacional.setNotaHistoria(4.9);
        alumnoInternacional.setNotaMatematica(4.2);
        alumnoInternacional.setEmail("petiuskirosky@hotmail.com");
        imprimir(alumnoInternacional);
        System.out.println();

        System.out.println("========= Creando la instancia de la clase profesor =========");
        Profesor profesor = new Profesor("Daniela", "Gomez", "Matematicas");
        profesor.setEdad(23);
        profesor.setEmail("danielag@colegio.edu.co");
        imprimir(profesor);

        System.out.println("=============================================");

    }

    public static void imprimir(Persona persona) {

        System.out.println(persona);
    }
}
