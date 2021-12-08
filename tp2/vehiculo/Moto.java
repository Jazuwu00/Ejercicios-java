package tp2.vehiculo;

public class Moto extends Vehiculo {
    private String marca;
    private String cilindrada;
    private String rodado;
    private String motor;

    public Moto(String nombre, int ruedas, String marca, String cilindrada, String rodado, String motor) {
        super(nombre, ruedas);
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.rodado = rodado;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", rodado='" + rodado + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
