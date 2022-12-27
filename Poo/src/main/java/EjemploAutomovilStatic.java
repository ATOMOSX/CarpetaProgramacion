public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setCilindrada(1926.5);
        subaru.setColor("Negro");
        System.out.println(subaru.detalle());

        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setCilindrada(3000.0);
        mazda.setColor("Rojo");
        System.out.println(mazda.detalle());

        Automovil nissan = new Automovil("Nissan", "GTR", "Blanco", 5000.0, 50);
        System.out.println(nissan.detalle());

        Automovil nissan2 = new Automovil("Nissan", "GTR", "Blanco", 5000.0, 50);

        Automovil kia = new Automovil();

        Automovil.setColorPatente("Amarillo");
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());








    }

}
