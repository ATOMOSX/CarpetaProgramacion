public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Blanco";
    private double cilindrada;
    private int capacidadTanque = 40;

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public Automovil() {

    }

    public String detalle(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("automovil.color = " + this.color);
        stringBuilder.append("\nautomovil.fabricante = " + this.fabricante);
        stringBuilder.append("\nautomovil.modelo = " + this.modelo);
        stringBuilder.append("\nautomovil.cilindrada = " + this.cilindrada);
        System.out.println();

        return stringBuilder.toString();
    }

    public String acelerar(int rpm){

        String aceleracion = "El auto " + this.fabricante + "acelerand a " + rpm + "rpm";
        return aceleracion;
    }

    public String frenar(){

        String frenando = this.fabricante + " " + this.modelo + " frenando!";
        return frenando;
    }

    public String acelerarFrenar(int rpm){

        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public double calcularConsumo(int km, float porcentajeBencina){

        double consumo = km / (capacidadTanque * porcentajeBencina);
        return consumo;
    }

    public double calcularConsumo(int km, int porcentajeBencina){

        double consumo = km / (capacidadTanque * (porcentajeBencina / 100d));
        return consumo;
    }

    @Override
    public boolean equals(Object obj) {
        Automovil automovil = (Automovil) obj;
        return (this.fabricante.equalsIgnoreCase(automovil.getFabricante()) &&
                this.modelo.equalsIgnoreCase(automovil.getModelo()));
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
}
