package org.juand.hilos;

import org.juand.hilos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) {

        new Thread(new ImprimirFrases("Hola ", "que tal")).start();
        new Thread(new ImprimirFrases("Quien eres ", "tu")).start();
        new Thread(new ImprimirFrases("Muchas ", "gracias amigo")).start();
    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
