/* MyProgram.java
 * --------------
 * Modify this file any way you like (or create additional files in
 * the ACMStarterProject) in order to experiment with the capabilities
 * of the ACM libraries.
 * 
 * NOTE: While you are free to do whatever you like with this project,
 * it is still best to use the assignment-specific starter files
 * for actual assignments.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class PigLatin2 extends ConsoleProgram {
    
    public void run() {
    	String filename = "lincoln.txt";
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	pigLatin2(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
    
    public void pigLatin2(Scanner input) {
    	while(input.hasNextLine()) {
    		String line = input.nextLine();
    		Scanner lineScanner = new Scanner(line);
    		
    		while(lineScanner.hasNext()) {
    			String word = lineScanner.next(); 

    			if(isVowel(word.charAt(0))) {
    				word = word + "yay";
    			} else {
    				int nConsonants = 0;
    				for(int i = 0; i < word.length(); i++) {
    					if(!isVowel(word.charAt(i))) {
    						nConsonants++;
    					} else {
    						break;
    					}
    				}

    				word = word.substring(nConsonants) + word.substring(0, nConsonants) + "ay";
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
