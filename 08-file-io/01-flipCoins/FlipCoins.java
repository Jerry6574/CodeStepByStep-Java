/* FlipCoins.java
 
Sollution to: https://www.codestepbystep.com/problem/view/java/fileio/flipCoins
 
Write a method named flipCoins that accepts as its parameter a Scanner for an input file. 
Assume that the input file data represents results of sets of coin flips that are either 
heads (H) or tails (T) in either upper or lower case, separated by at least one space. 

Your method should consider each line to be a separate set of coin flips and should output 
to the console the number of heads and the percentage of heads in that line, 
rounded down to the nearest integer (truncated). 

If this percentage is more than 50%, 
you should print a "There were more heads!" message. 
For example, consider the following input file:

H T H H T
T t   t T h  H
   h
   
For the input above, your method should produce the following output:

3 heads (60%)
There were more heads!

2 heads (33%)

1 heads (100%)
There were more heads!

The format of your output must exactly match that shown above. 
You may assume that the Scanner contains at least 1 line of input, 
that each line contains at least one token, and that no tokens other than h, H, t, or T will be in the lines.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import acm.program.*;

public class FlipCoins extends ConsoleProgram {
    
    public void run() {
    	try {
    		FileInputStream fileIn = new FileInputStream("flips.txt");
			Scanner input = new Scanner(fileIn);
			flipCoins(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	

    }
    
    public void flipCoins(Scanner input) {
    	while(input.hasNextLine()) {
    		String line = input.nextLine();
    		
    		int headCount = 0;
    		int tailCount = 0;
    		
    		for(int i = 0; i < line.length(); i++) {
    			char token = line.charAt(i);
    			if(Character.toUpperCase(token) == 'T') {
    				tailCount++;
    			} else if(Character.toUpperCase(token) == 'H') {
    				headCount++;
    			}
    		}
    		
    		println(headCount + String.format(" heads (%.0f", (double) headCount / (headCount + tailCount) * 100) + "%)");
    		if(headCount > tailCount) {
    			println("There were more heads!");
    		} 
    		
    		println();
    	}
    }
}
