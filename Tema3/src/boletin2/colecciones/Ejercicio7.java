package boletin2.colecciones;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio7 {

	public static void main(String[] args) {
		String valor = "Hola";
		HashMap<Integer, HashSet<String>> diccionarioLongitudPalabras =new HashMap<>();
		añadirPalabra(valor, diccionarioLongitudPalabras);
		System.out.println(diccionarioLongitudPalabras);
	}

	private static void añadirPalabra(String valor, HashMap<Integer, HashSet<String>> diccionarioLongitudPalabras) {
		int longitudPalabra = valor.length();
		HashSet<String> conjuntoAñadir = new HashSet<String>();
		// Si ya tiene la key de la longitud de la palabra solo añado al conjunto valor el valor que quiero añadir
		if(diccionarioLongitudPalabras.containsKey(longitudPalabra)) {
			diccionarioLongitudPalabras.get(longitudPalabra).add(valor);
		} else {
			// Si no está el valor, añado al conjunto que será el valor, elvalor que quiero añadir
			conjuntoAñadir.add(valor);
			// Añado la longitud y el conjunto al mapa
			diccionarioLongitudPalabras.put(longitudPalabra,conjuntoAñadir);
		}
		
	}
	
	

}
