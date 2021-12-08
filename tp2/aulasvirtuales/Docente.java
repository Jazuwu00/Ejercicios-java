package tp2.aulasvirtuales;

public class Docente extends Persona {
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Docente(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }
}
