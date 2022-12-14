package Seccion10;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-1);
        System.out.println("absoluto = " + absoluto);

        double maximo = Math.max(3.5 , 9.16);
        System.out.println("maximo = " + maximo);

        double minimo = Math.min(-3.6 , 0.15);
        System.out.println("minimo = " + minimo);

        double techo = Math.ceil(3.11145);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.151);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        long entero2 = Math.round(Math.PI);
        System.out.println("entero2 = " + entero2);

    }
}
