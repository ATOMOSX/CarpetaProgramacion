package org.juand.tarea.clases.abstractas.zoologico;

public class Guepardo extends Felinos{

    public Guepardo(String habitad, float altura, float largo,
                    float peso, String nombreCientifico,
                    float tamanoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los guepardos comen cuando cazan a su presa";
    }

    @Override
    public String dormir() {
        return "Los guepardos duermen cuando se sienten canzados";
    }

    @Override
    public String correr() {
        return "los guepardos solo corren para caza, ya que tratan de ser solitarios";
    }

    @Override
    public String Comunicarse() {
        return "Los guepardos se comunican con otra especie";
    }
}
