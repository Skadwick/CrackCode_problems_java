// Author: Josh Shadwick
// Date: 10-31-13
//
// Problem: 
// 1.2 Write code to reverse a C-Style String. 
// (C-String means that “abcd” is represented as 
// five characters, including the null character.)

import java.io.Exception;

public class ReverseCString {

	private static char[] reverse(char[] cString) throws IllegalArgumentException {
		if(cString[cString.length - 1] != null) {
			throw new IllegalArgumentException("C-string must be null terminated.");
		}

		int left = 0;
		int right = cString.length - 2; //Starting at second to last element, because last element is null.
		char temp;

		while(left < right) {

			//Swap the characters.
			temp = cString[right];
			cString[right] = cString[left];
			cString[left] = temp;

			//Update iterators.
			left++;
			right--;
		}

		return cString;
	}


	public static void main(String[] args) {

		char[] myCString = {'H', 'e', 'l', 'l', 'o', NUL}; //null-terminated c-string
		System.out.println("c-string: " + new String(myCString) );

		try {
			reverse(myCString);
			System.out.println("reversed: " + new String(myCString) );
		}
		catch(IllegalArgumentException iae) {
			System.out.println( iae.getMessage() );
		}
	}
}