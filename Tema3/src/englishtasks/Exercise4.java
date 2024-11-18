package englishtasks;

import java.util.Arrays;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		// Variables
		String field[] = new String[20];
		int random;
		int cont = 0;
		Random rand = new Random();
		int around = 0;

		while (cont < 6) {
			random = rand.nextInt(0, 20);
			if (field[random] != "*") {
				field[random] = "*";
				cont++;
			}
		}

		for (int i = 0; i < field.length; i++) {
			around = 0;
			if (i == 0) {
				if (field[i + 1] == "*") {
					around++;
				}
			} else if (i == field.length - 1) {
				if (field[i - 1] == "*") {
					around++;
				}
			} else if (field[i - 1] == "*") {
				around++;
			} else if (field[i + 1] == "*") {
				around++;
			} else if (field[i] != "*") {
				field[i] = around +"";
			}
		}

		System.out.println(Arrays.toString(field));
	}

}
