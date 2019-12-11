/* ReverseChunksInFile.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/reverseChunksInFile

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class ReverseChunksInFile extends ConsoleProgram {
    
    public void run() {
    	String filename = "input.txt";
    	FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	reverseChunksInFile(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void reverseChunksInFile(Scanner input) {

	    	while(input.hasNext()) {
	    		String line = input.nextLine();
	    		
	    		if(line.length() > 0) {
	    			Scanner lineScanner = new Scanner(line);
	    			while(lineScanner.hasNext()) {
	    				String word = lineScanner.next();
	    				int chunkLength = Integer.parseInt(lineScanner.next());
	    				print(reverseChunks(word, chunkLength) + " ");
	    			}
	    			lineScanner.close();
	    		}
	    		
	    		println();
	    	}
	    	
	    	input.close();
    }
    
    public String reverseChunks(String s, int n) {
    	int nChunks = s.length() / n;
    	if(nChunks == 0) {
    		return s;
    	}
    	
    	String reversedChunkStr = "";
    	
    	int i = 1;
    	for(i = 1; i <= nChunks; i++) {
    		String chunk = s.substring(n * (i - 1), n * i);
    		
    		// reverse of a chunk
    		String reversedChunk = "";
    		for(int j = 0; j < chunk.length(); j++) {
    			reversedChunk = chunk.charAt(j) + reversedChunk;
    		}
    		
    		reversedChunkStr += reversedChunk;
    	}
    	
    	// concat the unchunked portion of s
    	reversedChunkStr += s.substring(n * (i - 1), s.length());
    	
    	return reversedChunkStr;
    }
}
