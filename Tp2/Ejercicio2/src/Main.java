public class Main {
    public static void main(String[] args) {
        ListaGenerica<Empleados> listaEmpleados = new ListaGenerica<Empleados>();
        Empleados empleado1 = new Empleados("Mili", "Tomba", 59128, 4);
        Empleados empleado2 = new Empleados("Ivan", "Freiberg", 59129, 4);
        Empleados empleado3 = new Empleados("Nahuel", "Silva", 59127, 3);

        listaEmpleados.agregarElemento(empleado1);
        listaEmpleados.agregarElemento(empleado2);
        listaEmpleados.agregarElemento(empleado3);

        System.out.println("Lista Empleados: ");
        for(Empleados empleado : listaEmpleados.getListaEmpleados()){
            System.out.println(empleado.toString());
        }
        System.out.println("\n------------------------------------------");
        System.out.println("\nTamaño de la lista: " + listaEmpleados.getSizeLista());
        System.out.println("\n------------------------------------------");
        listaEmpleados.agregarElementoPosCero(new Empleados("Agus", "Capo", 59876, 5));
        System.out.println("\nLista con el nuevo empleado en la prosicion cero : ");
        for(Empleados empleado : listaEmpleados.getListaEmpleados()){
            System.out.println(empleado.toString());
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Lista ordenada por legajos: " );
        listaEmpleados.ordenarListaEmpleados();
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Lista desordenada");
        listaEmpleados.desordenarListaEmpleados();
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Almacenar un elemento en una posicion particular de la lista: ");
        listaEmpleados.almacenarNuevoElemento(new Empleados("Juan", "Ozollo", 56457, 3), 2);
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Mostrar un elemento de una posicion especifica: ");
        System.out.println(listaEmpleados.getEmpleadoCualquierPos(3));

        System.out.println("\n------------------------------------------");
        System.out.println("Mostrar el primer elemento de la lista: ");
        System.out.println(listaEmpleados.getElementoPosCero());

        System.out.println("\n------------------------------------------");
        System.out.println("Mostrar el ultimo elemento de la lista: ");
        System.out.println(listaEmpleados.getEmpleadoUlitmaPos());

        System.out.println("\n------------------------------------------");
        System.out.println("Eliminar elemento de una posicion particular: ");
        listaEmpleados.eliminarElemento(1);
        for(Empleados empleado : listaEmpleados.getListaEmpleados()) {
            System.out.println(empleado.toString());
        }

    }

}