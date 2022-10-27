package Seccion3;

public class StringTestRendimientoConcat {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder ab = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i  < 50; i++){

            //c = c.concat(a).concat(b).concat("\n");
            ab.append(a).append(b).append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("ab = " + ab.toString());
    }
}