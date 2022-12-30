package Seccion12;

//Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
// el promedio de los negativos y contar el número de ceros.

import java.util.Scanner;

public class Tarea3Seccion12 {
    public static void main(String[] args) {

        int[] numero = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            System.out.println("Ingrese un numero entero y al menos un numero negativo: ");
            numero[i] = scanner.nextInt();
        }

        int positivo = 0, negativo = 0;
        int cantPositivos = 0, cantNegativo = 0, cantCeros = 0;

        for (int i = 0; i < numero.length; i++){
            if (numero[i] >= 1){
                positivo = positivo + numero[i];
                cantPositivos++;
            } else if (numero[i] <= -1) {
                negativo = negativo + numero[i];
                cantNegativo++;
            } else if (numero[i] == 0) {
                cantCeros++;
            }
        }

        int promPositivos = positivo / cantPositivos;
        int promNegativos = negativo / cantNegativo;

        System.out.println("La cantidad de numero positivos es de: " + cantPositivos);
        System.out.println("Con un promedio de positivos del: " + promPositivos);
        System.out.println();
        System.out.println("La cantidad de numeros negativos es de: " + cantNegativo);
        System.out.println("Con un promedio de negativos del: " + promNegativos);
        System.out.println();
        System.out.println("La cantidad de ceros fue de: " + cantCeros);
    }
}
