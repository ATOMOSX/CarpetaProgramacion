public class Rueda {

    private String fabricante;
    private int radio;
    private double ancho;

    public Rueda(String fabricante, int radio, double ancho) {
        this.fabricante = fabricante;
        this.radio = radio;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
