package boletin4;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[] = {1,2,3,4,1,1,2};
		System.out.println(Arrays.toString(buscarTodos(tabla,7)));

	}
	
	public static int[] buscarTodos(int t[], int valor) {
		// Creo una tabla que va a ser la respuesta
		int res[];
		
		// Creo un contador para saber la longitud de la tabla final 
		int cont = 0;
		// Recorro la tabla de entrada para saber cuantas veces aparece el valor que buscamos
		for (int num : t) {
			if (num == valor) {
				cont++;
			}
		}
		res = new int[cont];
		// Reinicio el contador para usarlo de nuevo
		cont = 0;
		for (int i = 0; i<t.length; i++) {
			if (t[i] == valor) {
				res[cont] = i;
				cont++;
			}
		}
		return res;
	}

}
