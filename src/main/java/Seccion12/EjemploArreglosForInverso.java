package Seccion12;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"TV", "Computador todo en uno", "Iphone", "SSD", "Disco duro", "Motorola", "Moto"};
        int total = productos.length;

       /* productos[0] = "TV";
        productos[1] = "Computador todo en uno";
        productos[2] = "Iphone";
        productos[3] = "SSD";
        productos[4] = "Disco duro";
        productos[5] = "Motorola";
        productos[6] = "Moto";*/

        Arrays.sort(productos);

        System.out.println("===== Usando for =====");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice  " + i + ": " + productos[i]);
        }

        System.out.println("===== Usando for inverso =====");

        for (int i = 0; i < total; i++){
            System.out.println("Para i " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println("===== Usando for inverso 2=====");
        for (int i = total - 1; i >= 0; i--){
            System.out.println("Para i = " + i + " Valor: " + productos[i]);
        }

    }
}
