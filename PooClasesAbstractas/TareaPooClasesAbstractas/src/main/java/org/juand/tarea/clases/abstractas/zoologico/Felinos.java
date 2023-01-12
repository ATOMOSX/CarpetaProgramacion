package org.juand.tarea.clases.abstractas.zoologico;

abstract public class Felinos extends Mamifero{

    protected float tamanoGarras;
    protected int velocidad;

    public Felinos(String habitad, float altura, float largo, float peso) {
        super(habitad, altura, largo, peso);
    }

    public Felinos(String habitad, float altura, float largo, float peso, String nombreCientifico) {
        super(habitad, altura, largo, peso, nombreCientifico);
    }

    public Felinos(String habitad, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felinos(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
