/* WordCount.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/wordCount

Write a method named wordCount that accepts a file name as a parameter and opens 
that file and that returns a count of the number of unique words in the file. 

Do not worry about capitalization and punctuation; 
for example, "Hello" and "hello" and "hello!!" are different words for this problem. 
Use a TreeSet as auxiliary storage.

 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

import acm.program.*;
import acm.util.ErrorException;

public class WordCount extends ConsoleProgram {
    
    public void run() {
    	try {
			println(wordCount("wordCount-test3-data.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public int wordCount(String filename) throws FileNotFoundException {
    	TreeSet<String> words = new TreeSet<>();
    	BufferedReader rd = null;
    	
		try{
			FileInputStream stream = new FileInputStream(filename);
			rd = new BufferedReader(new InputStreamReader(stream));
		} catch(FileNotFoundException ex){
			println("That file doesn't exist. ");
			throw ex;
		}
		
		try {
			while(true){
				
				String line = rd.readLine();
				
				if(line == null){
					break;
				}
				
				String[] wordsInLine = line.split(" ");
				
				for(String string: wordsInLine) {
					words.add(string);	
				}
			}
			
			rd.close();
		} catch(IOException ex){
			throw new ErrorException(ex);
		}
		
		return words.size();
    }
}
