/* PrintMostCommonName.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/printMostCommonName

 */
import java.io.*;
import java.util.*;

import acm.program.*;

public class PrintMostCommonName extends ConsoleProgram {
    
    public void run() {
    	String filename = "names1.txt";
    	try {
			println(printMostCommonName(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public int printMostCommonName(String filename) throws FileNotFoundException {
    	HashMap<String, ArrayList<Integer>> nameFreq = new HashMap<>();
    	Set<String> uniqueNames = new HashSet<>();
    	FileInputStream fileIn;
    	
    	try {
			fileIn = new FileInputStream(filename);
		} catch(FileNotFoundException e) {
			throw e;
		}
    	
    	int currentPos = 1;
		Scanner input = new Scanner(fileIn);

    	while(input.hasNext()) {
    		String name = input.next();
    		uniqueNames.add(name);
    		
    		if(!nameFreq.containsKey(name)) {
    			ArrayList<Integer> nameInfo = new ArrayList<>();
    			int count = 1;
    			nameInfo.add(count);
    			nameInfo.add(currentPos);
    			nameFreq.put(name, nameInfo);
    			currentPos++;
    			
    		} else {
    			ArrayList<Integer> nameInfo = nameFreq.get(name);
    			nameInfo.set(0, nameInfo.get(0) + 1);
    		}
    	}
    	
    	Map.Entry<String, ArrayList<Integer>> maxEntry = null;

    	for (Map.Entry<String, ArrayList<Integer>> entry : nameFreq.entrySet()){
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
    	
    	println("Most common name: " + maxEntry.getKey() + ", " + maxEntry.getValue().get(0));
    	input.close();
    	
    	return uniqueNames.size();
    }
}
