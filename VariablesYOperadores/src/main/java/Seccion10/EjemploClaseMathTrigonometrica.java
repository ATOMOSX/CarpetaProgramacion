package Seccion10;

public class EjemploClaseMathTrigonometrica {
    public static void main(String[] args) {

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(2);
        System.out.println("log = " + log);

        double potencia = Math.pow(10 , 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir de radianes a grados = " + grados);
        grados = Math.round(grados);

        double radianes = Math.toRadians(90);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin (90) : " + Math.sin(radianes));
        System.out.println("cos (90) : " + Math.cos(radianes));
        System.out.println("tan (90) : " + Math.tan(radianes));

        radianes = Math.toRadians(180);
        System.out.println("sin (180) : " + Math.sin(radianes));
        System.out.println("cos (180) : " + Math.cos(radianes));
        System.out.println("tan (180) : " + Math.tan(radianes));

        radianes = Math.toRadians(0);
        System.out.println("sin (0) : " + Math.sin(radianes));
        System.out.println("cos (0) : " + Math.cos(radianes));
        System.out.println("tan (0) : " + Math.tan(radianes));

    }
}
