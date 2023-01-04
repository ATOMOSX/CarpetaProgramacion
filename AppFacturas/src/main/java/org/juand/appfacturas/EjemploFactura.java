package org.juand.appfacturas;

import org.juand.appfacturas.modelo.Cliente;
import org.juand.appfacturas.modelo.Factura;
import org.juand.appfacturas.modelo.ItemFactura;
import org.juand.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("1010065872-5");
        cliente.setNombre("Juan David");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la description de la factura: ");
        String description = scanner.nextLine();
        Factura factura = new Factura(description, cliente);

        Producto producto;
        String nombre;
        int precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto N° " + producto.getCodigo() + " : ");
            nombre = scanner.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = scanner.nextInt();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
