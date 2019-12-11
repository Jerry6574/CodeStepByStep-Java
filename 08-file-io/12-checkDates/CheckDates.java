/* CheckDates.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/checkDates

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class CheckDates extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public void checkDates(String filename) {
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	
	    	while(input.hasNext()) {
	    		int month1 = input.nextInt();
	    		int day1 = input.nextInt();
	    		int month2 = input.nextInt();
	    		int day2 = input.nextInt();
	    		
	    		boolean withAMonth = (Math.abs(month1-month2) < 1) || 
				    				 (month2 - month1 == 1 && day2 < day1) || 
				    				 (month1 - month2 == 1 && day2 > day1);
	    		
	    		if(withAMonth) {
	    			println(month1 + "/" + day1 + " and " + month2 + "/" + day2 + " are within one month of each other.");
	    		} else {
	    			println(month1 + "/" + day1 + " and " + month2 + "/" + day2 + " differ by one full month or more!");
	    		}
	    	}
	    	
	    	input.close();
	    	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
