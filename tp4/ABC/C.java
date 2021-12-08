package tp4.ABC;

public class C extends B {
    public C(int numero) {
        super(numero);
        System.out.println("Estoy construyendo C " + numero);
    }

    @Override
    public void Hola() {
        System.out.println("Hola en C");
    }
}
