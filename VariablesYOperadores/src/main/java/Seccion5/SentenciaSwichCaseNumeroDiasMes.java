package Seccion5;

import java.util.Scanner;

public class SentenciaSwichCaseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del mes de 1 - 12");
        int mes = scanner.nextInt();

        int numeroDeDias = 0;
        System.out.println("ingrese el año (YYYY)");
        int anio = scanner.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDeDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDeDias = 30;
                break;
            case 2:
                if (mes == 2) {
                    if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                        numeroDeDias = 29;
                    } else {
                        numeroDeDias = 28;
                    }
                }
                break;
            default:
                numeroDeDias = 0;
        }
        System.out.println("numeroDeDias = " + numeroDeDias);
    }
}
