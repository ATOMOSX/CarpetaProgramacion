package org.juand.poointerfaces.imprenta;

import org.juand.poointerfaces.imprenta.modelo.Curriculum;
import org.juand.poointerfaces.imprenta.modelo.Hoja;
import org.juand.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Resumen laboral", "Juan David", "Ingenieria de sistemas y computation");
        curriculum.addExperiencia("Java");
        curriculum.addExperiencia("PHP");
        curriculum.addExperiencia("Sql");
        curriculum.addExperiencia("Html5");
        curriculum.addExperiencia("Css");

        Informe informe = new Informe("Estudio sobre micro servicios", "Daniela Gomez", "Sasha");

        imprimir(curriculum);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
