public class Empleados implements Comparable<Empleados>{
    public String nombre;
    public String apellido;
    public int legajo;
    public int añosTrabajndo;

    //constructor

    public Empleados(String nombre, String apellido, int legajo, int añosTrabajndo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.añosTrabajndo = añosTrabajndo;
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAñosTrabajndo() {
        return añosTrabajndo;
    }

    public void setAñosTrabajndo(int añosTrabajndo) {
        this.añosTrabajndo = añosTrabajndo;
    }

    @Override
    public String toString(){
        return ("\nNombre: "+ this.nombre) + ("\nApellido: "+this.apellido)+("\nLegajo: "+this.legajo)+("\nAños trabajando: "+this.añosTrabajndo);
    }
    @Override
    public int compareTo(Empleados empleados) {
        if(this.legajo<empleados.getLegajo()){
            return -1;
        }
        if(this.legajo> empleados.getLegajo()){
            return 1;
        }
        return 0;
    }
}
