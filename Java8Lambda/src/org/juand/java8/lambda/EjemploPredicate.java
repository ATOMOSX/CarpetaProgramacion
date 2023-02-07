package org.juand.java8.lambda;

import org.juand.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 5;
        boolean resultado = test.test(4);
        System.out.println("resultado = " + resultado);

        Predicate<String> test2 = rol -> rol.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_ADMIN"));

        BiPredicate<String, String> test3 = String::equalsIgnoreCase;
        System.out.println(test3.test("Andres", "Andres"));

        BiPredicate<Integer, Integer> test4 = (a,b) -> a > b;
        boolean resultado2 = test4.test(4, 3);
        System.out.println("resultado2 = " + resultado2);

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("David");

        BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(test5.test(usuario1, usuario2));
    }
}
