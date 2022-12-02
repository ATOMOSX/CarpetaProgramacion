package Seccion6;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("Iniciamos el metodo main con i  = " + i);

        test(i);
        System.out.println("Finaliza el metodo main con i (Se mantiee igual) = " + i);
    }

    public static int test(int i ){
        System.out.println("Iniciamos el metodo Test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo Test con i = " + i);
        return i;
    }
}
