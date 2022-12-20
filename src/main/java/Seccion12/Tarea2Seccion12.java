package Seccion12;

//Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
// (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un
// valor considerar uno solo.

public class Tarea2Seccion12 {
    public static void main(String[] args) {

        int[] a = {12, 13, 14, 15, 16, 56, 22};
        int max = 0;

        for (int i = 0; i < 7; i++){

            max = (max > a[i]) ? max : a[i];
        }
        System.out.println("El valor mas alto es: " + max);
    }
}

