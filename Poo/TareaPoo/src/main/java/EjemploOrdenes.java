import Cliente.Cliente;
import Producto.Producto;

import java.util.*;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra compraDeZapatos = new OrdenCompra("Compra de zapatos");
        compraDeZapatos.setCliente(new Cliente("Juan", "David"));
        compraDeZapatos.setFecha(new Date());

        compraDeZapatos.addProducto(new Producto("Addidas", "F-50", 450460));
        compraDeZapatos.addProducto(new Producto("Puma", "Puma elite", 320515));
        compraDeZapatos.addProducto(new Producto("Nike", "Mercurial", 689120));

        OrdenCompra compraDeMotos = new OrdenCompra("Se compra motos de bajo hasta alto cilindraje");
        compraDeMotos.setCliente(new Cliente("Daniela", "Gomez"));
        compraDeMotos.setFecha(new Date());

        compraDeMotos.addProducto(new Producto("Yamaha", "R7", 45123546));
        compraDeMotos.addProducto(new Producto("AKT", "CR4", 5492150));
        compraDeMotos.addProducto(new Producto("Benelli", "180s", 14560120));

        OrdenCompra compraDeCelulares = new OrdenCompra("Se compra todo tipo de celulares");
        compraDeCelulares.setCliente(new Cliente("David", "Muñoz"));
        compraDeCelulares.setFecha(new Date());

        compraDeCelulares.addProducto(new Producto("Samsung", "S22", 4320160));
        compraDeCelulares.addProducto(new Producto("Iphone", "13", 4200000));
        compraDeCelulares.addProducto(new Producto("Xiaomi", "Mi11T Pro", 2806150));

        OrdenCompra[] ordenes = {compraDeZapatos, compraDeMotos, compraDeCelulares};

        for (OrdenCompra ordenCompra : ordenes){

            System.out.println("Cliente: " + ordenCompra.getCliente());
            System.out.println("Descripcion: " + ordenCompra.getDescripcion());
            System.out.println("Fecha: " + ordenCompra.getFecha());
            //System.out.println("Total: " + ordenCompra.obtenerTotal());

            int i = 0;
            for (Producto producto : ordenCompra.getProductos()){
                System.out.print("Producto " + i + ": " + producto.getNombre() + " ");
                System.out.print(producto.getFabricante() + " precio" + " ");
                System.out.print(producto.getPrecio() + " Pesos colombianos ");
                System.out.println();
                i++;
            }
        }
    }
}
