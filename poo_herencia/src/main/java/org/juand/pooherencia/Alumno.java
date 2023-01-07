package org.juand.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor...");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematica, double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        return super.saludar() + ", soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("Calcular promedio " + getClass().getCanonicalName());
        return (notaCastellano + notaHistoria + notaMatematica) / 3;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
