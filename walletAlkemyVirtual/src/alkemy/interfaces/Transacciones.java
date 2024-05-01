package alkemy.interfaces;

/**
 * La interfaz Transacciones define métodos para realizar transacciones
 * financieras.
 */
public interface Transacciones {

	/**
	 * Consulta el saldo actual.
	 *
	 * @return El saldo actual.
	 */
	double consultarSaldo();

	/**
	 * Deposita una cantidad en la cuenta.
	 *
	 * @param amount La cantidad a depositar.
	 */
	void depositar(double amount);

	/**
	 * Retira una cantidad de la cuenta.
	 *
	 * @param amount La cantidad a retirar.
	 */
	void retirar(double amount);

}
