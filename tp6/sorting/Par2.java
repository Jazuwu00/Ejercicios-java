package tp6.sorting;

public class Par2 implements ordenable {
    private int num;
    private int num2;
    private int resultado;

    public Par2(int num, int num2) {
        this.num = num;
        this.num2 = num2;
        this.resultado = num + num2;
    }

    @Override
    public String toString() {
        return "Par2{" +
                "num=" + num +
                ", num2=" + num2 +
                ", resultado : " + resultado + '}';
    }

    @Override
    public boolean esMayor(Object objeto) {
        Par2 par2 = (Par2) objeto;
        return this.resultado > par2.resultado;


    }
}
