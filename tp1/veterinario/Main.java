package tp1.veterinario;

public class Main {

    public static void main(String[] args) {

        Animal a1=new Animal("Gato",2,"laura",2);
        a1.describir();
        a1.ruido();
        a1.comer(new Alimento("Gato","pollo",3));


    }
}
