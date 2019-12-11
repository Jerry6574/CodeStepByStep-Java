/* wordStats.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/wordStats

 */

import java.io.*;
import java.util.*;

import acm.program.*;

public class WordStats extends ConsoleProgram {
    
    public void run() {
    	String filename = "tobe.txt";
    	try {
			wordStats(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void wordStats(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
    	Set<Character> letters = new java.util.HashSet<>();
    	
    	try {
			fileIn = new FileInputStream(filename);
		} catch(FileNotFoundException e) {
			throw e;
		}
    	
		Scanner input = new Scanner(fileIn);
		int wordCount = 0;
		int totalWordLength = 0;
		
    	while(input.hasNext()) {
    		String word = input.next();
    		wordCount++;
    		totalWordLength += word.length();
    		
    		for(int i = 0; i < word.length(); i++) {
    			if(Character.isLetter(word.charAt(i))) {
    				// convert letters to lowercase to be case-insensitive
    				letters.add(Character.toLowerCase(word.charAt(i)));
    			}
    		}
    	}
    	
    	println("Total words    = " + wordCount);
    	println(String.format("Average length = %.1f", (double) totalWordLength / wordCount));
    	println("Unique letters = " + letters.size());
    	
    	input.close();
    }
}
