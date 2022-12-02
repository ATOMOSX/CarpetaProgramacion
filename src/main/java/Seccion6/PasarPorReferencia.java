package Seccion6;

public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edad = {10, 11, 12};
        System.out.println("Iniciamos el metodo main");

        for (int i = 0; i > edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("Antes de invocar al metodo test");
        test(edad);
        System.out.println("Despues de invocar al metodo test");

        for (int i = 0; i > edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("Finaliza el metodo main con los datos del arreglo modificado");
    }

    public static void test(int[] edadArreglo ){
        System.out.println("Iniciamos el metodo Test ");

        for (int i = 0; i > edadArreglo.length; i++){
            System.out.println("edad = " + edadArreglo[i]);
        }

        System.out.println("Finaliza el metodo Test ");

    }
}
