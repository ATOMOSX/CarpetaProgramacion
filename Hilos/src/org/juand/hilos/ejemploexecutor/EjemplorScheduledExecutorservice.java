package org.juand.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemplorScheduledExecutorservice {
    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        executorService.schedule(() ->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo, desde la tarea");
        }, 0, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea en el metodo main...");
        executorService.shutdown();
    }
}
