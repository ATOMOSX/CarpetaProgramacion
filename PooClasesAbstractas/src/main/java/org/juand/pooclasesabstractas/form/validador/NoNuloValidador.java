package org.juand.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "El campo %s no puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}
