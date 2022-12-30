package Seccion3;

public class StringMetodos {

    public static void main(String[] args) {

        String nombre = "Juan David";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Juan David\") = " + nombre.equals("Juan David"));
        System.out.println("nombre.equals(\"Juan David\") = " + nombre.equals("juan david"));
        System.out.println("nombre.equalsIgnoreCase(\"Juan David\") = " + nombre.equalsIgnoreCase("Juan David"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));

        System.out.println("nombre.substring(6) = " + nombre.substring(6));
        System.out.println("nombre.substring(1,8) = " + nombre.substring(1,8));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "ñ"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('u') = " + trabalenguas.lastIndexOf('u'));
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());


    }
}
