package juand.poo.interfaces.repositorio.exception.generics;


import juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo.Cliente;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", "Lopez"));

        Cliente juan = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Juan", "Lopez"),
                new Cliente("Daniela", "Gomez")};

        Integer[] enterosArreglos = {1, 2, 3};

        //Transformamos un arreglo en listas mediante el método generic que realizamos
        //Con el parameter generic
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglos);

        System.out.println("=========== Lista de clientes ===========");
        clientes.forEach(System.out::println);

        System.out.println("=========== Lista de enteros ===========");
        enterosLista.forEach(System.out::println);

        System.out.println("=========== Lista de Sobrecarga ===========");
        //Creamos otra lista para probar la sobrecarga
        List<String> nombres = fromArrayToList(new String[]{"Juan", "David",
                "Daniela", "Sasha"}, enterosArreglos);
        nombres.forEach(System.out::println);

        System.out.println("=========== Lista de Clientes premium ===========");
        List<ClientePremium> clientePremiums = fromArrayToList(new ClientePremium[] {
                new ClientePremium("Daniela", "Lopez"),
                new ClientePremium("Juan", "David")});
        clientePremiums.forEach(System.out::println);

        System.out.println("=========== Con el metodo imprimir clientes ===========");
        imprimirClientes(clientes);
        imprimirClientes(clientePremiums);
        imprimirClientes(clientesLista);
        imprimirClientes(List.of(clientesArreglo));

        System.out.println("=========== Con el metodo Maximo en tres objetos ===========");
        System.out.println("Maximo en los numeros 12345, 54321, 98745 es: "
                + maximo(12345, 54321, 98745));
        System.out.println("Maximo en los numeros 1.6, 1.59, 1.58 es: "
                + maximo(1.6, 1.59, 1.58));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: "
                + maximo("Zanahoria", "Aranadanos", "Manzana"));
    }

    //Creamos un método generic "<T>", Se puede poner cualquier letra en mayúscula, pero
    //la "T" se suele utilizar para trabajar con listas
    public static <T> List<T> fromArrayToList(T[] clientes){
        return Arrays.asList(clientes);
    }

    //Creamos un método generico con límites con sobrecarga
    public static <T extends  Number> List<T> fromArrayToList(T[] clientes){
        return Arrays.asList(clientes);
    }

    //Aqui aceptará cualquier clase que sea de tipo cliente
    public static <T extends  Cliente & Comparable<T>> List<T> fromArrayToList(T[] clientes){
        return Arrays.asList(clientes);
    }

    //Ahora se va a tratar de hacer una sobrecarga
    public static <T, G>  List<T> fromArrayToList(T[] clientes, G[] g){
        for (G elemento : g){
            System.out.println(elemento);
        }
        return Arrays.asList(clientes);
    }

    //Creamos una clase para imprimir y hacemos un implemets para poder
    //Pasar también los metodos hijos y que no generen error
    public static void imprimirClientes (List< ? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    //Creamos un método generico que dara el maxims de 3 objetos
    public static <T extends Comparable<T>> T maximo (T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
