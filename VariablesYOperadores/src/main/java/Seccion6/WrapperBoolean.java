package Seccion6;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer numero1, numero2;
        numero1 = 1;
        numero2 = 2;

        boolean primBoolean = numero1 > numero2; //False
        Boolean objBoolean = Boolean.valueOf(primBoolean); //En este utilizamos el valueOf del Boolean.
        Boolean objBoolean2 = Boolean.valueOf(false); //En este utilizamos el valueOf del String.

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //Ahora vamos a comprar dos objetos Boolean por la instancia.
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean == objBoolean2));
        //Podemos ver que no se comporta igual que los objetos enteros, ya que este si se va a comparar por el valor.

    }
}
