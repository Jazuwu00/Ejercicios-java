package tp10.error;

import tp9.heap.Objeto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        int j = 1;
        try {
            List<Integer> numeros = new ArrayList<>();
            while (true) {
                numeros.add(j);
                j = j * 100;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("error: " + e.getMessage());
        }

    }


}