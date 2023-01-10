package org.juand.pooclasesabstractas.form.elementos;

import org.juand.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    @Override
    public String dibujarHtml() {
        StringBuilder stringBuilder = new StringBuilder("<select ");
        stringBuilder.append("name='").append(this.nombre).append("'>");

        for (Opcion opcion: this.opciones){
            stringBuilder.append("\n <option value='").append(opcion.getValor()).append("'");
            if (opcion.isSelected()){
                stringBuilder.append(" selected");
            }
            stringBuilder.append(">").append(opcion.getNombre()).append("</option>");
        }
        stringBuilder.append("</select>");
        return stringBuilder.toString();
    }

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }
}
