package tp8.comparator;
import tp8.carritodecompras.Producto;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CarritosC {
    public Map<Producto, Integer> comparacion = new TreeMap<>(new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    });

    public void agregarProducto(Producto p, Integer cantidadDeProducto) {
        comparacion.put(p, cantidadDeProducto);
    }

    public void Impimir() {
        for (Map.Entry<Producto, Integer> entry : comparacion.entrySet()) {
            System.out.println(entry.toString());
        }
    }


}
