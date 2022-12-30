package Seccion13;

public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numero = new int[2][4];

        numero[0][0] = 1;
        numero[0][1] = 2;
        numero[0][2] = 3;
        numero[0][3] = 4;

        numero[1][0] = 11;
        numero[1][1] = 12;
        numero[1][2] = 13;
        numero[1][3] = 14;

        System.out.println("numero de filas: " + numero.length);
        System.out.println("Numero de columnas: " + numero[0].length);

        System.out.println("Primer elemento de la matriz: " + numero[0][0]);
        System.out.println("Ultimo elemento: " + numero[numero.length - 1][numero[1].length - 1]);

        int num1 = numero[0][0];
        int num2 = numero[0][1];
        int num3 = numero[0][2];
        int num4 = numero[0][3];

        int num5 = numero[1][1];
        int num6 = numero[1][2];
        int num7 = numero[1][3];
        int num8 = numero[1][4];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num6 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
