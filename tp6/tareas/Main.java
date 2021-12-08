package tp6.tareas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);

        List<Tarea> ta = new ArrayList<Tarea>();
        ta.add(new Tarea1("impresion string", "hola"));
        ta.add(new Estudio("Lista de numeros", numeros));
        ta.add(new CambiadorGlobal("cambiar variable global", 12));
        Proceso.procesarBatch(ta);


    }
}