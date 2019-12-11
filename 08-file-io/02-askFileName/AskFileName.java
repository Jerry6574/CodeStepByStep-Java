/* askFileName.java

Solution to: https://www.codestepbystep.com/problem/view/java/fileio/askFileName

Write a method named askFileName that repeatedly prompts the user for a file name 
until the user types the name of a file that exists on the system. 

Once you get a good file name, return that file name as a String. 
Here is a sample dialogue from one call to your method, assuming that the file 
good.txt does exist and the others do not:

Type a file name: bad.txt
Type a file name: not_here.txt
Type a file name: good.txt
 */

import java.io.*;
import acm.program.*;


public class AskFileName extends ConsoleProgram {
    
    public void run() {
    	String filename = askFileName();
    	println(filename + " is a valid filename. ");
    }
    
    public String askFileName() {
    	while(true) {
    		String filename = readLine("Type a file name: ");
    		File file = new File(filename);
    		if(file.exists()) {
    			return file.getName();
    		}
    	}
    	
    }
}
