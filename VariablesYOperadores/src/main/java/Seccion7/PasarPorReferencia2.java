package Seccion7;

class Persona{

    private String nombre;

    public  void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Iniciamos el metodo main");

        System.out.println("persona = " + persona.getNombre());

        System.out.println("Antes de invocar al metodo test");
        test(persona);
        System.out.println("Despues de invocar al metodo test");

        System.out.println("persona = " + persona.getNombre());

        System.out.println("Finaliza el metodo main con los datos de la persona modificado");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo Test ");
        persona.modificarNombre("Daniela la vaga");
        System.out.println("Finaliza el metodo Test ");
    }
}
