/* PrintBox.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/printBox

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class PrintBox extends ConsoleProgram {
    
    public void run() {
    	String filename = "poem.txt";
    	int width = 7;
    	
    	printBox(filename, width);
    }
    
    public void printBox(String filename, int width) {
    	try {
    		printBorder(width);
    		
    		FileInputStream fileIn = new FileInputStream(filename);
			Scanner input = new Scanner(fileIn);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String formattedLine = "#";
				
				for(int i = 0; i <= width - 2; i++) {
					if((i >= line.length() || line.length() == 0) && i != width - 2) {
						// pad space when line is blank or i exceeds line's length
						formattedLine += " ";
						
					} else if(i == width - 2){
						formattedLine += "#";
					
					// uppercase the first letter of the line
					} else if(i == 0) {
						formattedLine += Character.toUpperCase(line.charAt(i));
						
					// lowercase the remaining letters of the line
					} else {
						formattedLine += Character.toLowerCase(line.charAt(i));
					}
				}
				
				println(formattedLine);
			}
			
			printBorder(width);
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    private void printBorder(int width) {
    	for(int i = 0; i < width; i++) {
    		print("#");
    	}
    	println();
    }
}
