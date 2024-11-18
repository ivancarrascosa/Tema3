package boletin5;

public class Ejercicio4 {

	public static void main(String[] args) {
		int mat[][] = {{2,7,6},{9,5,1},{3,3,8}};
		System.out.println(esMagica(mat));

	}

	public static boolean esMagica(int[][] matriz) {
		// Creo una variable con un booleano para comprobar si la matriz es mágica
		boolean magica = true;

		// Creo una variable para almacenar la suma
		int suma = 0;

		// Creo una variable que almacene la suma temporal en cada fila y columnana
		int sumaTemp = 0;

		// Saco la suma de la primera fila para establecerla en la suma, despues
		// comprobaré si la suma es igual al resto de sumas
		for (int j = 0; j < matriz[0].length; j++) {
			suma += matriz[0][j];
		}

		// Teniendo ya la suma, recorro la tabla para comprobar que todas las sumas sean iguales
		for (int i = 1 ; i < matriz.length && magica ; i++) {
			for (int j = 0 ; j <matriz[i].length ; j++) {
				sumaTemp += matriz[i][j];
			}
			if (sumaTemp != suma) {
				magica = false;
			}
			sumaTemp = 0;
		}
		// Hago lo mismo que en el bucle anterior pero esta vez recorro por columnas
		for (int i = 0 ; i < matriz[0].length && magica ; i++) {
			for (int j = 0 ; j <matriz.length ; j++) {
				sumaTemp += matriz[j][i];
			}
			if (sumaTemp != suma) {
				magica = false;
			}
			sumaTemp = 0;
		}
		return magica;
	}
	
}
