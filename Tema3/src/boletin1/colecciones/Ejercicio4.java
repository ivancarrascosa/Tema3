package boletin1.colecciones;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		TreeSet<Integer> numerosAleatoriosOrdenados = new TreeSet<>();
		Random rand = new Random();
		
		// Creo una variable para almacenar un numero random
		int numRand;
		
		// Creo una variable que cuente las veces que introduzco variables en el conjunto
		int cont = 0;
		
		while (cont <= 20) {
			numRand = rand.nextInt(Integer.MIN_VALUE, 11);
			if (!numerosAleatoriosOrdenados.contains(numRand)) {
				numerosAleatoriosOrdenados.add(numRand);
				cont++;
			}
		}
		System.out.println(numerosAleatoriosOrdenados);

	}

}
