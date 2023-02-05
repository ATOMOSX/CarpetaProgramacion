package org.juand.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService ejecutor = Executors.newSingleThreadExecutor();

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
        Future<String> resultado = ejecutor.submit(tarea);
        ejecutor.shutdown();
        System.out.println("Continuando con la ejecución del metodo main 1");

        //System.out.println(resultado.isDone());
        while (!resultado.isDone()){
            System.out.println("Ejecutando tarea...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea: " + resultado.isDone());


    }
}
