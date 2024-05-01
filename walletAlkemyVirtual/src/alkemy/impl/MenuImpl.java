package alkemy.impl;

import java.util.Scanner;

import alkemy.interfaces.Menu;

/**
 * La clase MenuImpl implementa la interfaz Menu y proporciona métodos para mostrar un menú de opciones
 * relacionadas con operaciones en la Wallet.
 */
public class MenuImpl implements Menu {

	private Wallet wallet;// La billetera sobre la que se realizarán las operaciones
	private Scanner scanner;// Scanner para la entrada del usuario

	/**
     * Constructor para inicializar un objeto MenuImpl.
     *
     * @param wallet La billetera sobre la que se realizarán las operaciones.
     * @param scanner Scanner para la entrada del usuario.
     */

	public MenuImpl(Wallet wallet, Scanner scanner) {
		this.wallet = wallet;
		this.scanner = scanner;
		

	}
	 /**
     * Muestra el menú de opciones y permite al usuario realizar diversas operaciones en la Wallet.
     */

	@Override
	public void showMenu() {
		int opcion;
		do {
			// Mostrar el menú
			System.out.println(" ");
			System.out.println(". - . - . - . - . - . - . - . - . - . - . - . ");
			System.out.println();
			System.out.println("* * * ¡Bienvenido Lalo Landa! * * * ");
			System.out.println();
			System.out.println("¿Qué quieres hacer hoy?:");
			System.out.println(" ");
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Depositar Dinero");
			System.out.println("3. Retirar Dinero");
			System.out.println("4. Convertir CLP a Dólares");
			System.out.println("5. Convertir CLP a Euros");
			System.out.println("6. Salir");
			System.out.println(" ");
			System.out.print("Por favor, ingresa tu opción: ");
			System.out.println("    ");
			opcion = scanner.nextInt();// Lee la opción ingresada por el usuario
			scanner.nextLine(); // Limpia el buffer del scanner

			// Procesar la opción seleccionada
			switch (opcion) {
			case 1:
				System.out.println("---------------------------------------------");
				System.out.println("Tu saldo actual es: $ " + wallet.consultarSaldo() + " CLP");
				System.out.println("---------------------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------------------");
				System.out.print("Ingresa el monto a depositar: ");
				double deposito = scanner.nextDouble();
				wallet.depositar(deposito);
				break;
			case 3:
				System.out.println("---------------------------------------------");
				System.out.print("Ingresa el monto a retirar: ");
				double retiro = scanner.nextDouble();
				wallet.retirar(retiro);
				break;
			case 4:
				System.out.println("---------------------------------------------");
				System.out.print("Ingresa el monto a convertir: ");
				double convertirADolar = scanner.nextDouble();
				wallet.convertirCLPaUSD(convertirADolar);

				break;
			case 5:
				System.out.println("---------------------------------------------");
				System.out.print("Ingresa el monto a convertir: ");
				double convertirAE = scanner.nextDouble();
				wallet.convertirCLPaEUR(convertirAE);
				break;
			case 6:
				// Salir del bucle y terminar el programa
				System.out.println();
				System.out.println("* * * * * * * * * * * * * * * * * * *");
				System.out.println("¡Gracias por preferir Alkemy Wallet!");
				System.out.println();
				System.out.println("¡Hasta la próxima!");
				System.out.println("* * * * * * * * * * * * * * * * * * *");
				break;
			default:
				// Opción inválida
				System.out.println("-----------------------------------------------------------");
				System.out.println("Opción inválida. Por favor, selecciona una opción del menú.");
				System.out.println("-----------------------------------------------------------");
				break;
			}
		} while (opcion != 6);// Continuar hasta que el usuario seleccione la opción "Salir"
    }
	}

