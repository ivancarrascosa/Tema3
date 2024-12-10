package boletin1.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		// Creo una variable para almacenar la contraseña que va a introducir el usuario
		String contraseña = "";

		// Creo una variable para almacenar la respuesta intentando adivinar la
		// contraseña
		String res = "";

		// Creo un array para imprimir las que haya acertado
		char[] tablaAciertos;

		// Creo una variable para almacenar que el usuario falle la contraseña
		boolean fallo = true;

		// Pido al usuario la contraseña y la almanceno en la variable
		System.out.println("Introduzca la contraseña");
		contraseña = reader.nextLine();

		// Inicializo la tabla de aciertos con asteriscos y con la longitud de la
		// contraseña
		tablaAciertos = new char[contraseña.length()];
		Arrays.fill(tablaAciertos, '*');

		while (fallo) {
			// Solicito que el usuario introduzca su intento de adivinarla
			System.out.println("Intente adivinar la contraseña:");
			res = reader.nextLine();
			// Compruebo los caracteres que coinciden y en caso de que coincidan lo
			// introduzco en el arrau
			for (int i = 0; i < contraseña.length() && i < res.length(); i++) {
				if (contraseña.charAt(i) == res.charAt(i)) {
					tablaAciertos[i] = contraseña.charAt(i);
				}
			}
			// Imprimo el array
			System.out.println(String.valueOf(tablaAciertos));
			// En caso de que esté acertada entera pongo la variable en falso para que salga
			// del bucle
			if (String.valueOf(tablaAciertos).equals(contraseña)) {
				fallo = false;
			}

		}
		System.out.println("Has acertado la contraseña!");
		// Cierro el escáner
		reader.close();
	}

}
