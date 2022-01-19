package com.hcl;

public class ThirdVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findThirdVowel("Hello, are you there?");
		findThirdVowel("What?");
		findThirdVowel("MyNameIsMariano");

	}

	public static boolean findThirdVowel(String phrase) {
		int countVowels = 0;
		for(int i = 0; i < phrase.length(); i++){
			char sel = phrase.charAt(i);
			if(sel == 'a' || sel == 'e' || sel == 'i' || sel == 'o' || sel == 'u' ) {
				countVowels++;
				if(countVowels == 3) {
					System.out.println("The third vowel is " + sel + " and position is " + (i+1));
					return true;
				}
			};
		}
		System.out.println("The string does not have enough vowels");
		return false;
	}
}
