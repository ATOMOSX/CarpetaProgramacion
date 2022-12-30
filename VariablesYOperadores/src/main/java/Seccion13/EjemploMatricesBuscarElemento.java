package Seccion13;

public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {

        int[][] matirzEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 30, 5},
                {677, 127, 32767, 1242}
        };

        int elemtentoBuscar = 15;
        boolean encontrado = false;

        int i = 0;
        int j = 0;

        buscar:
        for (i = 0; i < matirzEnteros.length; i++){
            for (j = 0; j < matirzEnteros[i].length; j++){
                if (matirzEnteros[i][j] == elemtentoBuscar){
                    encontrado = true;
                    break  buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado " + elemtentoBuscar + " En las coordenadas " + i + ", " + j);
        }else {
            System.out.println(elemtentoBuscar + " no se encontro");
        }
    }
}
