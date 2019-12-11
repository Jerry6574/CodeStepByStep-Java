/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/isPalindrome

Write a recursive method named isPalindrome that accepts a string parameter and returns true if the string is the same forwards as backwards, ignoring capitalization. For example, the call of isPalindrome("Madam") should return true.

Constraints: Do not declare any global variables or any auxiliary data structures. Do not use any loops; you must use recursion.

 */

public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Madam"));
	}
	
	public static boolean isPalindrome(String s) {
		String sLower = s.toLowerCase();
		if(sLower.length() <= 1) {
			return true;
		} else {
			char first = sLower.charAt(0);
			char last = sLower.charAt(sLower.length()-1);
			
			if(first != last) {
				return false;
			} else {
				sLower = sLower.substring(1, sLower.length()-1);
				return isPalindrome(sLower);
			}
		}
	}
}
