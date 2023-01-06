package org.juand.pooherencia;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: inicializando constructor...");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
