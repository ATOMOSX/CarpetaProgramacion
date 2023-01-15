package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements FullRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((cliente1, cliente2) -> {
            int resultado = 0;

            if (direccion == Direccion.ASCENDENTE) {
                resultado = this.ordenar(campo, cliente1, cliente2);

            } else if (direccion == Direccion.DESCENDENTE) {
               resultado = this.ordenar(campo, cliente2, cliente1);

            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        //Asignamos una variable nula
        Cliente cliente = null;

        //Iteramos con un for para buscar el cliente
        for (Cliente cli : dataSource) {

            //Si el cliente tiene el mismo id, es encontrado
            if (cli.getId() != null && cli.getId().equals(id)) {
                //Asignamos el cliente a la variable nula
                cliente = cli;
                break;
            }
        }
        //retornamos el cliente encontrado
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        //Creamos el cliente
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        //Utilizamos el buscar cliente por ID para poder modificarlo mediante
        //getters y setters
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        //Volvemos a utilizar el buscar por ID para poder eliminar el cliente
        Cliente c = this.porId(id);
        this.dataSource.remove(c);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }


    private int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
