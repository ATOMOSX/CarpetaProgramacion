package Seccion13;

public class EjemploMatircesFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe", "Pepa"}, {"Josefa", "Hugo"}, {"Paco", "pepe"}};

        for (String[] fila : nombres){
            for (String nombre : fila){
                System.out.print(nombre + " \t " );
            }
            System.out.println();
        }


    }
}
