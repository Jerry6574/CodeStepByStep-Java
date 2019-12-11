/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/indexOf

Write a recursive method named indexOf that accepts two strings s1 and s2 as parameters and that returns the starting index of the first occurrence of the second string s2 inside the first string s1, or -1 if s2 is not found in s1. The table below shows several calls to your method and their expected return values. If s2 is the empty string, always return 0 regardless of the contents of s1. If s2 is longer than s1, it of course cannot be contained in s1 and therefore your method would return -1 in such a case. Notice that case matters; the last example returns -1.

Call	                             Value Returned
indexOf("Barack Obama", "Bar")	     0
indexOf("foo", "foo")				 0
indexOf("Stanford CS", "ford")	     4
indexOf("Barack Obama", "ack")		 3
indexOf("Barack Obama", "a")		 1
indexOf("sandwich", "")				 0
indexOf("Barack Obama", "McCain")	-1
indexOf("Barack Obama", "ACK")		-1

Constraints: Your solution must obey the following constraints:

Your solution must not use any loops; it must be recursive.
Strings have member methods named indexOf and lastIndexOf, but you should not call them, because they allow you to get around using recursion. Similarly, the replace member is forbidden.
Do not construct any data structures (no array, list, set, map, etc.), and do not declare any global variables. You are allowed to define other "helper" methods if you like.

 */

public class IndexOf {

	public static void main(String[] args) {
		System.out.println(indexOf("Barack Obama", "ar"));
		System.out.println(indexOf("Stanford CS", "ford"));
		System.out.println(indexOf("Barack Obama", "McCain"));
	}
	
	public static int indexOf(String s1, String s2) {
		if(s2.length() == 0) {
			return 0;
		} else {
			return indexOfHelper(s1, s2, 0);
		}
	}
	
	private static int indexOfHelper(String s1, String s2, int s1beginIndex) {
		String subS1 = s1.substring(s1beginIndex);
		if(subS1.length() < s2.length()) {
			return -1;
		} else if(subS1.substring(0, s2.length()).equals(s2)) {
			return s1beginIndex;
		} else {
			return indexOfHelper(s1, s2, s1beginIndex+1);
		}
	}
}
