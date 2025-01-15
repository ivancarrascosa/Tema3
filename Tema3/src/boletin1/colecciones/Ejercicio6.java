package boletin1.colecciones;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		TreeSet<String> conjuntoPalabras = new TreeSet<>();
		
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
