package org.juand.hilos.treahds;

public class NombreThread extends Thread {

    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el hilo " + getName());
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println((i + 1) + " " +  this.getName());
        }
        System.out.println("Finaliza el hilo");
    }
}
