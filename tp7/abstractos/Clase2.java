package tp7.abstractos;

import java.util.ArrayList;
import java.util.List;

public class Clase2 implements Conjunto {
    protected List<Objetodeclase2> lista = new ArrayList<>();

    public void agregar(Objetodeclase2 objeto) {
        lista.add(objeto);
    }

    public void Imprimir() {
        for (Objetodeclase2 p : lista) {
            System.out.println(p.toString());
        }
    }

    @Override
    public boolean pertenece(Object o) {
        Objetodeclase2 objeto = (Objetodeclase2) o;
        return lista.contains(objeto);
    }
}
