public class Main {
    public static void main(String[] args) throws Excepciones {
        ListaGenerica<Empleados> listaEmpleados = new ListaGenerica<Empleados>();
        Empleados empleado1 = new Empleados("Mili", "Tomba", 59128, 4);
        Empleados empleado2 = new Empleados("Ivan", "Freiberg", 59129, 4);
        Empleados empleado3 = new Empleados("Nahuel", "Silva", 59127, 3);

        //1
        listaEmpleados.agregarElemento(empleado1);
        listaEmpleados.agregarElemento(empleado2);
        listaEmpleados.agregarElemento(empleado3);

        //2
        System.out.println("1-Lista Empleados: ");
        for(Empleados empleado : listaEmpleados.getListaEmpleados()){
            System.out.println(empleado.toString());
        }
        //3
        System.out.println("\n------------------------------------------");
        System.out.println("\n2-Tamaño de la lista: " + listaEmpleados.getSizeLista());

        //4
        System.out.println("\n------------------------------------------");
        listaEmpleados.agregarElementoPosCero(new Empleados("Agus", "Capo", 59876, 5));
        System.out.println("\n3-Lista con el nuevo empleado en la prosicion cero : ");
        for(Empleados empleado : listaEmpleados.getListaEmpleados()){
            System.out.println(empleado.toString());
        }

        //5
        System.out.println("\n------------------------------------------");
        System.out.println("4-Lista ordenada por legajos: " );
        listaEmpleados.ordenarListaEmpleados();
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        //6
        System.out.println("\n------------------------------------------");
        System.out.println("5Lista desordenada");
        listaEmpleados.desordenarListaEmpleados();
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        //7
        System.out.println("\n------------------------------------------");
        try {
            listaEmpleados.almacenarNuevoElemento(new Empleados("Juan", "Ozollo", 56457, 3), 2);
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage() );
        }
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        //8
        System.out.println("\n------------------------------------------");

        try {
            System.out.println(listaEmpleados.getEmpleadoCualquierPos(3));
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

        //9
        System.out.println("\n------------------------------------------");
        System.out.println("8-Mostrar el primer elemento de la lista: ");

        try{
            System.out.println(listaEmpleados.getElementoPosCero());
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

        //10
        System.out.println("\n------------------------------------------");
        System.out.println("9-Mostrar el ultimo elemento de la lista: ");
        try{
            System.out.println(listaEmpleados.getEmpleadoUlitmaPos());
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

        //11
        System.out.println("\n------------------------------------------");
        listaEmpleados.eliminarElemento(1);
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

        System.out.println("\n-----------------EXCEPCIONES-------------------------");
        //7
        System.out.println("Excepcion para el 6");
        try {
            listaEmpleados.almacenarNuevoElemento(new Empleados("Juan", "Ozollo", 56457, 3), 7);
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage() );
        }

        //8
        System.out.println("\n------------------------------------------");
        System.out.println("Excepcion para el 7");
        try {
            System.out.println(listaEmpleados.getEmpleadoCualquierPos(6));
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

        //11
        System.out.println("\n------------------------------------------");
        System.out.println("Excepcion para el 10");
        try {
            listaEmpleados.eliminarElemento(7);
            for (Empleados empleado : listaEmpleados.getListaEmpleados()) {
                System.out.println(empleado.toString());
            }
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }
        //-----------Vaciar lista
        listaEmpleados.vaciarLista();

        //9
        System.out.println("\n------------------------------------------");
        System.out.println("Excepcion para el 8");
        System.out.println("Mostrar el primer elemento de la lista: ");

        try{
            System.out.println(listaEmpleados.getElementoPosCero());
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

        //10
        System.out.println("Excepcion para el 9");
        System.out.println("\n------------------------------------------");
        System.out.println("Mostrar el ultimo elemento de la lista: ");
        try{
            System.out.println(listaEmpleados.getEmpleadoUlitmaPos());
        }catch (Excepciones e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}