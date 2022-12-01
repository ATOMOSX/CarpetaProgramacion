package Seccion5;

public class SentenciasDeBucleBuscar {
    public static void main(String[] args) {

        String frase = "Tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length();


        int cantidad = 0;
        buscar:
        for (int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.toUpperCase().charAt(k++) != palabra.toUpperCase().charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado un total de = " + cantidad + " la palabra " + palabra + " en la frase: "
                            + frase.toUpperCase());
    }
}
