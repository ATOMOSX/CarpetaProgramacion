package Seccion4;

import java.util.Scanner;

public class OperadorerTernarioLogin {
    public static void main(String[] args) {

        String [] usernames ={"juanda", "Admin", "Dani"};
        String [] passwords ={"12345", "2912", "9199"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el Username");

        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password");

        String contraseña = scanner.nextLine();

        boolean esAutenticado = false;
        for (int i = 0; i< usernames.length; i++){

            esAutenticado = (usernames[i].equalsIgnoreCase(usuario)
                    && passwords[i].equalsIgnoreCase(contraseña))
                    ? true : esAutenticado;
        /*    if (usernames[i].equalsIgnoreCase(usuario) && passwords[i].equalsIgnoreCase(contraseña)){
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario.toUpperCase().trim())
                : "username o contraseña incorrecta \nLo siento, requiere autenticación";
        System.out.println(mensaje);

        /*if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario.toUpperCase()));
        }else {
            System.out.println("username o contraseña incorrecta");
            System.out.println("Lo siento, requiere autenticación");
        }*/

    }
}
