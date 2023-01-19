package juand.poo.interfaces.repositorio.exception.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> camionCaballos = new Camion<>(3);
        camionCaballos.addObjeto(new Animal("Peregrino", "Caballo"));
        camionCaballos.addObjeto(new Animal("Porcino", "Caballo"));
        camionCaballos.addObjeto(new Animal("Tunquen", "Caballo"));
        imprimirCamion(camionCaballos);

        Camion<Maquinaria> transMaquinaria = new Camion<>(3);
        transMaquinaria.addObjeto(new Maquinaria("Buldozer"));
        transMaquinaria.addObjeto(new Maquinaria("Grúa horquilla"));
        transMaquinaria.addObjeto(new Maquinaria("Perforadora"));
        imprimirCamion(transMaquinaria);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.addObjeto(new Automovil("Mazda"));
        transAuto.addObjeto(new Automovil("Nissan"));
        transAuto.addObjeto(new Automovil("Chevrolet"));
        imprimirCamion(transAuto);
    }

    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a : camion){
            if (a instanceof Animal animal){
                System.out.println(animal.getNombre() + " tipo: " + animal.getTipo());
            } else if (a instanceof Maquinaria maquinaria) {
                System.out.println("Tipo de maquinaria: " + maquinaria.getTipo());
            }else if (a instanceof Automovil automovil){
                System.out.println("Marca de automovil: " + automovil.getMarca());
            }
        }
    }
}
