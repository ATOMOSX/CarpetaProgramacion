package org.juand.hilos.ejemplos;

import org.juand.hilos.ejemplos.treahds.NombreThread;

public class ExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Jhon Doe");
        hilo.start();
        //Thread.sleep(2);
        System.out.println(hilo.getState());

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        System.out.println(hilo2.getState());

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo3.getState());
    }
}
