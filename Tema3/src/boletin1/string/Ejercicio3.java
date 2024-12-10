package boletin1.string;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(contarEspacios("Hola buenas t ard es."));

	}

	public static int contarEspacios(String frase) {
		// Creo un parámetro que me cuente los espacios, lo inicio
		int contadorEspacios = 0;
		
		// Recorro la frase y comparo cada caracter, si es un espacio le sumo uno.
		for(int i = 0 ; i < frase.length() ; i++) {
			if(frase.charAt(i) == ' ') {
				contadorEspacios++;
			}
		}
		return contadorEspacios;
	}
}
