package englishtasks;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// I create but not initialize an array
		int sequence[];
		
		// I create a variable to store the initial value and the increases
		int v;
		int increase;
		
		// I create a value to storage the size of the array
		int arraySize;
		
		// I create a Scanner
		Scanner reader = new Scanner(System.in);
		
		// I ask the user for the initial value
		System.out.println("Introduce the initial value:");
		v = reader.nextInt();
		
		// I ask the user for the increases they want to make
		System.out.println("Introduce the increase you want to make in: ");
		increase = reader.nextInt();
		
		// I ask the user to introduce the length of the secuence
		System.out.println("Introduce the length of the sequence: ");
		arraySize = reader.nextInt();
		sequence = new int[arraySize];
		
		// I make a for with two variables to make the sequence
		for (int i = 0 , j = v ; i < arraySize ; i++ , j += increase) {
			sequence[i] = j;
		}
		System.out.println(Arrays.toString(sequence));
		
		// Close the scanner
		reader.close();
	}

}
