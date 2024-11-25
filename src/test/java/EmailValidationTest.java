import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Segundo ciclo: Implementar la verificación de que el correo electrónico tiene un formato válido.
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
