package Seccion13;

public class EjemploMatricesIdentidad {
    public static void main(String[] args) {

        int [][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
