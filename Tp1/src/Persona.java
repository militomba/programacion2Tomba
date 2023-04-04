public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //reescritura de metodos
    @Override
    public String toString(){
        return ("Nombre: "+ this.nombre) + ("\nApellido: " + this.apellido) + ("\nEdad: " + this.edad);
    }
}
