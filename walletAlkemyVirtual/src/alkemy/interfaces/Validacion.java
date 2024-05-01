package alkemy.interfaces;

import java.util.Scanner;

/**
 * La interfaz Validacion define un método para validar las credenciales del usuario.
 */
public interface Validacion {
	
	/**
     * Realiza la validación de las credenciales del usuario.
     *
     * @param scanner Scanner para la entrada del usuario.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
	boolean validacion(Scanner scanner);

}
