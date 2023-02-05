package org.juand.hilos.ejemploexecutor;

import org.juand.hilos.ejemplosyn.Panaderia;
import org.juand.hilos.ejemplosyn.runnable.Cliente;
import org.juand.hilos.ejemplosyn.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        //El Executors.newFixedThreadPool es para ejecutar la cantidad de tareas que nosotros le asignemos
        ThreadPoolExecutor ejecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        Panaderia panaderia = new Panaderia();
        Runnable productor = new Panadero(panaderia);
        Runnable cosumidor = new Cliente(panaderia);

        Future<?> future1 = ejecutor.submit(productor);
        Future<?> future2 = ejecutor.submit(cosumidor);

        System.out.println("Tamaño del pool actual: " + ejecutor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + ejecutor.getQueue().size());

        ejecutor.shutdown();
        System.out.println("Continuando con la ejecución del metodo main 1");
    }
}
