package Seccion5;

import java.util.Scanner;

public class Tarea3Seccion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero A: ");
        int numeroA = scanner.nextInt();

        System.out.println("Ingrese el numero B ");
        int numeroB = scanner.nextInt();

        int resultadoMultiplicacion = 0;

        boolean numeroPositivoA = numeroA > -1;
        boolean numeroPositivoB = numeroB > -1;

        int valorAbsolutoA = numeroPositivoA ? numeroA: -numeroA;

        for (int i = 0; i < valorAbsolutoA; i++){
            resultadoMultiplicacion = resultadoMultiplicacion + numeroB;
        }
        if ((!numeroPositivoA && !numeroPositivoB) || !numeroPositivoA){
            resultadoMultiplicacion = -resultadoMultiplicacion;
        }

        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
    }
}
