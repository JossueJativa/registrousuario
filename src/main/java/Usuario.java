public class Usuario {

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
