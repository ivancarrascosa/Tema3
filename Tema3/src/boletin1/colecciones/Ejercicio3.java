package boletin1.colecciones;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo el treemap en el que guardare los numeros
		ArrayList<Integer> listaNumeros = new ArrayList<>();

		// Creo un objeto random
		Random rand = new Random();

		// Creo una variable para almacenar el numero que voy a introducir
		int num;

		// Itero 30 veces este for (lo pedido en el enunciado)
		for (int i = 0; i < 30; i++) {
			num = rand.nextInt(0, 11);
			listaNumeros.add(num);
		}
		Collections.sort(listaNumeros);
		for(int numero : listaNumeros) {
			System.out.print(numero + " ");
		}
	}

}
