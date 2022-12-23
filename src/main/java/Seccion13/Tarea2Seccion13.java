package Seccion13;

//Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a
// base del numero 1 y utilizar el numero 0 como espacio. El tamaño de la silla se basa en una variable n que
// indicará el tamaño de la figura a imprimir en una matriz de n x n.
//
//Por ejemplo para n=5 se obtiene:
//
//10000
//10000
//11111
//10001
//10001

//Por ejemplo para n=6 se obtiene:
//
//100000
//100000
//100000
//111111
//100001
//100001

//Por ejemplo para n=10 se obtiene:
//
//1000000000
//1000000000
//1000000000
//1000000000
//1000000000
//1111111111
//1000000001
//1000000001
//1000000001
//1000000001
//Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

import java.util.Scanner;

public class Tarea2Seccion13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int tamano = scanner.nextInt();
        int[][] matriz = new int[tamano][tamano];

        if (tamano == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {

                if (j == 0 || i == tamano / 2 && j != tamano - 1 || j == tamano - 1 && i >= tamano / 2) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
