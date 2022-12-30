package Seccion12;

import java.util.Scanner;

public class EjemploArreglosDesplazadosPorPosicion {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int ultimo;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++){
            System.out.print("ingrese el numero: ");
            numero[i] = scanner.nextInt();
        }
        System.out.println();

        ultimo = numero[numero.length - 1];
        for (int i = numero.length - 2; i >= numero.length; i--){
            numero[i + 1] = numero[i];
        }
        numero[0] = ultimo;

        System.out.println("El arreglo: ");
        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }
    }
}
