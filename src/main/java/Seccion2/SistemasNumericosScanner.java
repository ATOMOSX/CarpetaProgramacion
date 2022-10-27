package Seccion2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero deseado");
        //String numeroIngresado = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal =scanner.nextInt(); //Integer.parseInt(numeroIngresado);
        }catch (InputMismatchException e){

            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero Octal es = " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);

        String resultadoHexa = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n " + resultadoHexa;
        System.out.println(mensaje);
    }
    
}
