package org.juand.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Camion implements Iterable {

    private List objetos;
    private int maximo;

    public Camion(int maximo) {
        this.maximo = maximo;
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(Objects objetos){
        if (this.objetos.size() < maximo) {
            this.objetos.add(objetos);
        }else {
            throw new RuntimeException("No hay mas espacio en el camion");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
