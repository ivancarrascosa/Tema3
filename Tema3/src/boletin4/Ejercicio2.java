package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaro la tabla y la inicializo y compruebo que suma funciona correctamente
		int tablaNum[] = new int [] {1,2,3,4,5};
		System.out.println(maximo(tablaNum));
	}
	
	public static int maximo(int[] tabla) {
		// Creo la variable suma total y por cada numero en la tabla de input lo summo a la suma total
		int valorMaximo = Integer.MIN_VALUE;
		for (int num : tabla) {
			if (num > valorMaximo) {
				valorMaximo = num;
			}
		}
		return valorMaximo;
	}
}
