import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public void add(Usuario user) {
        usuarios.add(user);
    }

    public void remove(Usuario user) {
        usuarios.remove(user);
    }

    public int size() {
        return usuarios.size();
    }
}
