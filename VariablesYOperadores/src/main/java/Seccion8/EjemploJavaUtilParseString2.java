package Seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilParseString2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'YYYY-MM-DD'");
        try {
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            //Esta es una forma de comparar las fechas.
            if (fecha.after(fecha2)){
                System.out.println("La fecha del usuario es despues que fecha2");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha del usuario es antes que fecha2");
            }else if (fecha.equals(fecha2)){
                System.out.println("La fecha del usuario es igual que fecha2");
            }

            //Ahora vamos a ver otra forma de comparar las fechas.
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("La fecha del usuario es despues que fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("La fecha del usuario es antes que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("La fecha del usuario es igual que fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
