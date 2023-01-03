import Cliente.Cliente;
import Producto.Producto;

import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private static int uId;
    private int indc;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = uId++;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public OrdenCompra addProducto(Producto producto){
        if (indc < this.productos.length){
            this.productos[indc++] = producto;
        }
        return this;
    }

    public int obtenerTotal (){
        int total = 0;
        for (Producto producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }

    public static int getuId() {
        return uId;
    }

    public static void setuId(int uId) {
        OrdenCompra.uId = uId;
    }

    public int getIndc() {
        return indc;
    }

    public void setIndc(int indc) {
        this.indc = indc;
    }
}
