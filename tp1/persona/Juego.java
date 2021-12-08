package tp1.persona;

public class Juego {
    private String email;
    private String nombreUsuario;
    private String contrasenia;
    private String regionServidor;

    public Juego(String email, String nombreUsu, String contra, String region) {
        this.email = email;
        this.nombreUsuario = nombreUsu;
        this.contrasenia = contra;
        this.regionServidor = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRegionServidor() {
        return regionServidor;
    }

    public void setRegionServidor(String regionServidor) {
        this.regionServidor = regionServidor;
    }

    @Override
    public String toString() {
        return "juego{" +
                "email='" + email + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", regionServidor='" + regionServidor + '\'' +
                '}';
    }
}
