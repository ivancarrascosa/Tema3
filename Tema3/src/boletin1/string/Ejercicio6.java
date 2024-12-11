package boletin1.string;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esPalindroma("ahgha"));

	}

	public static boolean esPalindroma(String frase) {
		// Creo una variable para almacenar si es o no palindroma y devolverlo
		boolean palindroma = true;
		
		// Creo una copia sin espacios
		String sinEspacios = "";
		
		// Paso la frase a minúsculas
		frase = frase.toLowerCase();
		
		// Creo un contador que usare para recorrer la frase
		int cont = 0;
		
		// Creo una variable para almacenar la longitud menos 1 que es donde tengo que empezar para recorrer de detras hacia delante
		int detrasDelante;
		
		// Creo una variable que me servirá para parar el while
		float parar;
		// Creo una copia sin espacios
		sinEspacios = frase.replace(" ", "");
		
		// le doy valor a la variable que va a recorrer de detras hacia delante
		detrasDelante = sinEspacios.length() - 1;
		
		// Le doy valor a la variable para parar
		parar = sinEspacios.length()/2;
		// Ahora recorro la frase de delante hacia atras y al reves
		while(palindroma && cont < parar) {
			if(sinEspacios.charAt(cont) != sinEspacios.charAt(detrasDelante - cont)) {
				palindroma = false;
			}
			cont++;
		}
		return palindroma;
	}
}
