package boletin1.string;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(invertirCadena("Hola"));

	}
	
	public static String invertirCadena(String frase) {
		// Creo la cadena que voy a devoler
		String cadenaInvertida = "";
		
		// Con un for hacia atrás voy recorriendo la frase y añadiendo cada caracter de la cadena a la respuesta
		for(int i = frase.length()-1 ; i >= 0 ; i--) {
			cadenaInvertida += frase.charAt(i); 
		}
		
		return cadenaInvertida;
	}
}
