/* Coolest.java
 
Solution to: https://www.codestepbystep.com/problem/view/java/fileio/coolest

 */


import java.io.*;
import java.util.*;

import acm.program.*;

public class Coolest extends ConsoleProgram {
    
    public void run() {
    	String filename = "twitter.txt";
    	try {
			println(coolest(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public String coolest(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
    	
    	// twitterMap consists of entries of {person=[list of follower]}
    	TreeMap<String, ArrayList<String>> twitterMap = new TreeMap<>();
    	
    	TreeMap<String, Integer> popularityScores = new TreeMap<>();
    	
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);

	    	while(input.hasNext()) {
	    		String name1 = input.next();
	    		String name2 = input.next();
	    		
	    		if(twitterMap.containsKey(name2)) {
	    			twitterMap.get(name2).add(name1);
	    		} else {
	    			ArrayList<String> followers = new ArrayList<>();
	    			followers.add(name1);
	    			twitterMap.put(name2, followers);
	    		}
	    		
	    		if(!twitterMap.containsKey(name1)) {
	    			twitterMap.put(name1, new ArrayList<String>());
	    		}
	    	}
	    	input.close();
	    	
	    	for(String person: twitterMap.keySet()) {
	    		int popularityScore = getPopularityScore(twitterMap, person);
	    		popularityScores.put(person, popularityScore);
	    	}
	    	
	    	println(popularityScores.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		Map.Entry<String, Integer> maxFame = null;
    	for (Map.Entry<String, Integer> entry : popularityScores.entrySet()){
    		
    		// compare and get person with maxFame, highest popularity score
    	    if (maxFame == null || entry.getValue() > maxFame.getValue()){
    	    	maxFame = entry;
    	    } else if(entry.getValue() == maxFame.getValue()){
    	    	
    	    	// having followers wins type-breaker over having no followers
    	    	if(twitterMap.get(entry.getKey()).size() > twitterMap.get(maxFame.getKey()).size()) {
    	    		maxFame = entry;
    	    		
    	    	// name comes first in alphabetical order wins type-breaker
    	    	} else if(entry.getKey().compareTo(maxFame.getKey()) < 0) {
    	    		maxFame = entry;
    	    	}
    	    }
    	}
		
		return maxFame.getKey();
    }
    
    public int getPopularityScore(TreeMap<String, ArrayList<String>> twitterMap, String person) {
    	int popularityScore = 0;
    	
    	ArrayList<String> followers = twitterMap.get(person);
    	
    	// get follower count of person's followers, aka, popularity score
    	for(String follower: followers) {
    		popularityScore += twitterMap.get(follower).size();
    	}
    	
    	return popularityScore;
    }
}
