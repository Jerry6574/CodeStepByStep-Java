/* AddCommas.java

Solution: https://www.codestepbystep.com/problem/view/java/strings/addCommas

Write a method named addCommas that accepts a string representing a number and returns 
a new string with a comma at every third position, starting from the right. 

For example, the call of addCommas("12345678") returns "12,345,678".

 */


import acm.program.*;

public class AddCommas extends ConsoleProgram {
    
    public void run() {
    	println(addCommas("123456"));
    }
    
    public String addCommas(String digits) {
        if(digits.length() <= 3) return digits;
        
        int nCommas = digits.length() / 3;
        int nonCommaDigits = 0;
        
        if(digits.length() % 3 == 0) {
        	nonCommaDigits = 3;
        	// first 3 most significant digits don't need comma
            nCommas--;
        } else{
        	nonCommaDigits = digits.length() % 3;
        }
        String commaDigits = "";

        int i = 1;
        for(i = 1; i <= nCommas; i++) {
        	int startPos = digits.length() - 3 * i;
        	int endPos = digits.length() - 3 * (i - 1);
            String digitsSubStr = digits.substring(startPos, endPos);
            commaDigits = "," + digitsSubStr + commaDigits;
        }

        commaDigits = digits.substring(0, nonCommaDigits) + commaDigits;
        return commaDigits;
    }
}
