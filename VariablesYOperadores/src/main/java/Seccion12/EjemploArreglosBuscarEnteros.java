package Seccion12;

import java.util.Scanner;

public class EjemploArreglosBuscarEnteros {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese el numero a buscar");
        int numero = scanner.nextInt();

        int i = 0;
        while (i < a.length && a[i] != numero){
            i++;
        }

        if (i == a.length){

            System.out.println("No se encontro el numero");
        } else if (a[i] == numero) {

            System.out.println("Numero encontrado en la posicion: " + i);
        }
    }
}
