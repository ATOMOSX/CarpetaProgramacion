public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(1926.5);
        subaru.asignarColor("Negro");

        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("Mx-5");
        mazda.asignarCilindrada(3000.0);
        mazda.asignarColor("Rojo");
        
        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerar(2500));
        System.out.println(subaru.frenar());
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));

        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarFrenar(3000));
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 60));

    }

}
