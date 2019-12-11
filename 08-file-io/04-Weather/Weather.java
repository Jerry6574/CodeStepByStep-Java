/* Weather.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/Weather

 */

import java.io.*;
import java.util.Scanner;

import acm.program.*;

public class Weather extends ConsoleProgram {
    
    public void run() {
    	String filename = readLine("Input file? ");
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(filename);
			Scanner weatherData = new Scanner(fileIn);
			
			if(weatherData.hasNext()) {
				double temperature1 = 0.0;
				
				// try to locate the first valid temperature1
				while(weatherData.hasNext()) {
					try {
						temperature1 = Double.parseDouble(weatherData.next());
						break;
					// ignore non-numeric tokens
					} catch (NumberFormatException e) {
						continue;
					}
				}
				
				while(weatherData.hasNext()) {
					try {
						double temperature2 = Double.parseDouble(weatherData.next());
						println(String.format("%.1f to %.1f, change = %.1f", temperature1, temperature2, temperature2 - temperature1));
						temperature1 = temperature2;
					} catch (NumberFormatException e) {
						continue;
					}
				}
			}

			weatherData.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
}
