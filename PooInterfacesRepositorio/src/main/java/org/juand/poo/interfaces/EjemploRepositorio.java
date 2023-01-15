package org.juand.poo.interfaces;

import org.juand.poo.interfaces.modelo.Cliente;
import org.juand.poo.interfaces.respositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repositorio = new ClienteListRepositorio();
        repositorio.crear(new Cliente("Juan David", "Lopez"));
        repositorio.crear(new Cliente("Daniela", "Gomez"));
        repositorio.crear(new Cliente("Eileen", "Gomez"));
        repositorio.crear(new Cliente("Sasha", "Lopez"));


        List<Cliente> clienteList = repositorio.listar();
        clienteList.forEach(System.out::println);

        System.out.println("============== Paginable ==============");
        List<Cliente> paginable = ((PaginableRepositorio)repositorio).listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("============== Ordenable ascendente ==============");
        List<Cliente> ordenableAscendente = ((OrdenableRepositorio)repositorio).
                listar("nombre", Direccion.ASCENDENTE);
        for (Cliente cliente : clienteList){
            System.out.println(cliente);
        }

        System.out.println("============== Ordenable descendente ==============");
        List<Cliente> ordenableDescendente = ((OrdenableRepositorio)repositorio).
                listar("nombre", Direccion.DESCENDENTE);
        for (Cliente cliente : clienteList){
            System.out.println(cliente);
        }

        System.out.println("============== Editar ==============");
        Cliente editar = new Cliente("Ledin", "Gomez");
        editar.setId(2);
        repositorio.editar(editar);
        Cliente daniela = repositorio.porId(2);
        ((OrdenableRepositorio)repositorio).
                listar("apellido", Direccion.DESCENDENTE).forEach(System.out::println);

        System.out.println("============== Eliminar ==============");
        repositorio.eliminar(2);
        repositorio.listar().forEach(System.out::println);
    }
}
