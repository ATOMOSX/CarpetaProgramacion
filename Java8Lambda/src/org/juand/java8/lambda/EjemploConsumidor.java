package org.juand.java8.lambda;

import org.juand.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumidor {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(fecha);
        };
        consumidor.accept(new Date());

        //Aca en la funcion lambda se utilizan parentesis porque son dos elementos, cuando es uno solo no es necesario
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) ->
            System.out.println(nombre + ", tiene " + edad + " años.");
        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo");

        List<String> nombres = Arrays.asList("Andres", "Pepe", "Luz", "Paco", "Hugo");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = (Usuario::setNombre);
        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get());
    }
}
