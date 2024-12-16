package englishtasks;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		String sentence;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce a sentence: ");
		sentence = reader.nextLine();
		System.out.println(encode(sentence));
		reader.close();
	}

	public static String encode(String message) {
		String encodedMessage = "";

		message = message.toUpperCase();

		char[] charMessage = message.toCharArray();
		for (int i = 0; i < charMessage.length; i++) {
			if (charMessage[i] >= 'A' && charMessage[i] < 'Z') {
				encodedMessage += (char) (charMessage[i] + 1);
			} else if (charMessage[i] >= '0' && charMessage[i] < '9') {
				encodedMessage += (char) (charMessage[i] + 1);
			} else if (charMessage[i] == 'Z') {
				encodedMessage += 'A';
			} else if (charMessage[i] == '9') {
				encodedMessage += '0';
			} else {
				encodedMessage += charMessage[i];
			}
		}
		return encodedMessage;
	}
}
