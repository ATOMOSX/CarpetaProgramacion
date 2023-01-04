package org.juandavid.app;

import org.juandavid.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //org.juandavid.app.hogar.Persona persona = new org.juandavid.app.hogar.Persona();

        Persona persona = new Persona();
        persona.setNombre("Juan David");
        System.out.println("persona = " + persona.getNombre());

        Gato gato = new Gato();

    }
}
