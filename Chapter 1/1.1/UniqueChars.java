//Author: Josh Shadwick
//Date: 10-31-13
//
//Problem: 
//1.1 Implement an algorithm to determine if a string has all 
//unique characters. What if youcan not use additional data structures?

public class UniqueChars { 


	private static boolean hasUniqueChars(String str) {

		//Testing each character in the string against all characters that follow.
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if( str.charAt(i) == str.charAt(j) )
					return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {

		String testStrA = "abcddefg";

		if( hasUniqueChars( testStrA )) {
			System.out.println("The string has all unique characters!");
		}
		else {
			System.out.println("The string does not have all unique characters.");
		}

	}
	
}