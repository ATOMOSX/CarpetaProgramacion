package juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio;

import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.AccsesoDatoException;

import java.util.List;

public interface CrudRepositorio <T> {

    List<T> listar();
    T porId(Integer id) throws AccsesoDatoException;
    void crear(T t) throws AccsesoDatoException;
    void editar(T t) throws AccsesoDatoException;
    void eliminar(Integer id) throws AccsesoDatoException;
}
