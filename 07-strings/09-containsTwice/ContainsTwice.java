/* ContainsTwice.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/containsTwice

Write a method named containsTwice that accepts a string and a character 
as parameters and returns true if that character occurs two or more times in the string. 

For example, the call of containsTwice("hello", 'l') should return true because there are 
two 'l' characters in that string.

 */
import acm.program.*;

public class ContainsTwice extends ConsoleProgram {
    
    public void run() {
    	println(containsTwice("hello", 'l'));
    }
    
    public boolean containsTwice(String str, char ch) {
    	int occurences = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(ch == str.charAt(i)) {
    			occurences++;
    		}
    		if(occurences == 2) {
    			return true;
    		}
    	}
    	return false;
    }
    
}
