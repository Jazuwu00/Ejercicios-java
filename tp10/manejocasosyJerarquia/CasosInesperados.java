package tp10.manejocasosyJerarquia;

import tp10.jerarquia.PersonaMenorException;
import tp10.jerarquia.PersonaYaExisteException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class CasosInesperados {
    private List<Persona> personaslista = new ArrayList<>();

    public List<Persona> getPersonaslista() {
        return personaslista;
    }

    public void setPersonaslista(List<Persona> personaslista) {
        this.personaslista = personaslista;
    }

    public static void ImprimirLista(List<Persona> listap) {
        Collections.sort(listap);
        for (Persona m : listap) {
            System.out.println(m);
        }
    }

    public static Persona funcionPersona(int dni, int edad, String nombre) throws Exception {
        if (dni <= 0 || edad <= 0) {
            throw new IllegalArgumentException("haz ingresado un número no admitido");
        } else if (nombre == null) {
            throw new IllegalArgumentException("El nombre es incorrecto ");
        } else {
            return new Persona(nombre, dni, edad);
        }
    }

    public static void agregarpersona(Persona s, List<Persona> list) throws Exception {
        if (list.contains(s)) {
            System.out.println(s.toString() + " ya esta registrada.");
            throw new PersonaYaExisteException();
        } else if (s.getEdad() < 18) {
            System.out.println("No se puede agregar a esta Persona debido a su edad : " + s.getEdad());
            throw new PersonaMenorException();
        } else {
            list.add(s);
        }
    }

    public static Integer listaPositiva(List<Integer> lista) throws Exception {
        int resultado = -1;
        for (int s : lista) {
            if (s > 10 && (resultado == -1)) {
                resultado = s;
            }
        }
        if (resultado == -1)
            throw new InputMismatchException("No se ha encontrado numero mayor");
        return resultado;

    }


}

