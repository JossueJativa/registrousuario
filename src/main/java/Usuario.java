public class Usuario {
    /**
     * Establece el nombre del usuario.
     * 
     * @param string el nombre del usuario
     */
    public void setNombre(String string) {
    }

    /**
     * Establece el email del usuario.
     * 
     * @param string el email del usuario
     */
    public void setEmail(String string) {
    }

    private String email;
    private String username;

    public void email(String string) {
        this.email = string;
    }

    public void username(String string) {
        this.username = string;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void changeEmail(String string) {
        this.email = string;
    }
}
