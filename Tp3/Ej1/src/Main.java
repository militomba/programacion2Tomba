import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Hilo1 h1 = new Hilo1("1");
        Hilo1 h2 = new Hilo1("2");
        Hilo1 h3 = new Hilo1("3");
        Hilo1 h4 = new Hilo1("4");


        Hilo2 hilo1 = new Hilo2("1", 20, 900);
        Hilo2 hilo2 = new Hilo2("2", 3, 980);
        Hilo2 hilo3 = new Hilo2("3", 1, 70);
        Hilo2 hilo4 = new Hilo2("4", 12, 500);


        h1.start();
        h2.start();
        h3.start();
        h4.start();



        new Thread(hilo1).start();
        new Thread(hilo2).start();
        new Thread(hilo3).start();
        new Thread(hilo4).start();


    }

}