package org.juand.ejemplos.maps;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        //En el treeMap no pueden existir campos null
        //Podemos ordenar por el largo mas corto del String, el cual seria
        // Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));
        //pero si queremos desde el largo mas largo del String seria
        // Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
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

        System.out.println(persona);
    }
}
