package alkemy.impl;

import java.util.Scanner;

import alkemy.interfaces.Validacion;
import alkemy.interfaces.Usuario;

/**
 * La clase ValidacionImpl implementa la interfaz Validacion y proporciona
 * métodos para validar las credenciales de un usuario.
 */
public class ValidacionImpl implements Validacion {

	private Usuario usuario;// El usuario cuyas credenciales se van a validar

	/**
	 * Constructor para inicializar un objeto ValidacionImpl.
	 *
	 * @param usuario El usuario cuyas credenciales se van a validar.
	 */
	public ValidacionImpl(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Realiza la validación de las credenciales del usuario.
	 *
	 * @param scanner Scanner para la entrada del usuario.
	 * @return true si las credenciales son válidas, false de lo contrario.
	 */
	@Override
	public boolean validacion(Scanner scanner) {
		System.out.print("Por favor ingrese su nombre de usuario: ");
		String username = scanner.nextLine();
		System.out.print("Ingrese su contraseña: ");
		String password = scanner.nextLine();
		return usuario.validar(username, password);
	}

}
