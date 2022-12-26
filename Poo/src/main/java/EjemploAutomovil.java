public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza" );
        subaru.setCilindrada(1926.5);
        subaru.setColor("Negro");

        Automovil mazda = new Automovil("Mazda", "Mx-5");
        mazda.setCilindrada(3000.0);
        mazda.setColor("Rojo");

        Automovil nissan = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerar(2500));
        System.out.println(subaru.frenar());
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));

        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarFrenar(3000));
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 60));

    }

}
