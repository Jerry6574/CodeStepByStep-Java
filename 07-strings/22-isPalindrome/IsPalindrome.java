/* IsPalindrome.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/isPalindrome

Write a method named isPalindrome that accepts a string parameter and returns true if that string is a palindrome, 
or false if it is not a palindrome.

For this problem, a palindrome is defined as a string that contains exactly the same sequence of characters 
forwards as backwards, case-insensitively. For example, "madam" or "racecar" are palindromes, 
so the call of isPalindrome("racecar") would return true. Spaces, punctuation, 
and any other characters should be treated the same as letters; so a multi-word string such as 
"dog god" could be a palindrome, as could a gibberish string such as "123 $$ 321". 
The empty string and all one-character strings are palindromes by our definition. 
Your code should ignore case, so a string like "Madam" or "RACEcar" would also count as palindromes.

 */
import acm.program.*;

public class IsPalindrome extends ConsoleProgram {
    
    public void run() {
    	println(isPalindrome("racecar"));
    }
    
    public boolean isPalindrome(String s) {
    	if(s.length() <= 1) {
    		return true;
    	}
    	
    	// convert s to lowercase to enable case-insensitivity
    	String lowerS = s.toLowerCase();
    	
    	for(int i = 0; i < lowerS.length() / 2; i++) {
    		if(lowerS.charAt(i) != lowerS.charAt(lowerS.length() - 1 - i)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
}
