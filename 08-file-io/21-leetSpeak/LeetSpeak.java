/* LeetSpeak.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/leetSpeak

 */
import java.io.*;
import java.util.*;

import acm.program.*;

public class LeetSpeak extends ConsoleProgram {
    
    public void run() {
    	String infile = "lincoln.txt";
    	String outfile = "leet.txt";
    	
    	try {
			leetSpeak(infile, outfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void leetSpeak(String infile, String outfile) throws FileNotFoundException {
    	FileInputStream fileIn = null;
    	PrintWriter fileOut = null;
    	
    	try {
			fileIn = new FileInputStream(infile);
		} catch(FileNotFoundException e) {
			throw e;
		}
    	
    	try {
    		fileOut = new PrintWriter(outfile);
    		Scanner input = new Scanner(fileIn);

        	while(input.hasNextLine()) {
        		String line = input.nextLine();
        		Scanner lineScanner = new Scanner(line);
        		
        		while(lineScanner.hasNext()) {
        			String word = lineScanner.next();
        			fileOut.print(leetify(word) + " ");
        			print(leetify(word) + " ");
        		}
        		fileOut.println();
        		lineScanner.close();
        	}
        
        	fileOut.close();
        	input.close();
        	
    	} catch(FileNotFoundException e) {
    		fileOut.close();
    		try {
				fileIn.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw e;
		}
    	
    }
    
    public String leetify(String str) {
    	String leetStr = "(";
    	
    	HashMap<Character, Character> leetMap = new HashMap<>();
    	leetMap.put('o', '0');
    	leetMap.put('l', '1');
    	leetMap.put('e', '3');
    	leetMap.put('a', '4');
    	leetMap.put('t', '7');
    	leetMap.put('s', 'Z');
    	
    	int i = 0;
    	for(i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		
    		if(!leetMap.containsKey(ch)) {
    			if(i == str.length() - 1) {
    				leetStr = leetStr + ch + ')';
    			} else {
    				leetStr = leetStr + ch;
    			}
    			
    		} else {
    			if(i == str.length() - 1) {
    				leetStr = leetStr + leetMap.get(ch) + ")";
    			} else if(ch != 's') {
    				leetStr = leetStr + leetMap.get(ch);
    			} else {
    				leetStr = leetStr + ch;
    			}
    		}
    		
    	}

    	return leetStr;
    }
}
