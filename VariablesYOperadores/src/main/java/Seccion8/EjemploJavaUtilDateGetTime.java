package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateGetTime {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy hh:mm:ss");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 1000000; i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFin = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFin);

        System.out.println("fechaStr = " + fechaStr);
    }
}
