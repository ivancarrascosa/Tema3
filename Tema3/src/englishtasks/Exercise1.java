package englishtasks;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// I create the array to store the 10 numbers, it will be initialized with
		// zeros.
		int numbers[] = new int[10];

		// I create the scanner
		Scanner reader = new Scanner(System.in);

		// I create a variable to store the letter introduced in the menu
		String menuLetter = "";

		// I create a variable for value and position to use if the user chooses option
		// b
		int value;
		int position = 1;

		// I create a value error to go out of the try catch in the do while
		boolean error = true;
		// I put it everything in a do while that will stops when the user introduces
		// letter c
		do {

			do { // In this loop i check that the option selected is correct with an assertion
				error = false;
				System.out.println("a. Show values.\nb. Introduce a value.\nc. Exit.");
				try {
					menuLetter = reader.nextLine();
					assert menuLetter.equalsIgnoreCase("a") || menuLetter.equalsIgnoreCase("b")
							|| menuLetter.equalsIgnoreCase("c") : "Introduce a valid option.";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
					error = true;
				}
			} while (error);
			if (menuLetter.equalsIgnoreCase("a")) { // With this option, it will print the array
				System.out.println(Arrays.toString(numbers));
			} else if (menuLetter.equalsIgnoreCase("b")) {
				// With this option, value and position will be asked and then it will introduce
				// that value in that position
				System.out.println("Type the value you want to introduce:");
				value = reader.nextInt();
				do { // I check that the position introduced is valid
					error = false;
					System.out.println("Introduce the position you want to put that value in the array:");
					try {
						reader.nextLine();
						position = reader.nextInt();
						reader.nextLine();
						assert position >= 0 && position < 10 : "Introduce a valid position";
					} catch (AssertionError e) {
						System.err.println(e.getMessage());
						error = true;
					} catch (InputMismatchException e) {
						System.err.println("Introduce an integer.");
						error = true;
					}
				} while (error);
				numbers[position] = value;
			} else {
				System.out.println("Saliendo");
			}
		} while (menuLetter.equalsIgnoreCase("a") || menuLetter.equalsIgnoreCase("b"));
		// I close the Scanner
		reader.close();
	}

}
