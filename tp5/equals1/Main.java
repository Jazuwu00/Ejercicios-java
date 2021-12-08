package tp5.equals1;


public class Main {

    public static void main(String[] args) {
        Album a = new Album("si","uu");
        Album b = new Album("si","uu");
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
