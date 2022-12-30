package Seccion3;

public class ConcatenandoString {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";
        
        String detalle = curso + "con el instructor" + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle+ numeroB + numeroA);
        System.out.println(numeroA +  numeroB + detalle);

        String detalle2 = curso.concat(" con " + profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}