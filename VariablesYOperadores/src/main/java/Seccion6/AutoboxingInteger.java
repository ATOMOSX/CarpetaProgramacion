package Seccion6;

public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;

        // Hacemos la suma de los numero pares de una forma explicita
        for (Integer i: enteros){
            if (i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        suma = 0;
        // Aquí hacemos otra vez la suma pero de una forma implicita
        for (Integer i: enteros){
            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
