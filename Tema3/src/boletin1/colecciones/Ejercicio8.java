package boletin1.colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
	static Scanner reader = new Scanner(System.in);
	static HashMap<String, String> areaRestringida = new HashMap<>();

	public static void main(String[] args) {

		// Creo una variable para la Opción del menú
		int opcMenu;

		// Creo variables para almacenar el nombre de usuario y la contraseña
		String usuario;
		String password;

		System.out.println("1. Registro");
		System.out.println("2. Login");
		System.out.println("0. Salir");
		opcMenu = reader.nextInt();
		reader.nextLine();

		while (opcMenu != 0) {
			switch (opcMenu) {
			case 1:
				System.out.println("Introduzca su nombre de usuario:");
				usuario = reader.nextLine();
				System.out.println("Introduzca su contraseña:");
				password = reader.nextLine();
				areaRestringida.put(usuario, password);
				break;

			case 2:
				accesoArea();
				break;
			
			case 0:
				break;
			default:
				System.out.println("Seleccione una opción correcta en el menú.");
				break;
			}
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			opcMenu = reader.nextInt();
			reader.nextLine();
		}

	}

	public static void accesoArea() {
		// Creo variables para almacenar el usuario y la contraseña
		String usuario;
		String password;
		// Creo una variable para el contador de intentos
		int intentos = 0;

		// Creo una variable para saber si el usuario y contraseña son correctos
		boolean correcto = false;

		while (intentos < 3 && !correcto) {
			System.out.println("Introduzca su usuario");
			usuario = reader.nextLine();
			System.out.println("Introduzca su contraseña");
			password = reader.nextLine();
			if (areaRestringida.containsKey(usuario)) {
				if (areaRestringida.get(usuario).equals(password)) {
					correcto = true;
					System.out.println("Ha accedido al area restringida");
				}
			}
			intentos++;
		}
		if(intentos == 3 && !correcto) {
			System.out.println("Lo siento, no tiene acceso al área restringida.");
		}
	}

}
