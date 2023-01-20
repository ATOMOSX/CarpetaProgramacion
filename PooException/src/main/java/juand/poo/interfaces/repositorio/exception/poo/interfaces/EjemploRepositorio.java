package juand.poo.interfaces.repositorio.exception.poo.interfaces;


import juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo.Cliente;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.Direccion;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.FullRepositorio;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.AccsesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.EscrituraAccesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.LecturaAccesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import juand.poo.interfaces.repositorio.exception.poo.interfaces.respositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) throws LecturaAccesoDatoException {

        try {
            FullRepositorio<Cliente> repositorio = new ClienteListRepositorio();
            repositorio.crear(new Cliente("Juan David", "Lopez"));
            repositorio.crear(new Cliente("Daniela", "Gomez"));
            repositorio.crear(new Cliente("Eileen", "Gomez"));
            Cliente sasha = new Cliente("Sasha", "Lopez");
            repositorio.crear(sasha);
            repositorio.crear(sasha);

            //repositorio.crear(null);

            List<Cliente> clienteList = repositorio.listar();
            clienteList.forEach(System.out::println);

            System.out.println("============== Paginable ==============");
            List<Cliente> paginable = (repositorio).listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("============== Ordenable ascendente ==============");
            List<Cliente> ordenableAscendente = (repositorio).
                    listar("nombre", Direccion.ASCENDENTE);
            for (Cliente cliente : clienteList) {
                System.out.println(cliente);
            }

            System.out.println("============== Ordenable descendente ==============");
            List<Cliente> ordenableDescendente = (repositorio).
                    listar("nombre", Direccion.DESCENDENTE);
            for (Cliente cliente : clienteList) {
                System.out.println(cliente);
            }

            System.out.println("============== Editar ==============");
            Cliente editar = new Cliente("Ledin", "Gomez");
            editar.setId(1);
            repositorio.editar(editar);
            //Cliente daniela = repositorio.porId(2);
            (repositorio).listar("apellido", Direccion.DESCENDENTE).forEach(System.out::println);

            System.out.println("============== Eliminar ==============");
            repositorio.eliminar(2);
            repositorio.listar().forEach(System.out::println);

            System.out.println("============== Total ==============");
            System.out.println("Total de registros: " + repositorio.total());
        }catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro de dato duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccsesoDatoException e) {
            System.out.println("Generica " + e.getMessage());
            e.printStackTrace();
        }
    }
}
