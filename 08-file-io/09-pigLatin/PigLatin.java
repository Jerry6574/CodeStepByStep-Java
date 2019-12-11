/* PigLatin.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/pigLatin

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class PigLatin extends ConsoleProgram {
    
    public void run() {
    	String filename = "lincoln.txt";
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	pigLatin(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
    
    public void pigLatin(Scanner input) {
    	while(input.hasNextLine()) {
    		String line = input.nextLine();
    		Scanner lineScanner = new Scanner(line);
    		
    		while(lineScanner.hasNext()) {
    			String word = lineScanner.next(); 

    			if(isVowel(word.charAt(0))) {
    				word = word + "yay";
    			} else {
    				word = word.substring(1) + word.charAt(0) + "ay";
    			}
    			
    			print(word + " ");
    		}
    		lineScanner.close();
    		println();
    	}
    }
    
    private boolean isVowel(char ch) {
    	char lowerCh = Character.toLowerCase(ch);
    	if(lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
    		return true;
    	} else {
    		return false;
    	}
    }
}
