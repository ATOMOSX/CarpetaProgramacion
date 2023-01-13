package org.juand.poointerfaces.imprenta;

import org.juand.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Resumen laboral", "Juan David", "Ingenieria de sistemas y computation");
        curriculum.addExperiencia("Java");
        curriculum.addExperiencia("PHP");
        curriculum.addExperiencia("Sql");
        curriculum.addExperiencia("Html5");
        curriculum.addExperiencia("Css");

        Libro libro = new Libro("Juan David", "Aprendiendo programacion desde 0", Genero.PROGRAMACION);
        libro.addPaginas(new Pagina("Programacion orientada a objetos"));
        libro.addPaginas(new Pagina("Interfaces"));
        libro.addPaginas(new Pagina("Clases abstractas"));


        Informe informe = new Informe("Estudio sobre micro servicios", "Daniela Gomez", "Sasha");

        imprimir(curriculum);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
