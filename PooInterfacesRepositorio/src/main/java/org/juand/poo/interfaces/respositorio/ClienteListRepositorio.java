package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        dataSource.sort((cliente1, cliente2) ->{
                int resultado = 0;

                if (direccion == Direccion.ASCENDENTE) {

                    switch (campo){
                        case "id" -> resultado = cliente1.getId().compareTo(cliente2.getId());
                        case "nombre" -> resultado = cliente1.getNombre().compareTo(cliente2.getNombre());
                        case "apellido" -> resultado = cliente1.getApellido().compareTo(cliente2.getApellido());
                    }
                } else if (direccion == Direccion.DESCENDENTE) {

                    switch (campo){
                        case "id" -> resultado = cliente2.getId().compareTo(cliente1.getId());
                        case "nombre" -> resultado = cliente2.getNombre().compareTo(cliente1.getNombre());
                        case "apellido" -> resultado = cliente2.getApellido().compareTo(cliente1.getApellido());
                    }
                }
                return resultado;
            }
        );
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente porId(Integer id) {
        //Asignamos una variable nula
        Cliente cliente = null;

        //Iteramos con un for para buscar el cliente
        for (Cliente cli : dataSource) {

            //Si el cliente tiene el mismo id, es encontrado
            if (cli.getId().equals(id)) {
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
}
