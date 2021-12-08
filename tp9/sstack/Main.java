package tp9.sstack;

public class Main {
    public static int metodo1(int n, int m) {
        return n * m;
    }

    public static int metodo2(int m, int e, int ult) {
        return metodo1(m, e) * ult;
    }

    public static void metodo3(int m, int e, int ult) {
        int[] array = new int[m];
        //System.out.println(  metodo2(m ,e , ult));
        //System.out.println(array[5]);
    }

    public static void StackOver() {
        Ejemplo s = new Ejemplo();
    }

    public static void main(String[] args) {
        //metodo3(4,5,7);
        StackOver();


    }

}
