package tp3.matematica;

import tp3.multiplicador.Multiplicador;

public class Matematica {
    public static int sumar(int num, int num2) {
        return num + num2;
    }

    public static int multiplicar(int num, int num2) {
        return num * num2;
    }

    public Multiplicador dameMultiplicador(int n) {
        return new Multiplicador(n);
    }
}
