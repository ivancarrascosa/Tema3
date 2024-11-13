package boletin3;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo la tabla 
		int tabla[][] = new int[4][5];
		
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo una variable para almacenar el número random que se va a introducir en la tabla
		int numRand;
		
		// Creo una variable para almacenar las sumas de filas y columnas
		int sumaFilasColumnas = 0;
		
		// Creo una variable para almacenar la suma total
		int suma = 0;
		
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				numRand = rand.nextInt(100,1000);
				tabla[i][j] = numRand;
				suma += numRand;
				sumaFilasColumnas += numRand;
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println(sumaFilasColumnas);
			sumaFilasColumnas = 0;
		}
		for (int i = 0 ; i < tabla[0].length ; i++) {
			for (int j = 0 ; j < tabla.length ; j++) {
				sumaFilasColumnas += tabla[j][i];
			}
			System.out.print(sumaFilasColumnas + "\t");
			sumaFilasColumnas = 0;
		}
		System.out.println(suma);
	}

}
