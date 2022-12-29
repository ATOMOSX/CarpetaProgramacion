public class EjemploAutomovilEnum {
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
        mazda.setEstanque(new Estanque(45));
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        System.out.println(mazda.detalle());

        TipoAtumovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru = " + tipo.getNombre());
        System.out.println("Tipo subaru descripcion = " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case CUPE -> System.out.println("El automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano, aspecto deportivo");
            case SEDAN -> System.out.println("Es un automovil mediano o commune y corriente");
        }

        TipoAtumovil[] tipos = TipoAtumovil.values();
        for (TipoAtumovil tipoAtumovil : tipos){
            System.out.println(tipoAtumovil + " => " + tipoAtumovil.name() + ", " +
                    tipoAtumovil.getNombre() + ", " + tipoAtumovil.getDescripcion() +
                    ", " + tipoAtumovil.getNumeroPuertas());
            System.out.println();
        }








    }

}
