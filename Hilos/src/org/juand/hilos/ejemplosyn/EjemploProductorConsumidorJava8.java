package org.juand.hilos.ejemplosyn;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();
        new Thread(() ->{
            for (int i = 0; i < 10; i++){
                panaderia.hornear("Pan No: " + (i + 1));
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() ->{
            for (int i = 0; i < 10; i++){
                panaderia.consumir();
            }
        }).start();
    }
}
