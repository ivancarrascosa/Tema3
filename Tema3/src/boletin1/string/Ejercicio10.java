package boletin1.string;

public class Ejercicio10 {

	public static void main(String[] args) {
		char conj2[] = {'p','v','i','u','m','t','e','r','k','q','s'};
		char conj1[] = {'e', 'i','k','m','p','q','r','s','t','u','v'};
		String frase = codificarFrase(conj1,conj2,"PaquiTo");
		System.out.println(frase);
	}

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Creo una variable para almacenar el carácter que voy a devolver
		char res = c;

		// Creo una variable para almacenar la posición de la lista en la que está el
		// carácter que queremos cambiar (si está), para después convertirlo.
		int pos = -1;

		// Recorro el conjunto 1 y en caso de que la letra c esté, le doy esa posición a
		// la variable pos
		for (int i = 0; i < conjunto1.length; i++) {
			if (conjunto1[i] == c) {
				pos = i;
			}
		}
		// Si la posición es mayor que -1 le asigno a res la variable de la cadena 2.
		if (pos > -1) {
			res = conjunto2[pos];
		}

		return res;
	}

	public static String codificarFrase(char conjunto1[], char conjunto2[], String frase) {
		// Creo el string para devolverlo codificado
		String res = "";
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			res += codifica(conjunto1, conjunto2, frase.charAt(i));
		}
		return res;
	}
	public static char codificaString(char conjunto1[], char conjunto2[], char c) {
			char charCoded = c;
			
			String conj1Cad = String.valueOf(conjunto1);
			String conj2Cad = String.valueOf(conjunto2);
			
			int pos = conj1Cad.indexOf(c);
			
			if (pos >= 0) {
				charCoded = conj2Cad.charAt(pos);
			}
			return charCoded;
	}
}
