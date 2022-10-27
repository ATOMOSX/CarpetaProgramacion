package Seccion3;

public class StringValidar {

    public static void main(String[] args) {

        String curso =  " "; //null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if (esNulo){

            curso = "Programacion java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esVacio3 = curso.isBlank();
        System.out.println("esVacio3 = " + esVacio3);

        if (!esVacio3) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
