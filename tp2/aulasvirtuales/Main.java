package tp2.aulasvirtuales;

public class Main {

    public static void main(String[] args) {

        Materia m = new Materia(new Docente("julio", "mate"));
        m.crearAlumno(new Alumno("lola", 12));
        m.crearAlumno(new Alumno("jhenry", 11));
        m.crearAlumno(new Alumno("cintia", 10));
        m.imprimirlista();
        m.impdevolverlista();


    }
}
