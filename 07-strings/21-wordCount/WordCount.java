/* WordCount.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/wordCount

Write a method named wordCount that accepts a string as its parameter and returns the number of words in the string. 
A word is a sequence of one or more non-space characters (any character other than ' '). 
For example, the call of wordCount("hello, how are you?") should return 4.

Constraints: Do not use a Scanner to help you solve this problem. 
Do not use any data structures such as arrays to help you solve this problem. 
Do not use the String method split on this problem. But you can declare as many simple 
variables like int, char, etc. as you like. Declaring String variables is also fine.

 */
import acm.program.*;

public class WordCount extends ConsoleProgram {
    
    public void run() {
    	println(wordCount("?? ??? ?????? ??"));
    	println(wordCount("How are you?"));
    }
    
    public int wordCount(String s) {
    	if(s.length() <= 1) {
    		return s.length();
    	}
    	
    	boolean onAWord = false;
    	int wordCount = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		// next character is a space, no new word
    		if(s.charAt(i) == ' ') {
    			onAWord = false;
    		
    		// next character is a letter and current state is not on a word, that means a new word was found. 
    		// avoid string like "?? ??? ?????? ??" having word counts
    		} else if(Character.isLetter(s.charAt(i)) && onAWord == false) {
    			onAWord = true;
    			wordCount++;
    		}
    	}
    	
    	return wordCount;
    }
    
}
