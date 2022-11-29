package seccion5;

import java.util.Scanner;

public class Tarea2Seccion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double promedioNotaMay5, promedioNotaMay4;
        double sumNotasMay5 = 0;
        double sumNotasMay4 = 0;
        double sumaTotal = 0;

        int contador = 0;
        int contadorNotaMay5 = 0;
        int contadorNotaMay4 = 0;
        int cantNotas = 20;

        boolean error = false;

        for (int i = 0; i < cantNotas; i++){
            System.out.println("Ingresa la nota (Entre 1 y 7) N " + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0){
                error = true;
                break;
            }

            if (nota == 1) {
                contador++;
            }else {
                if (nota > 5){
                    contadorNotaMay5++;
                    sumNotasMay5 += nota;
                }else if (nota > 4 ){
                    contadorNotaMay4++;
                    sumNotasMay4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error){
            System.out.println("No pueden haber notas de 0, por eso al momento de ingresar las notas se informo que de 1 a 7");
            System.exit(1);
        }
        System.out.println("El numero de notas1 es de " + contador);

        if (contadorNotaMay5 != 0){
            promedioNotaMay5 = sumNotasMay5 / contadorNotaMay5;
            System.out.println("El promedio de las notas mayores a 5 es de: " + promedioNotaMay5);
        }else {
            System.out.println("No se puede calcular el promedio de notas mayores a 5");
        }

        if (contadorNotaMay4 != 0){
            promedioNotaMay4 = sumNotasMay4 / contadorNotaMay4;
            System.out.println("El promedio de notas menores a 4 es de: " + promedioNotaMay4);
        }else {
            System.out.println("No se puede calcuar el promedio de notas menores a 4");
        }

        double promedioTotal = sumaTotal / 20;
        System.out.println("El promedio general del estudiante es de: " + promedioTotal);
    }
}
