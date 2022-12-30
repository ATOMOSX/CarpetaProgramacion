package Seccion12;

public class EjemploArreglosForBurbujaReutilizado {
    public static void arregloInverso (String [] arreglo) {

        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - i - 1];
            arreglo[i] = inverso;
            arreglo[total - i - 1] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total ;i++){
            for (int j = 0; j < total - 1 - i; j++){
                if ( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0){
                    Object aux = arreglo[j];
                    arreglo[i] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
    }

    public static void main(String[] args) {

        String[] productos = {"TV", "Computador todo en uno", "Iphone", "SSD", "Disco duro", "Motorola", "Moto"};
        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("===== Usando for =====");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice  " + i + ": " + productos[i]);
        }

        Integer [] numero = new Integer[4];

        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;

        sortBurbuja(numero);

        for (int i = 0; i < numero.length; i++){
            System.out.println("Numero " + i + " : " + numero[i ]);
        }
    }
}

