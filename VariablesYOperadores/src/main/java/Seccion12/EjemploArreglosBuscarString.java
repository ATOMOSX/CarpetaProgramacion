package Seccion12;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un nombre: ");
            a[i] = scanner.next();
        }

        System.out.println("\nIngrese el nombre a buscar");
        String nombre = scanner.next();
        int i = 0;
        for (; i < a.length && !a[i].equalsIgnoreCase(nombre); i++ ){

        }
        if (i == a.length){
            System.out.println("No se encontro el numero");
        } else if (a[i].equalsIgnoreCase(nombre) || a[i].compareTo(nombre) == 0) {
            System.out.println("Numero encontrado en la posicion: " + i);
        }

    }
}
