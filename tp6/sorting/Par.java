package tp6.sorting;

public class Par implements ordenable {
    private int num;
    private int num2;

    public Par(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Par{" +
                "num=" + num +
                ", num2=" + num2 +
                '}';
    }

    @Override
    public boolean esMayor(Object objeto) {
        Par par = (Par) objeto;
        if (this.num == par.num) {
            return this.num2 == par.num2;
        } else {
            return false;
        }
    }
}
