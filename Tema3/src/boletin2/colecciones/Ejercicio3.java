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
		TreeMap<Character, Integer> res = new TreeMap<>();
		ArrayList<Character> textoEnLista = new ArrayList<>();
		for (int i = 0; i < texto.length(); i++) {
			letraActual = texto.charAt(i);
			if (Character.isLetter(letraActual)) {
				textoEnLista.add((char) (letraActual > 'Z' ? letraActual-32 : letraActual));
			}
		}
		for (int i = 0; i < textoEnLista.size(); i++) {
			res.put(textoEnLista.get(i), Collections.frequency(textoEnLista, textoEnLista.get(i)));
		}
		return res;
	}

}
