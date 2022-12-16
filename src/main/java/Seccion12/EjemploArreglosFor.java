package Seccion12;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "TV";
        productos[1] = "Computador todo en uno";
        productos[2] = "Iphone";
        productos[3] = "SSD";
        productos[4] = "Disco duro";
        productos[5] = "Motorola";
        productos[6] = "Moto";

        Arrays.sort(productos);

        System.out.println("===== Usando for =====");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice  " + i + ": " + productos[i]);
        }

        System.out.println("===== Usando foreach =====");
        for (String prod : productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("===== Usando While =====");
        int i = 0;
        while (i < total) {
            System.out.println("Para el indice  " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("===== Usando do While =====");
        int j = 0;
        do {
            System.out.println("Para el indice  " + j + ": " + productos[j]);
            j++;
        } while (j < total);

        System.out.println("===== Ahora llenamos el arreglo de numeros =====");

        int[] numero = new int[10];

        int totalNum = numero.length;

        for (int k = 0; k < totalNum; k++){
            numero[k] = k * 3;
        }
        
        for (int k = 0; k < totalNum; k++){
            System.out.println("numero " + (k + 1) + ": " + numero[k]);
        }

    }
}
