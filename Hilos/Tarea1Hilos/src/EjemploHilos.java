public class EjemploHilos {
    public static void main(String[] args) {

        HiloAlfanumerico tarea1 = new HiloAlfanumerico(Tipo.LETRA);
        HiloAlfanumerico tarea2 = new HiloAlfanumerico(Tipo.NUMERO);

        Thread t1 = new Thread(tarea1);
        Thread t2 = new Thread(tarea2);

        t1.start();
        t2.start();
    }
}
