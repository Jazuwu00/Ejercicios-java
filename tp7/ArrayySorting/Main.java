package tp7.ArrayySorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] numero = new Integer[]{1, 2, 43, 1, 34};
        System.out.println("Array ordenado por sort");
        Arrays.sort(numero);
        ArraysSorting.iterararray(numero);
        System.out.println("\nArray a lista ");
        List<Integer> arraylista = Arrays.asList(numero);
        ArraysSorting.iterarINt(arraylista);

        List<Integer> num = new ArrayList<>();
        num.add(345);
        num.add(56);
        num.add(0);
        num.add(8);
        System.out.println("\nlista ordenada por sort");
        Collections.sort(num);
        ArraysSorting.iterarINt(num);
        System.out.println("\nlista a array");
        Object[] numerolista = num.toArray();
        ArraysSorting.iterarObje(numerolista);


    }
}