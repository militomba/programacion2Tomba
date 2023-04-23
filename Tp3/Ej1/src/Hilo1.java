import java.util.Random;

public class Hilo1 extends Thread{
    protected String nombre;



    public Hilo1(String nombre) {
        this.nombre = nombre;


    }


    @Override
    public void run() {

        Random random = new Random();
        int iteracion = random.nextInt(31)+10;
        int demora = random.nextInt(31)+10;
        for (int i=0; i<iteracion;i++){
            System.out.println("Este es el hilo extendido "+ this.nombre + " y esta es la iteracion "+i);
            try {
                Thread.sleep(demora);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }

    }
}
