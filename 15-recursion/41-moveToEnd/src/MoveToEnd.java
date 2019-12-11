/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/moveToEnd

Write a recursive method named moveToEnd that accepts a string s and a character c as parameters, and returns a new string similar to s but with all instances of c moved to the end of the string. The relative order of the other characters should be unchanged from their order in the original string s. If the character is a letter of the alphabet, all occurrences of that letter in either upper or lowercase should be moved to the end and converted to uppercase. If s does not contain c, it should be returned unmodified.

 */

public class MoveToEnd {

	public static void main(String[] args) {
		System.out.println(moveToEnd("aa---abcd", '-'));
	}
	
	public static String moveToEnd(String s, char c) {
		if(s.length() == 0) {
			return s;
		} else {
			char first = s.charAt(0);
			if(Character.toLowerCase(first) == Character.toLowerCase(c)) {
				if(Character.isLetter(first)) {
					return moveToEnd(s.substring(1), c) + Character.toString(first).toUpperCase();
				} else {
					return moveToEnd(s.substring(1), c) + Character.toString(first);
				}
			} else {
				return Character.toString(first) + moveToEnd(s.substring(1), c);
			}
		}
	}
}
