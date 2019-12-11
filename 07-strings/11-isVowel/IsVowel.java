/* IsVowel.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/isVowel

Write a method named isVowel that returns whether a string is a 
vowel (a single-letter string containing a, e, i, o, or u, case-insensitively).

 */
import acm.program.*;

public class IsVowel extends ConsoleProgram {
    
    public void run() {
    	println(isVowel("Z"));
    }
    
    public boolean isVowel(String s) {
    	return s.matches("[aeiouAEIOU]");
    }
}
