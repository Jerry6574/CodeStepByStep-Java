/* ConvertToAltCaps.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/convertToAltCaps

Write a method named convertToAltCaps that accepts a string as a parameter and returns 
a version of the string where alternating letters are uppercase and lowercase, 
starting with the first letter in lowercase. 

For example, the call of convertToAltCaps("Pikachu") should return "pIkAcHu".
 */


import acm.program.*;

public class ConvertToAltCaps extends ConsoleProgram {
    
    public void run() {
    	println(convertToAltCaps("this  is   a     test"));
    }
    
    public String convertToAltCaps(String str) {
    	String altCapStr = "";
    	
    	boolean isLowerCase = true;
    	
    	for(int i = 0; i < str.length(); i++) {
    		char curChar = str.charAt(i);
    		
    		if(Character.isLetter(curChar)) {
        		if(isLowerCase) {
        			altCapStr += Character.toLowerCase(curChar);
        		} else {
        			altCapStr += Character.toUpperCase(curChar);
        		}
        		isLowerCase = !isLowerCase;
    		} 
    		else {
    			altCapStr += curChar;
    		}

    	}
    	
    	return altCapStr;
    }
}
