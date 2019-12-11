/* FactorCount.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/factorCount

Write a method named factorCount that accepts an integer (assumed to be positive) 
as its parameter and returns a count of its positive factors. 

For example, the eight factors of 24 are 1, 2, 3, 4, 6, 8, 12, 
and 24, so the call of factorCount(24) should return 8.


 */

import acm.program.*;

public class FactorCount extends ConsoleProgram {
    
    public void run() {
    	println(factorCount(24));
    }
    
    // use trial division, brute force algorithm
    public int factorCount(int n) {
    	if(n == 1) {
    		return 1;
    	}
    	
    	// 1 and number itself are always factors
    	int nFactors = 2;
    	
    	for(int i = 2; i <= n / 2; i++) {
    		if(isFactor(i, n)) {
    			nFactors++;
    		}
    	}
    	return nFactors;
    }
    
    public boolean isFactor(int factor, int num) {
    	if(num % factor == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
