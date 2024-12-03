package boletin7;

public class Ejercicio2 {

	public static void main(String[] args) {
		String[][] tablero = {{"x","x","x","x"},{"-","-","-","-"}};
		System.out.println(ganador(tablero));

	}
	
	public static String ganador(String t[][]) {
		// Creo un String para devolver el ganador
		String res = "";
		// Creo un for para recorrer todas las horizontales 
		for (int i = 0 ; i <t.length ; i++) {
			// Llego solo hasta la longtud menos 4, porque sino se me va fuera de los límites de la tabla
			for(int j = 0 ; j <= t[i].length - 4 ; j++) {
				if (!t[i][j].equals("-") && t[i][j].equals(t[i][j+1]) && t[i][j+1].equals(t[i][j+2]) && t[i][j+2].equals(t[i][j+3])) {
					res = t[i][j];
				}
			}
		}
		return res;
	}
}
