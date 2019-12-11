/* RemoveDuplicatesFromFile.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/removeDuplicatesFromFile

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class RemoveDuplicatesFromFile extends ConsoleProgram {
    
    public void run() {
    	String filename = "input.txt";
    	removeDuplicatesFromFile(filename);
    }
    
    public void removeDuplicatesFromFile(String filename) {
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	
	    	while(input.hasNextLine()) {
	    		String line = input.nextLine();
	    		
	    		// does not process blank lines
	    		if(line.length() >= 0) {
		    		Scanner lineScanner = new Scanner(line);
		    		
		    		while(lineScanner.hasNext()) {
		    			String word = lineScanner.next();
		    			print(removeDuplicates(word) + " ");
		    		}
		    		lineScanner.close();
	    		}
	    		println();
	    	}
	    	
	    	input.close();
	    	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public String removeDuplicates(String str) {
    	if(str.length() == 0) return str;
    	
    	char currentChar = str.charAt(0);
    	String newStr = "" + currentChar;
    	
    	for(int i = 1; i < str.length(); i++) {
    		if(str.charAt(i) != currentChar) {
    			newStr += str.charAt(i);
    			currentChar = str.charAt(i);
    		}
    	}
    	return newStr;
    }
}
