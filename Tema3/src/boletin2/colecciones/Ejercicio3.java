package boletin2.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		System.out.println(cuentaLetras(texto));
	}

	public static TreeMap<Character, Integer> cuentaLetras(String texto) {
		char letraActual;
		// Creo un mapa para la respuesta
		TreeMap<Character, Integer> res = new TreeMap<>();
		
		// Creo una lista en la que almacenare todas las letras
		ArrayList<Character> textoEnLista = new ArrayList<>();
		
		// Recorro el texto
		for (int i = 0; i < texto.length(); i++) {
			letraActual = texto.charAt(i);
			// Si la el caracter actual es una letra lo introduzco en el array en mayúscula
			if (Character.isLetter(letraActual)) {
				textoEnLista.add((char) (letraActual > 'Z' ? letraActual-32 : letraActual));
			}
		}
		// Recorro los caracteres de A a Z
		for (int i = 'A'; i <= 'Z'; i++) {
			// Añado al mapa la frecuencia de los caracteres
			res.put((char) i, Collections.frequency(textoEnLista, (char) i));
		}
		return res;
	}

}
