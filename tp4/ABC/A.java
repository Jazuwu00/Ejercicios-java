package tp4.ABC;

import java.io.Serializable;

public class A implements Serializable {
    private int numero;

    public A(int numero) {
        this.numero = numero;
        System.out.println("Estoy construyendo A " + numero);
    }

    public void Hola() {
        System.out.println("Hola en A");
    }

}
