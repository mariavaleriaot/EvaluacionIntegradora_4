package walletAlkemyVirtual;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import alkemy.impl.ValidacionImpl;
import alkemy.interfaces.Usuario;

public class ValidacionImplTest {

	@Test
	public void validacionCredencialesValidasTest() {
		// Creamos una implementación de Usuario con credenciales válidas
		Usuario usuario = new Usuario() {
			@Override
			public boolean validar(String username, String password) {
				return "Lalo Landa".equals(username) && "Lalo1234".equals(password);
			}
		};

		// Creamos una instancia de ValidacionImpl con la implementación de Usuario
		ValidacionImpl validacion = new ValidacionImpl(usuario);

		// Simulamos la entrada del usuario directamente
		String entradaUsuario = "Lalo Landa\nLalo1234\n";
		Scanner scanner = new Scanner(entradaUsuario);

		// Probamos la validación con las credenciales válidas
		boolean resultado = validacion.validacion(scanner);

		// Verificamos si el resultado es verdadero
		assertTrue(resultado);
	}

	@Test
	public void testValidacionCredencialesInvalidas() {
		// Creamos una implementación de Usuario con credenciales válidas
		Usuario usuario = new Usuario() {
			@Override
			public boolean validar(String username, String password) {
				return false; // Retorna falso para cualquier combinación de credenciales
			}
		};

		// Creamos una instancia de ValidacionImpl con la implementación de Usuario
		ValidacionImpl validacion = new ValidacionImpl(usuario);

		// Simulamos la entrada del usuario directamente
		String entradaUsuario = "Otro usuario\nOtro password\n";
		Scanner scanner = new Scanner(entradaUsuario);

		// Probamos la validación con credenciales inválidas
		boolean resultado = validacion.validacion(scanner);

		// Verificamos si el resultado es falso
		assertFalse(resultado);
	}
}
