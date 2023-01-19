package juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio;

import java.util.List;

public interface OrdenableRepositorio <T> {

    List<T> listar(String campo, Direccion direccion);

}
