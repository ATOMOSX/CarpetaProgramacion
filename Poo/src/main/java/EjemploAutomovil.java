public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil automovil = new Automovil();

        automovil.fabricante = "Subaru";
        automovil.modelo = "Impreza";
        automovil.cilindrada = 1926.5;
        automovil.color = "Blanco";

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "Mx-5";
        mazda.cilindrada = 3000.0;
        mazda.color = "Rojo";

        System.out.println("automovil.color = " + automovil.color);
        System.out.println("automovil.fabricante = " + automovil.fabricante);
        System.out.println("automovil.modelo = " + automovil.modelo);
        System.out.println("automovil.cilindrada = " + automovil.cilindrada);

        System.out.println();

        System.out.println("automovil.color = " + mazda.color);
        System.out.println("automovil.fabricante = " + mazda.fabricante);
        System.out.println("automovil.modelo = " + mazda.modelo);
        System.out.println("automovil.cilindrada = " + mazda.cilindrada);

    }

}
