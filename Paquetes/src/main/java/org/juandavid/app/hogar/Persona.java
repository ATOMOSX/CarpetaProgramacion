package org.juandavid.app.hogar;

public class Persona {

    private String nombre;
    private String apellido;

    public String lanzarPelota(){
        return "Lanza la pelota al perro";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido){
        this(nombre);
        this.apellido = apellido;
    }

    public Persona (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
