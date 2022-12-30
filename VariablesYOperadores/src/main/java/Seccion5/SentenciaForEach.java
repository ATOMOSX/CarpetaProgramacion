package Seccion5;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numerosArreglo = {1 , 3, 5, 7, 9, 11, 13, 15};
        for (int num : numerosArreglo){
            System.out.println("num = " + num);
        }
        
        String[] nombres = {"andres", "maria", "paco", "juan", "dani", "eileen", "diana", "haydee"};
        for (String nom : nombres){
            System.out.println("nom = " + nom);
        }
    }
}
