package org.juand.tarea.clases.abstractas.zoologico.mamiferos;

public class Perro extends Caninos{

    private int fuerzaMordida;

    public Perro(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros comen cuando son alimentados";
    }

    @Override
    public String dormir() {
        return "Los perros duermen cuando se cansan de jugar o correr";
    }

    @Override
    public String correr() {
        return "Los perros corren cuando sienten la necesidad de atacar, jugar o comer";
    }

    @Override
    public String Comunicarse() {
        return "Los perros suelen comunicarse mediante ladridos";
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }
}
