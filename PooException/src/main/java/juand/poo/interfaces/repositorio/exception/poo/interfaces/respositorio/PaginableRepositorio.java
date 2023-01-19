package juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio;

import java.util.List;

public interface PaginableRepositorio <T> {

    List<T> listar(int desde, int hasta);
}
