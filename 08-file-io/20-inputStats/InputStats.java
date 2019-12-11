/* inputStats.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/inputStats

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class InputStats extends ConsoleProgram {
    
    public void run() {
    	String filename = "carroll.txt";
    	try {
			inputStats(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void inputStats(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
    	try {
			fileIn = new FileInputStream(filename);

		} catch(FileNotFoundException e) {
			throw e;
		}
    	
		Scanner input = new Scanner(fileIn);
		
		int i = 0;
		int longest = 0;
		int totalLength = 0;
		
    	while(input.hasNextLine()) {
    		i++;
    		String line = input.nextLine();
    		
    		if(line.length() > longest) {
    			longest = line.length();
    		}
    		totalLength += line.length();
    		
    		println("Line " + i + " has " + line.length() + " chars");
    		
    	}
    	
    	println(i + " lines; longest = " + longest + ", average = " + String.format("%.1f", (double) totalLength / i));
    	
    	input.close();
    }
}
