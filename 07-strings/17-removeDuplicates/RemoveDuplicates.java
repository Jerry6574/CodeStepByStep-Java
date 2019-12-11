/* RemoveDuplicates.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/removeDuplicates

Write a method named removeDuplicates that accepts a string parameter and returns 
a new string with all consecutive occurrences of the same character in the string 
replaced by a single occurrence of that character. 

For example, the call of removeDuplicates("bookkeeeeeper") should return "bokeper" .

 */
import acm.program.*;

public class RemoveDuplicates extends ConsoleProgram {
    
    public void run() {
    	println(removeDuplicates("bookkeeeeeper"));
    }
    
    public String removeDuplicates(String str) {
    	if(str.length() == 0) return str;
    	
    	char currentChar = str.charAt(0);
    	String newStr = "" + currentChar;
    	
    	for(int i = 1; i < str.length(); i++) {
    		if(str.charAt(i) != currentChar) {
    			newStr += str.charAt(i);
    			currentChar = str.charAt(i);
    		}
    	}
    	return newStr;
    }
}
