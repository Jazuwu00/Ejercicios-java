package tp1.persona;

public class AFIP {
    private int edad;
    private String nombre;
    private String apellido;
    private String Numeropostal;

    public AFIP(int edad, String nombre, String apellido, String numeropostal) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        Numeropostal = numeropostal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

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

    public String getNumeropostal() {
        return Numeropostal;
    }

    public void setNumeropostal(String numeropostal) {
        Numeropostal = numeropostal;
    }

    @Override
    public String toString() {
        return "AFIP{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Numeropostal='" + Numeropostal + '\'' +
                '}';
    }
}
