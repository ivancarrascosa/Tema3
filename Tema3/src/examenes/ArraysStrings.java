package examenes;

import java.util.*;

public class ArraysStrings {
	// Creo la variable estática para el abecedario
	static char[][] abecedario = {{'a','b','c','d','e','f','g','h','i'},
								{'j','k','l','m','n','ñ','o','p','q'},
								{'r','s','t','u','v','w','x','y','z'}};
	
	// Creo la vriable global para las frases
	static String[] frases = {"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien",
			"cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida",
			"la verdadera sabiduria esta en reconocer la propia ignorancia"};
	
	// Creo la variable global para la frase
	static String fraseReal;
	
	// Creo la variable global para la frase codificada
	static String fraseCodificada = "";
	
	// Creo un objeto random estático
	static Random rand = new Random();
	public static void main(String[] args) {
		
		desordenaAbecedario();
		System.out.println(Arrays.deepToString(abecedario));
		eligeFrase();
		System.out.println(fraseReal);
		codificaFrase();
		System.out.println(fraseCodificada);
		
	}
	
	public static void desordenaAbecedario() {
		
		
		// Dos variables para almacenar las coordenadas que voy a cambiar al desordenar el abecedario
		int fila;
		int col;
		// Creo una variable para almacenar la una de las letras que voy a cambiar
		char letraCambiar;
		
		// Recorro por filas
		for (int i = 0 ; i < abecedario.length ; i++) {
			// Recorro por columnas
			for (int j = 0 ; j < abecedario[i].length ; j++) {
				// Genero dos numeros random que son por la fila y columna que voy a cambiar
				fila = rand.nextInt(0,abecedario.length);
				col = rand.nextInt(0, abecedario[i].length);
				
				// Asigno a letra cambiar esa letra random
				letraCambiar = abecedario[fila][col];
				
				// Cambio la letra random por la letra por la que voy
				abecedario[fila][col] = abecedario[i][j];
				
				// Cambio la letra por la que voy por la letra random 
				abecedario[i][j] = letraCambiar;
			}
		}
	}
	
	public static void eligeFrase() {
		// Creo una variable para almacenar el indice de la frase random que voy a escoger y le asigno el numero random
		int indiceFrase = rand.nextInt(0, frases.length);
		fraseReal = frases[indiceFrase];
	}
	
	public static void codificaFrase() {
		// Creo dos variables para almacenar la fila y columna por la que voy
		int fila = 0;
		int col = 0;
		
		// Creo una variable para ver que la letra que busco este o no encontrada
		boolean encontrada;
		
		for (int i = 0 ; i < fraseReal.length() ; i++) {
			encontrada = false;
			col = 0;
			fila = 0;
			if (fraseReal.charAt(i) == ' ') {
				fraseCodificada += " ";
			}else {
				while (fila < abecedario.length && !encontrada) {
					while (col < abecedario[fila].length && !encontrada) {
						if(abecedario[fila][col] == fraseReal.charAt(i)) {
							fraseCodificada += "" + fila + col + " ";
							encontrada = true;
						}
						col++;
					}
					col = 0;
					fila++;
				}
			}
			
		}
		
	}
	
	public static boolean compruebaCodigo(String codigo, String letra) {
		// Creo una variable para almacenar si se ha acertado o no
		boolean acierto;
		if (abecedario[codigo.charAt(0)][codigo.charAt(1)] == letra.charAt(0)) {
			fraseCodificada.replace(codigo, letra);
			acierto = true;
		} else {
			acierto = false;
		}
		return acierto;
	}
	
	public static boolean sonIguales() {
		// Creo una variable para almacenar la respuesta
		boolean res;
		// Hago una copia de la frase codificada y de la frase real
		String fraseCodificadaCopia = fraseCodificada;
		String fraseRealCopia = fraseReal;
		fraseCodificadaCopia.replace(' ', '\u0000');
		fraseRealCopia.replace(' ', '\u0000');
		if(fraseCodificadaCopia.equals(fraseRealCopia)) {
			res = true;
		} else {
			res = false;
		}
		return res;
}
}
