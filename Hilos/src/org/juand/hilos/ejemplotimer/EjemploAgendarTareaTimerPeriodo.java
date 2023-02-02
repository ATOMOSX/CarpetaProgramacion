package org.juand.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        //Pero con esta forma tambien nos funciona para poder implementar el codigo desde afuera
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        //Para emitir un sonido utilizamos la siguiente clase
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //con este contador es una manera para poder ejecutar el codigo sin que sea infinito
            //int contador = 3;
            @Override
            public void run() {
                int contador = contadorAtomic.getAndDecrement();
                if (contador > 0){
                    toolkit.beep();
                //if (contador > 0) {
                    System.out.println("Tarea " + contador + " periodica en: " + new Date() + " nombre del thread: " +
                            Thread.currentThread().getName());
                   // contador--;
                }else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        }, 5000, 10000);
        System.out.println("Agendamos una tarea para 5 segundos más...");
    }
}
