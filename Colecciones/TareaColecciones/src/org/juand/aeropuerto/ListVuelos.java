package org.juand.aeropuerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListVuelos {
    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Vuelo("ALL 933", "New York", "Santiago", dateFormat.parse("2021-08-29 05:39"), 62));
        listaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", dateFormat.parse("2021-08-31 04:45"), 47));
        listaVuelos.add(new Vuelo("SKU 624", "Rio De Janeiro", "Santiago", dateFormat.parse("2021-08-30 16:00"), 52));
        listaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", dateFormat.parse("2021-08-29 13:22"), 59));
        listaVuelos.add(new Vuelo("AVA 245", "Bogotá", "Santiago", dateFormat.parse("2021-08-31 14:05"), 25));
        listaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", dateFormat.parse("2021-08-31 05:20"), 29));
        listaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", dateFormat.parse("2021-08-30 08:45"), 55));
        listaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", dateFormat.parse("2021-08-29 07:41"), 51));
        listaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", dateFormat.parse("2021-08-30 10:35"), 48));
        listaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", dateFormat.parse("2021-08-29 09:14"), 59));

        System.out.println("=========================== Orden de llegada por fecha y hora =========================== ");
        listaVuelos.sort((a, b) -> b.getFechaHoraLlegada().compareTo(a.getFechaHoraLlegada()));
        listaVuelos.forEach(System.out::println);

        System.out.println("=========================== Ultimo vuelo en llegar =========================== ");
        System.out.println("El ultimo vuelo el llegar es " + listaVuelos.get(0));

        System.out.println("=========================== Vuelo con menor numero de pasajeros =========================== ");
        listaVuelos.sort((a, b) -> Integer.compare(b.getNumeroPasajeros(), a.getNumeroPasajeros()));
        Vuelo menorPasajero = new LinkedList<>(listaVuelos).peekLast();
        System.out.println("El vuelo con el menor numero de pasajeros es: ");
        assert menorPasajero != null;
        System.out.println(menorPasajero.getNombre() + ": " + menorPasajero.getOrigen() +
                " , con " + menorPasajero.getNumeroPasajeros() + " pasajeros");
    }
}
