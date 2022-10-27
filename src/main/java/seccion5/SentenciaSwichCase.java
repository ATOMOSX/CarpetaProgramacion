package seccion5;

import java.util.Scanner;

public class SentenciaSwichCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del mes");
        int mes = scanner.nextInt();

        String nombreMes = null;

        switch (mes){

            case 1:
                nombreMes ="enero";
                break;
            case 2:
                nombreMes ="febrero";
                break;
            case 3:
                nombreMes ="marzo";
                break;
            case 4:
                nombreMes ="abril";
                break;
            case 5:
                nombreMes ="mayo";
                break;
            case 6:
                nombreMes ="junio";
                break;
            case 7:
                nombreMes ="julio";
                break;
            case 8:
                nombreMes ="agosto";
                break;
            case 9:
                nombreMes ="septiembre";
                break;
            case 10:
                nombreMes ="octubre";
                break;
            case 11:
                nombreMes ="Noviembre";
                break;
            case 12:
                nombreMes ="Diciembre";
                break;
            default:
                nombreMes = "indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
