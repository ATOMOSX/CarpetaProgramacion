package org.juand.ejemplos.maps;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put("nombre", "Jhon");
        persona.put("apellido paterno", "Doe");
        persona.put("apellido materno", "Muñoz");
        persona.put("edad", "30");
        persona.put("email", "juand.lopez@correo.com.edu.es");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        String valorApellido = persona.remove("apellido materno");
        boolean b = persona.remove("apellido materno", "Muñoz");
        System.out.println("Valor eliminado = " + valorApellido);
        System.out.println("b = " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellido paterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("Doe");
        System.out.println("b2 = " + b2);

        System.out.println("=========== Collection ===========");
        Collection<String> valores = persona.values();
        for (String valor : valores){
            System.out.println("valor = " + valor);
        }

        System.out.println("=========== Set ===========");
        Set<String> llaves = persona.keySet();
        for (String valor : llaves){
            System.out.println("valor = " + valor);
        }

        System.out.println("=========== Map entrySet ===========");
        for (Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("=========== Map keySet ===========");
        for (String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " +  valor);
        }

        System.out.println("=========== forEach ===========");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " +  valor);
        });

        System.out.println("Total: " +persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());

        //para modificar elementos
        persona.replace("nombre", "Andres");
        boolean b3 = persona.replace("nombre", "Juan", "Andres");
        System.out.println(persona);
        System.out.println("b3 = " + b3);
    }

}
