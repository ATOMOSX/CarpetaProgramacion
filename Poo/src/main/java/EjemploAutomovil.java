public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setCilindrada(1926.5);
        subaru.setColor(Color.GRIS);

        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setCilindrada(3000.0);
        mazda.setColor(Color.AMARILLO);

        Automovil nissan = new Automovil("Nissan", "GTR", Color.AZUL, 5000.0, 50);

        Automovil nissan2 = new Automovil("Nissan", "GTR", Color.BLANCO, 5000.0, 50);

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
