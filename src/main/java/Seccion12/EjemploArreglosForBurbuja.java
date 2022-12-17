package Seccion12;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForBurbuja {
    public static void arregloInverso (String [] arreglo) {

        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - i - 1];
            arreglo[i] = inverso;
            arreglo[total - i - 1] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"TV", "Computador todo en uno", "Iphone", "SSD", "Disco duro", "Motorola", "Moto"};
        int total = productos.length;

        int contador = 0;
        for (int i = 0; i < total;i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        System.out.println("===== Usando for =====");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice  " + i + ": " + productos[i]);
        }
    }
}

