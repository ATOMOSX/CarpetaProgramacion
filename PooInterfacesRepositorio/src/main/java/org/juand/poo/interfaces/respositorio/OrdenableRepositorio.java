package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion direccion);

}
