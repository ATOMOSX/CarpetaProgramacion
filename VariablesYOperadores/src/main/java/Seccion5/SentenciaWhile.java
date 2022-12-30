package Seccion5;

public class SentenciaWhile {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println(i);
            i++;
        }

        prueba = false;
        while (prueba){
            System.out.println("Nunca se ejecuta porque es falso");
        }

        do {
            System.out.println("Esto se ejecuta al menos una sola vez");
        }while (prueba);

        prueba = true;
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}
