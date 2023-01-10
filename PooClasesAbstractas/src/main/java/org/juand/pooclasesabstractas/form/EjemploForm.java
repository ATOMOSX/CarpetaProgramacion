package org.juand.pooclasesabstractas.form;

import org.juand.pooclasesabstractas.form.elementos.ElementoForm;
import org.juand.pooclasesabstractas.form.elementos.*;
import org.juand.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {

        //Ejemplo de como crear una clase anonima, se comenta para no afectar el codigo
        /*ElementoForm elementoForm = new ElementoForm(){

            @Override
            public String dibujarHtml() {
                return null;
            }
        };*/

        InputForm username = new InputForm("username");
        InputForm pasword = new InputForm("clave", "pasword");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguahe = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguahe.addOpcion(java);
        lenguahe.addOpcion(new Opcion("2", "Python"));
        lenguahe.addOpcion(new Opcion("3", "JavaScript"));
        lenguahe.addOpcion(new Opcion("4", "TypeScript"));
        lenguahe.addOpcion(new Opcion("5", "PHP"));

        username.setValor("juand.lopezm");
        pasword.setValor("12345");
        email.setValor("juand.lopezm@correo.edu.co");
        edad.setValor("22");
        java.setSelected(true);

    }
}
