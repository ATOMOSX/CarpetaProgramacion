package juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo;

public class Cliente extends BaseEntity{

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Id = " + id +
                "\nNombre = " + nombre +
                "\nApellido = " + apellido;
    }
}
