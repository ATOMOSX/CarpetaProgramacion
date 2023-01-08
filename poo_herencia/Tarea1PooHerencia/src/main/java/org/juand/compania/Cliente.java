package org.juand.compania;

public class Cliente extends Persona {

    private int idCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int idCliente) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nidCliente = " + idCliente;
    }
}
