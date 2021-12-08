package tp8.primos;

import java.util.Map;
import java.util.TreeMap;

public class Primo {
    public static Map<Integer, Boolean> guaradado = new TreeMap<>();

    public static boolean esPrimo(int numero) {
        if (guaradado.containsKey(numero)) {
            return true;
        }
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0)
                return false;
        }
        guaradado.put(numero, true);
        return true;
    }



}