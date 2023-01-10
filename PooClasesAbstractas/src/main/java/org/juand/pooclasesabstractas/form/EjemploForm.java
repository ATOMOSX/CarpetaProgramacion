package org.juand.pooclasesabstractas.form;

import org.juand.pooclasesabstractas.form.elementos.*;
import org.juand.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        lenguahe.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        username.setValor("juand.lopezm");
        pasword.setValor("12345");
        email.setValor("juand.lopezm@correo.edu.co");
        edad.setValor("22");
        experiencia.setValor("... Mas de 2 años de experiencia ...");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username, pasword, email,
                email, experiencia, lenguahe);

        //Esta es una forma de iterar
        for (ElementoForm elementoForm : elementos){
            System.out.println(elementoForm.dibujarHtml());
            System.out.println("<br>");
        }

        //Esta es otra forma de iterar mediante un forEach
        elementos.forEach(el ->{
            System.out.println(el.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
