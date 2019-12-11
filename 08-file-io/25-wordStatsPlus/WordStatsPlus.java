/* WordStatsPlus.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/wordStatsPlus

 */

import java.io.*;
import java.util.*;


import acm.program.*;

public class WordStatsPlus extends ConsoleProgram {
    
    public void run() {
    	String filename = "tobe.txt";
    	try {
			wordStatsPlus(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void wordStatsPlus(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
    	Set<Character> uniqueLetters = new HashSet<>();
    	
    	try {
			fileIn = new FileInputStream(filename);
		} catch(FileNotFoundException e) {
			throw e;
		}
    	
		Scanner input = new Scanner(fileIn);
		int wordCount = 0;
		int lineCount = 0;
		int totalWordLength = 0;
		
    	while(input.hasNextLine()) {
    		String line = input.nextLine();
    		lineCount++;
    		
    		if(line.length() > 0) {
    			Scanner lineScanner = new Scanner(line);
    			
    			while(lineScanner.hasNext()) {
            		String word = lineScanner.next();
            		wordCount++;
            		totalWordLength += word.length();
            		
            		for(int i = 0; i < word.length(); i++) {
            			if(Character.isLetter(word.charAt(i))) {
            				// convert letters to lowercase to be case-insensitive
            				uniqueLetters.add(Character.toLowerCase(word.charAt(i)));
            			}
            		}
    			}
    			lineScanner.close();
    		}
    	}
    	
    	int alphabetRate = uniqueLetters.size() * 100 / 26 ;
    	double wordPerLine = (double) wordCount / lineCount;
    	double avgWordLength = (double) totalWordLength / wordCount;
    	
    	println("Total lines = " + lineCount);
    	println("Total words = " + wordCount);
    	println("Total unique letters = " + uniqueLetters.size() + String.format(" (%d", alphabetRate) + "% of alphabet)");
    	println("Average words/line = " + wordPerLine);
    	println(String.format("Average word length = %.1f", avgWordLength));
    	
    	input.close();
    }
}
