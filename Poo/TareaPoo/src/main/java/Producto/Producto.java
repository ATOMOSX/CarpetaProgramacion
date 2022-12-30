package Producto;

public class Producto {

    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(){

    }

    public Producto(String fabricante, String nombre) {
        this.fabricante = fabricante;
        this.nombre = nombre;
    }

    public Producto(int precio, String fabricante, String nombre) {
        this(fabricante, nombre);
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
