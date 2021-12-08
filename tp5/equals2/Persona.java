package tp5.equals2;

import java.util.Objects;

public class Persona {
    private String nombre;
    private boolean sexo;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre, boolean sexo, int dni) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return sexo == persona.sexo && dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sexo, dni);
    }

}
