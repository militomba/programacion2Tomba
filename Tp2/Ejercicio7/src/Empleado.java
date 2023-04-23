import java.util.Locale;

public class Empleado {
    public String nombre;
    public String apellido;
    public String legajo;
    public int añosTrabajndo;

    //constructor

    public Empleado(String nombre, String apellido, String legajo, int añosTrabajndo) throws Excepciones {
        if(nombre.isEmpty() || apellido.isEmpty()||legajo.isEmpty()||añosTrabajndo<0){
            throw new Excepciones("Todos los campos son obligatorios y el campo años trabajando tiene que ser positivo");
        }
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAñosTrabajndo() {
        return añosTrabajndo;
    }

    public void setAñosTrabajndo(int añosTrabajndo) {
        this.añosTrabajndo = añosTrabajndo;
    }

    public static Empleado fromString(String empleadoString) throws Excepciones {

        String[] campos = empleadoString.split(",\\s*");
        int i = 0;
        String nombre = null;
        String apellido = null;
        String legajo = null;
        int añosTrabajando = 0;
        for(String campo : campos) {
            String[] partes = campo.split("=");
            String nombreCampo = partes[0].toLowerCase().trim();
            String valorCampo = partes[1].trim();
            if (partes.length == 2) {
                for (i = 0; i < 2; i++) {
                    String datos = partes[i].split("=")[0];
                    if (datos.equalsIgnoreCase("nombre")) {
                        nombre = partes[i].split("=")[1];
                    }else if(datos.equalsIgnoreCase("apellido")){
                        apellido = partes[i].split("=")[1];
                    }else if(datos.equalsIgnoreCase("legajo")){
                        apellido = partes[i].split("=")[1];}
                    else{
                        añosTrabajando = Integer.parseInt(partes[i].split("=")[1]);
                    }

                }
            }else{
                throw new Excepciones("faltan campos");
            }
        }


        return new Empleado(nombre, apellido, legajo, añosTrabajando);
    }


    @Override
    public String toString(){
        return ("\nNombre= "+ this.nombre) + ("\nApellido= "+this.apellido)+("\nLegajo= "+this.legajo)+("\nAños trabajando= "+this.añosTrabajndo);
    }
}
