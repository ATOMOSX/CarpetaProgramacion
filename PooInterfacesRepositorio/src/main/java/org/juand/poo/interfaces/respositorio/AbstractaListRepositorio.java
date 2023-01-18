package org.juand.poo.interfaces.respositorio;

import org.juand.poo.interfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements FullRepositorio<T>{

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) {
        //Asignamos una variable nula
        T cliente = null;

        //Iteramos con un for para buscar el cliente
        for (T cli : dataSource) {

            //Si el cliente tiene el mismo id, es encontrado
            if (cli.getId() != null && cli.getId().equals(id)) {
                //Asignamos el cliente a la variable nula
                cliente = cli;
                break;
            }
        }
        //retornamos el cliente encontrado
        return cliente;
    }

    @Override
    public void crear(T cliente) {
        //Creamos el cliente
        this.dataSource.add(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        //Volvemos a utilizar el buscar por ID para poder eliminar el cliente
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
