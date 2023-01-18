package org.juand.poo.interfaces.respositorio.lista;

import org.juand.poo.interfaces.modelo.Cliente;
import org.juand.poo.interfaces.modelo.Producto;
import org.juand.poo.interfaces.respositorio.AbstractaListRepositorio;
import org.juand.poo.interfaces.respositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) {
        Producto prod = porId(producto.getId());
        prod.setDescripcion(producto.getDescripcion());
        prod.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion direccion) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    private int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
