package englishtasks;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		String sentence;
		int shift = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce a sentence: ");
		sentence = reader.nextLine();
		System.out.println("Introduce the number of shift");
		shift = reader.nextInt();
		System.out.println(encode(sentence, shift));
		reader.close();
	}

	public static String encode(String message, int shift) {
		String encodedMessage = "";

		message = message.toUpperCase();

		char[] charMessage = message.toCharArray();
		for (int i = 0; i < charMessage.length; i++) {
			if (charMessage[i] >= 'A' && charMessage[i] <= 'Z') {
				if (charMessage[i] + shift > 'Z') {
					encodedMessage += (char) (((charMessage[i] + shift) % ('Z' + 1)) + 'A');
				} else if (charMessage[i] + shift < 'A') {
					encodedMessage += (char) (charMessage[i] + shift + 26);
				} else {
					encodedMessage += (char) (charMessage[i] + shift);
				}

			} else if (charMessage[i] >= '0' && charMessage[i] <= '9') {
				if (charMessage[i] + shift > '9') {
					encodedMessage += (char) (((charMessage[i] + shift) % ('9' + 1)) + '0');
				} else if (charMessage[i] + shift < '0') {
					encodedMessage += (char) (charMessage[i] + shift + 10);
				} else {
					encodedMessage += (char) (charMessage[i] + shift);
				}
			} else {
				encodedMessage += charMessage[i];
			}
		}
		return encodedMessage;

	}
}
