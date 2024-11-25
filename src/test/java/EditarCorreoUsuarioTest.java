import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Tercer ciclo: Implementar la funcionalidad para actualizar el correo de un usuario existente.
public class EditarCorreoUsuarioTest {
    @Test
    public void EditarCorreoUsuario() {
        Usuario usuario = new Usuario();

        usuario.username("Jossue");
        usuario.email("jossuedavidjt@gmail.com");

        assertEquals("jossuedavidjt@gmail.com", usuario.getEmail(), "Se esperaba crear el usuario con el correo jossuedavidjt@gmail.com");

        usuario.changeEmail("jjossuedavid@gmail.com");

        assertEquals("jjossuedavid@gmail.com", usuario.getEmail(), "Se esperaba cambiar el correo a jjossuedavid@gmail.com");
    }
}
