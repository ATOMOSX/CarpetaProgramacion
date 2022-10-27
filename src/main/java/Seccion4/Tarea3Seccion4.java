package Seccion4;

import javax.swing.*;

public class Tarea3Seccion4 {
    public static void main(String[] args) {

       String nombreFamiliar1 = JOptionPane.showInputDialog( "Ingrese el nombre del primer familiar con su apellido");
       String nombreFamiliar2 = JOptionPane.showInputDialog( "Ingrese el nombre del segundo familiar con su apellido");
       String nombreFamiliar3 = JOptionPane.showInputDialog( "Ingrese el nombre del tercer familiar con su apellido");


       String nombreMasLargo = nombreFamiliar1.split("") [0].length()
               > nombreFamiliar2.split("")[0].length() ? nombreFamiliar1 : nombreFamiliar2;
       nombreMasLargo = nombreFamiliar3.split("")[0].length()
               > nombreMasLargo.split("")[0].length() ? nombreFamiliar3 : nombreMasLargo;

        System.out.println("nombre MasLargo = " + nombreMasLargo);

    }
}
