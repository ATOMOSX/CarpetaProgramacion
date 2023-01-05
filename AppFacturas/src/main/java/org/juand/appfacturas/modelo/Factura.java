package org.juand.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public void addItemFactura(ItemFactura itemFactura){
        if (indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = itemFactura;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (int i = 0; i < indiceItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder stringBuilder = new StringBuilder("Factura N°: ");
        stringBuilder.append(folio)
                .append("\ncliente: ")
                .append(this.cliente.getNombre())
                .append("\nNif: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM  yyyy");
        stringBuilder.append("Fecha emision: ")
                .append(dateFormat.format(this.fecha))
                .append("\n")
                .append("\n#\t nombre\t Precio\t Cant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++){
            stringBuilder.append(this.items[i].toString())
                    .append("\n");
        }
        stringBuilder.append("\nGran total: ")
                .append(calcularTotal());

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

}
