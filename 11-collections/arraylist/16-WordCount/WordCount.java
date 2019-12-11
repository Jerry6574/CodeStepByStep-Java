/* WordCount.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/WordCount 

Write a console program named WordCount that reads a file and reports how many lines, words, 
and characters appear in it. Suppose, for example, that the file lear.txt contains the 
following passage from Shakespeare's King Lear:

Poor naked wretches, wheresoe'er you are,
That bide the pelting of this pitiless storm,
How shall your houseless heads and unfed sides,
Your loop'd and window'd raggedness, defend you
From seasons such as these?  O, I have ta'en
Too little care of this!

Given this file, your program should be able to generate the 
following sample run (with user input shown like this):

File: lear.txt
Lines = 6
Words = 47
Chars = 248

For the purposes of this program, a word consists of a consecutive sequence of letters and/or digits, 
which you can test using the static method Character.isLetterOrDigit.

 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import acm.program.*;
import acm.util.ErrorException;

public class WordCount extends ConsoleProgram {
    public void run() {
    	String filename = readLine("File: ");
    	BufferedReader rd = openTextFile(filename);
    	while(rd == null) {
    		filename = readLine("File: ");
    		rd = openTextFile(filename);
    	}
    	
    	int lineCount = 0;
    	int charCount = 0; 
    	int wordCount = 0;
    	
    	boolean curCharIsLetterOrDigit = false;
    	boolean prevCharIsLetterOrDigit = false;
		try {
			while(true){
				String line = rd.readLine();
				if(line == null){
					break;
				}
				lineCount++;
				for(int i = 0; i < line.length()-1; i++) {
					prevCharIsLetterOrDigit = Character.isLetterOrDigit(line.charAt(i));
					curCharIsLetterOrDigit = Character.isLetterOrDigit(line.charAt(i+1));
					
					// word counting mechanism. 
					// increment word count when change from LetterOrDigit to non-LetterOrDigit:
					// -> && prevCharIsLetterOrDigit to avoid duplicated counting.
					// -> count words at end of line that have no punctuation. 
					if((prevCharIsLetterOrDigit != curCharIsLetterOrDigit && prevCharIsLetterOrDigit) ||
					   (i == line.length()-2 && curCharIsLetterOrDigit)) {
						wordCount++;
					}
				}
				charCount += line.length();
			}
			rd.close();
			println("Lines = " + lineCount);
			println("Words = " + wordCount);
			println("Chars = " + charCount);
		} 
		catch(IOException ex){
			throw new ErrorException(ex);
		}
    }
    
    private BufferedReader openTextFile(String filename){
    	BufferedReader rd = null;
    	
		try{
			FileInputStream stream = new FileInputStream(filename);
			rd = new BufferedReader(new InputStreamReader(stream));
		} catch(IOException ex){
			println("That file doesn't exist. ");
		}
		
    	return rd;
    }
}
