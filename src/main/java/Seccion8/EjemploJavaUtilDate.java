package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy hh:mm:ss");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
    }
}
