package Seccion12;

import java.util.Arrays;

public class EjemploArregloString {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "TV";
        productos[1] = "Computador todo en uno";
        productos[2] = "Iphone";
        productos[3] = "SSD";
        productos[4] = "Disco duro";
        productos[5] = "Motorola";
        productos[6] = "Moto";

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];
        String producto4 = productos[3];
        String producto5 = productos[4];
        String producto6 = productos[5];
        String producto7 = productos[6];

        Arrays.sort(productos);

        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + producto3);
        System.out.println("productos[3] = " + producto4);
        System.out.println("productos[4] = " + producto5);
        System.out.println("productos[5] = " + producto6);
        System.out.println("productos[6] = " + producto7);

        int [] numero = new int[4];

        numero[0] = 4;
        numero[1] = 5;
        numero[2] = 1;
        numero[3] = -1;

        Arrays.sort(numero);

        int i = numero[0];
        int j = numero[1];
        int k = numero[2];
        int l = numero[3];
        int largo = numero[numero.length -1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("largo = " + largo);
    }
}
