package Seccion12;

import java.util.Scanner;

public class EjemploArreglosDesplazadosPorPosicion2 {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int elemento, posicion;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numero.length - 1; i++){
            System.out.print("ingrese el numero: ");
            numero[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento: ");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar el elemento de 0 a 9");
        posicion = scanner.nextInt();

        for (int i = numero.length - 2; i >= posicion; i--){
            numero[i + 1] = numero[i];
        }
        numero[posicion] = elemento;

        System.out.println("El arreglo: ");
        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }
    }
}
