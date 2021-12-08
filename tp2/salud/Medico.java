package tp2.salud;

public class Medico extends ProfesionalSalud {
    private String matricula;
    private String especializacion;

    public Medico(String nombre, int DNI, String hospital, String matricula, String especializacion) {
        super(nombre, DNI, hospital);
        this.matricula = matricula;
        this.especializacion = especializacion;
    }

}
