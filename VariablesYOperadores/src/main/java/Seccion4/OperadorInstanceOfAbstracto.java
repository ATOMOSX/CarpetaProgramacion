package Seccion4;

public class OperadorInstanceOfAbstracto {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String";
        Number num =  Integer.valueOf(7); // = 7

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String? = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer? = " + b1);

        b1 = texto instanceof String;
        System.out.println("Texto es del tipo String? = " + b1);

        b1 =num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo long? = = " + b1);
    }

}
