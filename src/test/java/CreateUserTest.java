import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Primer ciclo: Implementar la funcionalidad para agregar un usuario con nombre y correo electrónico.
public class CreateUserTest {
    @Test
    public void CreateUserWithUsernameAndEmail() {
        Usuario user = new Usuario();

        user.username("Jossue");
        user.email("jossuedavidjt@gmail.com");

        assertEquals("Jossue", user.getUsername(), "Se esperaba Jossue como nombre de usuario");
        assertEquals("jossuedavidjt@gmail.com", user.getEmail(), "Se esperaba jossuedavidjt@gmail.com como correo");
        assertNotNull(user, "Se esperaba un usuario");
    }
}
