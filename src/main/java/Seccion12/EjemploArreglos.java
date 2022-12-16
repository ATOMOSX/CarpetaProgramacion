package Seccion12;

public class EjemploArreglos {
    public static void main(String[] args) {

        int [] numero = new int[4];

        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;

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
