package juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio;

public interface FullRepositorio<T> extends OrdenableRepositorio<T>,
        CrudRepositorio<T>, PaginableRepositorio<T>, ContableRepositorio {
}
