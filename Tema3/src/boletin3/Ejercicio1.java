package boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el array que vamos a utilizar
		int num[][] = new int[3][6];
		// Voy insertando los números
		num[0][0] = 0;
		num[0][2] = 30;
		num[0][3] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		for (int i = 0 ; i<num.length ; i++) {
			for(int j = 0 ; j<num[1].length ; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
