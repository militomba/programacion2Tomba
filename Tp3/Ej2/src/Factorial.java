import java.util.List;

public class Factorial extends Thread{
    private List<Integer> lista;
    private String name;

    public Factorial(List<Integer> lista, String name) {
        this.lista = lista;
        this.name = name;
    }

    @Override
    public void run() {


        while(!lista.isEmpty()){
            int num =  lista.remove(0);
            int factorial = 1;

            for(int i=1; i <= num; i++){
                factorial *= i;

            }
            System.out.println("\nHilo: "+this.name+
                    "\nProcesando la lista.\n" +
                    "Valor a calcular: "+ num+
                    "\nResultado: "+factorial+
                    "\nQuedan "+lista.size() + " elementos en la lista");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }



        }
    }
}
