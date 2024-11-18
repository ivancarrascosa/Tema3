package englishtasks;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// We create a variable to storage if the user got it right
		boolean right = true;

		// We create a variable to storage the answer of the user
		int answer;
		// We create an array initialized with 0
		int fly[] = new int[10];

		// We create a random object
		Random rand = new Random();

		// We create a scanner
		Scanner reader = new Scanner(System.in);

		// We put the fly (which will be number 1) in a random position
		fly[rand.nextInt(0, fly.length)] = 1;

		// We create a while loop for the multiple options we can have
		while (right) {
			System.out.println("Choose a position to see if the fly is there (0 to 9): ");
			answer = reader.nextInt();
			if (fly[answer] == 1) {
				System.out.println("You are right!!");
				right = false;
			} else if (answer == 0) {
				if (fly[answer + 1] == 1) {
					System.out.println("The fly was next to the place you chose, it flies aways and changes position");
					fly[answer + 1] = 0;
					fly[rand.nextInt(0, fly.length)] = 1;
					System.out.println("Try again.");
				} else {
					System.out.println("Try again.");
				}
			} else if (answer == fly.length - 1) {
				if (fly[answer - 1] == 1) {
					System.out.println("The fly was next to the place you chose, it flies aways and changes position");
					fly[answer - 1] = 0;
					fly[rand.nextInt(0, fly.length)] = 1;
					System.out.println("Try again.");
				} else {
					System.out.println("Try again.");
				}
			} else if (fly[answer - 1] == 1 || fly[answer + 1] == 1) {
				System.out.println("The fly was next to the place you chose, it flies aways and changes position");
				fly[answer - 1] = 0;
				fly[answer + 1] = 0;
				fly[rand.nextInt(0, fly.length)] = 1;
			} else {
				System.out.println("Try again.");
			}
		}
		reader.close();

	}

}
