package walletAlkemyVirtual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import alkemy.impl.Wallet;

class WalletTest {

	private Wallet wallet;

	@BeforeEach
	public void setUp() {
		// Creamos una nueva instancia de Wallet con un saldo inicial de $1000 para cada
		// prueba
		wallet = new Wallet(1000);
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Consultar saldo")
	public void consultarSaldoTest() {
		wallet.consultarSaldo();
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // Comprobamos si el saldo inicial es correcto
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Depositar")
	public void depositarTest() {
		wallet.depositar(500); // Depositamos $500
		assertEquals(1500, wallet.consultarSaldo(), 0.01); // Comprobamos si el saldo después del depósito es correcto
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Depositar Monto Negativo")
	public void depositarMontoNegativoTest() {
		wallet.depositar(-200); // Intentamos depositar un monto negativo
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // El saldo debe permanecer igual
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Retirar")
	public void retirarTest() {
		wallet.retirar(300); // Retiramos $300
		assertEquals(700, wallet.consultarSaldo(), 0.01); // Comprobamos si el saldo después del retiro es correcto
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Retirar Monto Negativo")
	public void retirarMontoNegativoTest() {
		wallet.retirar(-200); // Intentamos retirar un monto negativo
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // El saldo debe permanecer igual
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Retirar Saldo Insuficiente")
	public void retirarConSaldoInsuficienteTest() {
		wallet.retirar(2000); // Intentamos retirar más de lo que hay en el saldo
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // El saldo debe permanecer igual

	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir pesos chilenos a dólares")
	public void convertirCLPaUSDTest() {
		double amountInD = wallet.convertirCLPaUSD(500); // Convertimos $500 a USD
		assertEquals(0.625, amountInD, 0.01); // Comprobamos si la conversión es correcta
		assertEquals(500, wallet.consultarSaldo(), 0.01); // El saldo en CLP debe ser el mismo después de la conversión
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir a dólares con Saldo Insuficiente")
	public void convertirCLPaUSDSaldoInsuficienteTest() {
		double amountInD = wallet.convertirCLPaUSD(1500); // Convertimos $1500 a USD
		assertEquals(0.0, amountInD, 0.01); // La cantidad devuelta debe ser (0)
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // Saldo en CLP debe ser el mismo después de conversión
		System.out.println("El saldo en CLP es " + wallet.consultarSaldo());

	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir a dólares 0 pesos")
	public void convertirCLPaUSD_0_Test() {
		double amountInD = wallet.convertirCLPaUSD(0); // Intentamos convertir un monto inválido (0) a dólares
		assertEquals(0.0, amountInD, 0.01); // La cantidad devuelta debe ser (0)
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // Saldo en CLP debe ser el mismo después de conversión

	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir pesos chilenos a euros")
	public void convertirCLPaEURTest() {
		double amountInE = wallet.convertirCLPaEUR(500); // Convertimos $500 a EUR
		assertEquals(0.55, amountInE, 0.01); // Comprobamos si la conversión es correcta
		assertEquals(500, wallet.consultarSaldo(), 0.01); // El saldo en CLP debe ser el mismo después de la conversión
	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir a euro con Saldo Insuficiente")
	public void convertirCLPaEURSaldoInsuficienteTest() {
		double amountInE = wallet.convertirCLPaEUR(1500); // Convertimos $1500 a EUR
		assertEquals(0.0, amountInE, 0.01); // La cantidad devuelta debe ser (0).
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // Saldo en CLP debe ser el mismo después de conversión
		System.out.println("El saldo en CLP es " + wallet.consultarSaldo());

	}

	// @Disabled
	@Test
	@DisplayName("Prueba de método Convertir a euro 0 pesos")
	public void convertirCLPaEUR_0_Test() {
		double amountInE = wallet.convertirCLPaEUR(0); // Intentamos convertir un monto inválido (0) a euros.
		assertEquals(0.0, amountInE, 0.01); // La cantidad devuelta debe ser (0)
		assertEquals(1000, wallet.consultarSaldo(), 0.01); // Saldo en CLP debe ser el mismo después de conversión

	}

	// @Disabled
	@Test
	@DisplayName("Prueba del método getBalance()")
	public void getBalanceTest() {
		// Verificamos si el saldo devuelto por getBalance() es el mismo que el saldo
		// esperado
		assertEquals(1000, wallet.getBalance(), 0.01);
		System.out.println("El saldo es " + wallet.getBalance());

	}

}