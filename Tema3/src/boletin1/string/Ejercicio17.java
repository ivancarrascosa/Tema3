package boletin1.string;


public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println(eliminarComentariosC("Entrada: if (a==3) /* igual a tres */ a++; /* incrementamos a */ Salida: if (a==3) a++;"));
	}
	
	public static String eliminarComentariosC(String codigo) {
		// Creo una variable para almacenar la repuesta
		String res = "";
		
		// Utilizo este regex que me elimina los comentarios
		final String regex = "(?<!\\\"|\\')((/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/)|(//.*))(?!\\\"|\\')";
		
		// Creo un array para separar el código sin comentarios
		String[] codigoSeparado; 
		codigoSeparado = codigo.split(regex);
		
		// Voy separa
		for (int i = 0 ; i < codigoSeparado.length ; i++) {
			res += codigoSeparado[i].trim() + "\n"; 
		}
		
		return res;
	}
	
	public static String eliminarComentariosCSubString(String sentenciaC) {
		// Creo una variable para almacenar la repuesta
		String res = "";
		
		final String INICIO = "/*";
		final String FIN = "*/";
		int posInicio = sentenciaC.indexOf(INICIO);
		int posFin = 0;
		
		while (posInicio >= 0) {
			res += sentenciaC.substring(posFin,posInicio);
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			posInicio = sentenciaC.indexOf(INICIO, posFin);
		}
		res += sentenciaC.substring(posFin, sentenciaC.length());
		return res;
	}
	
}
