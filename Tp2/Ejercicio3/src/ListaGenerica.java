import java.util.ArrayList;
import java.util.Collections;

public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> listaEmpleados;
    public ListaGenerica(){
        listaEmpleados = new ArrayList<T>();
    }
    //1
    public void agregarElemento(T elemento){
        listaEmpleados.add(elemento);
    }
    //2
    public ArrayList<T> getListaEmpleados() {
        return listaEmpleados;
    }
    //3
    public int getSizeLista(){
        return listaEmpleados.size();
    }
    //4
    public void agregarElementoPosCero(T elemento){
        listaEmpleados.add(0,  elemento);
    }
    //5
    public void ordenarListaEmpleados(){
        Collections.sort(listaEmpleados);
    }
    //6
    public void desordenarListaEmpleados(){
        Collections.shuffle(listaEmpleados);
    }
    //7
    //agregar excepcion si el indice es mayor a la cantidad de elementos
    public void almacenarNuevoElemento(T elemento, int posicion) throws Excepciones{
        System.out.println("\nAlmacenar un elemento en la posicion " + posicion + " de la lista");
        if(posicion<0 || posicion>listaEmpleados.size()) {
            throw new Excepciones("\nLa posicion " + posicion + " esta fuera del rango de la lista");
        }
        listaEmpleados.add(posicion, elemento);
    }
    //8
    //agregar excepcion si el indice es mayor a la cantidad de elementos
    public T getEmpleadoCualquierPos(int posicion) throws  Excepciones{
        System.out.println("\nObtener elemento en la posicion " + posicion + " de la lista");
        if(posicion<0 || posicion>listaEmpleados.size()){
            throw new Excepciones("\nLa posicion " + posicion + " esta fuera del rango de la lista");
        }
        return listaEmpleados.get(posicion);
    }
    //9 -- agregra excepcion si la lista esta vacia
    public T getElementoPosCero() throws Excepciones{
        if(listaEmpleados.size() == 0){
            throw new Excepciones("La lista esta vacia");
        }
        return listaEmpleados.get(0);
    }
    //10 -- agregra excepcion si la lista esta vacia
    public T getEmpleadoUlitmaPos() throws Excepciones{
        int pos= listaEmpleados.size();
        if (pos== 0){
            throw new Excepciones("La lista esta vacia");
        }
/*        if(listaEmpleados.contains(pos-1)) {
            return listaEmpleados.get(pos- 1);
        }*/
        /*throw new Excepciones("El elemento no existe en la lista");*/
    return listaEmpleados.get(pos-1);
    }
    //11
    public void eliminarElemento(int posicion){
        System.out.println("Eliminar elemento de la posicion " + posicion + " de la lista");
        listaEmpleados.remove(posicion);
    }
}