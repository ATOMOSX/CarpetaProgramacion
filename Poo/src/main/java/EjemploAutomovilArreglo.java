import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {
        Persona conductorSubaru = new Persona("Lucia", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(3.5, EnumTipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAtumovil.CUPE);
        subaru.setPropietario(conductorSubaru);


        Persona conductorMazda = new Persona("Pato", "Ramirez");
        Motor motorMazda = new Motor(3.0, EnumTipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setMotor(motorMazda);
        mazda.setColor(Color.ROJO);
        mazda.setTipo(TipoAtumovil.HATCHBACK);
        mazda.setPropietario(conductorMazda);


        Persona conductorNissan = new Persona("Bea", "Rodriguez");
        Automovil nissan = new Automovil("Nissan", "GTR", Color.BLANCO, new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));
        nissan.setPropietario(conductorNissan);
        nissan.setTipo(TipoAtumovil.CONVERTIBLE);


        Automovil[] autos = new Automovil[3];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }
}
