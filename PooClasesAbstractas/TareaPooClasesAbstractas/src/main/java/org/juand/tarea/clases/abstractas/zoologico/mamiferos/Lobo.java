package org.juand.tarea.clases.abstractas.zoologico.mamiferos;

public class Lobo extends Caninos{

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitad, float altura, float largo,
                float peso, String nombreCientifico, String color,
                float tamanoColmillos, int numeroCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "Los " + nombreCientifico + " comen cuando cazan a su presa acompañado de un total de "
                + numeroCamada + " " + nombreCientifico + " de su misma especie";
    }

    @Override
    public String dormir() {
        return "Los " + nombreCientifico + " duermen cuando se sienten agotados";
    }

    @Override
    public String correr() {
        return "Los " + nombreCientifico + " corren cuando se sienten amenazados o quieres jugar con sus compañeros";
    }

    @Override
    public String Comunicarse() {
        return "Los " + nombreCientifico + " se comunican mediante aullidos en las noches ";
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public void setNumeroCamada(int numeroCamada) {
        this.numeroCamada = numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }
}
