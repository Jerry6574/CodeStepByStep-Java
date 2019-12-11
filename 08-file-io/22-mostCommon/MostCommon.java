/* MostCommon.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/mostCommon

 */

import java.io.*;
import java.util.*;


import acm.program.*;

public class MostCommon extends ConsoleProgram {
    
    public void run() {
    	String filename = "names.txt";
    	try {
			println(mostCommon(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public String mostCommon(String filename) throws FileNotFoundException{
    	HashMap<String, ArrayList<Integer>> wordFreq = new HashMap<>();
    	FileInputStream fileIn;
    	
    	try {
			fileIn = new FileInputStream(filename);
		} catch(FileNotFoundException e) {
			throw e;
		}
    	
    	int currentPos = 1;
		Scanner input = new Scanner(fileIn);

    	while(input.hasNext()) {
    		String word = input.next();
    		
    		if(!wordFreq.containsKey(word)) {
    			ArrayList<Integer> wordInfo = new ArrayList<>();
    			int count = 1;
    			wordInfo.add(count);
    			wordInfo.add(currentPos);
    			wordFreq.put(word, wordInfo);
    			currentPos++;
    			
    		} else {
    			ArrayList<Integer> wordInfo = wordFreq.get(word);
    			wordInfo.set(0, wordInfo.get(0) + 1);
    		}
    	}
    	
    	Map.Entry<String, ArrayList<Integer>> maxEntry = null;

    	for (Map.Entry<String, ArrayList<Integer>> entry : wordFreq.entrySet()){
    		// compare number of occurences
    	    if (maxEntry == null || entry.getValue().get(0) > maxEntry.getValue().get(0)){
    	        maxEntry = entry;
    	        
    	    // same number of occurences, earlier entry wins tie-breaker
    	    } else if(entry.getValue().get(0) == maxEntry.getValue().get(0)) {
    	    	if(entry.getValue().get(1) < maxEntry.getValue().get(1)) {
    	    		maxEntry = entry;
    	    	}
    	    }
    	}

    	input.close();
    	return maxEntry.getKey();
    }
}
