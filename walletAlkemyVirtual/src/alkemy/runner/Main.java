package alkemy.runner;

import java.util.Scanner;

import alkemy.interfaces.Validacion;
import alkemy.interfaces.Menu;
import alkemy.impl.ValidacionImpl;
import alkemy.impl.Wallet;
import alkemy.impl.MenuImpl;
import alkemy.impl.UsuarioImpl;

/**
 * La clase Main es la clase principal que inicia la aplicación Alkemy Wallet.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validacion validacionServicio = new ValidacionImpl(new UsuarioImpl("Lalo Landa", "Lalo1234"));
		Wallet wallet = new Wallet(1000000); // Saldo inicial

		boolean autenticar = false;

		do {
			// Mostrar mensaje de bienvenida
			System.out.println();
			System.out.println("¡Bienvenido a Alkemy Wallet!");
			System.out.println(". - . - . - . - . - . - . - . - . - . - . - . ");
			System.out.println();

			// Realizar la validación del usuario
			if (validacionServicio.validacion(scanner)) {
				// Si la validación es exitosa, mostrar el menú y permitir al usuario interactuar con la billetera
				Menu menu = new MenuImpl(wallet, scanner);
				menu.showMenu();
				autenticar = true;
			} else {
				// Si la validación falla, mostrar un mensaje de error y solicitar al usuario que vuelva a intentarlo
				System.out.println("------------------------------------------------------------------");
				System.out.println("Usuario o contraseña incorrectos. Por favor, inténtalo nuevamente.");
				System.out.println("------------------------------------------------------------------");
			}
		} while (!autenticar);
	}
}