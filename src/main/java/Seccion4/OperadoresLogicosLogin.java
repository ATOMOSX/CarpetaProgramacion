package Seccion4;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
          // una forma de declarar arreglos, pero es poco practico
//        String [] usernames = new String[3];
//        String [] passwords = new String[3];
//        usernames[0] = "juanda";
//        passwords[0] = "12345";
//
//        usernames[1]  = "admin";
//        passwords[1] = "2912";
//
//        usernames[2]  = "Dani";
//        passwords[2] = "9199";

        String [] usernames ={"juanda", "Admin", "Dani"};
        String [] passwords ={"12345", "2912", "9199"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el Username");

        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password");

        String contraseña = scanner.nextLine();

        boolean esAutenticado = false;
        for (int i = 0; i< usernames.length; i++){

            if (usernames[i].equalsIgnoreCase(usuario) && passwords[i].equalsIgnoreCase(contraseña)){
                esAutenticado = true;
                break;
            }
        }
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario));
        }else {
            System.out.println("username o contraseña incorrecta");
            System.out.println("Lo siento, requiere autenticación");
        }

    }
}
