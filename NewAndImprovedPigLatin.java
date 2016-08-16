package pigLatin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NewAndImprovedPigLatin {

	public static void main(String[] args) throws IOException {

		BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any word: ");
		String userInput = myBufferedReader.readLine();

		userInput = userInput.toUpperCase();
		int lengthOfSentence = userInput.length();
		int position = -1;
		char charInWord;

		if (userInput.charAt(0) == 'A' || userInput.charAt(0) == 'E' || userInput.charAt(0) == 'I'
				|| userInput.charAt(0) == 'O' || userInput.charAt(0) == 'U' || userInput.charAt(0) == 'Y') {
			System.out.println(userInput + " translated into pig latin is: " + userInput + "YAY");

		} else {
			System.out.println(userInput + " translated into pig latin is: "
					+ startsWithCons(userInput, lengthOfSentence, position));
		}
	}

	public static String startsWithCons(String userInput, int lengthOfSentence, int position) {
		char charInWord;
		String pigLatinWord = null;
		for (int i = 0; i < lengthOfSentence; i++) {
			charInWord = userInput.charAt(i);
			if (charInWord == 'A' || charInWord == 'E' || charInWord == 'I' || charInWord == 'O' || charInWord == 'U') {
				position = i;
				break;
			}
		}

		if (position != -1) {
			String a = userInput.substring(position);
			String b = userInput.substring(0, position);
			pigLatinWord = a + b + "AY";
		} else
			System.out.println("You has no vowels Yo!");
		return pigLatinWord;
	}

}
