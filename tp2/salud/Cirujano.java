package tp2.salud;

public class Cirujano extends ProfesionalSalud {
    private String organo;

    public Cirujano(String nombre, int DNI, String hospital, String organo) {
        super(nombre, DNI, hospital);
        this.organo = organo;
    }


}
