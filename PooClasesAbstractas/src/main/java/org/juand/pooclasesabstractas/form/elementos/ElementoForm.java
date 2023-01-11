package org.juand.pooclasesabstractas.form.elementos;

import org.juand.pooclasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadors;
    private List<String> errores;

    public ElementoForm() {
        this.validadors = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadors.add(validador);
        return this;
    }

    public boolean esValido(){
        for (Validador validador : this.validadors){
            if (!validador.esValido(this.valor)){
                this.errores.add(validador.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getErrores() {
        return errores;
    }

    abstract public String dibujarHtml();
}
