package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta){

    }
}
