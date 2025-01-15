package boletin1.colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo un objeto treemap
		TreeMap<String, String> diccionarioIngEsp = new TreeMap<>();
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para la Opción del menú
		int opcMenu;
		
		// Creo dos variables para almacenar la palabra en español y en ingles
		String palEsp;
		String palIng;
		
		// Creo una variable para buscar palabras
		String palabraBuscar;
		
		System.out.println("1. Inserta palabra");
		System.out.println("2. Busca palabra");
		System.out.println("0. Salir");
		opcMenu = reader.nextInt();
		reader.nextLine();
		// Mientras la opción que se introduzca no sea 0
		while (opcMenu != 0) {
			switch (opcMenu) {
			case 1:
				System.out.println("Introduzca palabra en español:");
				palEsp = reader.nextLine();
				System.out.println("Introduzca su traducción al inglés:");
				palIng = reader.nextLine();
				diccionarioIngEsp.put(palEsp, palIng);
				break;
			
			case 2:
				System.out.println("Introduzca la palabra que quiere buscar:");
				palabraBuscar = reader.nextLine();
				if (diccionarioIngEsp.get(palabraBuscar) != null) {
					System.out.println(diccionarioIngEsp.get(palabraBuscar));
				} else {
					System.out.println("Esa palabra no está en el diccionario");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Opción seleccionada incorrecta.");
				break;
			}
			System.out.println("1. Inserta palabra");
			System.out.println("2. Busca palabra");
			System.out.println("0. Salir");
			opcMenu = reader.nextInt();
			//Limpio el buffer
			reader.nextLine();
		}
		reader.close();
	}

}
