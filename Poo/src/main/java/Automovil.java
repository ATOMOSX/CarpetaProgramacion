public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private TipoAtumovil tipo;
    private Persona propietario;
    private Rueda[] ruedas;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    public Automovil() {
        this.id = ++ultimoId;

    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, TipoAtumovil tipo, Persona propietario) {
        this(fabricante, modelo, color, motor, estanque);
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String detalle(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("auto.id = " + this.id);
        stringBuilder.append("\nautomovil.color = " + this.color.getColor());
        stringBuilder.append("\nautomovil.fabricante = " + this.fabricante);
        stringBuilder.append("\nautomovil.modelo = " + this.modelo);

        if (this.getTipo() != null) {
            stringBuilder.append("\nauto.tipo = " + this.getTipo().getDescripcion());
        }

        if (this.motor != null) {
            stringBuilder.append("\nautomovil.cilindrada = " + this.motor.getCilindrada());
        }

        stringBuilder.append("\nauto.patenteColor = " + colorPatente.getColor());
        System.out.println();
        if (getPropietario()  != null) {
            stringBuilder.append("\nPropietario del automovil: " + this.getPropietario());
        }

        if (getRuedas() != null) {
            for (Rueda rueda : this.getRuedas()) {
                stringBuilder.append("\nRuedas del automovil:");
                stringBuilder.append("\n" + rueda.getFabricante() + ", aro: " + rueda.getAncho() +
                        ", ancho: " + rueda.getRadio() + " ");
            }
        }

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
        return km / (this.getEstanque().getCapacidad() * porcentajeBencina);
    }

    public double calcularConsumo(int km, int porcentajeBencina){
        double consumo = km / (this.getEstanque().getCapacidad() * (porcentajeBencina / 100d));
        return consumo;
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){

        float consumo = (float) (km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100d)));
        return consumo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil automovil = (Automovil) obj;
        return (this.fabricante != null &&this.fabricante.equalsIgnoreCase(automovil.getFabricante()) &&
                this.modelo != null && this.modelo.equalsIgnoreCase(automovil.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoAtumovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAtumovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }
}
