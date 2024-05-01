package alkemy.interfaces;

/**
 * La interfaz Moneda define métodos para convertir cantidades de una moneda a
 * otra.
 */
public interface Moneda {

	/**
	 * Convierte una cantidad de pesos chilenos a dólares.
	 *
	 * @param amount La cantidad de pesos chilenos a convertir.
	 * @return La cantidad convertida en dólares.
	 */
	double convertirCLPaUSD(double amount);

	/**
	 * Convierte una cantidad de pesos chilenos a euros.
	 *
	 * @param amount La cantidad de pesos chilenos a convertir.
	 * @return La cantidad convertida en euros.
	 */
	double convertirCLPaEUR(double amount);
}
