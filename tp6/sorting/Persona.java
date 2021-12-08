package tp6.sorting;

public class Persona implements ordenable {
    private int dni;
    private boolean sexo;

    public Persona(int dni, boolean sexo) {
        this.dni = dni;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public boolean esMayor(Object objeto) {
        Persona persona = (Persona) objeto;
        if (this.dni == persona.dni && this.sexo != persona.sexo) {
             return !persona.sexo;
        } else {
            return this.dni > persona.dni;
        }
    }

}
