public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setCilindrada(1926.5);
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAtumovil.CUPE);
        System.out.println(subaru.detalle());

        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setCilindrada(3000.0);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        System.out.println(mazda.detalle());

        Automovil nissan = new Automovil("Nissan", "GTR", Color.BLANCO, 5000.0, 50);
        nissan.setTipo(TipoAtumovil.CONVERTIBLE);
        System.out.println(nissan.detalle());

        Automovil nissan2 = new Automovil("Nissan", "GTR", Color.VERDE, 5000.0, 50);

        Automovil kia = new Automovil();

        Automovil.setCapacidadTanqueEstatico(50);
        Automovil.setColorPatente(Color.AMARILLO);
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 600));

        System.out.println("Velocidad Maxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima en la ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAtumovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru = " + tipoSubaru.getNombre());
        System.out.println("Tipo subaru descripcion = " + tipoSubaru.getDescripcion());









    }

}
