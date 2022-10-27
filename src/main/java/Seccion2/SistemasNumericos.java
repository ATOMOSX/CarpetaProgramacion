package Seccion2;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroIngresado = JOptionPane.showInputDialog(null, "Ingrese su numero deseado");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroIngresado);
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero Octal es = " + numeroDecimal + " = " +Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n " + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
