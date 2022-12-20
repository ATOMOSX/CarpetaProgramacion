package Seccion12;

import java.util.Scanner;

public class EjemploArreglosDesplazadosPorPosicion2b {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int elemento, posicion, ultimo;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++){
            System.out.print("ingrese el numero: ");
            numero[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento: ");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar el elemento de 0 a 9");
        posicion = scanner.nextInt();

        ultimo = numero[numero.length - 1];
        for (int i = numero.length - 2; i >= posicion; i--){
            numero[i + 1] = numero[i];
        }
        int[] b = new int[numero.length + 1];
        System.arraycopy(numero, 0, b, 0, numero.length);

        b[posicion] = elemento;
        b[b.length - 1] = ultimo;

        System.out.println("El arreglo: ");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
