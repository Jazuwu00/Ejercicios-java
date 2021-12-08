package tp5.equalsprotected;

import java.util.Objects;

public class Perro extends Animal {
    protected String raza;

    public Perro(String raza, int peso) {
        super(raza, peso);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perro)) return false;
        if (!super.equals(o)) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

}
