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

    public Producto(String fabricante, String nombre, int precio) {
        this(fabricante, nombre);
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
