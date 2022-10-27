package seccion5;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"andres", "maria", "paco", "juan", "dani", "eileen", "diana", "haydee"};
        int count =nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("andres")
                    || nombres[i].equalsIgnoreCase("haydee")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("ingrese un nombre, ejemplo juan o dani");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar.toUpperCase() + " Fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar.toUpperCase() + "No existe en el sistema");
        }
    }
}
