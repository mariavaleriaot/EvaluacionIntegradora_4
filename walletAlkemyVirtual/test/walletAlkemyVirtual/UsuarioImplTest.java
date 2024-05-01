package walletAlkemyVirtual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import alkemy.impl.UsuarioImpl;
import alkemy.impl.Wallet;

public class UsuarioImplTest {

	// @Disabled
	@DisplayName("Prueba método constructor/getUserName/getPassword")
	@Test
	public void constructorUsuarioImplTest() {
		// Datos para la prueba
		String username = "Lalo Landa";
		String password = "Lalo1234";

		// Creamos una instancia de UsuarioImpl
		UsuarioImpl usuario = new UsuarioImpl(username, password);

		// Verificamos si los datos se han asignado correctamente
		assertEquals(username, usuario.getUsername());
		assertEquals(password, usuario.getPassword());
		System.out.println("El usuario es: " + usuario.getUsername());
		System.out.println("La contraseña es: " + usuario.getPassword());
	}

	@DisplayName("Prueba método de Validación Correcta")
	@Test
	public void validarCredencialesCorrectasTest() {
		// Creamos una instancia de UsuarioImpl con credenciales válidas
		UsuarioImpl usuario = new UsuarioImpl("Lalo Landa", "Lalo1234");

		// Probamos el método validar con las mismas credenciales
		boolean resultado = usuario.validar("Lalo Landa", "Lalo1234");

		// Verificamos si el resultado es verdadero
		assertTrue(resultado);
		System.out.println("Validación correcta: " + resultado);
	}

	@DisplayName("Prueba método de Validación Incorrecta")
	@Test
	public void validarCredencialesInvalidasTest() {
		// Creamos una instancia de UsuarioImpl con credenciales válidas
		UsuarioImpl usuario = new UsuarioImpl("Lalo Landa", "Lalo1234");

		// Probamos el método validar con credenciales inválidas
		boolean resultado = usuario.validar("Otro usuario", "Otro password");

		// Verificamos si el resultado es falso
		assertFalse(resultado);
		System.out.println("Validación incorrecta: " + resultado);
	}

	// @Disabled
	@DisplayName("Prueba método getWalelt/setWallet")
	@Test
	public void getWalletTest() {
		// Creamos un objeto walletUsuario para la prueba
		Wallet walletUsuario = new Wallet(1000); // Definimos que el saldo inicial es $1000

		// Creamos una instancia de UsuarioImpl y le asignamos el wallet creado
		UsuarioImpl usuario = new UsuarioImpl("Lalo Landa", "Lalo1234");
		usuario.setWallet(walletUsuario);

		// Probamos el método getWallet()
		Wallet walletObtenido = usuario.getWallet();

		// Verificamos si el wallet obtenido es el mismo que el creado anteriormente
		assertEquals(walletUsuario, walletObtenido);
	}

}
