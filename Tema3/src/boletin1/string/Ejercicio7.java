package boletin1.string;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(vecesAparece("Hola como estas,.,.,,,.., ,.., hola hola", "estas"));

	}
	
	public static int vecesAparece(String frase, String palabraBuscar) {
		// Pongo la frase y la palabra en minúsculas
		frase = frase.toLowerCase();
		palabraBuscar = palabraBuscar.toLowerCase();
		
		// Creo un contador para las veces que sale la palabra
		int cont = 0;
		
		// Separo la frase en palabras
		String palabras[] = frase.split(" ");
		
		// Recorro el string con las palabras y por cada una que sea igual le sumo 1 al contador
		for (String palabraFrase : palabras) {
			if(palabraFrase.contains(palabraBuscar)) {
				cont++;
			}
		}
		
		return cont;
	}
}
