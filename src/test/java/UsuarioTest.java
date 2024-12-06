import org.junit.jupiter.api.Test;

public class UsuarioTest{

  @Test
  public void agregarUsuario(){

    Usuario usuario = new Usuario();

    usuario.setNombre("Matheo Chavez");
    usuario.setEmail("matheochavez@email.com");
  }
}