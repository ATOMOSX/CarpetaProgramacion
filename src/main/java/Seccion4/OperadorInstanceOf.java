package Seccion4;

public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String";

        Integer num =  7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String? = " + b1);

        boolean b2 = texto instanceof String;
        System.out.println("Texto es del tipo String? = " + b2);

        boolean b3 =num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);
    }
}
