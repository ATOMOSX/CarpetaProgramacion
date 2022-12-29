public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Persona conductorSubaru = new Persona("Lucia", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setMotor(new Motor(3.5, EnumTipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAtumovil.CUPE);
        subaru.setPropietario(conductorSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRuedas(new Rueda("Yokohama", 16, 7.5));
        }
        System.out.println(subaru.detalle());

        Persona conductorMazda = new Persona("Pato", "Ramirez");
        Motor motorMazda = new Motor(3.0, EnumTipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setMotor(motorMazda);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        mazda.setPropietario(conductorMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++){
            mazda.addRuedas(new Rueda("Michellin", 18, 10.5));
        }
        System.out.println(mazda.detalle());

        Persona conductorNissan = new Persona("Bea", "Rodriguez");
        Automovil nissan = new Automovil("Nissan", "GTR", Color.BLANCO,new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan.setPropietario(conductorNissan);
        nissan.setTipo(TipoAtumovil.CONVERTIBLE);
        nissan.addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0));
        System.out.println(nissan.detalle());

        conductorNissan = new Persona("Juan", "Lopez");
        Automovil nissan2 = new Automovil("Nissan", "GTR", Color.VERDE, new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan2.setPropietario(conductorNissan);
        nissan2.addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0))
                .addRuedas(new Rueda("Pirelli", 17, 11.0));
        System.out.println(nissan2.detalle());

    }
}
