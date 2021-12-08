package tp2.aulasvirtuales;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private List<Alumno> listaAlumnos;
    private Docente docente;
    private Alumno alum;

    public Materia(Docente docente) {
        listaAlumnos = new ArrayList<Alumno>();
        this.docente = docente;
    }

    private void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    private void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Docente getDocente() {
        return docente;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public void crearAlumno(Alumno alumno) {
        this.getListaAlumnos().add(alumno);
    }

    public void imprimirlista() {
        System.out.println("Aula de " + docente.getMateria() + " del profesor " + docente.getNombre());
        System.out.println("Alumnos: ");
        for (Persona persona : listaAlumnos) {
            System.out.println(persona.getNombre());
        }
    }

    public List<Persona> devolverlista() {
        List<Persona> list = new ArrayList<>();
        list.add(docente);
        for (Alumno alumno : this.listaAlumnos) {
            list.add(alumno);
        }
        return list;

    }

    public void impdevolverlista() {
        System.out.println("Lista de todos los nombres del aula");
        for (Persona per : devolverlista()) {
            System.out.println(per.getNombre());
        }
    }

}







