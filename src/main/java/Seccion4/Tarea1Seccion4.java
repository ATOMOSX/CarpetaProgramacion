package Seccion4;

import java.util.Scanner;

public class Tarea1Seccion4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int numero2 = scanner.nextInt();

        String mayor = numero1 > numero2 ? numero2 + " y " + numero1
                : numero1 + " y " + numero2;
        System.out.println("El número de menor a mayor es = " + mayor);
    }
}
