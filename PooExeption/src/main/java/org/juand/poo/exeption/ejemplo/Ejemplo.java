package org.juand.poo.exeption.ejemplo;

import javax.swing.*;

public class Ejemplo {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        int divisor;
        double division;


        try {
          /*  divisor = Integer.parseInt(valor);
            division = calculadora.dividir(10, divisor);
            System.out.println("EL resultado es: " + division);*/

           double division2 = calculadora.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }catch (NumberFormatException nfe) {
            System.out.println("Se detecto un error, por favor ingrese un valor numerico " + nfe.getMessage());
            main(args);
        }catch (NumeroFormatoException e){
            System.out.println("Se detecto una exception, por favor ingrese un numero valido: " + e.getMessage());
            e.printStackTrace(System.out);
        }catch (DivisionPorZeroException ae) {
            System.err.println("No se puede dividir, capturamos la exeption " +
                    "en tiempo de ejecucion : " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin exeption");
        }
    }
}
