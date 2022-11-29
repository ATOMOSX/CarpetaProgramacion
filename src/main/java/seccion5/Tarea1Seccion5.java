package seccion5;

import java.util.Scanner;

public class Tarea1Seccion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los numeros que vamos a comparar");

        int cantidad = scanner.nextInt();
        int contador = 10;

        if (cantidad > contador) {

            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cantidad; i++){
                System.out.println("ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }
            System.out.println("El  numero menor es: " + menor);

            if (menor < contador){
                System.out.println("El numero: " + menor + " es menor que 10");
            }else {
                System.out.println("El numero: " + menor + " es igual o mayor a 10");
            }
        }else {
            System.out.println("Debe ingresar al menos 10 numeros para poder compararlos");
        }
    }
}
