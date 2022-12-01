package Seccion5;

import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del mes de 1 - 12");
        int mes = scanner.nextInt();

        int numeroDeDias = 0;
        System.out.println("ingrese el año (YYYY)");
        int anio = scanner.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes ==7
        || mes == 8 || mes == 10 || mes ==12){
            numeroDeDias = 31;
        }else if (mes == 4 || mes == 6 || mes == 9
                || mes == 11){
            numeroDeDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ( (anio % 4 ==0) && !(anio % 100 ==0) )){
                numeroDeDias = 29;
            }else {
                numeroDeDias = 28;
            }
        }
        System.out.println("anio = " + anio);
        System.out.println("mes = " + mes);
        System.out.println("numeroDeDias = " + numeroDeDias);


    }
}
