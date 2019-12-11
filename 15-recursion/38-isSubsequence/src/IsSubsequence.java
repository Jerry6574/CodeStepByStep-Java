/*
Solution to https://www.codestepbystep.com/problem/view/java/recursion/isSubsequence

Write a recursive method named isSubsequence that accepts two string parameters, and returns if the second string is a subsequence of the first string. A string is a subsequence of another if it contains the same letters in the same order, but not necessary consecutively. You can assume both strings are already lowercased.

 */

public class IsSubsequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abcdef", "abg"));
	}
	
	public static boolean isSubsequence(String big, String small) {
		if(small.length() == 0) {
			return true;
		} else if(big.length() == 0) {
			return false;
		} else {
			// last char of two strings match
			if(big.charAt(big.length()-1) == small.charAt(small.length()-1)){
				return isSubsequence(big.substring(0, big.length()-1), small.substring(0, small.length()-1));
			// last char of two strings don't match
			} else {
				return isSubsequence(big.substring(0, big.length()-1), small);
			}
		}
	}
}
