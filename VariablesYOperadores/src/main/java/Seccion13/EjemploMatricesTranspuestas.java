package Seccion13;

public class EjemploMatricesTranspuestas {
    public static void main(String[] args) {

        int [][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {14, 15, 16, 17},
        };

        System.out.println("================== Matriz original ==================");
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " \t");
            }
            System.out.println();
        }

        int aux;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("================== Matriz transpuesta ==================");
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " \t");
            }
            System.out.println();
        }
    }
}
