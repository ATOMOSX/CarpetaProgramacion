package org.juandavid.app.jardin;

import org.juandavid.app.hogar.Persona;

public class Perro {

    private String nombre;
    private String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
