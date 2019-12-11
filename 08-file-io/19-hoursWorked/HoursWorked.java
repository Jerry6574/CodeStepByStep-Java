/* HoursWorked.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/hoursWorked

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class HoursWorked extends ConsoleProgram {
    
    public void run() {
    	String filename = "hours.txt";
    	try {
			hoursWorked(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void hoursWorked(String filename) throws FileNotFoundException {
    	int nameFieldLength = 9;
    	int idFieldLength = 4;
    	
    	FileInputStream fileIn;
    	try {
			fileIn = new FileInputStream(filename);

		} catch(FileNotFoundException e) {
			println("Unable to open input file \"" + filename + "\"!");
			throw e;
		}
    	
		Scanner input = new Scanner(fileIn);

    	while(input.hasNextLine()) {
    		double totalHours = 0;
    		int nDays = 0;
    		
    		String line = input.nextLine();
    		Scanner lineScanner = new Scanner(line);
    		
    		String id = lineScanner.next();
    		String name = lineScanner.next();
    		
    		while(lineScanner.hasNext()) {
    			String token = lineScanner.next();
    			double hours = Double.parseDouble(token);
    			totalHours += hours;
    			nDays++;
    		}
    		
    		double hoursPerDay = totalHours / nDays;
    		
    		print(padRight(name, nameFieldLength));
    		print("(ID# " + padLeft(id, idFieldLength) + ")");
    		print(String.format(" worked %.1f hours (%.2f/day)", totalHours, hoursPerDay));
    		println();
    		lineScanner.close();
    	}
    	
    	input.close();
    }
    
    // pad spaces to right
	public static String padRight(String s, int n) {
		return String.format("%-" + n + "s", s);  
	}
	
	// pad spaces to left
    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);  
    }
    
}
