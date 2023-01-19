package org.juand.poo.exeption.ejemplo;

import javax.swing.*;

public class Ejemplo {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;

        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println("EL resultado es: " + division);
        }catch (NumberFormatException nfe) {
            System.out.println("Se detecto un error, por favor ingrese un valor numerico " + nfe.getMessage());
            main(args);
        }catch (ArithmeticException ae) {
            System.err.println("No se puede dividir, capturamos la exeption " +
                    "en tiempo de ejecucion : " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin exeption");
        }
    }
}
