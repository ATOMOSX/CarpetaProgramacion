package Seccion12;

//Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
// Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también
// imprimir la cantidad de veces que aparece en el arreglo.
//
//Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
//
//Como resultado debería imprimir lo siguiente:
//
//La mayor ocurrencias es: 3
//El elemento que más se repite es: 5
//En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.

import java.util.Scanner;

public class Tarea4Seccion12 {
    public static void main(String[] args) {

        int[] numero = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Por favor ingrese un numero de 1 a 9");
            numero[i] = scanner.nextInt();

            if (numero[i] < 0 || numero[i] > 10){
                System.err.println("Error debe ingresar un numero de 1 a 9");
                System.exit(1);
            }
        }

        int[] ocurrencias = new int[10];

        for (int i = 0; i < numero.length; i++){
            int acumulador = 0;
            for (int k : numero) {
                if (numero[i] == k) {
                    acumulador++;
                }
            }
            ocurrencias[i] = acumulador;
        }

        int indOcurren = 0, maximo = 0;

        for (int i = 0; i < 10; i++){
            if(maximo < ocurrencias[i]){
                maximo = ocurrencias[i];
                indOcurren = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + maximo);
        System.out.println("El elemento que mas se repite es: " + numero[indOcurren]);
        System.out.println("el elemento " + numero[indOcurren] + " esta repetido " + maximo + " veces");
    }
}
