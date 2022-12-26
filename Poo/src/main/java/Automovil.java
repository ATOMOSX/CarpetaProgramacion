public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Blanco";
    private double cilindrada;
    private int capacidadTanque = 40;


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

    public String leerFabricante(){
        return fabricante;
    }

    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return modelo;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public String leerColor(){
        return color;
    }

    public void asignarColor(String color){
        this.color = color;
    }

    public double leerCilindrada(){
        return cilindrada;
    }

    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int leerCapacidadTanque(){
        return capacidadTanque;
    }

    public void asignarCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }
}
