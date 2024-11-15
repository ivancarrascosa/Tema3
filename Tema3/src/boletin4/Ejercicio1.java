package boletin4;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro la tabla y la inicializo y compruebo que suma funciona correctamente
		int tablaNum[] = new int [] {1,2,3,4,5};
		System.out.println(suma(tablaNum));
	}
	
	public static int suma(int[] tabla) {
		// Creo la variable suma total y por cada numero en la tabla de input lo summo a la suma total
		int sumaTotal = 0;
		for (int num : tabla) {
			sumaTotal += num;
		}
		return sumaTotal;
	}
}
