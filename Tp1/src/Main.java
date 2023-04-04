import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Mili");
        nombre.add("Juan");
        nombre.add("Agus");
        nombre.add("Mica");
        nombre.add("Cande");

        ArrayList<String> apellido = new ArrayList<String>();
        apellido.add("Tomba");
        apellido.add("Ozollo");
        apellido.add("Tomba");
        apellido.add("Tosi");
        apellido.add("Martinez");

        List<Persona> personas = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i<5; i++){
            String n = nombre.get(i);
            String a = apellido.get(i);
            int edad = random.nextInt(20, 50);
            Persona person = new Persona(n,a,edad);
            personas.add(person);
        }
        System.out.println("Lista de personas: ");
        int num = 1;
        for(Persona persona : personas){
           System.out.println("\nPersona "+ num++ +"\n" + persona.toString());
        }

        Persona personaMayor = personas.get(0);
        for(Persona persona : personas){
            if(persona.edad > personaMayor.edad){
                personaMayor = persona;
            }
        }
        System.out.println("\nLa persona mayor es:\n" + personaMayor.toString());


    }
}