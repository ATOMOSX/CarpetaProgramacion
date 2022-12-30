import Cliente.Cliente;
import Producto.Producto;

import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
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

    public Cliente.Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto.Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public OrdenCompra addProducto(Producto producto){
        if (producto < productos.length){
            this.productos[producto++] = producto;
        }
        return this;
    }
}
