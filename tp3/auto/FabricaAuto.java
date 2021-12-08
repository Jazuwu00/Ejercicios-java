package tp3.auto;

public class FabricaAuto {
    private String marca;
    public static int anio;

    public FabricaAuto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getAnio() {
        return anio;
    }

    public static void setAnio(int anio) {
        FabricaAuto.anio = anio;
    }


    public Auto fabricarauto(String modelo) {
        if (anio == 0) {
            System.out.println("el año no está seteado");
            return null;
        } else {
            System.out.println("Se construyo un Auto satisfactoriamente");
            return new Auto(getMarca(), modelo, getAnio());
        }
    }
}
