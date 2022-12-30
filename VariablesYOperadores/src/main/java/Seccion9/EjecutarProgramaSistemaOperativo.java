package Seccion9;

import java.io.IOException;

public class EjecutarProgramaSistemaOperativo {
    public static void main(String[] args) {

        Runtime rn = Runtime.getRuntime();
        Process proceso;

        try {

            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rn.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rn.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("nux") ||
                        System.getProperty("os.name").toLowerCase().startsWith("nix")) {
                proceso = rn.exec("gedit");
            }else {
                proceso = rn.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
