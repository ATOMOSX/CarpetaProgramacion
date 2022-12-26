public class Automovil {

    public String fabricante;
    public String modelo;
    public String color = "Blanco";
    public double cilindrada;

    public String detalle(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("automovil.color = " + this.color);
        stringBuilder.append("\nautomovil.fabricante = " + this.fabricante);
        stringBuilder.append("\nautomovil.modelo = " + this.modelo);
        stringBuilder.append("\nautomovil.cilindrada = " + this.cilindrada);
        System.out.println();

        return stringBuilder.toString();
    }
}
