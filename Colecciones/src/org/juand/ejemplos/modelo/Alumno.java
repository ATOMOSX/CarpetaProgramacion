package org.juand.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private Double nota;

    public Alumno() {
    }

    public Alumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " , nota: " + nota;
    }

    @Override
    public int compareTo(Alumno alumno) {
        //Para comparar por nombre
        /*
        if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(alumno.nombre);

         */

        //Para comparar por nota
        if (this.nota == alumno.nota){
            return 0;
        }
        if (this.nota > alumno.nota){
            return 1;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
