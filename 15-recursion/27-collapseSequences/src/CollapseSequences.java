/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/collapseSequences

Write a recursive method named collapseSequences that accepts a string s and char c as parameters and returns a new string that is the same as s but with any sequences of consecutive occurrences of c compressed into a single occurrence of c. For example, if we collapse sequences of character 'a' in the string "aabaaccaaaaada", you get "abaccada".

Your method is case-sensitive; if the character c is, for example, a lowercase 'f', your method should not collapse sequences of uppercase 'F' characters. In other words, you do not need to write code to handle case issues in this problem.

The following table shows several calls and their expected return values:

Call														Returns
collapseSequences("aabaaccaaaaaada", 'a')					"abaccada"
collapseSequences("mississssipppi", 's')					"misisipppi"
collapseSequences("babbbbebbbxbbbbbb", 'b')					"babebxb"
collapseSequences("palo alto", 'o');						"palo alto"
collapseSequences("tennessee", 'x')							"tennessee"
collapseSequences("", 'x')									""
Constraints: Do not declare any global variables. Do not use any loops; you must use recursion. Do not call any of the following string member methods: find, rfind, indexOf, contains, replace, split. (The point of this problem is to solve it recursively; do not use a library method to get around recursion.) Do not use any auxiliary data structures like ArrayList, TreeMap, TreeSet, array, etc. You can declare as many primitive variables like ints as you like, as well as strings. You are allowed to define other "helper" methods if you like; they are subject to these same constraints.

 */

public class CollapseSequences {

	public static void main(String[] args) {
		System.out.println(collapseSequences("aabaaccaaaaaada", 'a'));
	}
	
	public static String collapseSequences(String s, char ch) {
		if(s.length() == 0) {
			return "";
		} else {
			return collapseSequencesHelper("", s, ch);
		}
	}
	
	private static String collapseSequencesHelper(String prefix, String suffix, char ch) {
		if(suffix.length() <= 1) {
			return prefix + suffix;
		} else {
			char first = suffix.charAt(0);
			char second = suffix.charAt(1);
			suffix = suffix.substring(1);
			
			if(first != second || first != ch) {
				prefix += first;
			}
			
			return collapseSequencesHelper(prefix, suffix, ch);
		}
	}
}
