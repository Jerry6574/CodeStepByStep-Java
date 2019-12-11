/* Triangle.java

Solution to https://www.codestepbystep.com/problem/view/java/parameters/triangle

Write a method named triangle that accepts an integer parameter representing a size in characters, 
and prints to the console a right-aligned right triangle figure whose non-hypotenuse sides are that length. 
For example, the call of triangle(5); should print the following output:

    *
   **
  ***
 ****
*****

 */

import acm.program.*;

public class Triangle extends ConsoleProgram {
    
    public void run() {
    	triangle(5);
    }
    
    public void triangle(int size) {
    	for(int i = size-1; i >= 0; i--) {
    		for(int j = 0; j < size ; j++) {
    			if(j < i) {
    				print(" ");
    			} else {
    				print("*");
    			}	
    		}
    		println();
    	}
    }
}
