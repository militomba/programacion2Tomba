import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Excepciones {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Empleado e1 = new Empleado("Mili", "Tomba", "59128", 4);
        Empleado e2 = new Empleado("Ivan", "Freiberg", "59129", 4);
        Empleado e3 = new Empleado("Nahuel", "Silva", "59127", 3);
        Empleado e4 = new Empleado("Agustina", "Capo", "59125", 3);
        Empleado e5 = new Empleado("Mica", "Tosi", "59167", 2);

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);

        String empleado1 = "nombre=Mili, Apellido=Tomba, legajo= 59128, añosTrabajando=3" ;
        String empleado2 = "Nombre=Mili, apellido=Tomba, legajo= 59128, añosTrabajando=3" ;
        String empleado3 = "nombre=Mili, apellido=Tomba, leGajo= 59128, añosTrabajando=3" ;
        String empleado4 = "nombre=Mili, apellido=Tomba, legajo= 59128, AñosTrabajando=3" ;
        String empleado5 = "noMbre=Mili, apellidO=Tomba, legajo= 59128, añosTrabajando=3" ;

        Empleado emp1 = Empleado.fromString(empleado1);
        Empleado emp2 = Empleado.fromString(empleado2);
        Empleado emp3 = Empleado.fromString(empleado3);
        Empleado emp4 = Empleado.fromString(empleado4);
        Empleado emp5 = Empleado.fromString(empleado5);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());
    }
}