package Seccion12;

//Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
// Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
// el segundo, el antepenúltimo, el tercero, y así sucesivamente.

import java.util.Scanner;

public class Tarea1Seccion12 {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++){
            System.out.println("Ingrese un numero");
            a[i] = scanner.nextInt();
        }

        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++){
            System.out.println(a[9 - i]);
            System.out.println(a[i + 12]);
        }
    }
}
