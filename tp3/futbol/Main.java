package tp3.futbol;

public class Main {

    public static void main(String[] args) {

        Futbolista.setMaximogoleador(new Futbolista("jonas", "lala", 1));
        Futbolista m = new Futbolista("lola", "aragon", 1);
        m.anotargol();
        m.anotargol();
        m.mostrarMaximogoleador();
    }
}
