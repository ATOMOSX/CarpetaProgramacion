public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setMotor(new Motor(3.5, EnumTipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.GRIS);

        Motor motorMazda = new Motor(3.0, EnumTipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setMotor(motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setColor(Color.AMARILLO);

        Automovil nissan = new Automovil("Nissan", "GTR", Color.AZUL, new Motor(4.4,
                EnumTipoMotor.BENCINA), new Estanque());

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.BLANCO, new Motor(4.0,
                EnumTipoMotor.DISEL), new Estanque(50));

        Automovil kia = new Automovil();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println("Son iguales con equals? " + (kia.equals(nissan2)));
        System.out.println();
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerar(2500));
        System.out.println(subaru.frenar());
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));

        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarFrenar(3000));
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 60));

        System.out.println(nissan.detalle());
        System.out.println("Kilometros por litros " + nissan.calcularConsumo(300, 60));

    }

}
