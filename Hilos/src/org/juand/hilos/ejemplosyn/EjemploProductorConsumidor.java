package org.juand.hilos.ejemplosyn;

import org.juand.hilos.ejemplosyn.runnable.Cliente;
import org.juand.hilos.ejemplosyn.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();
        new Thread(new Panadero(panaderia)).start();
        new Thread(new Cliente(panaderia)).start();
    }
}
