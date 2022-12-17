package Seccion12;

public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length;i++){
            a[i] = i+1;
        }

        for (int i = 0; i < b.length; i++){
            b[i] = (i+1) * 5;
        }

        int aux = 0;
        for (int i = 0; i < 10; i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++){
            System.out.println( (i + 1) + ": " + c[i]);
        }
    }
}
