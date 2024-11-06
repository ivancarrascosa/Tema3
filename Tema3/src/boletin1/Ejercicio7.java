package boletin1;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo una variable para almacenar las temperaturas que introduzca el usuario
		int temperatura;
		
		// Creo un array para almacenar esa información
		int temperaturasAnuales[] = new int[12];
		
		// Creo una variable para almacenar el mes en el que estemos
		String mes = "";
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Pido al usuario las temperaturas y las voy almacenando
		for (int i = 0 ; i<12 ; i++) {
			System.out.println("Introduzca la temperatura media del mes que corresponda:");
			temperatura = reader.nextInt();
			temperaturasAnuales[i] = temperatura;
		}
		// Dependiendo de la iteración, seleccionamos el mes
		for (int i = 0 ; i<12 ; i++) {
			switch (i) {
			case 0 -> mes = "Enero";
			case 1 -> mes = "Febrero";
			case 2 -> mes = "Marzo";
			case 3 -> mes = "Abril";
			case 4 -> mes = "Mayo";
			case 5 -> mes = "Junio";
			case 6 -> mes = "Julio";
			case 7 -> mes = "Agosto";
			case 8 -> mes = "Septiembre";
			case 9 -> mes = "Octubre";
			case 10 -> mes = "Noviembre";
			case 11 -> mes = "Diciembre";
			
			}
			System.out.print(mes + ": ");
			// Imprimo asteriscos hasta llegar al número que esta en la posición de ese mes en la lista
			for (int j = 1 ; j <= temperaturasAnuales[i] ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// Cerramos el escáner
		reader.close();

	}

}
