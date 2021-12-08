package tp7.colabanco;

import java.util.Deque;
import java.util.LinkedList;

public class ColaDelBanco {
    private Deque<Persona> cola = new LinkedList<>();

    public void agregar(Persona p) {
        if (!cola.contains(p)) {
            if (p.getEdad() > 60) {
                cola.addFirst(p);
            } else {
                cola.add(p);
            }
        }
    }

    public Persona atender() {
        return cola.poll();
    }

    public void Imprimir() {
        for (Persona p : this.cola) {
            System.out.println(p.toString());
        }
    }
}
