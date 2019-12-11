/* DecimalToBinary.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/decimalToBinary

Write a method named decimalToBinary that accepts an integer as a parameter and 
returns an integer whose digits look like that number's representation in binary (base-2). 
For example, the call of decimalToBinary(43) should return 101011.

Constraints: Do not use a string in your solution. 
Also do not use any built-in base conversion methods like Integer.toString .

 */
import acm.program.*;

public class DecimalToBinary extends ConsoleProgram {
    
    public void run() {
    	println(decimalToBinary(43));
    }
    
    public int decimalToBinary(int number) {
    	
    	int decimalNum = number;
    	int binaryPos = 1;
    	int binaryNum = 0;
    	
    	while(true) {		
    		if(decimalNum == 0) {
    			break;
    		}
    		
    		// build up binary number from least significant bit to most significant bit
    		binaryNum = binaryNum + decimalNum % 2 * binaryPos;	
    		decimalNum /= 2;
    		binaryPos *= 10;
	
    	}
    	
    	return binaryNum;
    }
    
}
