package Seccion5;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea4Seccion5 {
    public static void main(String[] args) {

        int opcionSeleccionada = 0;

        do {
            Map <String, Integer> opciones = new HashMap<>();
            opciones.put("", 0);
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar ", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación", "Mantenedor de Usuario",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción");
            }else {
                opcionSeleccionada = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionSeleccionada){
                    case 1:
                        mensaje = "Usuario acutalizado satisfactoriamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;

                    case 2:
                        mensaje = "Usuario Eliminado sasatisfactoriamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;

                    case 3:
                        mensaje = "Usuario agregado satisfactoriamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;

                    case 4:
                        mensaje = "Usuario listado satisfactoriamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                        break;
                }
            }
        }while (opcionSeleccionada != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con éxito");
    }
}
