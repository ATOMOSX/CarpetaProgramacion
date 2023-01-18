package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio <T> {

    List<T> listar();
    T porId(Integer id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}
