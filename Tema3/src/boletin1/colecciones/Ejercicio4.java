package boletin1.colecciones;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		TreeSet<Integer> numerosAleatoriosOrdenados = new TreeSet<>();
		Random rand = new Random();
		
		// Creo una variable para almacenar un numero random
		int numRand;
		
		while (numerosAleatoriosOrdenados.size() < 20) {
			numRand = rand.nextInt(Integer.MIN_VALUE, 11);
			numerosAleatoriosOrdenados.add(numRand);
		}
		System.out.println(numerosAleatoriosOrdenados);

	}

}
