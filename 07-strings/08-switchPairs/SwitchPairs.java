/* SwitchPairs.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/switchPairs

Write a method named switchPairs that accepts a string as a parameter and returns 
that string with each pair of neighboring letters reversed. 

If the string has an odd number of letters, the last letter should not be modified. 

For example, the call switchPairs("example") should return "xemalpe" and 
the call switchPairs("hello there") should return "ehll ohtree"

 */
import acm.program.*;

public class SwitchPairs extends ConsoleProgram {
    
    public void run() {
    	println(switchPairs("example"));
    }
    
    public String switchPairs(String s) {
    	String switchPairsStr = "";
    	
    	int i = 0;
    	for(i = 0; i < s.length()-1; i += 2) {
    		switchPairsStr = switchPairsStr + s.charAt(i + 1) + s.charAt(i);
    	}
    	
    	// concat the last char of s unchanged if s.length() is odd
    	if(s.length() % 2 == 1) {
    		switchPairsStr = switchPairsStr + s.charAt(i);
    	}
    	
    	return switchPairsStr;
    }
    
}
