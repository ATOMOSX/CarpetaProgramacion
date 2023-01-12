package org.juand.tarea.clases.abstractas.zoologico.mamiferos;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero lobo = new Lobo("Bosques", 1.57f, 1.20f, 45.8f, "Lobos",
                "Blancos", 0.15f,  20, " Lobos blancos");
        Mamifero perro = new Perro("Casas", 1.50f, 10.0f, 30.5f, "Perro",
                "Negro", 0.5f, 20 );
        Mamifero tigre = new Tigre("Selva tropicales", 2.16f, 1.50f, 60.5f, "Tigres",
                0.20f, 65, "Tigre albino");
        Mamifero leon = new Leon("Sabanas", 1.22f, 0.90f, 58.15f, "Leones",
                0.25f, 80, 10, 15f);
        Mamifero guepardo = new Guepardo("Africa", 1.10f, 0.80f, 250.8f, "Guepardos",
                0.25f, 110);

        mamiferos[0] = lobo;
        mamiferos[1] = perro;
        mamiferos[2] = tigre;
        mamiferos[3] = leon;
        mamiferos[4] = guepardo;

        for (Mamifero animales : mamiferos){
            System.out.println("Nombre: " + animales.getNombreCientifico());
            System.out.println("Habitad: " + animales.getHabitad());
            System.out.println("Altura: " + animales.getAltura());
            System.out.println("Peso: " + animales.getPeso());
            System.out.println("Largo: " + animales.getLargo());

            if (animales instanceof Caninos){
                System.out.println("Tamaño de colmillos: " + ((Caninos) animales).getTamanoColmillos());
                System.out.println("Color: " + ((Caninos) animales).getColor());

                if (animales instanceof  Lobo){
                    System.out.println("Especie del lobo: " + ((Lobo) animales).getEspecieLobo());
                    System.out.println("Numero de camada: " + ((Lobo) animales).getNumeroCamada());

                }else if (animales instanceof  Perro){
                    System.out.println("Fuerza de la mordida es " + ((Perro) animales).getFuerzaMordida() + " kg.");
                }
            }
            if (animales instanceof Felinos){
                System.out.println("Tamaño de las garras: " + ((Felinos) animales).getTamanoGarras());
                System.out.println("Velocidad: " + ((Felinos) animales).getVelocidad() + " km/h");

                if (animales instanceof Tigre){
                    System.out.println("Especie de tigre: " + ((Tigre) animales).getEspecieTigre());
                }else if (animales instanceof  Guepardo){

                }else if (animales instanceof Leon){
                    System.out.println("Numero de manada: " + ((Leon) animales).getNumeroManada());
                    System.out.println("Potencia de rugido en decibeles: " + ((Leon) animales).getPotenciaRugidoDecibel());
                }
            }
            System.out.println(animales.comer());
            System.out.println(animales.dormir());
            System.out.println(animales.correr());
            System.out.println(animales.Comunicarse());
            System.out.println();
        }
    }
}
