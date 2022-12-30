package Seccion3;

public class StringExtensionArchivo {

    public static void main(String[] args) {

        String archivo= "alguna imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo = " + archivo.substring(i + 1));
        System.out.println("imagen.length() = " + archivo.length());

    }
}
