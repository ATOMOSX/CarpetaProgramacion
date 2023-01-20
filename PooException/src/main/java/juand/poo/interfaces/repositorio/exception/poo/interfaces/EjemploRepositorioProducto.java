package juand.poo.interfaces.repositorio.exception.poo.interfaces;


import juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo.Producto;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.Direccion;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.FullRepositorio;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.AccsesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.LecturaAccesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) throws LecturaAccesoDatoException {

        try {
            FullRepositorio<Producto> repositorio = new ProductoListRepositorio();
            repositorio.crear(new Producto("mesa", 40000.0));
            repositorio.crear(new Producto("silla", 25000.0));
            repositorio.crear(new Producto("lámpara", 35800.0));
            repositorio.crear(new Producto("libro", 50000.0));

            System.out.println("============== Productos ==============");
            List<Producto> productos = repositorio.listar();
            productos.forEach(System.out::println);

            System.out.println("============== Paginable ==============");
            List<Producto> paginable = (repositorio).listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("============== Ordenable ==============");
            List<Producto> productosAscendente = repositorio.listar("Descripcion",
                    Direccion.ASCENDENTE);
            for (Producto producto : productosAscendente) {
                System.out.println(producto);
            }

            System.out.println("============== Editar ==============");
            Producto lampara = new Producto("Computador", 1500000.0);
            lampara.setId(3);
            repositorio.editar(lampara);
            //Cliente daniela = repositorio.porId(2);
            (repositorio).listar("Precio", Direccion.DESCENDENTE).forEach(System.out::println);

            System.out.println("============== Eliminar ==============");
            repositorio.eliminar(2);
            repositorio.listar().forEach(System.out::println);

            System.out.println("============== Total ==============");
            System.out.println("Total de registros: " + repositorio.total());
        } catch (LecturaAccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (AccsesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
