package Seccion12;

//Escribir un programa que recorra un arreglo y genere un histograma con base en los valores de este.
//El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
//Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos,
// es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.
//Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
//
//1: ***
//2:
//3: *
//4: *****
//5: *
//6: **
//Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.

import java.util.Scanner;

public class Tarea5Seccion12 {
    public static void main(String[] args) {

        int[] numero = new int[12];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++){
            System.out.println("Ingrese un numero del 1 al 6: ");
            numero[i] = scanner.nextInt();

            if (numero[i] < 1 || numero[i] > 6){
                System.err.println("Error, debe ingresar un numero del 1 al 6");
                System.exit(1);
            }
        }

        String[] histograma = new String[6];

        for (int i = 0; i < histograma.length; i++){
            int mostrarNum = i + 1;
            StringBuilder separadorHistograma = new StringBuilder(mostrarNum + ": ");

            for (int j = 0; j < histograma.length; j++){

                if (mostrarNum == numero[i]){
                    separadorHistograma.append("*");
                }
            }
            histograma[i] = separadorHistograma.toString();
        }

        for (String s : histograma) {
            System.out.println(s);
        }
    }
}
