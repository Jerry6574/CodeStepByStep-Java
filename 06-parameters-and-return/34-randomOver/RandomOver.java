/* RandomOver.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/randomOver

Write a method named randomOver that accepts two integer parameters n and max and repeatedly 
prints random numbers between 0 and max (inclusive) until a number greater than or equal to n is printed. 

At least one line of output should always be printed, even if the first random number is above n. 
Here is a sample log from the call of randomOver(900, 1000);

 */
import acm.program.*;
import acm.util.*;

public class RandomOver extends ConsoleProgram {
    
    public void run() {
    	randomOver(900, 1000);
    }
    
    public void randomOver(int n, int max) {
    	RandomGenerator rgen = new RandomGenerator();
    	
    	while(true) {
    		int randNum = rgen.nextInt(0, max);
    		println("Random number: " + randNum);
    		if(randNum >= n) {
    			break;
    		}
    	}
    }
}
