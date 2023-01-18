package org.juand.poo.interfaces.respositorio;

public interface FullRepositorio<T> extends OrdenableRepositorio<T>,
        CrudRepositorio<T>, PaginableRepositorio<T>, ContableRepositorio {
}
