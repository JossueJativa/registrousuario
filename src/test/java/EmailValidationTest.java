import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Tercer ciclo: Implementar la funcionalidad para actualizar el correo de un usuario existente.
import com.registrousuario.Usuario;

public class EmailValidationTest {

    @Test
    public void EmailValidator() {

        Usuario usuario = new Usuario();

        usuario.email("jossuedavid@gmail.com");

        // Sacar el @ del correo 
        String email = usuario.getEmail();
        boolean containsAt = email.contains("@");

        // Sacar el com del correo
        boolean containsCom = email.contains(".com");

        assertTrue(containsAt, "Se esperaba un @ en el correo");
        assertTrue(containsCom, "Se esperaba un .com en el correo");
    }
}
