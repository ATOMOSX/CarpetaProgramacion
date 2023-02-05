package org.juand.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        //El Executors.newFixedThreadPool es para ejecutar la cantidad de tareas que nosotros le asignemos
        ExecutorService ejecutor = Executors.newFixedThreadPool(3);

        Callable<String > tarea = () ->{
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea");
            return "Algun resultado de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando la tarea 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = ejecutor.submit(tarea);
        Future<String> resultado2 = ejecutor.submit(tarea);
        Future<Integer> resultado3 = ejecutor.submit(tarea2);

        ejecutor.shutdown();
        System.out.println("Continuando con la ejecución del metodo main 1");

        //System.out.println(resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("Resultado 1: %s - Resultado 2: %s - Resultado 3: %s",
                    resultado.isDone()? "Finalizo" : "En proceso",
                    resultado2.isDone()? "Finalizo" : "En proceso",
                    resultado3.isDone()? "Finalizo" : "En proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("Resultado de la tarea 1: " + resultado.get());
        System.out.println("Finaliza la tarea 1: " + resultado.isDone());

        System.out.println("Resultado de la tarea 2: " + resultado2.get());
        System.out.println("Finaliza la tarea 2: " + resultado2.isDone());

        System.out.println("Resultado de la tarea 3: " + resultado3.get());
        System.out.println("Finaliza la tarea 3: " + resultado3.isDone());


    }
}
