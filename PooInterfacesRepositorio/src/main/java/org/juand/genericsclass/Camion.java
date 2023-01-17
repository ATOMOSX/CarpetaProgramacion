package org.juand.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {

    private List objetos;
    private int maximo;

    public Camion(int maximo) {
        this.maximo = maximo;
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(Object objeto){
        if (this.objetos.size() <= maximo) {
            this.objetos.add(objeto);
        }else {
            throw new RuntimeException("No hay mas espacio en el camion");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
