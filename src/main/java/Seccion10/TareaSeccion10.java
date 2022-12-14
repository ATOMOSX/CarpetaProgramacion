package Seccion10;

import java.util.Scanner;

public class TareaSeccion10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area;
        double radio;

        System.out.println("Ingrese el radio del circulo");
        radio = scanner.nextDouble();

        area = Math.PI * Math.pow(radio , 2);

        System.out.println("El area del circulo es = " + area);
        System.exit(0);
    }
}
