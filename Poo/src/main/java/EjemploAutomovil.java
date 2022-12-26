public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 1926.5;
        subaru.color = "Negro";

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "Mx-5";
        mazda.cilindrada = 3000.0;
        mazda.color = "Rojo";

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
    }

}
