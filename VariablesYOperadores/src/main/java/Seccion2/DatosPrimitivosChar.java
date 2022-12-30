package Seccion2;

public class DatosPrimitivosChar {

    public static void main(String[] args) {

        char caracter = '@';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        System.out.println("char corresponde en byte= " + Character.BYTES);
        System.out.println("char corresponde en bites= " + Character.SIZE);
        System.out.println("Character.MIN_VALUE= " + Character.MIN_VALUE);
        System.out.println("Character MAX_VALUE= " + Character.MAX_VALUE);
    }
}
