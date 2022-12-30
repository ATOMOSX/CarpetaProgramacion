package Seccion12;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int [] a, pares, impares;

        a = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros");

        int totalPares = 0, totalImpares = 0;

        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){

            if (a[i] % 2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int controlPares = 0;
        int controlImpares = 0;

        for (int i = 0; i < a.length; i++){

            if (a[i] % 2 == 0){
                pares[controlPares++] = a[i];
            }else {
                impares[controlImpares++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }

        System.out.println();
    }
}
