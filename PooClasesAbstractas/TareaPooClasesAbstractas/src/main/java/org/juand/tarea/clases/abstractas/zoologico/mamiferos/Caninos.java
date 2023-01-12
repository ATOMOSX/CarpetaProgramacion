package org.juand.tarea.clases.abstractas.zoologico.mamiferos;

abstract public class Caninos extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Caninos(String habitad, float altura, float largo, float peso) {
        super(habitad, altura, largo, peso);
    }

    public Caninos(String habitad, float altura, float largo, float peso, String nombreCientifico) {
        super(habitad, altura, largo, peso, nombreCientifico);
    }

    public Caninos(String habitad, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitad, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public Caninos(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }
}
