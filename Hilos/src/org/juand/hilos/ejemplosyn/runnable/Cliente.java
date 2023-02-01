package org.juand.hilos.ejemplosyn.runnable;

import org.juand.hilos.ejemplosyn.Panaderia;

public class Cliente implements Runnable{

    private Panaderia panaderia;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            panaderia.consumir();
        }
    }
}
