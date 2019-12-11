/* IsHappyNumber.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/isHappyNumber

Write a method named isHappyNumber that returns whether a given integer is "happy". 
An integer is "happy" if repeatedly summing the squares of its digits eventually leads to the number 1.

For example, 139 is happy because:

12 + 32 + 92 = 91
92 + 12 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
By contrast, 4 is not happy because:

42 = 16
12 + 62 = 37
32 + 72 = 58
52 + 82 = 89
82 + 92 = 145
12 + 42 + 52 = 42
42 + 22 = 20
22 + 02 = 4
...

 */

import java.util.*;

import acm.program.*;


public class IsHappyNumber extends ConsoleProgram {
    
    public void run() {
    	println(isHappyNumber(1234));
    }
    
    public boolean isHappyNumber(int n) {
    	int num = n;
    	
    	TreeSet<Integer> sumsOfSquare = new TreeSet<>();
    	
    	while(true) {
    		int sumOfSquare = 0;
    		
    		while(true) {
    			// sum the square of each digit
    			sumOfSquare += Math.pow(num % 10, 2);
    			
    			num /= 10;
    			if(num / 10 == 0) {
    				// add the square of the most significant digit
    				sumOfSquare += Math.pow(num % 10, 2);
    				break;
    			}
    		}
    		
    		println(sumOfSquare);
    		num = sumOfSquare;
    		
    		// if the same sumOfSquare comes up, it will be an infinite loop if we don't stop it.
    		if(sumsOfSquare.contains(sumOfSquare) || sumOfSquare == 1) {
    			break;
    		} else {
    			sumsOfSquare.add(sumOfSquare);
    		}
    	}
    	
    	if(num == 1) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
}
