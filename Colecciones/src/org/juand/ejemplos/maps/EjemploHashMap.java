package org.juand.ejemplos.maps;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("edad", "30");
        persona.put("email", "juand.lopez@correo.com.edu.es");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
    }

}
