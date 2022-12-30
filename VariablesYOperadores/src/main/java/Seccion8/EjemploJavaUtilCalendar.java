package Seccion8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, 9, 29, 21, 22, 10);
        calendario.set(Calendar.YEAR, 2002);
        calendario.set(Calendar.MONTH, 9);
        calendario.set(Calendar.DAY_OF_MONTH, 29);

        calendario.set(Calendar.HOUR, 9);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 30);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        String fechaConFormato = format.format(fecha);
        System.out.println("fecha con format0 = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = new Date();

        if (fecha.after(fecha2)){
            System.out.println("La fecha del usuario es despues que fecha2");
        } else if (fecha.before(fecha2)) {
            System.out.println("La fecha del usuario es antes que fecha2");
        }else if (fecha.equals(fecha2)){
            System.out.println("La fecha del usuario es igual que fecha2");
        }

    }
}
