package Seccion13;

public class EjemploMatricesTamanoVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("matriz = " + matriz.length);
        System.out.println("matriz[0].length = " + matriz[0].length);
        System.out.println("matriz[1].length = " + matriz[1].length);
        System.out.println("matriz[2].length = " + matriz[2].length);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i * j;
            }
        }

        for (int[] fila : matriz){
            for (int nombre : fila){
                System.out.print(nombre + " \t " );
            }
            System.out.println();
        }
    }

}
