/* Histogram.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/Histogram

Write a console program named Histogram that reads a list of exam scores from an input file that contains one score per line and then displays a histogram of those numbers, divided into the ranges 0-9, 10-19, 20-29, and so forth, up to the range containing only the value 100. For example, suppose a file midtermscores.txt contains the numbers shown below (one per line):

73 58 73 93 82 62 80 53 93 52 92 75 65 95 23 100 75 38 80 77 92 60 98 95 62 87 97 73 78 72 55 58 42 31 78 70 78 74 70 60 72 75 84 87 62 17 92 78 74 65 90

Given this file, your program should be able to generate the following sample run (with user input shown like this):

File: midtermscores.txt
00-09:
10-19: *
20-29: *
30-39: **
40-49: *
50-59: *****
60-69: *******
70-79: *****************
80-89: ******
90-99: **********
  100: *

 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import acm.program.*;
import acm.util.ErrorException;

public class Histogram extends ConsoleProgram{
	public void run() {
    	String filename = readLine("File: ");
    	BufferedReader rd = openTextFile(filename);
    	
    	while(rd == null) {
    		filename = readLine("File: ");
    		rd = openTextFile(filename);
    	}
    	
    	String[] midTermScoreLabels = {"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ", 
    								   "50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "  100: "};
    	String[] scoreCounts = new String [11];
    	for(int i = 0; i < scoreCounts.length; i++) {
    		scoreCounts[i] = "";
    	}
    	
    	int[] midTermScoreBins = new int[11];
    	
		try {
			while(true){
				String line = rd.readLine();
				if(line == null) {
					break;
				}
				int score = Integer.parseInt(line);
				
				int binIndex = score / 10;
				midTermScoreBins[binIndex] += 1;
			}
			rd.close();
			
			for(int i = 0; i < midTermScoreBins.length; i++) {
				for(int j = 0; j < midTermScoreBins[i]; j++) {
					scoreCounts[i] += "*";
				}
				println(midTermScoreLabels[i] + scoreCounts[i]);
			}
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
