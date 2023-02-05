package org.juand.hilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemplorScheduledExecutorservicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        //CountDownLatch bloqueador = new CountDownLatch(5);
        AtomicInteger contador = new AtomicInteger(5);

       Future<?> future = executorService.scheduleAtFixedRate(() ->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
               // bloqueador.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo, desde la tarea");
        }, 1000, 2000, TimeUnit.MILLISECONDS);

        // TimeUnit.SECONDS.sleep(10);
        // bloqueador.await();
        // future.cancel(true);
        while (contador.get() >= 0){
            if (contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }
        System.out.println("Alguna otra tarea en el metodo main...");
        executorService.shutdown();
    }
}
