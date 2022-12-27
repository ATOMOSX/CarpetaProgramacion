public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setCilindrada(1926.5);
        subaru.setColor(Automovil.COLOR_GRIS);
        System.out.println(subaru.detalle());

        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setCilindrada(3000.0);
        mazda.setColor(Automovil.COLOR_ROJO);
        System.out.println(mazda.detalle());

        Automovil nissan = new Automovil("Nissan", "GTR", Automovil.COLOR_BLANCO, 5000.0, 50);
        System.out.println(nissan.detalle());

        Automovil nissan2 = new Automovil("Nissan", "GTR", Automovil.COLOR_BLANCO, 5000.0, 50);

        Automovil kia = new Automovil();

        Automovil.setCapacidadTanqueEstatico(50);
        Automovil.setColorPatente("Amarillo");
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 600));

        System.out.println("Velocidad Maxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima en la ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);








    }

}
