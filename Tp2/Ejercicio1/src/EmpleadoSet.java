import java.util.Objects;

public class EmpleadoSet extends Empleados {

    public EmpleadoSet(String nombre, String apellido, int legajo, int añosTrabajndo) {
        super(nombre, apellido, legajo, añosTrabajndo);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        EmpleadoSet empleadoSet = (EmpleadoSet) obj;
        return legajo == empleadoSet.legajo && Objects.equals(nombre, empleadoSet.nombre)
                && Objects.equals(apellido, empleadoSet.apellido) && añosTrabajndo == empleadoSet.añosTrabajndo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, legajo, añosTrabajndo);
    }
}
