public class Motor {

    private double cilindrada;
    private EnumTipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(double cilindrada, EnumTipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public EnumTipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(EnumTipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
