/* RemoveAll.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/removeAll

Write a method named removeAll that accepts a string and a character as parameters, 
and removes all occurrences of the character. 

For example, the call of removeAll("Summer is here!", 'e') should return "Summr is hr!". 
Do not use the string replace method in your solution.

 */


import acm.program.*;

public class RemoveAll extends ConsoleProgram {
    
    public void run() {
        println(removeAll("Summer is here", 'e'));
    }
    
    public String removeAll(String str, char ch) {
    	String newStr = "";
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) != ch) {
    			newStr += str.charAt(i);
    		}
    	}
    	return newStr;
    }
}
