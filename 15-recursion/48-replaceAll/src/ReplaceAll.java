/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/replaceAll

Write a recursive method named replaceAll that accepts three parameters: a string s, a char from, and a char to as parameters, and returns a new string that is the same as s but with any occurrences of from changed to to. For example, the call of replaceAll("crazy raccoons", 'c', 'k') should return "krazy rakkoons" and the call of replaceAll("BANANA", 'A', 'O') should return "BONONO".

Your method is case-sensitive; if the character from is, for example, a lowercase 'f', your method should not replace uppercase 'F' characters. In other words, you should not need to write code to handle case issues in this problem.

 */

public class ReplaceAll {

	public static void main(String[] args) {
		System.out.println(replaceAll("BANANA", 'A', 'O'));
	}
	
	public static String replaceAll(String s, char from, char to) {
		if (s.length() == 0) {
			return "";
		}
		
		char first = s.charAt(0);
		
		if(s.charAt(0) == from) {
			first = to;
		}
		
		if(s.length() == 1) {
			return first + "";
		} else {
			return first + replaceAll(s.substring(1), from, to);
		}
	}
}
