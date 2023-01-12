package org.juand.tarea.clases.abstractas.zoologico;

public class Leon extends Felinos{

    private int numeroManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitad, float altura, float largo, float peso,
                String nombreCientifico, float tamanoGarras, int velocidad,
                int numeroManada, float potenciaRugidoDecibel) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String habitad, float altura, float largo, float peso,
                String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los leones comen cuando cazan a su presa";
    }

    @Override
    public String dormir() {
        return "Los leones duermen cuando sienten la necesidad de dormir, pero tratan de hacerlo en manada, " +
                "para no estar vulnerables, la manada suele ser de " + numeroManada;
    }

    @Override
    public String correr() {
        return "Los leones corren para cazar, jugar, etc" +
                "\n tratan de hacerlo en manada";
    }

    @Override
    public String Comunicarse() {
        return "Los leones tratan de comunicarse con un rugido, este puede alcanzar " +
                potenciaRugidoDecibel + " decibeles";
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
}
