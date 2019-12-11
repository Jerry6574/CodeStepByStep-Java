/* FlipAndReverseLines.java
	
Solution to: https://www.codestepbystep.com/problem/view/java/fileio/flipAndReverseLines

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import acm.program.*;

public class FlipAndReverseLines extends ConsoleProgram {
    
    public void run() {
    	println(flipAndReverseLines());
    }
    
    public int flipAndReverseLines() {
    	String filename = "";
    	FileInputStream fileIn;
    	
    	while(true) {
    		filename = readLine("Input file name? ");
    		
    		try {
    			fileIn = new FileInputStream(filename);
    			println();
    			break;
    		} catch(FileNotFoundException e) {
    			println("Unable to open that file.  Try again.");
    			continue;
    		}
    	}
    	
    	Scanner input = new Scanner(fileIn);
    	int lineCounts = 0;
    	boolean isUpper = true;
    	
    	while(input.hasNextLine()) {
    		String line1 = input.nextLine();
    		try {
    			String line2 = input.nextLine();
    			println(reverse(line2, isUpper));
    			println(reverse(line1, !isUpper));
    			
    			lineCounts += 2;
    		
    		// with odd number of lines, the last line should be uppercase
    		} catch (NoSuchElementException e) {
    			println(reverse(line1, isUpper));
    			lineCounts++;
    			break;
			}
	
    	}
    	
    	input.close();
    	
    	return lineCounts;
    }
    
    public String reverse(String s, boolean isUpper) {
    	String reverseStr = "";
    	
    	for(int i = 0; i < s.length(); i++) {
    		reverseStr = s.charAt(i) + reverseStr;
    	}
    	if(isUpper) {
    		return reverseStr.toUpperCase();
    	} else {
    		return reverseStr.toLowerCase();
    	}
    	
    }
}
