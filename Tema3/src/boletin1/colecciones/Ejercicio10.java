package boletin1.colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	// Creo un escáner estático
	static Scanner reader = new Scanner(System.in);
	
	// Creo una variable global para usar el diccionario
	static HashMap<String, Float> catalogo = new HashMap<>();
	
	public static void main(String[] args) {
		// Creo una variable para la opcion del menu que seleccione el usuario
		int opcionMenu;
		
		// Imprimo menu
		opcionMenu = imprimirMenu();
		
		// Creo un bucle while del que saldre si la opcion es 0
		while(opcionMenu != 0) {
			realizarOpcion(opcionMenu);
			imprimirMenu();
		}
		
		System.out.println(catalogo);

	}
	
	public static int imprimirMenu() {
		int res;
		System.out.println("PRODUCTOS");
		System.out.println("1. Alta de producto");
		System.out.println("2. Baja de producto");
		System.out.println("3. Cambiar precio");
		System.out.println("0. Salir");
		res = reader.nextInt();
		reader.nextLine();
		return res;
	}
	
	public static void realizarOpcion(int opcionMenu) {
		// Creo una variable para el producto
		String producto;
		
		// Creo una variable para almacenar el precio del producto
		float precio;
		
		switch (opcionMenu) {
		case 1:
			System.out.println("Introduzca el nombre del producto:");
			producto = reader.nextLine();
			System.out.println("Introduzca su precio");
			precio = reader.nextFloat();
			//Limpio el buffer
			reader.nextLine();
			// Lo introduzco en el catálogo 
			catalogo.put(producto, precio);
			break;
		
		case 2:
			System.out.println("Introduzca el nombre del producto que desea eliminar");
			producto = reader.nextLine();
			catalogo.remove(producto);
			
		case 3:
			System.out.println("Introduzca el nombre del producto cuyo precio desea actualizar:");
			producto = reader.nextLine();
			System.out.println("Introduzca el nuevo precio");
			precio = reader.nextFloat();
			//Limpio el buffer
			reader.nextLine();
			// Lo introduzco en el catálogo 
			catalogo.put(producto, precio);
		default:
			break;
		}
	}

}
