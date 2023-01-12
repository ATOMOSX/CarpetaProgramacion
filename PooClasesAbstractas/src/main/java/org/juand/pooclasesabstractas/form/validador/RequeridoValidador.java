package org.juand.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "El campo %s es requerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
    }
}
