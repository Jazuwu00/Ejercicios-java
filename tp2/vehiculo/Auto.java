package tp2.vehiculo;

public class Auto extends Vehiculo {
    private String marca;
    private int puertas;
    private String tipodeconbustible;
    private String transmision;

    public Auto(String nombre, int ruedas, String marca, int puertas, String tipodeconbustible, String transmision) {
        super(nombre, ruedas);
        this.marca = marca;
        this.puertas = puertas;
        this.tipodeconbustible = tipodeconbustible;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipodeconbustible() {
        return tipodeconbustible;
    }

    public void setTipodeconbustible(String tipodeconbustible) {
        this.tipodeconbustible = tipodeconbustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", puertas=" + puertas +
                ", tipodeconbustible='" + tipodeconbustible + '\'' +
                ", transmision='" + transmision + '\'' +
                '}';
    }
}
