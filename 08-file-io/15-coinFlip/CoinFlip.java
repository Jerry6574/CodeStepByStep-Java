/* coinFlip.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/coinFlip

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class CoinFlip extends ConsoleProgram {
    
    public void run() {
    	String filename = "flips.txt";
    	try {
			coinFlip(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void coinFlip(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	
	    	int headCounts = 0;
	    	int tailCounts = 0;
	    	
	    	while(input.hasNext()) {
	    		String flip = input.next().toUpperCase();
	    		
	    		if(flip.equals("H") || flip.equals("HEADS")) {
	    			headCounts++;
	    		} else {
	    			tailCounts++;
	    		}
	    	}
	    	
	    	input.close();
	    	double headPercent = (double) headCounts / (headCounts + tailCounts) * 100;
	    	
	    	println(String.format("%d heads (%.0f", headCounts, headPercent) + "%)");
	    	if(headPercent >= 50) {
	    		println("You win!");
	    	} else {
	    		println("You lose!");
	    	}
	    	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
    }
}
