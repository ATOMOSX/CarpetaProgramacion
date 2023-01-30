package org.juand.ejemplos.maps;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put("nombre", "Jhon");
        persona.put("apellido paterno", "Doe");
        persona.put("apellido materno", "Muñoz");
        persona.put("edad", "30");
        persona.put("email", "juand.lopez@correo.com.edu.es");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "177");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido paterno");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String estado = direccionPersona.get("estado");
        String ciudad = direccionPersona.get("ciudad");
        String calle = direccionPersona.get("calle");
        String numero = direccionPersona.get("numero");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        System.out.println("El pais de " + nombre + " es " + pais);
        System.out.println("Vive en el estado de " + estado);
        System.out.println("La ciudad se llama " + ciudad);
        System.out.println("Con calle " + calle + " numero " + numero);
        System.out.println("En el barrio " + barrio);

        String valorApellido = (String) persona.remove("apellido materno");
        boolean b = persona.remove("apellido materno", "Muñoz");
        System.out.println("Valor eliminado = " + valorApellido);
        System.out.println("b = " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellido paterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("Doe");
        System.out.println("b2 = " + b2);

        System.out.println("=========== Collection ===========");
        Collection<Object> valores = persona.values();
        for (Object valor : valores) {
            System.out.println("valor = " + valor);
        }

        System.out.println("=========== Set ===========");
        Set<String> llaves = persona.keySet();
        for (String llave : llaves) {
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " =>" + parDir.getValue());
                }
            } else {
                System.out.println(llave + " => " + valor);
            }
            System.out.println("valor = " + llave);
        }

        System.out.println("=========== Map entrySet ===========");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            Object valor = par.getValue();
            if (valor instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get("nombre") + " : " + direccionMap.get("pais"));
                System.out.println("El estado de " + persona.get("estado") + " : " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + persona.get("nombre") + " : " + direccionMap.get("ciudad "));
            } else {
                System.out.println(par.getKey() + " => " + par.getValue());
            }
        }

        System.out.println("=========== Map keySet ===========");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("=========== forEach ===========");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());

        //para modificar elementos
        persona.replace("nombre", "Andres");
        boolean b3 = persona.replace("nombre", "Juan", "Andres");
        System.out.println(persona);
        System.out.println("b3 = " + b3);
    }

}
