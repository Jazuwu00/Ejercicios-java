package tp8.carritodecompras;

import java.util.Map;
import java.util.TreeMap;

public class Carritodecompras {
    public Map<Producto, Integer> comparacion = new TreeMap<>();

    public void agregarProducto(Producto p,Integer cantidadDeProducto){
        comparacion.put(p,cantidadDeProducto);
    }
    public void Impimir() {
        for (Map.Entry<Producto, Integer> entry : comparacion.entrySet()) {
            System.out.println(entry.toString());
        }
    }
}
