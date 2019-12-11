/* Hours.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/Hours

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class Hours  extends ConsoleProgram{
    
    public void run(){
    	String filename = readLine("Input file? ");
		
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			Scanner hoursData = new Scanner(fileIn);
			
			while(hoursData.hasNextLine()) {
				String line = hoursData.nextLine();
				Scanner lineScanner = new Scanner(line);
				
				int i = 0;
				String formattedLine = "";
				double totalHours = 0.0;
				int nDays = 0;
				
				while(lineScanner.hasNext()) {
					String token = lineScanner.next();
					
					// add ID#
					if(i == 0) {
						formattedLine = String.format(" (ID#" + token + ") worked ");
					
					// add name
					} else if(i == 1) {
						formattedLine = token + formattedLine;
					} else {
						totalHours += Double.parseDouble(token);
						nDays++;
					}
					i++;
				}
				
				double hoursPerDay = totalHours / nDays;
				formattedLine = formattedLine + String.format("%.1f hours (%.1f/day)", totalHours, hoursPerDay);
				println(formattedLine);
				
				lineScanner.close();
			}
			hoursData.close();
			
		} catch (FileNotFoundException e) {
			println("File doesn't exist. ");
		}
    }
    
}
