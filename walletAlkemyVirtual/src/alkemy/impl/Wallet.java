package alkemy.impl;

import alkemy.interfaces.Moneda;
import alkemy.interfaces.Transacciones;

/**
 * La clase Wallet implementa las interfaces Transacciones y Moneda,
 * proporcionando métodos para realizar operaciones financieras.
 */
public class Wallet implements Transacciones, Moneda {

	private double balance;// El saldo de la billetera

	/**
	 * Constructor para inicializar un objeto Wallet con un saldo inicial.
	 *
	 * @param balance El saldo inicial de la billetera.
	 */
	public Wallet(double balance) {
		this.balance = balance;
	}

	/**
	 * Consulta el saldo actual de la billetera.
	 *
	 * @return El saldo actual de la billetera.
	 */
	@Override
	public double consultarSaldo() {
		return balance;
	}

	/**
	 * Deposita una cantidad en la billetera.
	 *
	 * @param amount La cantidad a depositar.
	 */
	@Override
	public void depositar(double amount) {

		if (amount <= 0) {
			System.out.println("---------------------------------------------");
			System.out.println("Por favor ingresa un monto válido");
			System.out.println("---------------------------------------------");
			return;
		}

		balance += amount;
		System.out.println("---------------------------------------------");
		System.out.println("¡Depósito exitoso!");
		System.out.println("  ");
		System.out.println("Tu nuevo saldo es: $ " + balance);
		System.out.println("---------------------------------------------");
	}

	/**
	 * Retira una cantidad de la billetera.
	 *
	 * @param amount La cantidad a retirar.
	 */
	@Override
	public void retirar(double amount) {

		if (amount <= 0) {
			System.out.println("---------------------------------------------");
			System.out.println("Debes ingresar un monto válido.");
			System.out.println("---------------------------------------------");
			return;
		}

		if (balance >= amount) {
			balance -= amount;
			System.out.println("---------------------------------------------");
			System.out.println("¡Retiro exitoso!");
			System.out.println("  ");
			System.out.println("Tu nuevo saldo es: $ " + balance);
			System.out.println("---------------------------------------------");
		} else {
			System.out.println("---------------------------------------------");
			System.out.println("Saldo insuficiente.");
			System.out.println("---------------------------------------------");
		}
	}

	/**
	 * Convierte una cantidad de pesos chilenos a dólares.
	 *
	 * @param amount La cantidad de pesos chilenos a convertir.
	 * @return La cantidad convertida en dólares.
	 */
	@Override
	public double convertirCLPaUSD(double amount) {

		if (amount <= 0) {
			System.out.println("---------------------------------------------");
			System.out.println("Debes ingresar un monto válido.");
			System.out.println("---------------------------------------------");
			return 0;
		}

		if (amount > balance) {
			System.out.println("-  - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("Error.Saldo insuficiente.");
			System.out.println("---------------------------------------------");
			return 0;
		}

		double amountInD = amount * 0.00125;
		balance -= amount;
		System.out.println("---------------------------------------------");
		System.out.println("Tu nuevo saldo en dólares es " + amountInD + " USD");
		System.out.println("Tu nuevo saldo en pesos chilenos es: " + balance + " CLP");
		System.out.println("---------------------------------------------");
		return amountInD;

	}

	/**
	 * Convierte una cantidad de pesos chilenos a euros.
	 *
	 * @param amount La cantidad de pesos chilenos a convertir.
	 * @return La cantidad convertida en euros.
	 */
	@Override
	public double convertirCLPaEUR(double amount) {

		if (amount <= 0) {
			System.out.println("---------------------------------------------");
			System.out.println("Debes ingresar un monto válido.");
			System.out.println("---------------------------------------------");
			return 0;
		}
		if (amount > balance) {
			System.out.println("-  - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("Error.Saldo insuficiente.");
			System.out.println("---------------------------------------------");
			return 0;
		}

		double amountInE = amount * 0.0011;
		balance -= amount;
		System.out.println("---------------------------------------------");
		System.out.println("Tu nuevo saldo en euros es: € " + amountInE);
		System.out.println("Tu nuevo saldo en pesos chilenos es:" + balance + " CLP");
		System.out.println("---------------------------------------------");
		return amountInE;
	}

	/**
	 * Obtiene el saldo actual de la billetera.
	 *
	 * @return El saldo actual de la billetera.
	 */
	public double getBalance() {
		return balance;
	}
}
