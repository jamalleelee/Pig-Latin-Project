package pigLatin;

import java.util.Scanner;

public class LegendaryPigLatin {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter word you want to translate:");
		String userInput = keyboard.nextLine();
		StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
//		char firstLetter = modUserInput.charAt(0);
//		char secondLetter = modUserInput.charAt(1);
//		char thridLetter = modUserInput.charAt(2);
//		char fourthLetter = modUserInput.charAt(3);
//		char fifthLetter = modUserInput.charAt(4);
//		int wordLength = modUserInput.length();

//		for (char i = 'a'; i <= 'z'; i++) {
		for (int i = 0; i < modUserInput.length(); i++){
		    char letter = modUserInput.charAt(i);        
		

			if (startsWithAVowel(letter)) {
				
				System.out.println(modUserInput + "-yay");
				break;			

			}else if (startsWithOneConsonant(letter)) {
				
			}
			
		}
		
		keyboard.close();
	}

	private static boolean startsWithOneConsonant(char letter) {
		//immaConsonant=false
		return false;
	}

	private static boolean startsWithAVowel(char fromTheIfStatement) {
		boolean immaVowel = false;
		if ((fromTheIfStatement == 'a') || (fromTheIfStatement == 'e') || (fromTheIfStatement == 'i') || (fromTheIfStatement == 'o')
				|| (fromTheIfStatement == 'u') || (fromTheIfStatement == 'y')) {
			immaVowel=true;

		}
		return immaVowel;
	}

}
