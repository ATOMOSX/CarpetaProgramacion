package org.juand.aeropuerto;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHoraLlegada;
    private int numeroPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaHoraLlegada, int numeroPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaHoraLlegada=" + fechaHoraLlegada +
                ", numeroPasajeros=" + numeroPasajeros;
    }
}
