package org.juand.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumidor {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(fecha);
        };
        consumidor.accept(new Date());

        //Aca en la funcion lambda se utilizan parentesis porque son dos elementos, cuando es uno solo no es necesario
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) ->{
            System.out.println(nombre + ", tiene " + edad + " años.");
        };
        consumidorBi.accept("pepe", 20);

    }
}
