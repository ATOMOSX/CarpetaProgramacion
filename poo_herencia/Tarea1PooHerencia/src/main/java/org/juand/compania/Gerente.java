package org.juand.compania;

public class Gerente extends  Empleado{

    private double presupuesto;

    public Gerente() {

    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int idEmpleado, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, idEmpleado);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "presupuesto = " + presupuesto;
    }
}
