/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/nonMatching

Write a recursive method named nonMatching that accepts two strings as parameters, and returns an integer representing the number of character indexes between the two strings that do not match. For this problem, two strings are defined as having a "match" at a given index if they contain exactly the same ASCII character value at that index. For example, consider the following two strings:

// index     012345678901234
String s1 = "I love Mariana!";
String s2 = "U Love Marty";
In the above example, seven indexes do not match (underlined above for emphasis): indexes 0, 2, 10, 11, 12, 13, and 14. So the call of nonMatching(s1, s2) would return 7 . Any character could match or fail to match, including letters, numbers, spacing, punctuation, etc. Your method is case-sensitive; notice that the 'l' and 'L' at index 2 do not match.

If the two strings are not the same length, any indexes at the end of the longer string by definition do not match, since there is no character in the other string at that index that could correspond to them. One implication of this is that if one of the parameters is an empty string, the entirety of the other string is considered non-matching.

 */

public class NonMatching {

	public static void main(String[] args) {
		String s1 = "I love Mariana!";
		String s2 = "U Love Marty";
		System.out.println(nonMatching(s1, s2));
	}
	
	public static int nonMatching(String s1, String s2) {
		if(s1.length() == 0) {
			return s2.length();
			
		} else if(s2.length() == 0) {
			return s1.length();
			
		} else {
			int nonMatchCount = 0;
			if(s1.charAt(0) != s2.charAt(0)) {
				nonMatchCount = 1;
			}
			return nonMatchCount + nonMatching(s1.substring(1), s2.substring(1));
		}
	}
}
