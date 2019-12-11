/* CrazyCaps.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/crazyCaps

Write a method named crazyCaps that accepts a string as a parameter and returns a 
new string with its capitalization altered such that the characters at even indexes 
are all in lowercase and odd indexes are all in uppercase. 
For example, if a variable s stores "Hey!! THERE!", the call of crazyCaps(s); should return "hEy!! tHeRe!".

 */


import acm.program.*;

public class CrazyCaps extends ConsoleProgram {
    
    public void run() {
    	println(crazyCaps("Hey!! THERE!"));
    }
    
    public String crazyCaps(String s) {
    	String crazyCapStr = "";
    	
    	for(int i = 0; i < s.length(); i++) {
    		char curChar = s.charAt(i);
    		
    		if(Character.isLetter(curChar)) {
        		if(i % 2 == 0) {
        			crazyCapStr += Character.toLowerCase(curChar);
        		} else {
        			crazyCapStr += Character.toUpperCase(curChar);
        		}
    		} 
    		else {
    			crazyCapStr += curChar;
    		}

    	}
    	
    	return crazyCapStr;
    }
}
