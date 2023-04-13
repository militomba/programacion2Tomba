import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Empleado e1 = new Empleado("Mili", "Tomba", 59128, 4);
        Empleado e2 = new Empleado("Ivan", "Freiberg", 59129, 4);
        Empleado e3 = new Empleado("Nahuel", "Silva", 59127, 3);
        Empleado e4 = new Empleado("Agustina", "Capo", 59125, 3);
        Empleado e5 = new Empleado("Mica", "Tosi", 59167, 2);

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        Map<String, Empleado> empleadosMap = new HashMap<>();
        empleadosMap.put(e1.apellido+","+e1.nombre, e1);
        empleadosMap.put(e2.apellido+","+e2.nombre, e2);
        empleadosMap.put(e3.apellido+","+e3.nombre, e3);
        empleadosMap.put(e4.apellido+","+e4.nombre, e4);
        empleadosMap.put(e5.apellido+","+e5.nombre, e5);

        for (Map.Entry<String, Empleado> entrada : empleadosMap.entrySet()){
            String clave = entrada.getKey();
            Empleado empleado = entrada.getValue();
            System.out.println("\nClave --> "+clave + "\nCaracteristicas: " + empleado.toString());
        }
    }
}