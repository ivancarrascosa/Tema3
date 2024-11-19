package boletin4;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[] = {1,2,3,4,1,1,2};
		System.out.println(Arrays.toString(buscarTodos(tabla,1)));

	}
	
	public static int apariciones(int t[], int valor) {
		// Creo un contador para saber la longitud de la tabla final y dar la respuesta 
		int res = 0;
		// Recorro la tabla de entrada para saber cuantas veces aparece el valor que buscamos
		for (int num : t) {
			if (num == valor) {
				res++;
			}
		}
		return res;
	}
	public static int[] buscarTodos(int t[], int valor) {
		// Creo una tabla que va a ser la respuesta
		int res[] = new int[apariciones(t,valor)];
		
		// Creo un contador
		int cont = 0;
		
		// El for recorrera la tabla e ira metiendo los valores que coincidan en las tablas de respuesta
		for (int i = 0; i<t.length; i++) {
			if (t[i] == valor) {
				res[cont] = i;
				cont++;
			}
		}
		return res;
	}

}
