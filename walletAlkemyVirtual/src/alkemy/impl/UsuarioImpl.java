package alkemy.impl;

import alkemy.interfaces.Usuario;

/**
 * La clase UsuarioImpl implementa la interfaz Usuario y representa un usuario
 * en el sistema.
 */

public class UsuarioImpl implements Usuario {

	private String username;// El nombre de usuario del usuario
	private String password;// La contraseña del usuario
	private Wallet wallet; // La billetera asociada al usuario

	/**
	 * Constructor para inicializar un objeto UsuarioImpl.
	 *
	 * @param username El nombre de usuario del usuario.
	 * @param password La contraseña del usuario.
	 */

	public UsuarioImpl(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * Obtiene la billetera asociada al usuario.
	 *
	 * @return La billetera asociada al usuario.
	 */
	public Wallet getWallet() {
		return wallet;
	}

	/**
	 * Establece la billetera asociada al usuario.
	 *
	 * @param wallet La billetera a establecer.
	 */
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	/**
	 * Valida las credenciales del usuario.
	 *
	 * @param username El nombre de usuario a validar.
	 * @param password La contraseña a validar.
	 * @return true si las credenciales son válidas, false de lo contrario.
	 */
	@Override
	public boolean validar(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}

	/**
	 * Obtiene el nombre de usuario del usuario.
	 *
	 * @return El nombre de usuario del usuario.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Obtiene la contraseña del usuario.
	 *
	 * @return La contraseña del usuario.
	 */
	public String getPassword() {
		return password;
	}
}
