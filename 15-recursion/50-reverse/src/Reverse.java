/*

Solution to https://www.codestepbystep.com/problem/view/java/recursion/reverse

Write a recursive method named reverse that accepts a string parameter and returns that string with its characters in the opposite order. For example, the call of reverse("Hi you!") should return "!uoy iH" .

Constraints: Do not use any loops; you must use recursion. Do not declare any global variables or any auxiliary data structures.

 */

public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverse("!uoy iH"));
	}
	
	public static String reverse(String s) {
		if(s.length() <= 1) {
			return s;
		} else {
			String first = s.charAt(0) + "";
			String last = s.charAt(s.length() - 1) + "";
			
			return last + reverse(s.substring(1, s.length() - 1)) + first;
		}
	}
}
