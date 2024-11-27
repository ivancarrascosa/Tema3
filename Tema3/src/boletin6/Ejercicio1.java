package boletin6;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(encontrarValorEnBidimensional(tabla, 3));

	}
	
	public static boolean encontrarValorEnBidimensional (int t[][], int valor) {
		// Creo una variable booleana para devolver
		boolean encontrado = false;
		
		// Creo índices para recorrer la tabla
		int i = 0;
		int j = 0;
		
		// Recorro la tabla 
		while (!encontrado && i< t.length) {
			while(j < t[i].length) {
			if(t[i][j] == valor) {
				encontrado = true;
			}
			j++;
			}
			j = 0;
			i++;
		}
		
		// Devuelvo si hemos encontrado o no el valor
		return encontrado;
	}
}
