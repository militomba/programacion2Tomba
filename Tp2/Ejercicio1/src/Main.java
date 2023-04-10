import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //Coleccion SET
        Set<Empleados> empleados = new HashSet<>();
        empleados.add(new Empleados("Mili", "Tomba", 59128, 4));
        empleados.add(new Empleados("Mili", "Tomba", 59128, 4));
        empleados.add(new Empleados("Ivan", "Freiberg", 59129, 4));
        empleados.add(new Empleados("Nahuel", "Silva", 59127, 3));
        empleados.add(new Empleados("Agus", "Capo", 59126, 2));
        //System.out.println(empleados.toString());

        System.out.println("LISTA DE EMPLEADOS REPETIDOS");
        //Iterar sobre el set y mostrar los objetos empleados
        Iterator<Empleados> empleadoSet = empleados.iterator();
        while (empleadoSet.hasNext()) {
            Empleados empleado = empleadoSet.next();
            System.out.println(empleado.toString());
        }

            Set<EmpleadoSet> empleadosSet = new HashSet<>();
            empleadosSet.add(new EmpleadoSet("Mili", "Tomba", 59128, 4));
            empleadosSet.add(new EmpleadoSet("Mili", "Tomba", 59128, 4));
            empleadosSet.add(new EmpleadoSet("Ivan", "Freiberg", 59129, 4));
            empleadosSet.add(new EmpleadoSet("Nahuel", "Silva", 59127, 3));
            empleadosSet.add(new EmpleadoSet("Agus", "Capo", 59126, 2));

            System.out.println("\nLISTA DE EMPLEADOS NO REPETIDOS");
            //Iterator<EmpleadoSet> empleadoNR = empleadosSet.iterator();
            for (EmpleadoSet emSet : empleadosSet) {
                System.out.println(emSet.toString());
                }
            }

    }
