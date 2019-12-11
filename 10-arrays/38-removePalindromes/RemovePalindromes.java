/* RemovePalindromes.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/removePalindromes

Write a method named removePalindromes that that removes 
all strings that are palindromes from an array of strings.

Your method accepts an array of strings as a parameter and modifies its contents, 
replacing every string in the array that is a palindrome with an empty string, "". 
For example, if an array named a stores the following element values:

String[] a = {"Madam", "raceCAR", "", "hi", "A", "Abba", "banana", "dog God",
              "STOP otto POTS", "Madame", "Java", "LevEL", "staTS"};
              
Then the call of removePalindromes(a); should change it to contain the following element values. 
Notice that the palindromes from the array such as "Madam" and "LevEL" have been replaced by "".

             {"", "", "", "hi", "", "banana", "", "", "Madame", "Java", "", ""}
             
Constraints: You are to modify the existing array in-place. 
Do not create any other data structures such as temporary arrays. 
You may create as many strings as you like, and you may use as many simple variables (such as ints) as you like.

Note: You may want to go solve the string problem isPalindrome 
first and use it as part of your solution to this problem.

 */
import java.util.Arrays;

import acm.program.*;

public class RemovePalindromes extends ConsoleProgram {
    
    public void run() {
    	String[] array = {"Madam", "raceCAR", "", "hi", "A", "Abba", "banana", "dog God", 
    				  "STOP otto POTS", "Madame", "Java", "LevEL", "staTS"};
    	
    	removePalindromes(array);
    	println(Arrays.toString(array));
    }
    
    public void removePalindromes(String[] array) {
    	for (int i = 0; i < array.length; i++) {
			if(isPalindrome(array[i])) {
				array[i] = "";
			}
		}
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
