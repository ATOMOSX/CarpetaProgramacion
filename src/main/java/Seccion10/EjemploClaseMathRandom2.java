package Seccion10;

import java.util.Random;

public class EjemploClaseMathRandom2 {
    public static void main(String[] args) {

        String[] colores = {"Azul, Amarillo, Blanco, Negro, Rojo"};

        Random random = new Random();
        int randomInt = 15 + random.nextInt(25 - 15);
        System.out.println("randomInt = " + randomInt);

        randomInt = random.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
