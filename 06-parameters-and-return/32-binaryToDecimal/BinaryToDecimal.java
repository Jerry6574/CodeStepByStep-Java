/* BinaryToDecimal.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/binaryToDecimal

Write a method named binaryToDecimal that accepts an integer parameter whose digits are meant to 
represent binary (base-2) digits, and returns an integer of that number's representation in decimal (base-10). 
For example, the call of binaryToDecimal(101011) should return 43.

Constraints: Do not use a string in your solution. 
Also do not use any built-in base conversion methods like Integer.toString .

 */


import acm.program.*;

public class BinaryToDecimal extends ConsoleProgram {
    
    public void run() {
    	println(binaryToDecimal(101011));
    }
    
    public int binaryToDecimal(int number) {
    	int binaryNum = number;
    	
    	int decimalNum = 0;
    	int exponent = 0;
    	
    	while(true) {
    		if(binaryNum == 0) {
    			break;
    		}
    		
    		// raise each binary digit to the power of its position (0-base), 
    		// then sum all the results as the decimal number
    		decimalNum = (int) (decimalNum + binaryNum % 10 * Math.pow(2, exponent));
    		exponent++;
    		binaryNum /= 10;
    	}
    	
    	return decimalNum;
    }
    
}
