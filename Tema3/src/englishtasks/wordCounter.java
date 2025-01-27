package englishtasks;

import java.util.Scanner;
import java.util.TreeMap;

public class wordCounter {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner reader = new Scanner(System.in);
		String sentence;

		// I create a counter for the sentences
		int sentencesCounter = 1;

		// We create a map for the output
		TreeMap<String, String> output = new TreeMap<>();
		
		// We create a variable for the value of the current word
		String wordValue;
		System.out.println("Introduce the sentence:");
		sentence = reader.nextLine().toLowerCase();
		
		while(!sentence.equalsIgnoreCase("end")) {
			
			for (String currentWord : sentence.split(" ")) {
				if (currentWord.length() > 2) {
					wordValue = output.get(currentWord);
					if (output.containsKey(currentWord) && !wordValue.equals("" + sentencesCounter)) {
						output.put(currentWord, output.get(currentWord) + " " + sentencesCounter);
					} else {
						output.put(currentWord, "" + sentencesCounter);
					}
				}
			}
			sentencesCounter++;
			System.out.println("Introduce the sentence:");
			sentence = reader.nextLine().toLowerCase();
		}
		System.out.println(output);
		reader.close();
	}

}
