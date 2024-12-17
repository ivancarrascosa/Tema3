package boletin1.string;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Creo una variable para el título y para el párrafo
		String titulo;
		String parrafo;
		
		System.out.println("Introduzca el título del HTML");
		titulo = reader.nextLine();
		
		System.out.println("Introduzca el párrafo del HTML");
		parrafo = reader.nextLine();
		
		System.out.println(hacerHTML(titulo, parrafo));
		
		reader.close();

	}
	public static String hacerHTML(String titulo, String parrafo) {
		// Creo una constante para el inicio y el final del HTML
		final String INICIO_HTML = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"utf-8\">\r\n"
				+ "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "	<title>\r\n"
				+ "	</title>\r\n"
				+ "</head>\r\n"
				+ "<body>";
		final String FINAL_HTML = "</body>\r\n"
				+ "</html>";
		
		// Creo una variable para devolver la respuesta
		String res ="";
		
		res += INICIO_HTML + "\n";
		res += "\t" + "<h1>" + titulo + "<h1>"+ "\n";
		res += "\t" + "<p>" + parrafo + "<p>" + "\n";
		res += FINAL_HTML;
		return res;
	}
}
