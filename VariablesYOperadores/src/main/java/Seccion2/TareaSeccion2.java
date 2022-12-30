package Seccion2;
import java.util.Scanner;

public class TareaSeccion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese datos de la factura");
        String datos = scanner.nextLine();

        System.out.println("Ingrese primer precio de la factura");
        double precioIngresado1 = scanner.nextDouble();

        System.out.println("Ingrese segundo precio de la factura");
        double precioIngresado2 = scanner.nextDouble();

        double totalBruto = precioIngresado1 + precioIngresado2;
        double impuesto = totalBruto * 0.19;
        double total = totalBruto + impuesto;

        String detalle = "La factura " + datos + "Tiene un total de " + total;
        System.out.println(detalle);



    }
}
