package boletin2.colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// Creo un escáner 
		Scanner reader = new Scanner(System.in);
		
		// Creo un mapa para almacenar la serie y las valoraciones
		HashMap<String, Float> valoracionesSeries = new HashMap<>();
		// Creo una variable para seleccionar la opción elegida por el usuario
		int opcElegida;
		
		// Muestro el menú y almaceno la opción elegida en una variable
		mostrarMenu();
		opcElegida = reader.nextInt();
		reader.nextLine();
		while (opcElegida != 4) {
			// Utilizo la función realizar opción con el input de la opción elegida
			realizarOpcion(opcElegida, valoracionesSeries);
			mostrarMenu();
			opcElegida = reader.nextInt();
			reader.nextLine();
		}
		 
		reader.close();

	}
	
	public static void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Agregar serie.");
		System.out.println("2. Buscar serie.");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Salir.");
	}
	
	public static void realizarOpcion(int opc, HashMap<String, Float> Diccionario) {
		// Creo una variable para almacenar el nombre de la serie
		String serie;
		// Creo una variable para almacenar la puntuacion
		float punt;
		switch (opc) {
		case 1:
			System.out.println("Introduzca la serie que desea evaluar:");
			serie = reader.nextLine();
			
			System.out.println("Introduzca la puntuacion que le da:");
			punt = reader.nextFloat();
			reader.nextLine();
			Diccionario.put(serie, punt);
			break;
		case 2:
			System.out.println("Introduzca la serie que desea buscar:");
			serie = reader.nextLine();
			if (Diccionario.get(serie) != null) {
				System.out.println("La puntuación de la serie es " + Diccionario.get(serie));
			} else {
				System.out.println("Esta serie no tiene valoraciones");
			}
			break;
		case 3:
			System.out.println("Introduzca la serie que desea eliminar:");
			serie = reader.nextLine();
			if (Diccionario.containsKey(serie)) {
				Diccionario.remove(serie);
				System.out.println("Serie eliminada");
			} else {
				System.out.println("Esta serie no estaba incluida, no ha podido ser eliminada");
			}
		default:
			System.out.println("Saliendo del programa");
			break;
		}
	}

}
