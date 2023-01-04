package org.juandavid.app.jardin;

import org.juandavid.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //org.juandavid.app.hogar.Persona persona = new org.juandavid.app.hogar.Persona();

        Persona persona = new Persona();
        persona.setNombre("Juan David");
        persona.setApellido("Lopez Muñoz");
        System.out.println("persona = " + persona.getNombre() + " " + persona.getApellido());

        Gato gato = new Gato();

        Perro perro = new Perro();
        perro.setNombre("Sasha");
        perro.setRaza("Criollita");

    }
}
