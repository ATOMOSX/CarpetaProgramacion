public enum TipoAtumovil {
    SEDAN("Sedan", 4, "Auto mediano"),
    CONVERTIBLE("Convertible",2 ,"Auto deportivo"),
    FURGON("Furgon",4  , "Auto utilitario"),
    HATCHBACK("Hatchback", 4, "Auto compacto"),
    CUPE("Cupe", 2, "Auto pequeño");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAtumovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
