/* SwapPairs.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/swapPairs

Write a method named swapPairs that accepts a string as a parameter and returns 
a new string such that each pair of adjacent letters will be reversed. 
If the string has an odd number of letters, the last letter is unchanged. 

For example, if a string variable s stores "example", the call of swapPairs(s); 
should return "xemalpe". If s had been "hello there", the call would produce "ehll ohtree".

 */
import acm.program.*;

public class SwapPairs extends ConsoleProgram {
    
    public void run() {
    	println(swapPairs("example"));
    }
    
    public String swapPairs(String s) {
    	String swapPairsStr = "";
    	
    	int i = 0;
    	for(i = 0; i < s.length()-1; i += 2) {
    		swapPairsStr = swapPairsStr + s.charAt(i + 1) + s.charAt(i);
    	}
    	
    	// concat the last char of s unchanged if s.length() is odd
    	if(s.length() % 2 == 1) {
    		swapPairsStr = swapPairsStr + s.charAt(i);
    	}
    	
    	return swapPairsStr;
    }
    
}
