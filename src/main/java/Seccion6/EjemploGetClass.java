package Seccion6;

import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {

        String texto = "Hola, qué tal?";

        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method method: strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

        Integer numero = 32;
        Class intClass = numero.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

        for (Method method: objClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
