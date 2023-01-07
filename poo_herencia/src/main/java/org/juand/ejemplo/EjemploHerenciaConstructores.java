package org.juand.ejemplo;

import org.juand.pooherencia.*;

public class EjemploHerenciaConstructores {
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

        System.out.println("Imprimiendo los datos del tipo persona:");
        System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() +
                " Edad: " + persona.getEdad() + " Email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo alumno:");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("========= Sobre escritura, promedio =========");
            System.out.println(((Alumno) persona).calcularPromedio());
            //System.out.println("=============================================");
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo profesor:");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("========= Sobre escritura, saludar =========");
        System.out.println(persona.saludar());
    }
}
