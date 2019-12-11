/* Election.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/Election

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class Election extends ConsoleProgram {
    
    public void run() {
    	String filename = readLine("Input file? ");
		
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			Scanner pollsData = new Scanner(fileIn);
			
			int cand1Votes = 0;
			int cand2Votes = 0;
			
			while(pollsData.hasNextLine()) {
				String line = pollsData.nextLine();
				Scanner lineScanner = new Scanner(line);
				
				int cand1Percent = 0;
				int cand2Percent = 0;
				int electorialVotes = 0;
				int i = 0; 

				while(lineScanner.hasNext()) {
					String token = lineScanner.next();
					if(i > 3) {
						break;
					} else if(i == 1) {
						cand1Percent = Integer.parseInt(token);
					} else if(i == 2) {
						cand2Percent = Integer.parseInt(token);
					} else if(i == 3) {
						electorialVotes = Integer.parseInt(token);
					}
					
					if(cand1Percent > cand2Percent) {
						cand1Votes += electorialVotes;
					} else if(cand1Percent < cand2Percent) {
						cand2Votes += electorialVotes;
					}
					
					i++;
				}
				lineScanner.close();
			}
			
			println("Candidate 1: " + cand1Votes + " votes");
			println("Candidate 2: " + cand2Votes + " votes");
			
			pollsData.close();
			
		} catch (FileNotFoundException e) {
			println("File doesn't exist. ");
		}
    }
    
}
