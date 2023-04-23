import java.util.Random;

public class Hilo2 implements Runnable {
    protected String nombre;
    protected int iteracion;
    protected double demora;

    public Hilo2(String hilo2) {
    }

    public Hilo2(String nombre, int iteracion, double demora) {
        this.nombre = nombre;
        this.iteracion = iteracion;
        this.demora = demora;

    }

    @Override
    public void run() {
        for (int i = 0; i < iteracion; i++) {
            System.out.println("Este es el hilo implementado " + this.nombre + " y esta es la iteracion " + i);
            try {
                Thread.sleep((long) this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
