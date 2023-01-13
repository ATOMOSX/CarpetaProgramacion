package org.juand.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder stringBuilder = new StringBuilder("Nombre: ");
        stringBuilder.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ").append(carrera)
                .append("\n").append("Experiencias: ").append("\n");
        for (String experiencias : this.experiencias){
            stringBuilder.append("- ").append(experiencias).append("\n");
        }
        return stringBuilder.toString();
    }
}
