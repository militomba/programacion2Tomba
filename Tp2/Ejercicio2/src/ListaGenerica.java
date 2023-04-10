import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;

public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> listaEmpleados;
    public ListaGenerica(){
        listaEmpleados = new ArrayList<T>();
    }
    public void agregarElemento(T elemento){
        listaEmpleados.add(elemento);
    }

    public ArrayList<T> getListaEmpleados() {
        return listaEmpleados;
    }
    public int getSizeLista(){
        return listaEmpleados.size();
    }
    public void agregarElementoPosCero(T elemento){
        listaEmpleados.add(0,  elemento);
    }
    public void ordenarListaEmpleados(){
        Collections.sort(listaEmpleados);
    }
    public void desordenarListaEmpleados(){
        shuffle(listaEmpleados);
    }
    public void almacenarNuevoElemento(T elemento, int posicion){
        listaEmpleados.add(posicion, elemento);
    }
    public T getEmpleadoCualquierPos(int posicion){
        return listaEmpleados.get(posicion);
    }
    public T getElementoPosCero(){
        return listaEmpleados.get(0);
    }
    public T getEmpleadoUlitmaPos(){
        int posicion = listaEmpleados.size();
        return listaEmpleados.get(posicion-1);
    }
    public void eliminarElemento(int posicion){
        listaEmpleados.remove(posicion);
    }
}