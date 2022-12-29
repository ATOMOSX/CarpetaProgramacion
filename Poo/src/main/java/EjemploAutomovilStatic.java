public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setMotor(new Motor(3.5, EnumTipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAtumovil.CUPE);
        System.out.println(subaru.detalle());

        Motor motorMazda = new Motor(3.0, EnumTipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setMotor(motorMazda);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        System.out.println(mazda.detalle());

        Automovil nissan = new Automovil("Nissan", "GTR", Color.BLANCO,new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan.setTipo(TipoAtumovil.CONVERTIBLE);
        System.out.println(nissan.detalle());

        Automovil nissan2 = new Automovil("Nissan", "GTR", Color.VERDE, new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));

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
