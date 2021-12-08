package tp7.abstractos;

import java.util.ArrayList;
import java.util.List;

public class Clase1 implements Conjunto {
    private List<Object> listaNumero;

    public Clase1() {
        this.listaNumero = new ArrayList<>();
    }

    public void agregar(Object I) {
        listaNumero.add(I);
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public void Imprimir() {
        for (Object p : listaNumero) {
            System.out.println(p);
        }
    }

    @Override
    public boolean pertenece(Object o) {
        return o instanceof Integer && (esPar((Integer) o));
    }
}
