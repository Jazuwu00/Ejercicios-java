package tp2.salud;

public abstract class ProfesionalSalud {
    private String nombre;
    private int DNI;
    private String hospital;

    public ProfesionalSalud(String nombre, int DNI, String hospital) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.hospital = hospital;
    }


}
