/* IsAllVowels.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/isAllVowels

 */

import acm.program.*;

public class IsAllVowels extends ConsoleProgram {
    
    public void run() {
    	println(isAllVowels("AAAIII"));
    }
    
    public boolean isVowel(String s) {
    	return s.matches("[aeiouAEIOU]");
    }
    
    public boolean isAllVowels(String s) {
    	for(int i= 0; i < s.length(); i++) {
    		if(!isVowel(s.substring(i, i + 1))) {
    			return false;
    		}
    	}
    	return true;
    }
}
