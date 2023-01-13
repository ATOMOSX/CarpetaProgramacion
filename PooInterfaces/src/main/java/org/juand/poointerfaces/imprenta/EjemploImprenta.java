package org.juand.poointerfaces.imprenta;

import org.juand.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Resumen laboral", new Persona("Juan David", "Lopez"),
                "Ingenieria de sistemas y computation");
        curriculum.addExperiencia("Java")
            .addExperiencia("PHP")
            .addExperiencia("Sql")
            .addExperiencia("Html5")
            .addExperiencia("Css");

        Libro libro = new Libro(new Persona("Juan David", "Lopez"), "Aprendiendo programacion desde 0",
                Genero.PROGRAMACION);
        libro.addPaginas(new Pagina("Programacion orientada a objetos"))
            .addPaginas(new Pagina("Interfaces"))
            .addPaginas(new Pagina("Clases abstractas"));


        Informe informe = new Informe("Estudio sobre micro servicios", new Persona("Daniela", "Gomez"),
                new Persona("Sasha", "Lopez"));

        Imprimible.imprimir(curriculum);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        //Creamos una clase anonima al vuelo
        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo un objeto generico de la clase anonima";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }
}
