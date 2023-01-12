package org.juand.tarea.clases.abstractas.zoologico.mamiferos;


public class Tigre extends Felinos {

    private String especieTigre;

    public Tigre(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre come cuando los cuidadores le dan de alimentar";
    }

    @Override
    public String dormir() {
        return "El tigre come cuando siente cansancio de tanta actividad física";
    }

    @Override
    public String correr() {
        return "El tigre corre cuando siente la necesidad de jugar con sus otros amigos";
    }

    @Override
    public String Comunicarse() {
        return "El tigre trata de comunicarse con otras especies de tigres por ejemplo un: " + especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }
}
