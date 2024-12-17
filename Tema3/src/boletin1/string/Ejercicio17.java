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
	
}