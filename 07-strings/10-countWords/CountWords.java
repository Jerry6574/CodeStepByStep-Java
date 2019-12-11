/* CountWords.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/countWords

Write a method named countWords that accepts a string as its parameter and returns the number of words in it. 
A word is a sequence of one or more non-space characters. 
For example, the call of countWords("What is your name?") should return 4.

 */

import acm.program.*;

public class CountWords extends ConsoleProgram {
    
    public void run() {
    	println(countWords("  this  string    has  wide   spaces "));
    }
    
    public int countWords(String s) {
    	if(s.equals("")) return 0;
    	
    	// trim leading and trailing spaces
    	// split s into array by 1 or more whitespaces
    	return s.trim().split("\\s+").length;
    }
}
