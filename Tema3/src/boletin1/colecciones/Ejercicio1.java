package boletin1.colecciones;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar los numeros que se introducen por consola
		int num;
		
		// Pido el numero y lo asigno a la variable num
		System.out.println("Introduzca un entero positivo, si quiere parar introduzca un negativo.");
		num = reader.nextInt();
		// En un bucle while voy introduciendo los numeros en la lista hasta que el numero sea positivo
		while (num >= 1) {
			listaNumeros.add(num);
			System.out.println("Introduzca un entero positivo, si quiere parar introduzca un negativo.");
			num = reader.nextInt();
		}
		
		// Recorro la lista y muestro los indices de los numeros pares
		for (int i = 0 ; i < listaNumeros.size() ; i++) {
			if (listaNumeros.get(i) % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		reader.close();
	}

}
