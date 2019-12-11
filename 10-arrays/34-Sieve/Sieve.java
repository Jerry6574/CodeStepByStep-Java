/* Sieve.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/Sieve

 */


import acm.program.*;

public class Sieve extends ConsoleProgram {
    
    public void run() {
    	int n = readInt("Max value N? ");
    	printPrimes(n);
    }
    
    public void printPrimes(int n) {
    	int[] nums = new int[n-1];
    	nums[0] = 2;
    	
    	for(int i = 1; i < nums.length; i++) {
    		nums[i] = nums[i-1] + 1;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] != 0 && nums[j] != 0 && (nums[j] % nums[i] == 0)) {
					// set composite number to 0
					nums[j] = 0;
				}
			}
		}
    	
    	print("Primes: ");
    	for(int i = 0; i < nums.length; i++) {
    		// all remaining non-0 numbers are primes
    		if(nums[i] != 0) {
    			print(nums[i] + " ");
    		}
    		
    	}

    }
}
