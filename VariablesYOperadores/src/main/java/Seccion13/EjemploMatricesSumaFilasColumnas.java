package Seccion13;

public class EjemploMatricesSumaFilasColumnas {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaFila, sumaColumna;

        for (int i = 0; i < 3; i++){
            sumaFila = 0;
            sumaColumna = 0;

            for (int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            System.out.println("Total fila " + i + ": " + sumaFila);
            System.out.println("Total columna " + i + ": " + sumaColumna);
        }
    }
}
