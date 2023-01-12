package org.juand.pooclasesabstractas.form.validador;

public class LargoValidadoer extends Validador{

    protected String mensaje = "El campo %s debe tener un minimo %d caracteres  y maximo %d caracteres";
    private int minimo;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidadoer() {
    }

    public LargoValidadoer(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje = String.format(this.mensaje, this.minimo, this.maximo);
        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= minimo && largo <= minimo);
    }

    public String getMensajeFormateado(String campo){
        return String.format(this.mensaje, campo ,this.minimo, this.maximo);
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
}
