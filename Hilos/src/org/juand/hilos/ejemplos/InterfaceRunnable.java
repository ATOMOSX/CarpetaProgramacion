package org.juand.hilos.ejemplos;

import org.juand.hilos.ejemplos.runnable.ViajeTarea;

public class InterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de pascua")).start();
        new Thread(new ViajeTarea("Islas perdidas")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Miami")).start();
        new Thread(new ViajeTarea("Cancún")).start();

    }
}
