package org.juand.tarea.clases.abstractas.zoologico.mamiferos;

abstract public class Mamifero {

    protected String habitad;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero(String habitad, float altura, float largo, float peso) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public Mamifero(String habitad, float altura, float largo, float peso, String nombreCientifico) {
        this(habitad, altura, largo, peso);
        this.nombreCientifico = nombreCientifico;
    }
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String Comunicarse();

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
}
