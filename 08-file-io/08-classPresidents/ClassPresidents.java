/* ClassPresidents.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/classPresidents

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class ClassPresidents extends ConsoleProgram {
    
    public void run() {
    	String filename = "candidates.txt";
    	FileInputStream fileIn;
    	
		try {
			fileIn = new FileInputStream(filename);
			Scanner input = new Scanner(fileIn); 
			classPresidents(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void classPresidents(Scanner input) {
    	String mostVoteJunior = "";
    	String mostVoteSoph = "";
    	
    	int juniorVoteCounts = 0;
    	int sophVoteCounts = 0;
    	
    	while(input.hasNext()) {
    		String person = input.next();
    		String rank = input.next();
    		int votes = Integer.parseInt(input.next());
    		
    		if(rank.equals("s")) {
    			if(votes > sophVoteCounts) {
    				mostVoteSoph = person;
    				sophVoteCounts = votes;
    			} 
    		} else {
    			if(votes > juniorVoteCounts) {
    				mostVoteJunior = person;
    				juniorVoteCounts = votes;
    			} 
    		}
    	}
    	
    	println("Sophomore Class President: " + mostVoteSoph +  " (" + sophVoteCounts + " votes)");
    	println("Junior Class President: " + mostVoteJunior +  " (" + juniorVoteCounts + " votes)");
    }
}
