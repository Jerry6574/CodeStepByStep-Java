/* NegativeSum.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/negativeSum

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class NegativeSum extends ConsoleProgram {
    
    public void run() {
    	String filename = readLine("Input file? ");
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
			Scanner input = new Scanner(fileIn); 
			println(negativeSum(input));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public boolean negativeSum(Scanner input) {
    	int sum = 0;
    	int steps = 1;
    	
    	while(input.hasNext()) {
    		sum += input.nextInt();
    		if(sum < 0) {
    			println(sum + " after " + steps + " steps");
    			return true;
    		}
    		steps++;
    	}
    	
    	println("no negative sum");
    	return false;
    }
}
