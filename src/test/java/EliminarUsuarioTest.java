import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

// Cuarto ciclo: Implementar una función para eliminar un usuario del sistema.
public class EliminarUsuarioTest {
    @Test
    public void EliminarUsuario() {
        Usuarios usuarios = new Usuarios();

        Usuario user = new Usuario();

        user.username("Jossue");
        user.email("jossuedavidjt@gmail.com");

        usuarios.add(user);

        assertEquals(1, usuarios.size(), "Se esperaba un usuario en la lista");

        user.username("Jativa");
        user.email("jjossuedavid@gmail.com");

        usuarios.add(user);

        assertEquals(2, usuarios.size(), "Se esperaban dos usuarios en la lista");

        usuarios.remove(user);

        assertEquals(1, usuarios.size(), "Se esperaba un usuario en la lista");
    }
}
