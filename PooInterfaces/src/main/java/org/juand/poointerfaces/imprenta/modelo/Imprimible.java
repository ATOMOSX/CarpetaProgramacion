package org.juand.poointerfaces.imprenta.modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    //No se agrega public porque siempre debería ser público, nos marcaría un warning
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
