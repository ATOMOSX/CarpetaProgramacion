package org.juand.pooclasesabstractas.form.elementos;

import org.juand.pooclasesabstractas.form.validador.LargoValidadoer;
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
                if (validador instanceof LargoValidadoer){
                    this.errores.add(((LargoValidadoer) validador).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(validador.getMensaje(), nombre));
                }
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

    public String getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract public String dibujarHtml();
}
