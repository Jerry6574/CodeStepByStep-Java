/* FlipLines.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/flipLines

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import acm.program.*;

public class FlipLines extends ConsoleProgram {
    
    public void run() {
    	try {
			flipLines("carroll.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void flipLines(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;

		try {
			fileIn = new FileInputStream(filename);

		} catch(FileNotFoundException e) {
			println("Unable to open input file \"" + filename + "\"!");
			throw e;
		}
		
		Scanner input = new Scanner(fileIn);
		
    	while(input.hasNextLine()) {
    		String line1 = input.nextLine();
    		try {
    			String line2 = input.nextLine();
    			println(line2.toUpperCase());
    			println(line1.toLowerCase());
    			
    		// with odd number of lines, the last line should be uppercase
    		} catch (NoSuchElementException e) {
    			println(line1.toUpperCase());
			}
    	}
    	
    	input.close();
    }
}
