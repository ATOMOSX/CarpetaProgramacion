package org.juand.appfacturas;

import org.juand.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("1010065872-5");
        cliente.setNombre("Juan David");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la description de la factura: ");
        Factura factura = new Factura(scanner.nextLine(), cliente);

        Producto producto;
        System.out.println();

        for (int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto N° " + producto.getCodigo() + " : ");
            producto.setNombre(scanner.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextInt());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
        }
        System.out.println(factura);
    }
}
