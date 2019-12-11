/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/editDistance

Write a recursive method named editDistance that accepts string parameters s1 and s2 and returns the "edit distance" between the two strings as an integer. Edit distance (also called Levenshtein distance) is defined as the minimum number of "changes" required to get from s1 to s2 or vice versa. A "change" can be defined as a) inserting a character, b) deleting a character, or c) changing a character to a different character.

Call										Value Returned
editDistance("driving", "diving")			1
editDistance("debate", "irate")				3
editDistance("football", "cookies")			6

Constraints: Your solution must obey the following constraints:

Your solution must not use any loops; it must be recursive.
Strings have member methods named indexOf, but you should not call them, because they allow you to get around using recursion. Similarly, the replace and replaceAll members are forbidden. You should limit yourself to using only the following string members:
charAt, length, substring, trim
Do not construct any data structures (no array, list, set, map, etc.), and do not declare any global variables. You are allowed to define other "helper" methods if you like.

 */

public class EditDistance {

	public static void main(String[] args) {
		System.out.println(editDistance("football", "cookies"));
	}
	
	public static int editDistance(String s1, String s2) {
		if(s1.length() == 0) {
			return s2.length();
		} else if(s2.length() == 0) {
			return s1.length();
		} else {
			int replacement = 0;
			if(s1.charAt(0) == s2.charAt(0)) {
				return editDistance(s1.substring(1), s2.substring(1));
			} else {
				replacement = 1;
			}
			
			int replacements = replacement + editDistance(s1.substring(1), s2.substring(1));
			int insertions = editDistance(s1, s2.substring(1)) + 1;
			int deletions = editDistance(s1.substring(1), s2) + 1;
			
			return Math.min(deletions, Math.min(replacements, insertions));
		}
	}
}
