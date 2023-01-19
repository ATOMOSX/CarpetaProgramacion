package org.juand.poo.exeption.ejemplo;

import javax.swing.*;

public class Ejemplo {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        double division;


        try {
            divisor = Integer.parseInt(valor);
            division = calculadora.dividir(10, divisor);
            System.out.println("EL resultado es: " + division);
        }catch (NumberFormatException nfe) {
            System.out.println("Se detecto un error, por favor ingrese un valor numerico " + nfe.getMessage());
            main(args);
        }catch (DivisionPorZeroException ae) {
            System.err.println("No se puede dividir, capturamos la exeption " +
                    "en tiempo de ejecucion : " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin exeption");
        }
    }
}
