/* AverageValueInFile.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/averageValueInFile

 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acm.program.*;

public class AverageValueInFile extends ConsoleProgram {
    
    public void run() {
    	String filename= "input.txt";
    	try {
			println(averageValueInFile(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public double averageValueInFile(String filename) throws FileNotFoundException {
    	FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(filename);
	    	Scanner input = new Scanner(fileIn);
	    	if(!input.hasNext()) {
	    		input.close();
	    		return 0.0;
	    	}
	    	
	    	double sum = 0.0;
	    	int i = 0;

	    	while(input.hasNext()) {
	    		sum += input.nextDouble();
	    		i++;
	    	}
	    	
	    	input.close();
	    	
	    	return sum / i;
	    	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
    }
}
