import java.util.concurrent.TimeUnit;

public class HiloAlfanumerico implements Runnable {

    private Tipo tipo;

    public HiloAlfanumerico(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        switch (tipo){
            case NUMERO -> {
                for (int i = 0; i <= 10; i++){
                    System.out.println("Numero: "+i);
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finaliza la tarea de numero");
            }
            case LETRA -> {
                for (char letra = 'A'; letra <= 'Z'; letra++){
                    System.out.println("Letra: "+letra);
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finaliza la tarea de letra");
            }
        }
    }
}
