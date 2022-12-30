package Seccion4;

import java.util.Scanner;

public class Tarea2Seccion4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual de litros");
        int litros = scanner.nextInt();

        if (litros >= 0 && litros < 20){
            System.out.println("Capacidad insuficiente");
        } else if (litros >= 20 && litros < 35) {
            System.out.println("Capacidad suficiente");
        } else if (litros >= 35 && litros <40) {
            System.out.println("Capacidad a medio estanque");
        } else if (litros >= 40 && litros <60) {
            System.out.println("Capacidad de estanque en 3/4");
        } else if (litros >= 60 && litros < 70) {
            System.out.println("Capacidad de estanque casi lleno");
        } else if (litros == 70) {
            System.out.println("Capacidad de estanque lleno");
        }

    }
}
