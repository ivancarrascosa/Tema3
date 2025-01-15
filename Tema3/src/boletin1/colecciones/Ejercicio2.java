package boletin1.colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo la arraylist que voy a usar
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo una variable para almacenar la longitud de la lista
		int longitudLista;
		
		// Creo una variable para ir almacenando los numeros que tengo que añadir a la lista
		int num;
		
		// Creo una variable para almacenar la suma, la media, el maximo y el minimo
		int suma = 0;
		float media;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		longitudLista = rand.nextInt(5,11);
		
		for (int i = 0 ; i < longitudLista ; i++) {
			num = rand.nextInt(0,101);
			listaNumeros.add(num);
		}
		
		for (int numero : listaNumeros) {
			if (numero > maximo) {
				maximo = numero;
			} else if (numero < minimo){
				minimo = numero;
			}
			suma += numero;
		}
		media = (float)suma / longitudLista;
		
		System.out.println("La suma es " + suma);
		System.out.println("La media es " + media);
		System.out.println("El minimo es " + minimo);
		System.out.println("El maximo es " + maximo);
	}

}
