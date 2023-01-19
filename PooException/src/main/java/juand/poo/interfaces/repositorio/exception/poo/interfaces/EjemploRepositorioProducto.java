package juand.poo.interfaces.repositorio.exception.poo.interfaces;

import org.juand.poo.interfaces.modelo.Producto;
import org.juand.poo.interfaces.respositorio.Direccion;
import org.juand.poo.interfaces.respositorio.FullRepositorio;
import org.juand.poo.interfaces.respositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

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
        for (Producto producto : productosAscendente){
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
    }
}
