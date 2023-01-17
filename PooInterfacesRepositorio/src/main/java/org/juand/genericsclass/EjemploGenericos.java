package org.juand.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion camionCaballos = new Camion(3);
        camionCaballos.addObjeto(new Animal("Peregrino", "Caballo"));
        camionCaballos.addObjeto(new Animal("Porcino", "Caballo"));
        camionCaballos.addObjeto(new Animal("Tunquen", "Caballo"));

        for (Object objeto : camionCaballos){
            Animal animal = (Animal) objeto;
            System.out.println(animal.getNombre() + " tipo: " + animal.getTipo());
        }

        Camion transMaquinaria = new Camion(3);
        transMaquinaria.addObjeto(new Maquinaria("Buldozer"));
        transMaquinaria.addObjeto(new Maquinaria("Grúa horquilla"));
        transMaquinaria.addObjeto(new Maquinaria("Perforadora"));

        for (Object objeto : transMaquinaria){
            Maquinaria maquinaria = (Maquinaria) objeto;
            System.out.println("Tipo de maquinaria: " + maquinaria.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.addObjeto(new Automovil("Mazda"));
        transAuto.addObjeto(new Automovil("Nissan"));
        transAuto.addObjeto(new Automovil("Chevrolet"));

        for (Object objeto : transAuto){
            Automovil automovil = (Automovil) objeto;
            System.out.println("Marca de automovil: " + automovil.getMarca());
        }
    }
}
