package org.juandavid.app.jardin;

import org.juandavid.app.hogar.*;

import static org.juandavid.app.hogar.Persona.*;

import static org.juandavid.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //org.juandavid.app.hogar.Persona persona = new org.juandavid.app.hogar.Persona();

        Persona persona = new Persona();
        persona.setNombre("Juan David");
        persona.setApellido("Lopez Muñoz");
        persona.setColorPelo(CAFE);
        System.out.println("persona = " + persona.getNombre() + " " + persona.getApellido());

        Perro perro = new Perro();
        perro.setNombre("Sasha");
        perro.setRaza("Criollita");

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = sludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
