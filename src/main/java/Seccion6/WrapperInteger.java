package Seccion6;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        //Formas de declarar un Integer.
        Integer intObjeto1 = Integer.valueOf(intPrimitivo);//En esta esta recibiendo una variable primitiva.
        Integer intObjeto2 = Integer.valueOf(32768); //Esta es una forma explicita de declararlo.
        Integer intObjeto3 = 32768; //Esta es otra forma de declararlo implicitamente, en todas son correctas.
        Integer intObjeto4 = intPrimitivo;
        System.out.println("intObjeto1 = " + intObjeto1);

        //Ahora vamos a convertir un objeto de referencia a un tipo primitivo.
        int num = intObjeto1; //Esta es una forma implicita de convertirlo.
        System.out.println("num = " + num);
        int num2 = intObjeto1.intValue(); //Esta forma es la explicita, pero practicamente ambos estan realizando la misma funcion.
        System.out.println("num2 = " + num2);

        //Ahora vamos a convertir un String a un objeto de referencia.
        String valorTVLED = "1759000"; //asignamos el String en este caso sera el valor de un TV.
        Integer valor = Integer.valueOf(valorTVLED); //Aqui haremos la conversion del String a Integer.
        System.out.println("valor = " + valor);

        //Ahora vamos a convertir un short.
        short shortObjeto = intObjeto1.shortValue(); //Pero en este caso tendremos perdida de informacion.
        System.out.println("shortObjeto = " + shortObjeto); //Recordemos que el short el numero maximo es 32797.

        //Ahora vamos a convertir en un byte.
        byte byteObjeto = intObjeto1.byteValue(); //En este caso tambien tendremos perdida de informacion.
        System.out.println("byteObjeto = " + byteObjeto); //Recordemos que el byte el numero maximo es 127.

        //Ahora lo haremos con el objeto de referencia Long.
        Long longObjeto = intObjeto1.longValue(); //En este caso vemos que el long tiene mayor capacidad de infmoracion.
        System.out.println("longObjeto = " + longObjeto); // Y no habra perdida de informacion.
        


    }
}
