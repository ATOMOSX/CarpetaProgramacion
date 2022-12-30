package Seccion10;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"Azul, Amarillo, Blanco, Negro, Rojo"};

        double aleatorio = Math.random();
        System.out.println("aleatorio = " + aleatorio);

        aleatorio *= colores.length;
        System.out.println("aleatorio = " + aleatorio);

        aleatorio = Math.floor(aleatorio);
        System.out.println("aleatorio = " + aleatorio);

        System.out.println("colores = " + colores[(int) aleatorio]);

    }
}
