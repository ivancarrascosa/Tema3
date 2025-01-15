package boletin1.colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		LinkedHashSet<String> conjuntoPalabras = new LinkedHashSet<>();
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar los nombres que se van introduciendo
		String nombre;
		
		System.out.println("Introduzca el siguiente nombre. Introduzca fin si quiere parar:");
		nombre = reader.nextLine();
		
		while(!nombre.equals("fin")) {
			conjuntoPalabras.add(nombre);
			System.out.println("Introduzca el siguiente nombre. Introduzca fin si quiere parar:");
			nombre = reader.nextLine();
		}
		
		System.out.println(conjuntoPalabras);
		
		reader.close();
	}

}
