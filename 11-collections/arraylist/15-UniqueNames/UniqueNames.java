/* UniqueNames.java

Write a console program named UniqueNames that asks the user for a list of names (one per line) 
until the user enters a blank line (i.e., just presses Enter when asked for a name). 

At that point the program should print out the list of names entered, 
where each name is listed only once (i.e., uniquely) no matter how many 
times the user entered the name in the program. 

For example, your program should behave as follows:
Enter name: Alice
Enter name: Bob
Enter name: Alice
Enter name: Alice
Enter name: Alice
Enter name: Bob
Unique name list contains: Alice Bob

 */
import java.util.ArrayList;

import acm.program.*;

public class UniqueNames extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> names = new ArrayList<>();
    			
        while (true) {
        	String newName = readLine("Enter name: ");
        	
        	if(!names.contains(newName)) {
        		names.add(newName);
        	}
        	
            if(newName.equals("")) {
            	print("Unique name list contains: ");
            	for(String name: names) {
            		print(name + " ");
            	}
            	break;
            }
        }
    }
    
}
