package pigLatin;

import java.util.Scanner;

public class ExplorerPigLatin {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter word you want to translate:");
		String userInput = keyboard.nextLine();
		StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
		char firstLetter = modUserInput.charAt(0);

		switch (modUserInput.charAt(0)) {
		case 'a':
			System.out.println(modUserInput + "-yay");
			break;
		case 'e':
			System.out.println(modUserInput + "-yay");
			break;
		case 'i':
			System.out.println(modUserInput + "-yay");
			break;
		case 'u':
			System.out.println(modUserInput + "-yay");
			break;
		case 'y':
			System.out.println(modUserInput + "-yay");
			break;
		default:
			modUserInput.deleteCharAt(0);
			System.out.println(modUserInput + "-" + firstLetter + "ay");
			break;
		}
		keyboard.close();
	}
}
