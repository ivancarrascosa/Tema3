package boletin2.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	// Creo un escáner que voy a usar en los distintos métodos
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo un arraylist para los nombres
		ArrayList<String> listaNombres = new ArrayList<String>();
	// Creo una variable para almacenar la opcion elegida por el usuario
		int opcionElegida;
		do {
			opcionElegida = mostrarMenu();
			realizarAccion(opcionElegida, listaNombres);
			System.out.println(listaNombres);
		} while (opcionElegida != 5);
	}

	public static int mostrarMenu() {
		// Creo una variable donde almacenar la respuesta del usuario
		int res;
		System.out.println("Seleccione una opción:");
		System.out.println("1. Añadir nuevo nombre a la lista.");
		System.out.println("2. Eliminar nombre.");
		System.out.println("3. Ordena la lista alfabéticamente.");
		System.out.println("4. Buscar nombre.");
		System.out.println("5. Salir.");
		res = reader.nextInt();
		// Limpio el buffer
		reader.nextLine();
		return res;
	}
	
	public static void realizarAccion(int opcMenu, ArrayList<String> listaNombres ) {
		// Creo una variable para guarda el nombre que se introduzca
		String nombre;
		
		switch (opcMenu) {
		case 1:
			System.out.println("Introduzca el nombre que desea añadir:");
			nombre = reader.nextLine();
			listaNombres.add(nombre);
			break;
		
		case 2:
			System.out.println("Introduzca el nombre que desea eliminar:");
			nombre = reader.nextLine();
			while(listaNombres.remove(nombre)) {
				listaNombres.remove(nombre);
			}
			break;
		
		case 3:
			Collections.sort(listaNombres);
			System.out.println("Lista Ordenada.");
			break;
			
		case 4:
			System.out.println("Introduzca el nombre que quieres buscar:");
			nombre = reader.nextLine();
			if(listaNombres.indexOf(nombre) != -1) {
				System.out.println("El nombre se encuentra en la lista.");
			} else {
				System.out.println("El nombre no se encuentra en la lista.");
			}
		default:
			break;
		}
	}
}
