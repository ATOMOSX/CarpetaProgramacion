package org.juand.pooclasesabstractas.form;

import org.juand.pooclasesabstractas.form.elementos.*;
import org.juand.pooclasesabstractas.form.elementos.select.Opcion;
import org.juand.pooclasesabstractas.form.validador.*;

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
        username.addValidador(new RequeridoValidador());
        InputForm pasword = new InputForm("clave", "password");
        pasword.addValidador(new RequeridoValidador());
        pasword.addValidador(new LargoValidadoer(6, 12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador()).addValidador(new LargoValidadoer());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguahe = new SelectForm("lenguaje");
        lenguahe.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1", "Java");
        lenguahe.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript").setSelected())
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        //Creamos una clase anonima sencilla con un saludo
        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disable name='" + this.nombre + "' value=\""+ this.valor +"\">";
            }
        };

        saludar.setValor("Hola, este campo esta desabilitado");
        username.setValor("juand.lopezm");
        pasword.setValor("123456b1bx75");
        email.setValor("jua.nd@correo.com");
        edad.setValor("22");
        experiencia.setValor("... Mas de 2 años de experiencia ...");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username, pasword, email,
                email, experiencia, lenguahe, saludar);

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

        //Creamos otro for each para iterar el addValidador
        elementos.forEach(elementoForm -> {
            if (!elementoForm.esValido()){
                elementoForm.getErrores().forEach(System.out::println);
            }
        });
    }
}
