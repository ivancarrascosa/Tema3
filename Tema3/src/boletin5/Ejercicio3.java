package boletin5;

public class Ejercicio3 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3},{2,1,3},{3,3,1}};
		System.out.println(simetrica(matriz));

	}
	
	public static boolean simetrica(int[][] matriz) {
		// Creo un booleano para saber si es simetrica o no, lo usare también para salir del for 
		boolean simetrica = true;
		
		// Primero, si no es una matriz cuadrada, directamente es false
		if (matriz.length != matriz[0].length) {
			simetrica = false;
		}
		// Solo recorreré la mitad de las filas o hasta que simétrica sea false
		for (int i = 0 ; i < Math.round((double)matriz.length/2) && simetrica ; i++) {
			for (int j = 0 ; j < matriz[0].length ; j++) {
				simetrica = (matriz[i][j] == matriz[j][i]); 
			}
		}
		return simetrica;
	}
}
