package org.juand.compania;

public class Empleado extends Persona{

    private double remuneracion;
    private int idEmpleado;

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String numeroFiscal, double remuneracion, int idEmpleado) {
        super(nombre, apellido, numeroFiscal);
        this.remuneracion = remuneracion;
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int idEmpleado) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.idEmpleado = idEmpleado;
    }

    public double aumentarRemuneracion(int porcentaje){
        double remuneracion = (this.remuneracion * porcentaje) / 100;
        return remuneracion;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nremuneracion = " + remuneracion +
                ", idEmpleado = " + idEmpleado;
    }
}
