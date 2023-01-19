package juand.poo.interfaces.repositorio.exception.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int maximo;

    public Camion(int maximo) {
        this.maximo = maximo;
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(T objeto){
        if (this.objetos.size() <= maximo) {
            this.objetos.add(objeto);
        }else {
            throw new RuntimeException("No hay mas espacio en el camion");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
