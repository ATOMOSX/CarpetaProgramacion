package org.juand.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPaginas(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder stringBuilder = new StringBuilder("Titulo: ");
        stringBuilder.append(this.titulo).append("\n")
                .append("Autor: ").append(autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimible pagina : this.paginas){
            stringBuilder.append(pagina.imprimir()).append("\n");
        }
        return stringBuilder.toString();
    }
}
