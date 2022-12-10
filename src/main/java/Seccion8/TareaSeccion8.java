package Seccion8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaSeccion8 {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento con formato 'YYYY-MM-DD'");
        String fechaIngresada = scanner.next();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDeNacimiento = format.parse(fechaIngresada);
        Date fechaActual = new Date();

        format = new SimpleDateFormat("yyyyMMdd");

        int nacimiento = Integer.parseInt(format.format(fechaDeNacimiento));
        int actual = Integer.parseInt(format.format(fechaActual));

        int edadCalculada = (actual - nacimiento) / 10000;
        System.out.println("edadCalculada = " + edadCalculada);
    }
}
