package boletin2.colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo un HashMap cuyas claves sean Strings y los valores HashSet
		HashMap<String, HashSet<String>> listaTareas = new HashMap<>();
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar la opción del menú
		int opcMenu;
		
		// Creo una opción para almacenar la categoría y otra para la tarea
		String categoria;
		String tarea;
		
		mostrarMenu();
		opcMenu = reader.nextInt();
		reader.nextLine();
		
		// Creo un bucle while del que saldré si se selecciona salir
		while(opcMenu != 4) {
			switch (opcMenu) {
			case 1:
				// Si el jugador elige añadir una tarea:
				System.out.println("Introduzca la categoría que desea añadir:");
				categoria = reader.nextLine();
				System.out.println("Introduzca la tarea que quiere apuntar en esa categoría");
				tarea = reader.nextLine();
				añadirTarea(listaTareas, categoria, tarea);
				break;
			
			case 2:
				// Si el usuario elige eliminar una tarea
				System.out.println("Introduzca la categoría de la cual desea eliminar una tarea:");
				categoria = reader.nextLine();
				System.out.println("Introduzca la tarea que desea eliminar:");
				tarea = reader.nextLine();
				eliminarTarea(listaTareas, categoria, tarea);
				break;
			
			case 3:
				// Si el usuario elige listar las listas de una categoria
				System.out.println("Introduzca la categoría de la cual quiere ver las tareas:");
				categoria = reader.nextLine();
				listarTareas(listaTareas,categoria);
				break;
			default:
				break;
			}
			mostrarMenu();
			opcMenu = reader.nextInt();
			reader.nextLine();
		}
		
		// Cierro el escáner
		reader.close();

	}

	private static void listarTareas(HashMap<String, HashSet<String>> listaTareas, String categoria) {
		// Si la categoría existe
		if (listaTareas.containsKey(categoria) ) {
			System.out.println(listaTareas.get(categoria));
		} else {
			System.out.println("Esta categoría no se encuentra en la lista de tareas.");
		}
		
	}

	private static void eliminarTarea(HashMap<String, HashSet<String>> listaTareas, String categoria, String tarea) {
		// Si no existe la categoría
		if (!listaTareas.containsKey(categoria)) {
			System.out.println("Esta categoría no existe.");
		} else {
			// Si la categoría existe y su valor contiene la tarea
			if(listaTareas.get(categoria).contains(tarea)) {
				listaTareas.get(categoria).remove(tarea);
			} else { // Si la categoría existe pero el valor no contiene la tarea
				System.out.println("Esta tarea no existe en la categoría");
			}
		}
		
	}

	private static void añadirTarea(HashMap<String, HashSet<String>> listaTareas, String categoria, String tarea) {
		// Creo un conjunto para las tareas por si no está la categoría en el mapa
		HashSet<String> conjuntoTareas = new HashSet<String>();
		// Si la categoría ya está en el mapa, añado al conjunto que es su valor la
		// tarea
		if (listaTareas.containsKey(categoria)) {
			listaTareas.get(categoria).add(tarea);
		} else {
			// Si no está ya, le pongo de clave la categoría y de valor el conjunto de las
			// tareas
			conjuntoTareas.add(tarea);
			listaTareas.put(categoria, conjuntoTareas);
		}

	}

	public static void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Añadir tarea.");
		System.out.println("2. Eliminar tarea.");
		System.out.println("3. Mostrar tareas de una categoría");
		System.out.println("4. Salir.");
	}

}
