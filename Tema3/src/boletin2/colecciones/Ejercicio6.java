package boletin2.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo el HashMap que voy a utilizar como agenda, cuyas claves serán String
		// (las personas) y los valores serán listas de telefonos
		HashMap<String, ArrayList<Integer>> agenda = new HashMap<>();

		// Creo una variable para almacenar la opción seleccionada por el usuario
		int opcMenu;

		// Creo una variable para almacenar el nombre de la persona que se introduzca,
		// ya sea para borrar, añadir...
		String nombre;

		// Creo una variable para almacenar un numero de telefono
		int telefono;

		mostrarMenu();
		opcMenu = reader.nextInt();
		reader.nextLine();

		// Creo un bucle while del que saldré si la opción seleccionada es el 6
		while (opcMenu != 6) {
			switch (opcMenu) {
			case 1:
				System.out.println("Introduzca el nombre de la persona que desea añadir:");
				nombre = reader.nextLine();
				// añado a la persona llamando a la funcion con el nombre y la agenda
				añadirPersona(nombre, agenda);
				break;

			case 2:
				System.out.println("Introduzca el nombre de la persona la cual desea añadir un telefono:");
				nombre = reader.nextLine();
				System.out.println("Introduzca el telefono que desea añadir:");
				telefono = reader.nextInt();
				reader.nextLine();
				// Añado el telefono a la persona que me han dado y si no está añado a la
				// persona con el telefono
				añadirTelefono(nombre, telefono, agenda);
				break;

			case 3:
				System.out.println("Introduzca la persona de la cual quiere ver los telefonos:");
				nombre = reader.nextLine();
				System.out.println(mostrarTelefonos(nombre, agenda));
				break;
			case 4:
				// Pido el nombre y el telefono
				System.out.println("Introduzca el nombre de la persona que quiere eliminar el telefono");
				nombre = reader.nextLine();
				System.out.println("Introduzca el telefono que quiere eliminar:");
				telefono = reader.nextInt();
				reader.nextLine();
				// Si se ha eliminado muestro que se ha eliminado
				if (eliminarTelefono(nombre, telefono, agenda)) {
					System.out.println("Telefono eliminado adecuadamente");
				} else { // Sino muestro este otro mensaje
					System.out.println(
							"No se ha podido eliminar el numero, puede ser que la persona no esté añadida o no tenga ese número asociado");
				}
				break;
			
			case 5:
				System.out.println("Introduzca a la persona que desea eliminar:");
				nombre = reader.nextLine();
				if(eliminarPersona(nombre, agenda)) {
					System.out.println("Contacto eliminado correctamente");
				} else {
					System.out.println("Esta persona no estaba en sus contactos o no tenía ningún teléfono asociado");
				}
			default:
				break;
			}
			
			System.out.println(agenda);
			
			mostrarMenu();
			opcMenu = reader.nextInt();
			reader.nextLine();
		}

	}

	private static boolean eliminarPersona(String nombre, HashMap<String, ArrayList<Integer>> agenda) {
		boolean res = true;
		if (agenda.remove(nombre) == null) {
			res = false;
		}
		return res;
	}

	public static void mostrarMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Añadir persona.");
		System.out.println("2. Añadir teléfono a una persona dada.");
		System.out.println("3. Mostrar los teléfonos de una persona.");
		System.out.println("4. Eliminar teléfono de una persona.");
		System.out.println("5. Eliminar una persona.");
		System.out.println("6. Salir.");
	}

	public static void añadirPersona(String nombre, HashMap<String, ArrayList<Integer>> agenda) {
		agenda.put(nombre, null);
	}

	public static void añadirTelefono(String nombre, int telefono, HashMap<String, ArrayList<Integer>> agenda) {
		// Creo un array list para añadir el telefono si es necesario
		ArrayList<Integer> telefonos = new ArrayList<Integer>();
		ArrayList<Integer> listaTelefonos = agenda.get(nombre);
		if (agenda.containsKey(nombre) && listaTelefonos == null) {
			telefonos.add(telefono);
			agenda.put(nombre, telefonos);
		} else if (agenda.containsKey(nombre) && listaTelefonos != null) {
			listaTelefonos.add(telefono);
		} else {
			System.out.println("Esa persona no se encuentra en la agenda, pero se le añadirá con su teléfono");
			telefonos.add(telefono);
			agenda.put(nombre, telefonos);
		}
			
	}

	public static String mostrarTelefonos(String nombre, HashMap<String, ArrayList<Integer>> agenda) {
		String res = "";
		ArrayList<Integer> telefonos = agenda.get(nombre);
		if (telefonos == null) {
			res = "El nombre no tiene ningún teléfono asociado o no tiene agregada a esa persona";
		} else {
			for (int i = 0; i < telefonos.size(); i++) {
				res += telefonos.get(i) + "\n";
			}
		}
		return res;
	}

	public static boolean eliminarTelefono(String nombre, int telefono, HashMap<String, ArrayList<Integer>> agenda) {
		boolean eliminado = false;
		// Asigno a una array list la lista de los telefonos de la persona
		ArrayList<Integer> listaTelefonos = agenda.get(nombre);

		// Si es distinto de nulo y contiene el numero, lo elimino y devuelvo true, sino
		// devuelvo false
		if (listaTelefonos != null && listaTelefonos.contains(telefono)) {
			listaTelefonos.remove(Integer.valueOf(telefono));
			eliminado = true;
		}

		return eliminado;
	}
}
