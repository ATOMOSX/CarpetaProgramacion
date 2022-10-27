package Seccion4;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;

        i += 2;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= 3;
        System.out.println("j = " + j);

        String sqlString = "select * form clientes as c";
        sqlString += "where c.nombre 'Juan David' ";
        sqlString += "and c.activo = 1";
        System.out.println("sqlString = " + sqlString);
    }
}
