import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<40;i++){
            list.add(new Random().nextInt(15 -3 + 1) + 3);
        }

        Factorial f1 = new Factorial(list, "Thread 1");
        f1.start();

        Factorial f2 = new Factorial(list, "Thread 2");
        f2.start();

        Factorial f3 = new Factorial(list, "Thread 3");
        f3.start();
    }
}