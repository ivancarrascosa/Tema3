package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo la tabla de 10x10
		int tablaMultiplicar[][] = new int[10][10];
		
		for (int i = 0 ; i<tablaMultiplicar.length ; i++) {
			System.out.print("Tabla del " + (i+1) + "\t");
			for (int j = 0 ; j<tablaMultiplicar[i].length ; j++) {
				tablaMultiplicar[i][j] = (i+1) * (j+1);
				System.out.print(tablaMultiplicar[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
