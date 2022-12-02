package Seccion6;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer numero1 = Integer.valueOf(1000);
        Integer numero2 = numero1;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        System.out.println("Son el mismo objeto? " + (numero1 == numero2));

        //Java compara en este caso por el valor hasta un maximo de 127 si lo supera compara por el objeto.
        numero2 = 1000;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        //En este no son iguales porque esta comparando por el objero y no por el valor (Pueden tener el mismo valor
        //pero no son el mismo objeto).
        System.out.println("Son el mismo objeto? " + (numero1 == numero2));

        //En este caso estamos comparando los valores de estas dos clases.
        System.out.println("Son el mismo valor? " + (numero1.equals(numero2)));
        //Esta es otra forma de comparar el valor que estan asignadas en las clases.
        System.out.println("Son el mismo valor? " + (numero1.intValue() == numero2.intValue()));

        //Ahora vamos a comparar una condicion
        numero2 = 500;
        //De esta forma lo esta haciendo con un autoboxing.
        boolean condicion = numero1 > numero2;
        System.out.println("condicion = " + condicion);

        //De esta otra forma lo esta haciendo de una forma explicita, pero ambas son iguales.
        boolean condicion2 = numero1.intValue() > numero2.intValue();
        System.out.println("condicion2 = " + condicion2);

    }
}
