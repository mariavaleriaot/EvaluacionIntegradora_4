package alkemy.interfaces;

/**
 * La interfaz Usuario define un método para validar las credenciales de un
 * usuario.
 */
public interface Usuario {

	/**
	 * Valida las credenciales de un usuario.
	 *
	 * @param username El nombre de usuario a validar.
	 * @param password La contraseña a validar.
	 * @return true si las credenciales son válidas, false de lo contrario.
	 */
	boolean validar(String username, String password);

}
