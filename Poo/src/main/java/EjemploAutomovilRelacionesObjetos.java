public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[4] = new Rueda("Yokohama", 16, 7.5);

        Persona conductorSubaru = new Persona("Lucia", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setMotor(new Motor(3.5, EnumTipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAtumovil.CUPE);
        subaru.setPropietario(conductorSubaru);
        subaru.setRuedas(ruedasSubaru);
        System.out.println(subaru.detalle());

        Rueda[] ruedasMazda = {new Rueda("Michellin", 18, 10.5),
                new Rueda("Michellin", 18, 10.5),
                new Rueda("Michellin", 18, 10.5),
                new Rueda("Michellin", 18, 10.5)};

        Persona conductorMazda = new Persona("Pato", "Ramirez");
        Motor motorMazda = new Motor(3.0, EnumTipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setMotor(motorMazda);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        mazda.setPropietario(conductorMazda);
        mazda.setRuedas(ruedasMazda);
        System.out.println(mazda.detalle());

        Rueda[] ruedasNissan = {new Rueda("Pirelli", 17, 11.0),
                new Rueda("Pirelli", 17, 11.0),
                new Rueda("Pirelli", 17, 11.0),
                new Rueda("Pirelli", 17, 11.0)};

        Persona conductorNissan = new Persona("Bea", "Rodriguez");
        Automovil nissan = new Automovil("Nissan", "GTR", Color.BLANCO,new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan.setPropietario(conductorNissan);
        nissan.setRuedas(ruedasNissan);
        nissan.setTipo(TipoAtumovil.CONVERTIBLE);
        System.out.println(nissan.detalle());

        conductorNissan = new Persona("Juan", "Lopez");
        Automovil nissan2 = new Automovil("Nissan", "GTR", Color.VERDE, new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan2.setPropietario(conductorNissan);
        nissan2.setRuedas(ruedasNissan);
        System.out.println(nissan2.detalle());
        
    }
}
