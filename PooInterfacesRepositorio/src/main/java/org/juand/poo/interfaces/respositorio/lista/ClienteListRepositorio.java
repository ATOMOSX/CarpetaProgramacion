package org.juand.poo.interfaces.respositorio.lista;

import org.juand.poo.interfaces.modelo.Cliente;
import org.juand.poo.interfaces.respositorio.AbstractaListRepositorio;
import org.juand.poo.interfaces.respositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

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
    public void editar(Cliente cliente) {
        //Utilizamos el buscar cliente por ID para poder modificarlo mediante
        //getters y setters
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
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
