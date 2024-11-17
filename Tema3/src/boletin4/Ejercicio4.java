package boletin4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int tabla[] = {1,2,3,4,5,4};
		System.out.println(buscar(tabla,2));

	}

	public static int buscar(int t[], int clave) {
		// Creo una variable para almacenar la respuesta
		int res = -1;
		int cont = 0;
		while(res == -1 && cont<t.length) {
			if (t[cont] == clave) {
				res = cont;
			}
			cont++;
		}
		return res;
	}

}
